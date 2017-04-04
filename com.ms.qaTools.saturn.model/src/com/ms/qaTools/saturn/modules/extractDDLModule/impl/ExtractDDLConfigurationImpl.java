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
package com.ms.qaTools.saturn.modules.extractDDLModule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.modules.extractDDLModule.AbstractOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLConfiguration;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Extract DDL Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLConfigurationImpl#getEnvFile <em>Env File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLConfigurationImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtractDDLConfigurationImpl extends EObjectImpl implements ExtractDDLConfiguration
{
  /**
   * The cached value of the '{@link #getEnvFile() <em>Env File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvFile()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition  envFile;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<AbstractOperation> operations;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ExtractDDLConfigurationImpl()
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
    return ExtractDDLModulePackage.Literals.EXTRACT_DDL_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getEnvFile()
  {
    return envFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnvFile(NamedResourceDefinition newEnvFile, NotificationChain msgs)
  {
    NamedResourceDefinition oldEnvFile = envFile;
    envFile = newEnvFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__ENV_FILE, oldEnvFile, newEnvFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEnvFile(NamedResourceDefinition newEnvFile)
  {
    if (newEnvFile != envFile)
    {
      NotificationChain msgs = null;
      if (envFile != null)
        msgs = ((InternalEObject)envFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__ENV_FILE, null, msgs);
      if (newEnvFile != null)
        msgs = ((InternalEObject)newEnvFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__ENV_FILE, null, msgs);
      msgs = basicSetEnvFile(newEnvFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__ENV_FILE, newEnvFile, newEnvFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractOperation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<AbstractOperation>(AbstractOperation.class, this, ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__OPERATIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__ENV_FILE:
        return basicSetEnvFile(null, msgs);
      case ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__ENV_FILE:
        return getEnvFile();
      case ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__OPERATIONS:
        return getOperations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__ENV_FILE:
        setEnvFile((NamedResourceDefinition)newValue);
        return;
      case ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends AbstractOperation>)newValue);
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
      case ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__ENV_FILE:
        setEnvFile((NamedResourceDefinition)null);
        return;
      case ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__OPERATIONS:
        getOperations().clear();
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
      case ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__ENV_FILE:
        return envFile != null;
      case ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION__OPERATIONS:
        return operations != null && !operations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // ExtractDDLConfigurationImpl
