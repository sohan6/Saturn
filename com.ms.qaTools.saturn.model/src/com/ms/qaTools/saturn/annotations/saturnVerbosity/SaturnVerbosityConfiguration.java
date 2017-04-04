/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.annotations.saturnVerbosity;

import com.ms.qaTools.saturn.types.AbstractAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Configuration</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#getVerbosity <em>Verbosity</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityPackage#getSaturnVerbosityConfiguration()
 * @model extendedMetaData="name='SaturnVerbosityConfiguration' kind='elementOnly'"
 * @generated
 */
public interface SaturnVerbosityConfiguration extends AbstractAnnotation
{
  /**
   * Returns the value of the '<em><b>Verbosity</b></em>' attribute.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verbosity</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verbosity</em>' attribute.
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum
   * @see #isSetVerbosity()
   * @see #unsetVerbosity()
   * @see #setVerbosity(VerbosityEnum)
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityPackage#getSaturnVerbosityConfiguration_Verbosity()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='element' name='verbosity' namespace='##targetNamespace'"
   * @generated
   */
  VerbosityEnum getVerbosity();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#getVerbosity <em>Verbosity</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Verbosity</em>' attribute.
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum
   * @see #isSetVerbosity()
   * @see #unsetVerbosity()
   * @see #getVerbosity()
   * @generated
   */
  void setVerbosity(VerbosityEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#getVerbosity <em>Verbosity</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetVerbosity()
   * @see #getVerbosity()
   * @see #setVerbosity(VerbosityEnum)
   * @generated
   */
  void unsetVerbosity();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#getVerbosity <em>Verbosity</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Verbosity</em>' attribute is set.
   * @see #unsetVerbosity()
   * @see #getVerbosity()
   * @see #setVerbosity(VerbosityEnum)
   * @generated
   */
  boolean isSetVerbosity();

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
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityPackage#getSaturnVerbosityConfiguration_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#isEnabled <em>Enabled</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

} // SaturnVerbosityConfiguration
