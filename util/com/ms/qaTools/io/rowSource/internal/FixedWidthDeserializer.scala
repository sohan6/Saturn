package com.ms.qaTools.io.rowSource.internal
import com.ms.qaTools.complexValues.Resolver
import com.ms.qaTools.ecore.utils.ECoreXmlDeserializer
import com.ms.qaTools.generated.{fixedWidth => M}
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.FixedWidth
import scala.collection.JavaConversions.asScalaBuffer

object FixedWidthDeserializer extends ECoreXmlDeserializer[M.FixedWidthConfig] {
  val packageInstance = M.FixedWidthPackage.eINSTANCE
  val rootFeature = M.FixedWidthPackage.eINSTANCE.getDocumentRoot_FixedWidthConfig()
  val resourceFactory = new M.util.FixedWidthResourceFactoryImpl()

  def extractAllColDefs(config: M.FixedWidthConfig) =
    extractRootColDefs(config) ++ extractSwitchColDefs(config)

  def extractRootColDefs(config: M.FixedWidthConfig): Seq[M.ColDef] =
    config.getColDefs.filter(!_.isOmitted)

  def extractSwitchColDefs(config: M.FixedWidthConfig): Seq[M.ColDef] =
    for {
      switch     <- config.getSwitches
      switchCase <- switch.getCases.filter(!_.isOmitted)
      colDef     <- switchCase.getColDefs.filter(!_.isOmitted)
    } yield colDef

  def createColumnDefinitions(colDefs: Seq[M.ColDef]) =
    colDefs.zipWithIndex.map{case (colDef, i) =>
      new ColumnDefinition(colDef.getName, None, i) with FixedWidth {
        val width = colDef.getWidth.intValue

        val caseCondition = colDef.eContainer match {
          case sc: M.SwitchCase => Some((new Resolver).resolve(sc.getCondition))
          case _               => None
        }
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