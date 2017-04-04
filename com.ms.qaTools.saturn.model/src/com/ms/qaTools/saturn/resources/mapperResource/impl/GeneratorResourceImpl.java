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
package com.ms.qaTools.saturn.resources.mapperResource.impl;

import com.ms.qaTools.saturn.resources.mapperResource.GeneratorResource;
import com.ms.qaTools.saturn.resources.mapperResource.MapperResourcePackage;

import com.ms.qaTools.saturn.types.NamedResourceDefinition;

import com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.mapperResource.impl.GeneratorResourceImpl#getInputResource <em>Input Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mapperResource.impl.GeneratorResourceImpl#getTemplateResource <em>Template Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorResourceImpl extends NamedResourceDefinitionImpl implements GeneratorResource
{
  /**
   * The cached value of the '{@link #getInputResource() <em>Input Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition inputResource;

  /**
   * The cached value of the '{@link #getTemplateResource() <em>Template Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition templateResource;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneratorResourceImpl()
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
    return MapperResourcePackage.Literals.GENERATOR_RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getInputResource()
  {
    return inputResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputResource(NamedResourceDefinition newInputResource, NotificationChain msgs)
  {
    NamedResourceDefinition oldInputResource = inputResource;
    inputResource = newInputResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperResourcePackage.GENERATOR_RESOURCE__INPUT_RESOURCE, oldInputResource, newInputResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputResource(NamedResourceDefinition newInputResource)
  {
    if (newInputResource != inputResource)
    {
      NotificationChain msgs = null;
      if (inputResource != null)
        msgs = ((InternalEObject)inputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperResourcePackage.GENERATOR_RESOURCE__INPUT_RESOURCE, null, msgs);
      if (newInputResource != null)
        msgs = ((InternalEObject)newInputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperResourcePackage.GENERATOR_RESOURCE__INPUT_RESOURCE, null, msgs);
      msgs = basicSetInputResource(newInputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperResourcePackage.GENERATOR_RESOURCE__INPUT_RESOURCE, newInputResource, newInputResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getTemplateResource()
  {
    return templateResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplateResource(NamedResourceDefinition newTemplateResource, NotificationChain msgs)
  {
    NamedResourceDefinition oldTemplateResource = templateResource;
    templateResource = newTemplateResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperResourcePackage.GENERATOR_RESOURCE__TEMPLATE_RESOURCE, oldTemplateResource, newTemplateResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplateResource(NamedResourceDefinition newTemplateResource)
  {
    if (newTemplateResource != templateResource)
    {
      NotificationChain msgs = null;
      if (templateResource != null)
        msgs = ((InternalEObject)templateResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperResourcePackage.GENERATOR_RESOURCE__TEMPLATE_RESOURCE, null, msgs);
      if (newTemplateResource != null)
        msgs = ((InternalEObject)newTemplateResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperResourcePackage.GENERATOR_RESOURCE__TEMPLATE_RESOURCE, null, msgs);
      msgs = basicSetTemplateResource(newTemplateResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperResourcePackage.GENERATOR_RESOURCE__TEMPLATE_RESOURCE, newTemplateResource, newTemplateResource));
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
      case MapperResourcePackage.GENERATOR_RESOURCE__INPUT_RESOURCE:
        return basicSetInputResource(null, msgs);
      case MapperResourcePackage.GENERATOR_RESOURCE__TEMPLATE_RESOURCE:
        return basicSetTemplateResource(null, msgs);
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
      case MapperResourcePackage.GENERATOR_RESOURCE__INPUT_RESOURCE:
        return getInputResource();
      case MapperResourcePackage.GENERATOR_RESOURCE__TEMPLATE_RESOURCE:
        return getTemplateResource();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MapperResourcePackage.GENERATOR_RESOURCE__INPUT_RESOURCE:
        setInputResource((NamedResourceDefinition)newValue);
        return;
      case MapperResourcePackage.GENERATOR_RESOURCE__TEMPLATE_RESOURCE:
        setTemplateResource((NamedResourceDefinition)newValue);
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
      case MapperResourcePackage.GENERATOR_RESOURCE__INPUT_RESOURCE:
        setInputResource((NamedResourceDefinition)null);
        return;
      case MapperResourcePackage.GENERATOR_RESOURCE__TEMPLATE_RESOURCE:
        setTemplateResource((NamedResourceDefinition)null);
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
      case MapperResourcePackage.GENERATOR_RESOURCE__INPUT_RESOURCE:
        return inputResource != null;
      case MapperResourcePackage.GENERATOR_RESOURCE__TEMPLATE_RESOURCE:
        return templateResource != null;
    }
    return super.eIsSet(featureID);
  }

} //GeneratorResourceImpl
