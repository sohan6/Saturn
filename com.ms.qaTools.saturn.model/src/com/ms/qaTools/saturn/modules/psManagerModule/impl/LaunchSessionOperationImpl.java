package com.ms.qaTools.saturn.modules.psManagerModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Launch Session Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchSessionOperationImpl#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchSessionOperationImpl#getSessionName <em>Session Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchSessionOperationImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchSessionOperationImpl#getPollInterval <em>Poll Interval</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchSessionOperationImpl#getPause <em>Pause</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchSessionOperationImpl#isWait <em>Wait</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchSessionOperationImpl#isForce <em>Force</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaunchSessionOperationImpl extends AbstractOperationImpl implements LaunchSessionOperation
{
  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected exception            exception;

  /**
   * The cached value of the '{@link #getSessionName() <em>Session Name</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSessionName()
   * @generated
   * @ordered
   */
  protected ComplexValue         sessionName;

  /**
   * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected ComplexValue         timeout;

  /**
   * The cached value of the '{@link #getPollInterval() <em>Poll Interval</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPollInterval()
   * @generated
   * @ordered
   */
  protected ComplexValue         pollInterval;

  /**
   * The cached value of the '{@link #getPause() <em>Pause</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPause()
   * @generated
   * @ordered
   */
  protected ComplexValue         pause;

  /**
   * The default value of the '{@link #isWait() <em>Wait</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isWait()
   * @generated
   * @ordered
   */
  protected static final boolean WAIT_EDEFAULT  = false;

  /**
   * The cached value of the '{@link #isWait() <em>Wait</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isWait()
   * @generated
   * @ordered
   */
  protected boolean              wait           = WAIT_EDEFAULT;

  /**
   * This is true if the Wait attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              waitESet;

  /**
   * The default value of the '{@link #isForce() <em>Force</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isForce()
   * @generated
   * @ordered
   */
  protected static final boolean FORCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isForce() <em>Force</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isForce()
   * @generated
   * @ordered
   */
  protected boolean              force          = FORCE_EDEFAULT;

  /**
   * This is true if the Force attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              forceESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected LaunchSessionOperationImpl()
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
    return PsManagerModulePackage.Literals.LAUNCH_SESSION_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public exception getException()
  {
    return exception;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException(exception newException, NotificationChain msgs)
  {
    exception oldException = exception;
    exception = newException;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__EXCEPTION, oldException, newException);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setException(exception newException)
  {
    if (newException != exception)
    {
      NotificationChain msgs = null;
      if (exception != null)
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.LAUNCH_SESSION_OPERATION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.LAUNCH_SESSION_OPERATION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getSessionName()
  {
    return sessionName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSessionName(ComplexValue newSessionName, NotificationChain msgs)
  {
    ComplexValue oldSessionName = sessionName;
    sessionName = newSessionName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__SESSION_NAME, oldSessionName, newSessionName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSessionName(ComplexValue newSessionName)
  {
    if (newSessionName != sessionName)
    {
      NotificationChain msgs = null;
      if (sessionName != null)
        msgs = ((InternalEObject)sessionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.LAUNCH_SESSION_OPERATION__SESSION_NAME, null, msgs);
      if (newSessionName != null)
        msgs = ((InternalEObject)newSessionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.LAUNCH_SESSION_OPERATION__SESSION_NAME, null, msgs);
      msgs = basicSetSessionName(newSessionName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__SESSION_NAME, newSessionName, newSessionName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getTimeout()
  {
    return timeout;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimeout(ComplexValue newTimeout, NotificationChain msgs)
  {
    ComplexValue oldTimeout = timeout;
    timeout = newTimeout;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__TIMEOUT, oldTimeout, newTimeout);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTimeout(ComplexValue newTimeout)
  {
    if (newTimeout != timeout)
    {
      NotificationChain msgs = null;
      if (timeout != null)
        msgs = ((InternalEObject)timeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.LAUNCH_SESSION_OPERATION__TIMEOUT, null, msgs);
      if (newTimeout != null)
        msgs = ((InternalEObject)newTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.LAUNCH_SESSION_OPERATION__TIMEOUT, null, msgs);
      msgs = basicSetTimeout(newTimeout, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__TIMEOUT, newTimeout, newTimeout));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getPollInterval()
  {
    return pollInterval;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPollInterval(ComplexValue newPollInterval, NotificationChain msgs)
  {
    ComplexValue oldPollInterval = pollInterval;
    pollInterval = newPollInterval;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__POLL_INTERVAL, oldPollInterval, newPollInterval);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPollInterval(ComplexValue newPollInterval)
  {
    if (newPollInterval != pollInterval)
    {
      NotificationChain msgs = null;
      if (pollInterval != null)
        msgs = ((InternalEObject)pollInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.LAUNCH_SESSION_OPERATION__POLL_INTERVAL, null, msgs);
      if (newPollInterval != null)
        msgs = ((InternalEObject)newPollInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.LAUNCH_SESSION_OPERATION__POLL_INTERVAL, null, msgs);
      msgs = basicSetPollInterval(newPollInterval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__POLL_INTERVAL, newPollInterval, newPollInterval));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getPause()
  {
    return pause;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPause(ComplexValue newPause, NotificationChain msgs)
  {
    ComplexValue oldPause = pause;
    pause = newPause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__PAUSE, oldPause, newPause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPause(ComplexValue newPause)
  {
    if (newPause != pause)
    {
      NotificationChain msgs = null;
      if (pause != null)
        msgs = ((InternalEObject)pause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.LAUNCH_SESSION_OPERATION__PAUSE, null, msgs);
      if (newPause != null)
        msgs = ((InternalEObject)newPause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.LAUNCH_SESSION_OPERATION__PAUSE, null, msgs);
      msgs = basicSetPause(newPause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__PAUSE, newPause, newPause));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isForce()
  {
    return force;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setForce(boolean newForce)
  {
    boolean oldForce = force;
    force = newForce;
    boolean oldForceESet = forceESet;
    forceESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__FORCE, oldForce, force, !oldForceESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetForce()
  {
    boolean oldForce = force;
    boolean oldForceESet = forceESet;
    force = FORCE_EDEFAULT;
    forceESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__FORCE, oldForce, FORCE_EDEFAULT, oldForceESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetForce()
  {
    return forceESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isWait()
  {
    return wait;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setWait(boolean newWait)
  {
    boolean oldWait = wait;
    wait = newWait;
    boolean oldWaitESet = waitESet;
    waitESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__WAIT, oldWait, wait, !oldWaitESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetWait()
  {
    boolean oldWait = wait;
    boolean oldWaitESet = waitESet;
    wait = WAIT_EDEFAULT;
    waitESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, PsManagerModulePackage.LAUNCH_SESSION_OPERATION__WAIT, oldWait, WAIT_EDEFAULT, oldWaitESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetWait()
  {
    return waitESet;
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
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__EXCEPTION:
        return basicSetException(null, msgs);
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__SESSION_NAME:
        return basicSetSessionName(null, msgs);
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__TIMEOUT:
        return basicSetTimeout(null, msgs);
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__POLL_INTERVAL:
        return basicSetPollInterval(null, msgs);
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__PAUSE:
        return basicSetPause(null, msgs);
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
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__EXCEPTION:
        return getException();
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__SESSION_NAME:
        return getSessionName();
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__TIMEOUT:
        return getTimeout();
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__POLL_INTERVAL:
        return getPollInterval();
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__PAUSE:
        return getPause();
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__WAIT:
        return isWait();
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__FORCE:
        return isForce();
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
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__EXCEPTION:
        setException((exception)newValue);
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__SESSION_NAME:
        setSessionName((ComplexValue)newValue);
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__TIMEOUT:
        setTimeout((ComplexValue)newValue);
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__POLL_INTERVAL:
        setPollInterval((ComplexValue)newValue);
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__PAUSE:
        setPause((ComplexValue)newValue);
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__WAIT:
        setWait((Boolean)newValue);
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__FORCE:
        setForce((Boolean)newValue);
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
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__EXCEPTION:
        setException((exception)null);
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__SESSION_NAME:
        setSessionName((ComplexValue)null);
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__TIMEOUT:
        setTimeout((ComplexValue)null);
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__POLL_INTERVAL:
        setPollInterval((ComplexValue)null);
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__PAUSE:
        setPause((ComplexValue)null);
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__WAIT:
        unsetWait();
        return;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__FORCE:
        unsetForce();
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
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__EXCEPTION:
        return exception != null;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__SESSION_NAME:
        return sessionName != null;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__TIMEOUT:
        return timeout != null;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__POLL_INTERVAL:
        return pollInterval != null;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__PAUSE:
        return pause != null;
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__WAIT:
        return isSetWait();
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION__FORCE:
        return isSetForce();
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
    result.append(" (wait: ");
    if (waitESet) result.append(wait); else result.append("<unset>");
    result.append(", force: ");
    if (forceESet) result.append(force); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // LaunchSessionOperationImpl
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
