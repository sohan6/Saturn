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
package com.ms.qaTools.saturn.modules.xmlManipModule;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Where Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation#getXPath <em>XPath</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation#isExclude <em>Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getWhereOperation()
 * @model extendedMetaData="name='WhereOperation' kind='elementOnly'"
 * @generated
 */
public interface WhereOperation extends AbstractOperation
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
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getWhereOperation_XPath()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='XPath' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getXPath();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation#getXPath <em>XPath</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>XPath</em>' containment reference.
   * @see #getXPath()
   * @generated
   */
  void setXPath(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Exclude</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Exclude</em>' attribute.
   * @see #isSetExclude()
   * @see #unsetExclude()
   * @see #setExclude(boolean)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getWhereOperation_Exclude()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='exclude'"
   * @generated
   */
  boolean isExclude();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation#isExclude <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude</em>' attribute.
   * @see #isSetExclude()
   * @see #unsetExclude()
   * @see #isExclude()
   * @generated
   */
  void setExclude(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation#isExclude <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetExclude()
   * @see #isExclude()
   * @see #setExclude(boolean)
   * @generated
   */
  void unsetExclude();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation#isExclude <em>Exclude</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Exclude</em>' attribute is set.
   * @see #unsetExclude()
   * @see #isExclude()
   * @see #setExclude(boolean)
   * @generated
   */
  boolean isSetExclude();

} // WhereOperation
