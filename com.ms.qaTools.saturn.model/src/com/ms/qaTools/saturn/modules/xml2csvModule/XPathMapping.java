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
package com.ms.qaTools.saturn.modules.xml2csvModule;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>XPath Mapping</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#getXPath <em>XPath</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#getColumn <em>Column</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXPathMapping()
 * @model extendedMetaData="name='XPathMappings_._type' kind='elementOnly'"
 * @generated
 */
public interface XPathMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>XPath</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XPath</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XPath</em>' containment reference.
   * @see #setXPath(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXPathMapping_XPath()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='XPath' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getXPath();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#getXPath <em>XPath</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>XPath</em>' containment reference.
   * @see #getXPath()
   * @generated
   */
  void setXPath(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' containment reference.
   * @see #setColumn(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXPathMapping_Column()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Column' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getColumn();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#getColumn <em>Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' containment reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #setEnabled(boolean)
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXPathMapping_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='1'"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#isEnabled <em>Enabled</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

} // XPathMapping
