package com.ms.qaTools.toolkit.cmdLine

import groovy.lang.Closure
import org.kohsuke.args4j.{Option => A4JOption}
import com.ms.qaTools.interpreter.{Interpreter, GroovyInterpreter, ScalaInterpreter}
import com.ms.qaTools.interpreter.{InterpreterResult, GroovyInterpreterResult, ScalaInterpreterResult}
import com.ms.qaTools.io.rowSource.delimited.DelimitedParser
import com.ms.qaTools.io.SortedDelimitedIterator
import com.ms.qaTools.io.rowSource.file.CsvRowSource
import com.ms.qaTools.conversions.JavaIOConversions._
import com.ms.qaTools.io._
import com.ms.qaTools.io.rowSource.SimpleColumnDefinitionAdapter
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.StreamingColumnDefinitionAdapter
import com.ms.qaTools.io.rowSource.file.ExcelRowSource
import com.ms.qaTools.io.rowSource.file.DataRowSource
import com.ms.qaTools.io.rowSource.file.TsvRowSource
import com.ms.qaTools.io.rowSource.file.PsvRowSource
import com.ms.qaTools.io.rowSource.DsRowSourceCreator
import com.ms.qaTools.toolkit.{Passed, Failed}
import java.util.{List => JList}
import scala.collection.JavaConversions._
import com.ms.qaTools.io.rowSource.file.DelimitedRowSource
import com.ms.qaTools.io.rowSource.file.DelimitedIterator
import com.ms.qaTools.io.rowSource.ColumnDefinitionAdapter
import java.io.StringReader
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.ColumnDefinitions



trait InputDelimitedFile {
  @A4JOption(name = "--inFmt", usage = "specify input format: CSV (default) | EXCEL | PSV | TSV | DATA | CUSTOM")
  val inFmt: String = "CSV"

  @A4JOption(name = "-i", aliases = Array("--inFileName"), usage = "specify an input fileName", required = true)
  val inFileName: String = null

  @A4JOption(name = "--inWsName", usage = "specify the input worksheet name")
  val inWsName: String = null

  @A4JOption(name = "--inColNames", usage = "specify the input column names")
  val inColNames: String = null
    
  @A4JOption(name = "--inColNameRow", usage = "Specify the column names row")
  val inColNameRow: Int = 1  

  @A4JOption(name = "--inFirstRow", usage = "Number of the row to use as the col header (default 1)")
  val inFirstRow: Int = 0

  @A4JOption(name = "--inSeparatorChar", usage = "specify the field separator character (default: ',')")
  val inSeparatorChar: Char = DelimitedParser.DEFAULT_SEPARATOR

  @A4JOption(name = "--inQuoteChar", usage = "specify the quote character (default: '\"')")
  val inQuoteChar: Char = DelimitedParser.DEFAULT_QUOTE_CHARACTER

  @A4JOption(name = "--inEscapeChar", usage = "specify the escape character (default: '\"')")
  val inEscapeChar: Char = DelimitedParser.DEFAULT_ESCAPE_CHARACTER
  
  @A4JOption(name = "--inMultiPartColNameSeparator", usage = "Specify the multi part separator for columns. Default: \".\"")
  val inMultiPartColNameSeparator = "."
    
  @A4JOption(name = "--inHeaderless", usage = "set if the file is headerless")
  val inHeaderless: Boolean = false

  @A4JOption(name  = "--transformColDefsInterpreter",
             usage = "Specify the interpreter to use in --transformColDefs: GROOVY (default) | SCALA")
  val transformColDefsInterpreterStr: String = "GROOVY"

  def stringToInterpreter(s: String) = s.toUpperCase match {
    case "GROOVY" => GroovyInterpreter()
    case "SCALA"  => ScalaInterpreter(imports = Seq("com.ms.qaTools.io.rowSource.ColumnDefinition"))
    case _        => throw new IllegalArgumentException("Unsupported interpreter: " + s)
  }

  @A4JOption(name  = "--transformColDefs",
             usage = "Specify a function to transform ColumnDefinitions")
  val transformColDefsStr: String = null

  def transformColDefs(code: String,
                       interpreter: Interpreter[String, InterpreterResult]): (Seq[ColumnDefinition]) => Seq[ColumnDefinition] =
    Option(code) match {
      case Some(code) =>
        interpreter run code match {
          case GroovyInterpreterResult(Passed(), _, Some(closure), _) =>
            (colDefs: Seq[ColumnDefinition]) => {
              val jColDefs: JList[ColumnDefinition] = colDefs
              closure.asInstanceOf[Closure[JList[ColumnDefinition]]] call jColDefs
            }
          case ScalaInterpreterResult(Passed(), _, Some(function), _, _) =>
            function.asInstanceOf[(Seq[ColumnDefinition]) => Seq[ColumnDefinition]]
          case res @ _ =>
            throw new Exception(res.toString)
        }
      case None => identity[Seq[ColumnDefinition]] _
    }                      
                       
  def inColDefs: Seq[ColumnDefinition] = Option(inColNames).map {c => ColumnDefinition.fromColumnNames(DelimitedIterator(new StringReader(c),inSeparatorChar, Some(inQuoteChar), Some(inEscapeChar)).next)}.getOrElse(Nil)
                       
  def inRowSource = {
    val dsRowSourceCreator = DsRowSourceCreator(inFileName,
                                                Option(inWsName),                                                
                                                inFirstRow,
                                                inSeparatorChar,
                                                inQuoteChar,
                                                inEscapeChar,
                                                inMultiPartColNameSeparator,
                                                inColNameRow,
                                                inHeaderless,
                                                inColDefs,
                                                transformColDefs(transformColDefsStr, stringToInterpreter(transformColDefsInterpreterStr)) )
    
    try { dsRowSourceCreator.createRowSource(inFmt) }
    catch {
      case t: Throwable => throw new Exception("Couldn't create input dataset for format: " + inFmt, t)
    }
  }
  

}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
