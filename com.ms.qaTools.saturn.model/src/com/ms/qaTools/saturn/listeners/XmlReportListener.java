/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 *
 * $Id$
 */
package com.ms.qaTools.saturn.listeners;

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.types.AbstractListener;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xml Report Listener</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.listeners.XmlReportListener#getXmlFiles <em>Xml Files</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getXmlReportListener()
 * @model extendedMetaData="name='XmlReportListener' kind='elementOnly'"
 * @generated
 */
public interface XmlReportListener extends AbstractListener
{
  /**
   * Returns the value of the '<em><b>Xml Files</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.listeners.XmlFile}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xml Files</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xml Files</em>' containment reference list.
   * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getXmlReportListener_XmlFiles()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='XmlFiles' namespace='##targetNamespace'"
   * @generated
   */
  EList<XmlFile> getXmlFiles();

} // XmlReportListener
