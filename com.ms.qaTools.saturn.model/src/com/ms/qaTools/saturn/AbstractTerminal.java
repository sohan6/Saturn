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
package com.ms.qaTools.saturn;

import com.ms.qaTools.saturn.types.RepetitionActionsEnum;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Abstract Terminal</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.AbstractTerminal#getRepetitionAction <em>Repetition Action</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractTerminal#getTerminationStatus <em>Termination Status</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractTerminal()
 * @model abstract="true" extendedMetaData="name='AbstractTerminal' kind='elementOnly'"
 * @generated
 */
public interface AbstractTerminal extends AbstractStep
{
  /**
   * Returns the value of the '<em><b>Repetition Action</b></em>' attribute. The default value is <code>"NONE"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.types.RepetitionActionsEnum}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repetition Action</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Repetition Action</em>' attribute.
   * @see com.ms.qaTools.saturn.types.RepetitionActionsEnum
   * @see #isSetRepetitionAction()
   * @see #unsetRepetitionAction()
   * @see #setRepetitionAction(RepetitionActionsEnum)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractTerminal_RepetitionAction()
   * @model default="NONE" unsettable="true" extendedMetaData="kind='attribute' name='repetitionAction'"
   * @generated
   */
  RepetitionActionsEnum getRepetitionAction();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractTerminal#getRepetitionAction <em>Repetition Action</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Repetition Action</em>' attribute.
   * @see com.ms.qaTools.saturn.types.RepetitionActionsEnum
   * @see #isSetRepetitionAction()
   * @see #unsetRepetitionAction()
   * @see #getRepetitionAction()
   * @generated
   */
  void setRepetitionAction(RepetitionActionsEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.AbstractTerminal#getRepetitionAction <em>Repetition Action</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetRepetitionAction()
   * @see #getRepetitionAction()
   * @see #setRepetitionAction(RepetitionActionsEnum)
   * @generated
   */
  void unsetRepetitionAction();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.AbstractTerminal#getRepetitionAction <em>Repetition Action</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Repetition Action</em>' attribute is set.
   * @see #unsetRepetitionAction()
   * @see #getRepetitionAction()
   * @see #setRepetitionAction(RepetitionActionsEnum)
   * @generated
   */
  boolean isSetRepetitionAction();

  /**
   * Returns the value of the '<em><b>Termination Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Termination Status</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Termination Status</em>' attribute.
   * @see #setTerminationStatus(String)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractTerminal_TerminationStatus()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='terminationStatus'"
   * @generated
   */
  String getTerminationStatus();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractTerminal#getTerminationStatus <em>Termination Status</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Termination Status</em>' attribute.
   * @see #getTerminationStatus()
   * @generated
   */
  void setTerminationStatus(String value);

} // AbstractTerminal
