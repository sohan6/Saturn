package com.ms.qaTools.saturn.modules.sqlModule;

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>SQL Call Operation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getOutputResource <em>Output Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getParameterResource <em>Parameter Resource</em>}
 * </li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getProcedureCalls <em>Procedure Calls</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getDefaultOutputResourceType <em>Default Output
 * Resource Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getSQLCallOperation()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl executable='Saturn::Module::SQL::Call::Executable'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib createUpdater='true' name='sqlCall'"
 *        extendedMetaData="name='Call' kind='elementOnly'"
 * @generated
 */
public interface SQLCallOperation extends AbstractSQLOperation
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
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getSQLCallOperation_OutputResource()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='OutputResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getOutputResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getOutputResource <em>Output Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Resource</em>' containment reference.
   * @see #getOutputResource()
   * @generated
   */
  void setOutputResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Parameter Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Resource</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Resource</em>' containment reference.
   * @see #setParameterResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getSQLCallOperation_ParameterResource()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ParameterResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getParameterResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getParameterResource <em>Parameter Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Resource</em>' containment reference.
   * @see #getParameterResource()
   * @generated
   */
  void setParameterResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Procedure Calls</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure Calls</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure Calls</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getSQLCallOperation_ProcedureCalls()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ProcedureCalls' namespace='##targetNamespace'"
   * @generated
   */
  EList<ProcCallDefinition> getProcedureCalls();

  /**
   * Returns the value of the '<em><b>Default Output Resource Type</b></em>' attribute.
   * The default value is <code>"CSV"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Output Resource Type</em>' attribute isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Output Resource Type</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum
   * @see #isSetDefaultOutputResourceType()
   * @see #unsetDefaultOutputResourceType()
   * @see #setDefaultOutputResourceType(IOFileTypesEnum)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getSQLCallOperation_DefaultOutputResourceType()
   * @model default="CSV" unsettable="true"
   *        extendedMetaData="kind='attribute' name='defaultOutputResourceType'"
   * @generated
   */
  IOFileTypesEnum getDefaultOutputResourceType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getDefaultOutputResourceType <em>Default Output Resource Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Output Resource Type</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum
   * @see #isSetDefaultOutputResourceType()
   * @see #unsetDefaultOutputResourceType()
   * @see #getDefaultOutputResourceType()
   * @generated
   */
  void setDefaultOutputResourceType(IOFileTypesEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getDefaultOutputResourceType <em>Default Output Resource Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDefaultOutputResourceType()
   * @see #getDefaultOutputResourceType()
   * @see #setDefaultOutputResourceType(IOFileTypesEnum)
   * @generated
   */
  void unsetDefaultOutputResourceType();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getDefaultOutputResourceType <em>Default Output Resource Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Default Output Resource Type</em>' attribute is set.
   * @see #unsetDefaultOutputResourceType()
   * @see #getDefaultOutputResourceType()
   * @see #setDefaultOutputResourceType(IOFileTypesEnum)
   * @generated
   */
  boolean isSetDefaultOutputResourceType();

} // SQLCallOperation
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
