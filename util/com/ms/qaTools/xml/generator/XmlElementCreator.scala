package com.ms.qaTools.xml.generator

import scala.annotation.tailrec
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import com.ms.qaTools.Logger
import com.ms.qaTools.io.DelimitedRow
import com.ms.qaTools.tree.generator.ColContext
import com.ms.qaTools.tree.generator.Lookupable
import com.ms.qaTools.tree.generator.NodeCreator
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.xml.xpath.XPath
import com.ms.qaTools.xml.xpath.XPath
import org.w3c.dom.Attr



class XmlElementCreator(val elem: Element,
                        val childCreators: List[NodeCreator[Document, Node]],
                        val attrCreators: List[XmlAttributeCreator])
  extends XmlInnerNodeCreator {
  require(elem != null, "text node must not be null")
  require(childCreators != null, "childCreators must not be null")
  require(attrCreators != null, "attrCreators must not be null")

  val logger = Logger(getClass)
  val xmlGenNsUri = "http://www.ms.com/qaTools/xmlGenerator/2007"
  val name = elem.getTagName()
  val nsUri = elem.getNamespaceURI()
  implicit val nsContext = NamespaceContextImpl(Map("x" -> xmlGenNsUri))
  override val isLocal: Boolean = false
  
  def cleanUpNode(node: Node): Node = {
    val nodes = XPath("*[namespace-uri()='" + xmlGenNsUri + "'] | @*[namespace-uri()='" + xmlGenNsUri + "'] | namespace::*[. = '" + xmlGenNsUri + "']") asNodes(node)
    nodes.foldLeft(node) {
      (node,n) =>
        n match {
          case a: Attr => node.getAttributes().removeNamedItemNS(a.getNamespaceURI(), a.getLocalName())
          case n: Node => node.removeChild(n)
        }
        node
    }     
  }

  def create(data: DelimitedRow)(implicit colMap: Lookupable, colContext: ColContext, doc: Document): Node = {   
    def createNewElement0(): Node = {
      @tailrec 
      def applyModifiers0(e: Node, row: DelimitedRow, modifiers: Seq[ElementModifier]): Node = {
        if (modifiers.isEmpty) e
        else {
          modifiers.head(e, row, colContext, colMap) match {
            case Some(nn) => applyModifiers0(nn, row, modifiers.tail)
            case None     => e.getOwnerDocument().createDocumentFragment()
          }
        }
      }      
      val newElem = doc.createElement(name)
      val (modifiers, elementCreators) = childCreators.partition { _.isInstanceOf[XmlElementModifierCreator] }
      elementCreators map { _.create(data) } foreach { newElem.appendChild(_) }
      attrCreators map { _.create(data) } foreach { newElem.setAttributeNode(_) }
      applyModifiers0(cleanUpNode(newElem), data, modifiers.map { m => ElementModifier(m.create(data)) })
    }
    val cLocalIterators = this.adjustedIterators
    if (cLocalIterators.isEmpty) { createNewElement0() }
    else {
      val fragment = doc.createDocumentFragment
      for (iterator <- cLocalIterators) colContext.nextIndex(iterator)
      while (cLocalIterators.forall(!colContext.iteratorIsFinished(_, data))) {
        fragment.appendChild(createNewElement0())
        for (iterator <- cLocalIterators) colContext.nextIndex(iterator)
      }
      fragment
    }
  }

  override def creators: Seq[NodeCreator[Document, Node]] = childCreators ++ attrCreators
  override def toString: String = "XmlElementCreator(<" + elem.getTagName() + "/>, (" +
    childCreators.mkString(",") + "), (" +
    attrCreators.mkString(",") + "))"
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
