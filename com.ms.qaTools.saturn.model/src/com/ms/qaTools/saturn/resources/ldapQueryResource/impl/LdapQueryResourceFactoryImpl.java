package com.ms.qaTools.saturn.resources.ldapQueryResource.impl;

import com.ms.qaTools.saturn.resources.ldapQueryResource.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryFilter;
import com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryResource;
import com.ms.qaTools.saturn.resources.ldapQueryResource.LdapQueryResourceFactory;
import com.ms.qaTools.saturn.resources.ldapQueryResource.LdapQueryResourcePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class LdapQueryResourceFactoryImpl extends EFactoryImpl implements LdapQueryResourceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static LdapQueryResourceFactory init()
  {
    try
    {
      LdapQueryResourceFactory theLdapQueryResourceFactory = (LdapQueryResourceFactory)EPackage.Registry.INSTANCE.getEFactory(LdapQueryResourcePackage.eNS_URI);
      if (theLdapQueryResourceFactory != null)
      {
        return theLdapQueryResourceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LdapQueryResourceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LdapQueryResourceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LdapQueryResourcePackage.LDAP_QUERY_FILTER: return createLDAPQueryFilter();
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE: return createLDAPQueryResource();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LDAPQueryFilter createLDAPQueryFilter()
  {
    LDAPQueryFilterImpl ldapQueryFilter = new LDAPQueryFilterImpl();
    return ldapQueryFilter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LDAPQueryResource createLDAPQueryResource()
  {
    LDAPQueryResourceImpl ldapQueryResource = new LDAPQueryResourceImpl();
    return ldapQueryResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LdapQueryResourcePackage getLdapQueryResourcePackage()
  {
    return (LdapQueryResourcePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LdapQueryResourcePackage getPackage()
  {
    return LdapQueryResourcePackage.eINSTANCE;
  }

} // LdapQueryResourceFactoryImpl
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
