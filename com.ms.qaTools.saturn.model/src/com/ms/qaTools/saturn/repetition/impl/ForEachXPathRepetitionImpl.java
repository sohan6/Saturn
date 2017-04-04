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
package com.ms.qaTools.saturn.repetition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.repetition.ForEachXPathRepetition;
import com.ms.qaTools.saturn.repetition.RepetitionPackage;
import com.ms.qaTools.saturn.repetition.XPathMapping;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.impl.AbstractRepetitionHandlerImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>For Each XPath Repetition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.repetition.impl.ForEachXPathRepetitionImpl#getXMLResource <em>XML Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.repetition.impl.ForEachXPathRepetitionImpl#getNamespaceDefinition <em>Namespace Definition</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.repetition.impl.ForEachXPathRepetitionImpl#getXPathMappings <em>XPath Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForEachXPathRepetitionImpl extends AbstractRepetitionHandlerImpl implements ForEachXPathRepetition
{
  /**
   * The cached value of the '{@link #getXMLResource() <em>XML Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getXMLResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition xMLResource;

  /**
   * The cached value of the '{@link #getNamespaceDefinition() <em>Namespace Definition</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getNamespaceDefinition()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition namespaceDefinition;

  /**
   * The cached value of the '{@link #getXPathMappings() <em>XPath Mappings</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getXPathMappings()
   * @generated
   * @ordered
   */
  protected EList<XPathMapping>     xPathMappings;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ForEachXPathRepetitionImpl()
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
    return RepetitionPackage.Literals.FOR_EACH_XPATH_REPETITION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getXMLResource()
  {
    return xMLResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXMLResource(NamedResourceDefinition newXMLResource, NotificationChain msgs)
  {
    NamedResourceDefinition oldXMLResource = xMLResource;
    xMLResource = newXMLResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepetitionPackage.FOR_EACH_XPATH_REPETITION__XML_RESOURCE, oldXMLResource, newXMLResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setXMLResource(NamedResourceDefinition newXMLResource)
  {
    if (newXMLResource != xMLResource)
    {
      NotificationChain msgs = null;
      if (xMLResource != null)
        msgs = ((InternalEObject)xMLResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepetitionPackage.FOR_EACH_XPATH_REPETITION__XML_RESOURCE, null, msgs);
      if (newXMLResource != null)
        msgs = ((InternalEObject)newXMLResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepetitionPackage.FOR_EACH_XPATH_REPETITION__XML_RESOURCE, null, msgs);
      msgs = basicSetXMLResource(newXMLResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepetitionPackage.FOR_EACH_XPATH_REPETITION__XML_RESOURCE, newXMLResource, newXMLResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getNamespaceDefinition()
  {
    return namespaceDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespaceDefinition(NamedResourceDefinition newNamespaceDefinition,
      NotificationChain msgs)
  {
    NamedResourceDefinition oldNamespaceDefinition = namespaceDefinition;
    namespaceDefinition = newNamespaceDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepetitionPackage.FOR_EACH_XPATH_REPETITION__NAMESPACE_DEFINITION, oldNamespaceDefinition, newNamespaceDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNamespaceDefinition(NamedResourceDefinition newNamespaceDefinition)
  {
    if (newNamespaceDefinition != namespaceDefinition)
    {
      NotificationChain msgs = null;
      if (namespaceDefinition != null)
        msgs = ((InternalEObject)namespaceDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepetitionPackage.FOR_EACH_XPATH_REPETITION__NAMESPACE_DEFINITION, null, msgs);
      if (newNamespaceDefinition != null)
        msgs = ((InternalEObject)newNamespaceDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepetitionPackage.FOR_EACH_XPATH_REPETITION__NAMESPACE_DEFINITION, null, msgs);
      msgs = basicSetNamespaceDefinition(newNamespaceDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepetitionPackage.FOR_EACH_XPATH_REPETITION__NAMESPACE_DEFINITION, newNamespaceDefinition, newNamespaceDefinition));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<XPathMapping> getXPathMappings()
  {
    if (xPathMappings == null)
    {
      xPathMappings = new EObjectContainmentEList<XPathMapping>(XPathMapping.class, this, RepetitionPackage.FOR_EACH_XPATH_REPETITION__XPATH_MAPPINGS);
    }
    return xPathMappings;
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
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__XML_RESOURCE:
        return basicSetXMLResource(null, msgs);
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__NAMESPACE_DEFINITION:
        return basicSetNamespaceDefinition(null, msgs);
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__XPATH_MAPPINGS:
        return ((InternalEList<?>)getXPathMappings()).basicRemove(otherEnd, msgs);
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
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__XML_RESOURCE:
        return getXMLResource();
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__NAMESPACE_DEFINITION:
        return getNamespaceDefinition();
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__XPATH_MAPPINGS:
        return getXPathMappings();
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
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__XML_RESOURCE:
        setXMLResource((NamedResourceDefinition)newValue);
        return;
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__NAMESPACE_DEFINITION:
        setNamespaceDefinition((NamedResourceDefinition)newValue);
        return;
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__XPATH_MAPPINGS:
        getXPathMappings().clear();
        getXPathMappings().addAll((Collection<? extends XPathMapping>)newValue);
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
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__XML_RESOURCE:
        setXMLResource((NamedResourceDefinition)null);
        return;
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__NAMESPACE_DEFINITION:
        setNamespaceDefinition((NamedResourceDefinition)null);
        return;
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__XPATH_MAPPINGS:
        getXPathMappings().clear();
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
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__XML_RESOURCE:
        return xMLResource != null;
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__NAMESPACE_DEFINITION:
        return namespaceDefinition != null;
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION__XPATH_MAPPINGS:
        return xPathMappings != null && !xPathMappings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // ForEachXPathRepetitionImpl
