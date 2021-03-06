package com.ms.qaTools.io.rowSource.file

import java.io.Closeable
import java.io.File
import java.io.FileNotFoundException
import java.io.InputStream
import java.io.OutputStream

import scala.collection.AbstractIterator
import scala.slick.util.CloseableIterator

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.openxml4j.opc.OPCPackage
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem
import org.apache.poi.poifs.filesystem.OfficeXmlFileException
import org.apache.poi.ss.usermodel.{ Workbook, Sheet, Cell }
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.ss.util.CellRangeAddress
import org.apache.poi.xssf.streaming.SXSSFWorkbook

import com.ms.qaTools.io.rowSource._
import com.ms.qaTools.io.rowSource.file.xlsx.XSSFXMLStreamRowSource

class HeaderlessExcelCellRowSource(val ws: Sheet) extends Iterator[Seq[Cell]] with ColumnDefinitions {
  require(ws != null)

  protected val mergedRegions = for (i <- 0 until ws.getNumMergedRegions()) yield ws.getMergedRegion(i)
  protected var currentRowIdx: Int = 0
  val fromCellRange = new Function2[Cell, CellRangeAddress, Seq[Cell]] {
    def apply(c: Cell, r: CellRangeAddress): Seq[Cell] = {
      if (c.getColumnIndex() == r.getFirstColumn()) {
        val refRangeCell = c.getSheet().getRow(r.getFirstRow()).getCell(r.getFirstColumn())
        for (i <- r.getFirstColumn() to r.getLastColumn()) yield refRangeCell
      }
      else Seq()
    }
  }
  val colDefs = ColumnDefinitionAdapter(getRow(fromCellRange, 0).size, 0).colDefs

  private def getRow(f: (Cell, CellRangeAddress) => Seq[Cell], rowIdx: Int): Seq[Cell] = {
    val row = ws.getRow(rowIdx)
    Option(row).map { r =>
      val cells = (0 to (r.getLastCellNum - 1)).map(r.getCell(_))
      cells.flatMap {
        cell => Option(cell).flatMap {c => mergedRegions.find {m => m.isInRange(c.getRowIndex(), c.getColumnIndex()) }.map {f(c, _)} }.getOrElse(Seq(cell))
      }
    }.getOrElse(Seq())
  }

  def nextWithCellRangeStrategy(f: (Cell, CellRangeAddress) => Seq[Cell]): Seq[Cell] = {
    if (hasNext) {
      val row = getRow(f, currentRowIdx)
      currentRowIdx += 1
      row
    }
    else
      null
  }

  def next: Seq[Cell] = nextWithCellRangeStrategy(fromCellRange)
  def hasNext = currentRowIdx <= ws.getLastRowNum
}

class ExcelCellRowSource(ws: Sheet, val columnDefinitionAdapter: ColumnDefinitionAdapter)
  extends HeaderlessExcelCellRowSource(ws) with AdapterColumnDefinitions with Resizable[Cell] {

  private sealed class ProxyNullRowRangeIterator(i: HeaderlessExcelCellRowSource) extends Iterator[Seq[Cell]] with Proxy {
    def self = i
    val nullifyRowCellRange = new Function2[Cell, CellRangeAddress, Seq[Cell]] {
      def apply(c: Cell, r: CellRangeAddress): Seq[Cell] = {
        if (c.getColumnIndex() == r.getFirstColumn()) for (i <- r.getFirstColumn() to r.getLastColumn()) yield c
        else Seq()
      }
    }
    def next = { resize(self.nextWithCellRangeStrategy(nullifyRowCellRange), colDefs) }
    def hasNext = self.hasNext
  }

  override val colDefs = columnDefinitionAdapter.extractColDefs(new ProxyNullRowRangeIterator(this))
}

class ExcelRowSource(excelIterator: Iterator[Seq[String]] with ColumnDefinitions)
extends AbstractIterator[Seq[String]] with ColumnDefinitions with Resizable[String] with CloseableIterator[Seq[String]] {
  def colDefs = excelIterator.colDefs
  def next: Seq[String] = resize(excelIterator.next, colDefs)
  def hasNext = excelIterator.hasNext
  def close() = com.ms.qaTools.closeAny(excelIterator)
}

