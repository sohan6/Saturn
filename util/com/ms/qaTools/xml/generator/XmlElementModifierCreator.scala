package com.ms.qaTools.xml.generator
import org.w3c.dom.Element
import org.w3c.dom.Document
import org.w3c.dom.Node
import com.ms.qaTools.xml.xpath.XPath
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.tree.generator.Lookupable
import com.ms.qaTools.tree.generator.ColContext
import com.ms.qaTools.tree.generator.NodeCreator
import com.ms.qaTools.tree.generator.NodeCreator
import scala.annotation.tailrec
import com.ms.qaTools.tree.generator.ParameterizedText

class XmlElementModifierCreator(elem: Element, childCreators: List[NodeCreator[Document, Node]], attrCreators: List[XmlAttributeCreator])
extends XmlElementCreator(elem, childCreators, attrCreators) {
  override def toString: String = "XmlElementModifierCreator(<" + elem.getTagName() + "/>, (" +
    childCreators.mkString(",") + "))"

  override def create(data: Seq[String])(implicit colMap: Lookupable, colContext: ColContext, doc: Document): Node = {
    val newElem = super.create(data)
    if (elem.getAttribute("expandableRefs") == null || elem.getAttribute("expandableRefs").isEmpty() || ! elem.getAttribute("expandableRefs").toBoolean)
      newElem.setTextContent(elem.getTextContent())
    newElem
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
