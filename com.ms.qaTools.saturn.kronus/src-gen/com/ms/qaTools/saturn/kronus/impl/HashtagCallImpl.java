/**
 */
package com.ms.qaTools.saturn.kronus.impl;

import com.ms.qaTools.saturn.kronus.HashtagCall;
import com.ms.qaTools.saturn.kronus.HashtagDef;
import com.ms.qaTools.saturn.kronus.KronusPackage;
import com.ms.qaTools.saturn.kronus.SimpleParameterValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hashtag Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.HashtagCallImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.HashtagCallImpl#getParameterValues <em>Parameter Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HashtagCallImpl extends MinimalEObjectImpl.Container implements HashtagCall
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected HashtagDef method;

  /**
   * The cached value of the '{@link #getParameterValues() <em>Parameter Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterValues()
   * @generated
   * @ordered
   */
  protected EList<SimpleParameterValue> parameterValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HashtagCallImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KronusPackage.Literals.HASHTAG_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HashtagDef getMethod()
  {
    if (method != null && method.eIsProxy())
    {
      InternalEObject oldMethod = (InternalEObject)method;
      method = (HashtagDef)eResolveProxy(oldMethod);
      if (method != oldMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KronusPackage.HASHTAG_CALL__METHOD, oldMethod, method));
      }
    }
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HashtagDef basicGetMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(HashtagDef newMethod)
  {
    HashtagDef oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.HASHTAG_CALL__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SimpleParameterValue> getParameterValues()
  {
    if (parameterValues == null)
    {
      parameterValues = new EObjectContainmentEList<SimpleParameterValue>(SimpleParameterValue.class, this, KronusPackage.HASHTAG_CALL__PARAMETER_VALUES);
    }
    return parameterValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KronusPackage.HASHTAG_CALL__PARAMETER_VALUES:
        return ((InternalEList<?>)getParameterValues()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KronusPackage.HASHTAG_CALL__METHOD:
        if (resolve) return getMethod();
        return basicGetMethod();
      case KronusPackage.HASHTAG_CALL__PARAMETER_VALUES:
        return getParameterValues();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KronusPackage.HASHTAG_CALL__METHOD:
        setMethod((HashtagDef)newValue);
        return;
      case KronusPackage.HASHTAG_CALL__PARAMETER_VALUES:
        getParameterValues().clear();
        getParameterValues().addAll((Collection<? extends SimpleParameterValue>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KronusPackage.HASHTAG_CALL__METHOD:
        setMethod((HashtagDef)null);
        return;
      case KronusPackage.HASHTAG_CALL__PARAMETER_VALUES:
        getParameterValues().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KronusPackage.HASHTAG_CALL__METHOD:
        return method != null;
      case KronusPackage.HASHTAG_CALL__PARAMETER_VALUES:
        return parameterValues != null && !parameterValues.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HashtagCallImpl
