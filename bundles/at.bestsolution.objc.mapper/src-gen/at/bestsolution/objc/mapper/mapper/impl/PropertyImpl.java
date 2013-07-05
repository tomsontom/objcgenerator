/**
 */
package at.bestsolution.objc.mapper.mapper.impl;

import at.bestsolution.objc.mapper.mapper.Docu;
import at.bestsolution.objc.mapper.mapper.MapperPackage;
import at.bestsolution.objc.mapper.mapper.Property;
import at.bestsolution.objc.mapper.mapper.PropertyAttribute;
import at.bestsolution.objc.mapper.mapper.TypeRef;
import at.bestsolution.objc.mapper.mapper.Version;

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
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.PropertyImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.PropertyImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.PropertyImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.PropertyImpl#getSince <em>Since</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
{
  /**
   * The cached value of the '{@link #getDoc() <em>Doc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected Docu doc;

  /**
   * The cached value of the '{@link #getDeprecated() <em>Deprecated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeprecated()
   * @generated
   * @ordered
   */
  protected Version deprecated;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<PropertyAttribute> attributes;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeRef type;

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
   * The cached value of the '{@link #getSince() <em>Since</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSince()
   * @generated
   * @ordered
   */
  protected Version since;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return MapperPackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Docu getDoc()
  {
    return doc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoc(Docu newDoc, NotificationChain msgs)
  {
    Docu oldDoc = doc;
    doc = newDoc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.PROPERTY__DOC, oldDoc, newDoc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoc(Docu newDoc)
  {
    if (newDoc != doc)
    {
      NotificationChain msgs = null;
      if (doc != null)
        msgs = ((InternalEObject)doc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROPERTY__DOC, null, msgs);
      if (newDoc != null)
        msgs = ((InternalEObject)newDoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROPERTY__DOC, null, msgs);
      msgs = basicSetDoc(newDoc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.PROPERTY__DOC, newDoc, newDoc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version getDeprecated()
  {
    return deprecated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeprecated(Version newDeprecated, NotificationChain msgs)
  {
    Version oldDeprecated = deprecated;
    deprecated = newDeprecated;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.PROPERTY__DEPRECATED, oldDeprecated, newDeprecated);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeprecated(Version newDeprecated)
  {
    if (newDeprecated != deprecated)
    {
      NotificationChain msgs = null;
      if (deprecated != null)
        msgs = ((InternalEObject)deprecated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROPERTY__DEPRECATED, null, msgs);
      if (newDeprecated != null)
        msgs = ((InternalEObject)newDeprecated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROPERTY__DEPRECATED, null, msgs);
      msgs = basicSetDeprecated(newDeprecated, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.PROPERTY__DEPRECATED, newDeprecated, newDeprecated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<PropertyAttribute>(PropertyAttribute.class, this, MapperPackage.PROPERTY__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeRef newType, NotificationChain msgs)
  {
    TypeRef oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.PROPERTY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeRef newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROPERTY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROPERTY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.PROPERTY__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version getSince()
  {
    return since;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSince(Version newSince, NotificationChain msgs)
  {
    Version oldSince = since;
    since = newSince;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.PROPERTY__SINCE, oldSince, newSince);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSince(Version newSince)
  {
    if (newSince != since)
    {
      NotificationChain msgs = null;
      if (since != null)
        msgs = ((InternalEObject)since).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROPERTY__SINCE, null, msgs);
      if (newSince != null)
        msgs = ((InternalEObject)newSince).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROPERTY__SINCE, null, msgs);
      msgs = basicSetSince(newSince, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.PROPERTY__SINCE, newSince, newSince));
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
      case MapperPackage.PROPERTY__DOC:
        return basicSetDoc(null, msgs);
      case MapperPackage.PROPERTY__DEPRECATED:
        return basicSetDeprecated(null, msgs);
      case MapperPackage.PROPERTY__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case MapperPackage.PROPERTY__TYPE:
        return basicSetType(null, msgs);
      case MapperPackage.PROPERTY__SINCE:
        return basicSetSince(null, msgs);
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
      case MapperPackage.PROPERTY__DOC:
        return getDoc();
      case MapperPackage.PROPERTY__DEPRECATED:
        return getDeprecated();
      case MapperPackage.PROPERTY__ATTRIBUTES:
        return getAttributes();
      case MapperPackage.PROPERTY__TYPE:
        return getType();
      case MapperPackage.PROPERTY__NAME:
        return getName();
      case MapperPackage.PROPERTY__SINCE:
        return getSince();
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
      case MapperPackage.PROPERTY__DOC:
        setDoc((Docu)newValue);
        return;
      case MapperPackage.PROPERTY__DEPRECATED:
        setDeprecated((Version)newValue);
        return;
      case MapperPackage.PROPERTY__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends PropertyAttribute>)newValue);
        return;
      case MapperPackage.PROPERTY__TYPE:
        setType((TypeRef)newValue);
        return;
      case MapperPackage.PROPERTY__NAME:
        setName((String)newValue);
        return;
      case MapperPackage.PROPERTY__SINCE:
        setSince((Version)newValue);
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
      case MapperPackage.PROPERTY__DOC:
        setDoc((Docu)null);
        return;
      case MapperPackage.PROPERTY__DEPRECATED:
        setDeprecated((Version)null);
        return;
      case MapperPackage.PROPERTY__ATTRIBUTES:
        getAttributes().clear();
        return;
      case MapperPackage.PROPERTY__TYPE:
        setType((TypeRef)null);
        return;
      case MapperPackage.PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MapperPackage.PROPERTY__SINCE:
        setSince((Version)null);
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
      case MapperPackage.PROPERTY__DOC:
        return doc != null;
      case MapperPackage.PROPERTY__DEPRECATED:
        return deprecated != null;
      case MapperPackage.PROPERTY__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case MapperPackage.PROPERTY__TYPE:
        return type != null;
      case MapperPackage.PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MapperPackage.PROPERTY__SINCE:
        return since != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
