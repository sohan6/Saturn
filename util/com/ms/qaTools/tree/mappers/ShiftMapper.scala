package com.ms.qaTools.tree.mappers

import com.ms.qaTools.tree.XmlNode
import javax.xml.namespace.NamespaceContext
import com.ms.qaTools.conversions.XmlToTreeNodeConversions._
import com.ms.qaTools.io.rowWriter.file.XmlRowWriter
import com.ms.qaTools.io.rowSource.Utils._
import com.ms.qaTools.io._
import com.ms.qaTools.conversions.JavaIOConversions._
import java.io.FileWriter



/*
 * By default will put to file the shifted docs and the remainder is available
 * to the next mappers
 */
case class XmlNodeShiftMapper(
  shift: Int = 1,
  fileName: String = null,
  keepShifted: Boolean = false,
  keepRemainder: Boolean = false,
  shiftedToFile: Boolean = false,
  remainderToFile: Boolean = false)
  extends XmlNodeManyToManyMapper {

  override def apply(optionNodes: Seq[Option[XmlNode]]): Seq[Option[XmlNode]] = {
    val (shifted, remainder) = optionNodes.filter(_ != None).splitAt(shift)
    if (fileName != null) {
      val xmlRowWriter = new XmlRowWriter(new FileWriter(fileName))

      if(shiftedToFile && remainderToFile) xmlRowWriter.write((shifted ++ remainder).flatten.map{_.node.toDocument}.toIterator)
      else if(shiftedToFile)               xmlRowWriter.write(shifted.flatten.map{_.node.toDocument}.toIterator)
      else if(remainderToFile)             xmlRowWriter.write(remainder.flatten.map{_.node.toDocument}.toIterator)
    }

    if ((keepShifted && keepRemainder) || (!keepShifted && !keepRemainder)) optionNodes
    else if (keepShifted) shifted
    else remainder
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