class ExcelWorkBook(val wb: Workbook, val os: OutputStream, val isXlsx: Boolean) extends Closeable {
  def write() = wb.write(os)
  def close = os.close()
}

object ExcelWorkBook {
  import scala.language.implicitConversions

  def apply() = new HSSFWorkbook()
  def apply(file: File): Workbook = WorkbookFactory.create(file, null, true)
  def apply(inputStream: InputStream): Workbook = WorkbookFactory.create(inputStream)
  def apply(outputStream: OutputStream, isXlsx: Boolean = false): ExcelWorkBook =
    if (isXlsx) ExcelXmlWorkBook(outputStream)
    else new ExcelWorkBook(ExcelWorkBook(), outputStream, isXlsx)

  implicit def wtowb(w: ExcelWorkBook): Workbook = w.wb
}

object ExcelXmlWorkBook {
  def apply() = new SXSSFWorkbook()
  def apply(file: File): Workbook = ExcelWorkBook(file)
  def apply(inputStream: InputStream): Workbook = ExcelWorkBook(inputStream)
  def apply(outputStream: OutputStream): ExcelWorkBook = new ExcelWorkBook(ExcelXmlWorkBook(), outputStream, true) {
    override def close = {
      super.close()
      wb.asInstanceOf[SXSSFWorkbook].dispose()
    }
  }
}

object ExcelWorkSheet {
  def apply(wb: Workbook, wsName: String): Sheet = wb.getSheet(wsName)
  def apply(wb: Workbook): Sheet = wb.getSheetAt(0)
}

object ExcelCellRowSource {
  def apply(wb: Workbook, wsName: String, columnDefinitionAdapter: ColumnDefinitionAdapter = StreamingColumnDefinitionAdapter()): ExcelCellRowSource = {
    val ws = if (wsName == null) wb.getSheetAt(0) else wb.getSheet(wsName)
    if (ws == null) throw new Exception("Can't get worksheet")
    new ExcelCellRowSource(ws, columnDefinitionAdapter)
  }
}

object ExcelRowSource {

  def isXlsx(file: File) = {
    if (!file.exists) throw new FileNotFoundException(file.toString())
    try {
      val fs = new NPOIFSFileSystem(file)
      new HSSFWorkbook(fs.getRoot(), true)
      false
    }
    catch {
      case e: OfficeXmlFileException => {
        OPCPackage.open(file)
        true
      }
      case t: Throwable => throw new Exception("Can't check if file: '%s' is an XLSX file.".format(file.getAbsolutePath), t)
    }
  }

  /*
   * No support for InputStream as we would have to buffer the whole file.
   * Using file has less memory usage
   */
  def apply(file: File, wsName: String, colNameRows: Int = 1, firstRow: Int = 0, multiPartColNameSep: String = ".", headerless: Boolean = false, columns: Seq[ColumnDefinition] = Nil, transformColDefs: Seq[ColumnDefinition] => Seq[ColumnDefinition] = identity[Seq[ColumnDefinition]]): ExcelRowSource = {
    val colDefAdapter =
      if (! columns.isEmpty)
        new SimpleColumnDefinitionAdapter(columns, firstRow)
      else
        StreamingColumnDefinitionAdapter(colNameRows = colNameRows, multiPartColNameSep = multiPartColNameSep, skipRows = firstRow, transformColDefs = transformColDefs)
    if (isXlsx(file)) new ExcelRowSource(XSSFXMLStreamRowSource(file, wsName, colDefAdapter)) else {
      val wb = ExcelWorkBook(file)
      new ExcelRowSource(ExcelCellRowSource(wb, wsName, colDefAdapter)) {
        override def close() = {
          super.close()
          wb.close()
        }
      }
    }
  }
}
/*
Copyright 2017 Morgan Stanley

Licensed under the GNU Lesser General Public License Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.gnu.org/licenses/lgpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS PROGRAM:

THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY
WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY
USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED
LICENSE TERMS.
*/
