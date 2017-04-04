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

import java.math.BigInteger;

import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Shift Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#getOutputResource <em>Output Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#getCount <em>Count</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemain <em>Remain</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemove <em>Remove</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getShiftOperation()
 * @model extendedMetaData="name='ShiftOperation' kind='elementOnly'"
 * @generated
 */
public interface ShiftOperation extends AbstractOperation
{
  /**
   * Returns the value of the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Resource</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Resource</em>' containment reference.
   * @see #setOutputResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getShiftOperation_OutputResource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='OutputResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getOutputResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#getOutputResource <em>Output Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Resource</em>' containment reference.
   * @see #getOutputResource()
   * @generated
   */
  void setOutputResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Count</b></em>' attribute. The default value is <code>"1"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Count</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Count</em>' attribute.
   * @see #isSetCount()
   * @see #unsetCount()
   * @see #setCount(BigInteger)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getShiftOperation_Count()
   * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='count'"
   * @generated
   */
  BigInteger getCount();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #isSetCount()
   * @see #unsetCount()
   * @see #getCount()
   * @generated
   */
  void setCount(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCount()
   * @see #getCount()
   * @see #setCount(BigInteger)
   * @generated
   */
  void unsetCount();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#getCount <em>Count</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Count</em>' attribute is set.
   * @see #unsetCount()
   * @see #getCount()
   * @see #setCount(BigInteger)
   * @generated
   */
  boolean isSetCount();

  /**
   * Returns the value of the '<em><b>Remain</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remain</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Remain</em>' attribute.
   * @see #isSetRemain()
   * @see #unsetRemain()
   * @see #setRemain(boolean)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getShiftOperation_Remain()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='remain'"
   * @generated
   */
  boolean isRemain();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemain <em>Remain</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Remain</em>' attribute.
   * @see #isSetRemain()
   * @see #unsetRemain()
   * @see #isRemain()
   * @generated
   */
  void setRemain(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemain <em>Remain</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetRemain()
   * @see #isRemain()
   * @see #setRemain(boolean)
   * @generated
   */
  void unsetRemain();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemain <em>Remain</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Remain</em>' attribute is set.
   * @see #unsetRemain()
   * @see #isRemain()
   * @see #setRemain(boolean)
   * @generated
   */
  boolean isSetRemain();

  /**
   * Returns the value of the '<em><b>Remove</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Remove</em>' attribute.
   * @see #isSetRemove()
   * @see #unsetRemove()
   * @see #setRemove(boolean)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getShiftOperation_Remove()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='remove'"
   * @generated
   */
  boolean isRemove();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemove <em>Remove</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Remove</em>' attribute.
   * @see #isSetRemove()
   * @see #unsetRemove()
   * @see #isRemove()
   * @generated
   */
  void setRemove(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemove <em>Remove</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetRemove()
   * @see #isRemove()
   * @see #setRemove(boolean)
   * @generated
   */
  void unsetRemove();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemove <em>Remove</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Remove</em>' attribute is set.
   * @see #unsetRemove()
   * @see #isRemove()
   * @see #setRemove(boolean)
   * @generated
   */
  boolean isSetRemove();

} // ShiftOperation
