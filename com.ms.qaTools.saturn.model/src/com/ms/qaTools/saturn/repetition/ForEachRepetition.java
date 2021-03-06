package com.ms.qaTools.saturn.repetition;

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.types.AbstractRepetitionHandler;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>For Each Repetition</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.repetition.ForEachRepetition#getDataSetResource <em>Data Set Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.repetition.ForEachRepetition#getColumnMappings <em>Column Mappings</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.repetition.RepetitionPackage#getForEachRepetition()
 * @model annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='forEachLoop'"
 *        extendedMetaData="name='ForEachRepetition' kind='elementOnly'"
 * @generated
 */
public interface ForEachRepetition extends AbstractRepetitionHandler
{
  /**
   * Returns the value of the '<em><b>Data Set Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Set Resource</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Set Resource</em>' containment reference.
   * @see #setDataSetResource(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.repetition.RepetitionPackage#getForEachRepetition_DataSetResource()
   * @model containment="true" required="true"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib accessor='dataSet' map='genDataSet'"
   *        extendedMetaData="kind='element' name='DataSetResource' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getDataSetResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.repetition.ForEachRepetition#getDataSetResource <em>Data Set Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Set Resource</em>' containment reference.
   * @see #getDataSetResource()
   * @generated
   */
  void setDataSetResource(NamedResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Column Mappings</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.repetition.ColumnMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Mappings</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Mappings</em>' containment reference list.
   * @see com.ms.qaTools.saturn.repetition.RepetitionPackage#getForEachRepetition_ColumnMappings()
   * @model containment="true"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib accessor='mappings'"
   *        extendedMetaData="kind='element' name='ColumnMappings' namespace='##targetNamespace'"
   * @generated
   */
  EList<ColumnMapping> getColumnMappings();

} // ForEachRepetition
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
