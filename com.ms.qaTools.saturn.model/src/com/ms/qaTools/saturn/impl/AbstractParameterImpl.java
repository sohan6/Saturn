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
package com.ms.qaTools.saturn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.AbstractParameter;
import com.ms.qaTools.saturn.SaturnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Parameter</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractParameterImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractParameterImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class AbstractParameterImpl extends EObjectImpl implements AbstractParameter
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String  NAME_EDEFAULT         = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String               name                  = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIsMandatory()
   * @generated
   * @ordered
   */
  protected static final boolean IS_MANDATORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIsMandatory()
   * @generated
   * @ordered
   */
  protected boolean              isMandatory           = IS_MANDATORY_EDEFAULT;

  /**
   * This is true if the Is Mandatory attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              isMandatoryESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AbstractParameterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SaturnPackage.Literals.ABSTRACT_PARAMETER;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsMandatory()
  {
    return isMandatory;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIsMandatory(boolean newIsMandatory)
  {
    boolean oldIsMandatory = isMandatory;
    isMandatory = newIsMandatory;
    boolean oldIsMandatoryESet = isMandatoryESet;
    isMandatoryESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_PARAMETER__IS_MANDATORY, oldIsMandatory, isMandatory, !oldIsMandatoryESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIsMandatory()
  {
    boolean oldIsMandatory = isMandatory;
    boolean oldIsMandatoryESet = isMandatoryESet;
    isMandatory = IS_MANDATORY_EDEFAULT;
    isMandatoryESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.ABSTRACT_PARAMETER__IS_MANDATORY, oldIsMandatory, IS_MANDATORY_EDEFAULT, oldIsMandatoryESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIsMandatory()
  {
    return isMandatoryESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SaturnPackage.ABSTRACT_PARAMETER__NAME:
        return getName();
      case SaturnPackage.ABSTRACT_PARAMETER__IS_MANDATORY:
        return isIsMandatory();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SaturnPackage.ABSTRACT_PARAMETER__NAME:
        setName((String)newValue);
        return;
      case SaturnPackage.ABSTRACT_PARAMETER__IS_MANDATORY:
        setIsMandatory((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SaturnPackage.ABSTRACT_PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SaturnPackage.ABSTRACT_PARAMETER__IS_MANDATORY:
        unsetIsMandatory();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SaturnPackage.ABSTRACT_PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SaturnPackage.ABSTRACT_PARAMETER__IS_MANDATORY:
        return isSetIsMandatory();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", isMandatory: ");
    if (isMandatoryESet) result.append(isMandatory); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // AbstractParameterImpl
