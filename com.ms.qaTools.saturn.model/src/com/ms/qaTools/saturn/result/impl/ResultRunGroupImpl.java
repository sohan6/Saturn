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
package com.ms.qaTools.saturn.result.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.AbstractRunGroup;
import com.ms.qaTools.saturn.result.ResultPackage;
import com.ms.qaTools.saturn.result.ResultRunGroup;
import com.ms.qaTools.saturn.result.SaturnResult;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Run Group</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.result.impl.ResultRunGroupImpl#getRunGroupResult <em>Run Group Result</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.result.impl.ResultRunGroupImpl#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultRunGroupImpl extends SaturnResultImpl implements ResultRunGroup
{
  /**
   * The cached value of the '{@link #getRunGroupResult() <em>Run Group Result</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRunGroupResult()
   * @generated
   * @ordered
   */
  protected EList<SaturnResult> runGroupResult;

  /**
   * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getConfig()
   * @generated
   * @ordered
   */
  protected AbstractRunGroup    config;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ResultRunGroupImpl()
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
    return ResultPackage.Literals.RESULT_RUN_GROUP;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<SaturnResult> getRunGroupResult()
  {
    if (runGroupResult == null)
    {
      runGroupResult = new EObjectContainmentEList<SaturnResult>(SaturnResult.class, this, ResultPackage.RESULT_RUN_GROUP__RUN_GROUP_RESULT);
    }
    return runGroupResult;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractRunGroup getConfig()
  {
    return config;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfig(AbstractRunGroup newConfig, NotificationChain msgs)
  {
    AbstractRunGroup oldConfig = config;
    config = newConfig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.RESULT_RUN_GROUP__CONFIG, oldConfig, newConfig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setConfig(AbstractRunGroup newConfig)
  {
    if (newConfig != config)
    {
      NotificationChain msgs = null;
      if (config != null)
        msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.RESULT_RUN_GROUP__CONFIG, null, msgs);
      if (newConfig != null)
        msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.RESULT_RUN_GROUP__CONFIG, null, msgs);
      msgs = basicSetConfig(newConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.RESULT_RUN_GROUP__CONFIG, newConfig, newConfig));
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
      case ResultPackage.RESULT_RUN_GROUP__RUN_GROUP_RESULT:
        return ((InternalEList<?>)getRunGroupResult()).basicRemove(otherEnd, msgs);
      case ResultPackage.RESULT_RUN_GROUP__CONFIG:
        return basicSetConfig(null, msgs);
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
      case ResultPackage.RESULT_RUN_GROUP__RUN_GROUP_RESULT:
        return getRunGroupResult();
      case ResultPackage.RESULT_RUN_GROUP__CONFIG:
        return getConfig();
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
      case ResultPackage.RESULT_RUN_GROUP__RUN_GROUP_RESULT:
        getRunGroupResult().clear();
        getRunGroupResult().addAll((Collection<? extends SaturnResult>)newValue);
        return;
      case ResultPackage.RESULT_RUN_GROUP__CONFIG:
        setConfig((AbstractRunGroup)newValue);
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
      case ResultPackage.RESULT_RUN_GROUP__RUN_GROUP_RESULT:
        getRunGroupResult().clear();
        return;
      case ResultPackage.RESULT_RUN_GROUP__CONFIG:
        setConfig((AbstractRunGroup)null);
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
      case ResultPackage.RESULT_RUN_GROUP__RUN_GROUP_RESULT:
        return runGroupResult != null && !runGroupResult.isEmpty();
      case ResultPackage.RESULT_RUN_GROUP__CONFIG:
        return config != null;
    }
    return super.eIsSet(featureID);
  }

} // ResultRunGroupImpl