/**
 */
package at.bestsolution.objc.mapper.mapper.impl;

import at.bestsolution.objc.mapper.mapper.Import;
import at.bestsolution.objc.mapper.mapper.MapperPackage;
import at.bestsolution.objc.mapper.mapper.PackageDeclaration;
import at.bestsolution.objc.mapper.mapper.Type;

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
 * An implementation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.PackageDeclarationImpl#isNative <em>Native</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.PackageDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.PackageDeclarationImpl#getJavaPackage <em>Java Package</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.PackageDeclarationImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.PackageDeclarationImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageDeclarationImpl extends MinimalEObjectImpl.Container implements PackageDeclaration
{
  /**
   * The default value of the '{@link #isNative() <em>Native</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNative()
   * @generated
   * @ordered
   */
  protected static final boolean NATIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNative() <em>Native</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNative()
   * @generated
   * @ordered
   */
  protected boolean native_ = NATIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getJavaPackage() <em>Java Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaPackage()
   * @generated
   * @ordered
   */
  protected static final String JAVA_PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJavaPackage() <em>Java Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaPackage()
   * @generated
   * @ordered
   */
  protected String javaPackage = JAVA_PACKAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> types;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageDeclarationImpl()
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
    return MapperPackage.Literals.PACKAGE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNative()
  {
    return native_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNative(boolean newNative)
  {
    boolean oldNative = native_;
    native_ = newNative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.PACKAGE_DECLARATION__NATIVE, oldNative, native_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.PACKAGE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJavaPackage()
  {
    return javaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaPackage(String newJavaPackage)
  {
    String oldJavaPackage = javaPackage;
    javaPackage = newJavaPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.PACKAGE_DECLARATION__JAVA_PACKAGE, oldJavaPackage, javaPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, MapperPackage.PACKAGE_DECLARATION__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<Type>(Type.class, this, MapperPackage.PACKAGE_DECLARATION__TYPES);
    }
    return types;
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
      case MapperPackage.PACKAGE_DECLARATION__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case MapperPackage.PACKAGE_DECLARATION__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
      case MapperPackage.PACKAGE_DECLARATION__NATIVE:
        return isNative();
      case MapperPackage.PACKAGE_DECLARATION__NAME:
        return getName();
      case MapperPackage.PACKAGE_DECLARATION__JAVA_PACKAGE:
        return getJavaPackage();
      case MapperPackage.PACKAGE_DECLARATION__IMPORTS:
        return getImports();
      case MapperPackage.PACKAGE_DECLARATION__TYPES:
        return getTypes();
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
      case MapperPackage.PACKAGE_DECLARATION__NATIVE:
        setNative((Boolean)newValue);
        return;
      case MapperPackage.PACKAGE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case MapperPackage.PACKAGE_DECLARATION__JAVA_PACKAGE:
        setJavaPackage((String)newValue);
        return;
      case MapperPackage.PACKAGE_DECLARATION__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case MapperPackage.PACKAGE_DECLARATION__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type>)newValue);
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
      case MapperPackage.PACKAGE_DECLARATION__NATIVE:
        setNative(NATIVE_EDEFAULT);
        return;
      case MapperPackage.PACKAGE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MapperPackage.PACKAGE_DECLARATION__JAVA_PACKAGE:
        setJavaPackage(JAVA_PACKAGE_EDEFAULT);
        return;
      case MapperPackage.PACKAGE_DECLARATION__IMPORTS:
        getImports().clear();
        return;
      case MapperPackage.PACKAGE_DECLARATION__TYPES:
        getTypes().clear();
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
      case MapperPackage.PACKAGE_DECLARATION__NATIVE:
        return native_ != NATIVE_EDEFAULT;
      case MapperPackage.PACKAGE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MapperPackage.PACKAGE_DECLARATION__JAVA_PACKAGE:
        return JAVA_PACKAGE_EDEFAULT == null ? javaPackage != null : !JAVA_PACKAGE_EDEFAULT.equals(javaPackage);
      case MapperPackage.PACKAGE_DECLARATION__IMPORTS:
        return imports != null && !imports.isEmpty();
      case MapperPackage.PACKAGE_DECLARATION__TYPES:
        return types != null && !types.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (native: ");
    result.append(native_);
    result.append(", name: ");
    result.append(name);
    result.append(", javaPackage: ");
    result.append(javaPackage);
    result.append(')');
    return result.toString();
  }

} //PackageDeclarationImpl
