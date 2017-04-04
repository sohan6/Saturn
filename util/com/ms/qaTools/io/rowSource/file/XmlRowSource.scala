package com.ms.qaTools.io.rowSource.file
import com.ms.qaTools.io.rowSource.internal.StreamingReader
import com.ms.qaTools.io.rowSource.NamespaceDefinitions
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.xml.NamespaceContextImpl
import java.io.Closeable
import java.io.File
import java.io.FileReader
import java.io.{Reader => JReader}
import java.io.StringReader
import org.w3c.dom.Document
import scala.annotation.tailrec

class XmlRowSource(reader: JReader, val namespaceContext: NamespaceContextImpl = NamespaceContextImpl(), bufSize: Int = 4 * 1024)
extends Iterator[Document] with Closeable with NamespaceDefinitions {
  val streamingBuffer = new StreamingReader(reader, bufSize)
  def parse: String = {
    val sb = new StringBuilder(bufSize)
    var balanced = 0
    @tailrec def readElement0(): String = {
      sb.append(streamingBuffer.dropUntil("<", true))
      val tagIndicator = streamingBuffer.drop
      sb.append(tagIndicator)
      tagIndicator match {
        case '!' => {
          val dbldashes = "--"
          val cDataStart = "[CDATA["
          val cDataEnd = "]]"

          if (streamingBuffer.headIs(dbldashes)) { //is a comment
            sb.append(streamingBuffer.dropUntil(dbldashes + ">", true))
          } else if (streamingBuffer.headIs(cDataStart)) { //is a cdata section
            sb.append(streamingBuffer.dropUntil(cDataEnd + ">", true))
          } else {
            var declBalanced = 1
            while (declBalanced > 0) {
              sb.append(streamingBuffer.dropUntilRegex("""\<|\>""".r, false))
              if (streamingBuffer.headIs("<")) declBalanced += 1 else declBalanced -= 1
              sb.append(streamingBuffer.drop)
            }
          }
          readElement0()
        }
        case '?' => {
          sb.append(streamingBuffer.dropUntil("?>", true))
          readElement0()
        }
        case '/' => {
          sb.append(streamingBuffer.dropUntil(">", true))
          balanced -= 1
          if (balanced == 0) sb.toString else readElement0()
        }
        case c: Char => {
          balanced += 1
          sb.append(streamingBuffer.dropUntil(">", false))
          if (sb.last == '/') balanced -= 1
          val closingTag = streamingBuffer.drop
          if (closingTag == StreamingReader.NUL) 
            throw new Exception(s"The xml message '${sb.toString()}' appears to be malformed.")
          else {
            sb.append(closingTag) // the '>'
            if (balanced == 0) sb.toString else readElement0()
          }
        }
      }
    }
    readElement0().trim()
  }

  def hasNext = {
    streamingBuffer.removeWhitespace
    !streamingBuffer.atEnd
  }

  def next: Document = parse.toDocument
  def close = reader.close()
}

object XmlRowSource {
  def apply(reader: JReader, namespaces: NamespaceContextImpl = NamespaceContextImpl()) =
    new XmlRowSource(reader, namespaces)
}

object XmlFileRowSource {
  def apply(fileName: String): XmlRowSource = apply(new File(fileName))
  def apply(file: File, namespaces: NamespaceContextImpl = NamespaceContextImpl()): XmlRowSource =
    XmlRowSource(new FileReader(file))
}

object XmlBufferRowSource {
  def apply(content: String, namespaces: NamespaceContextImpl = NamespaceContextImpl()) =
    XmlRowSource(new StringReader(content))
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
