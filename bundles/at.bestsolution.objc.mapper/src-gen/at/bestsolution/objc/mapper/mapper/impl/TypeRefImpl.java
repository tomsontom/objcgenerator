/**
 */
package at.bestsolution.objc.mapper.mapper.impl;

import at.bestsolution.objc.mapper.mapper.MapperPackage;
import at.bestsolution.objc.mapper.mapper.Type;
import at.bestsolution.objc.mapper.mapper.TypeRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.TypeRefImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.TypeRefImpl#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.TypeRefImpl#getBuiltin <em>Builtin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRefImpl extends MinimalEObjectImpl.Container implements TypeRef
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getGenericType() <em>Generic Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericType()
   * @generated
   * @ordered
   */
  protected TypeRef genericType;

  /**
   * The default value of the '{@link #getBuiltin() <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltin()
   * @generated
   * @ordered
   */
  protected static final String BUILTIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBuiltin() <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltin()
   * @generated
   * @ordered
   */
  protected String builtin = BUILTIN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeRefImpl()
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
    return MapperPackage.Literals.TYPE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapperPackage.TYPE_REF__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.TYPE_REF__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getGenericType()
  {
    return genericType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenericType(TypeRef newGenericType, NotificationChain msgs)
  {
    TypeRef oldGenericType = genericType;
    genericType = newGenericType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.TYPE_REF__GENERIC_TYPE, oldGenericType, newGenericType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericType(TypeRef newGenericType)
  {
    if (newGenericType != genericType)
    {
      NotificationChain msgs = null;
      if (genericType != null)
        msgs = ((InternalEObject)genericType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.TYPE_REF__GENERIC_TYPE, null, msgs);
      if (newGenericType != null)
        msgs = ((InternalEObject)newGenericType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.TYPE_REF__GENERIC_TYPE, null, msgs);
      msgs = basicSetGenericType(newGenericType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.TYPE_REF__GENERIC_TYPE, newGenericType, newGenericType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBuiltin()
  {
    return builtin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuiltin(String newBuiltin)
  {
    String oldBuiltin = builtin;
    builtin = newBuiltin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.TYPE_REF__BUILTIN, oldBuiltin, builtin));
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
      case MapperPackage.TYPE_REF__GENERIC_TYPE:
        return basicSetGenericType(null, msgs);
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
      case MapperPackage.TYPE_REF__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case MapperPackage.TYPE_REF__GENERIC_TYPE:
        return getGenericType();
      case MapperPackage.TYPE_REF__BUILTIN:
        return getBuiltin();
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
      case MapperPackage.TYPE_REF__TYPE:
        setType((Type)newValue);
        return;
      case MapperPackage.TYPE_REF__GENERIC_TYPE:
        setGenericType((TypeRef)newValue);
        return;
      case MapperPackage.TYPE_REF__BUILTIN:
        setBuiltin((String)newValue);
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
      case MapperPackage.TYPE_REF__TYPE:
        setType((Type)null);
        return;
      case MapperPackage.TYPE_REF__GENERIC_TYPE:
        setGenericType((TypeRef)null);
        return;
      case MapperPackage.TYPE_REF__BUILTIN:
        setBuiltin(BUILTIN_EDEFAULT);
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
      case MapperPackage.TYPE_REF__TYPE:
        return type != null;
      case MapperPackage.TYPE_REF__GENERIC_TYPE:
        return genericType != null;
      case MapperPackage.TYPE_REF__BUILTIN:
        return BUILTIN_EDEFAULT == null ? builtin != null : !BUILTIN_EDEFAULT.equals(builtin);
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
    result.append(" (builtin: ");
    result.append(builtin);
    result.append(')');
    return result.toString();
  }

} //TypeRefImpl
