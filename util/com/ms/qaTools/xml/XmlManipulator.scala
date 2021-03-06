package com.ms.qaTools.xml
import com.ms.qaTools.tree.mappers._
import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.io.rowSource.file.XmlRowSource
import com.ms.qaTools.conversions.XmlToTreeNodeConversions._
import javax.xml.namespace.NamespaceContext
import org.w3c.dom.Node
import org.w3c.dom.Document

case class XmlManipulator(xmlRowSource: Iterator[Document], transformers: Seq[XmlNodeTransformer[_, _]], nsContext: NamespaceContext = new NamespaceContextImpl())
extends Iterator[Node] {
  lazy val transformedIterator =
    transformers.foldLeft(xmlDocsToTreeNodes(xmlRowSource)(nsContext))((rowSource, mapper) => {
      mapper match {
        case m: XmlNodeMapper             => rowSource.map(m(_))
        case f: XmlNodeFilter             => rowSource.filter(f(_))
        case mm: XmlNodeManyMapper        => rowSource.flatMap(mm(_))
        case m2m: XmlNodeManyToManyMapper => m2m(rowSource.toSeq).toIterator
        case o: XmlNodeComparator         => rowSource.toSeq.sortWith(Function.untupled(o)).toIterator
      }
    })

  def hasNext = transformedIterator.hasNext
  def next = transformedIterator.next match {
    case None      => next
    case Some(xml) => xml.node
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
