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
package com.ms.qaTools.saturn.modules.soapIOModule;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Abstract Soap IO Operation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation#getTimeOut <em>Time Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getAbstractSoapIOOperation()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractSoapIOOperation' kind='elementOnly'"
 * @generated
 */
public interface AbstractSoapIOOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Request Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Request Id</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Request Id</em>' containment reference.
   * @see #setRequestId(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getAbstractSoapIOOperation_RequestId()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='RequestId' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getRequestId();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation#getRequestId <em>Request Id</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Request Id</em>' containment reference.
   * @see #getRequestId()
   * @generated
   */
  void setRequestId(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Time Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Out</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Out</em>' containment reference.
   * @see #setTimeOut(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getAbstractSoapIOOperation_TimeOut()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='TimeOut' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTimeOut();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation#getTimeOut <em>Time Out</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Out</em>' containment reference.
   * @see #getTimeOut()
   * @generated
   */
  void setTimeOut(ComplexValue value);

} // AbstractSoapIOOperation
