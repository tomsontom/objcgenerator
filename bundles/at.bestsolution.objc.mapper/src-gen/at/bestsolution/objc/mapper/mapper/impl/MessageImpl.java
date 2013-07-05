/**
 */
package at.bestsolution.objc.mapper.mapper.impl;

import at.bestsolution.objc.mapper.mapper.Docu;
import at.bestsolution.objc.mapper.mapper.MapperPackage;
import at.bestsolution.objc.mapper.mapper.Message;
import at.bestsolution.objc.mapper.mapper.MessageElement;
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
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.MessageImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.MessageImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.MessageImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.MessageImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.MessageImpl#getSince <em>Since</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message
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
   * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnValue()
   * @generated
   * @ordered
   */
  protected TypeRef returnValue;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<MessageElement> elements;

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
  protected MessageImpl()
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
    return MapperPackage.Literals.MESSAGE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.MESSAGE__DOC, oldDoc, newDoc);
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
        msgs = ((InternalEObject)doc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.MESSAGE__DOC, null, msgs);
      if (newDoc != null)
        msgs = ((InternalEObject)newDoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.MESSAGE__DOC, null, msgs);
      msgs = basicSetDoc(newDoc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.MESSAGE__DOC, newDoc, newDoc));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.MESSAGE__DEPRECATED, oldDeprecated, newDeprecated);
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
        msgs = ((InternalEObject)deprecated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.MESSAGE__DEPRECATED, null, msgs);
      if (newDeprecated != null)
        msgs = ((InternalEObject)newDeprecated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.MESSAGE__DEPRECATED, null, msgs);
      msgs = basicSetDeprecated(newDeprecated, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.MESSAGE__DEPRECATED, newDeprecated, newDeprecated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getReturnValue()
  {
    return returnValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnValue(TypeRef newReturnValue, NotificationChain msgs)
  {
    TypeRef oldReturnValue = returnValue;
    returnValue = newReturnValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.MESSAGE__RETURN_VALUE, oldReturnValue, newReturnValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnValue(TypeRef newReturnValue)
  {
    if (newReturnValue != returnValue)
    {
      NotificationChain msgs = null;
      if (returnValue != null)
        msgs = ((InternalEObject)returnValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.MESSAGE__RETURN_VALUE, null, msgs);
      if (newReturnValue != null)
        msgs = ((InternalEObject)newReturnValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.MESSAGE__RETURN_VALUE, null, msgs);
      msgs = basicSetReturnValue(newReturnValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.MESSAGE__RETURN_VALUE, newReturnValue, newReturnValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MessageElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<MessageElement>(MessageElement.class, this, MapperPackage.MESSAGE__ELEMENTS);
    }
    return elements;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.MESSAGE__SINCE, oldSince, newSince);
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
        msgs = ((InternalEObject)since).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.MESSAGE__SINCE, null, msgs);
      if (newSince != null)
        msgs = ((InternalEObject)newSince).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.MESSAGE__SINCE, null, msgs);
      msgs = basicSetSince(newSince, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.MESSAGE__SINCE, newSince, newSince));
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
      case MapperPackage.MESSAGE__DOC:
        return basicSetDoc(null, msgs);
      case MapperPackage.MESSAGE__DEPRECATED:
        return basicSetDeprecated(null, msgs);
      case MapperPackage.MESSAGE__RETURN_VALUE:
        return basicSetReturnValue(null, msgs);
      case MapperPackage.MESSAGE__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case MapperPackage.MESSAGE__SINCE:
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
      case MapperPackage.MESSAGE__DOC:
        return getDoc();
      case MapperPackage.MESSAGE__DEPRECATED:
        return getDeprecated();
      case MapperPackage.MESSAGE__RETURN_VALUE:
        return getReturnValue();
      case MapperPackage.MESSAGE__ELEMENTS:
        return getElements();
      case MapperPackage.MESSAGE__SINCE:
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
      case MapperPackage.MESSAGE__DOC:
        setDoc((Docu)newValue);
        return;
      case MapperPackage.MESSAGE__DEPRECATED:
        setDeprecated((Version)newValue);
        return;
      case MapperPackage.MESSAGE__RETURN_VALUE:
        setReturnValue((TypeRef)newValue);
        return;
      case MapperPackage.MESSAGE__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends MessageElement>)newValue);
        return;
      case MapperPackage.MESSAGE__SINCE:
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
      case MapperPackage.MESSAGE__DOC:
        setDoc((Docu)null);
        return;
      case MapperPackage.MESSAGE__DEPRECATED:
        setDeprecated((Version)null);
        return;
      case MapperPackage.MESSAGE__RETURN_VALUE:
        setReturnValue((TypeRef)null);
        return;
      case MapperPackage.MESSAGE__ELEMENTS:
        getElements().clear();
        return;
      case MapperPackage.MESSAGE__SINCE:
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
      case MapperPackage.MESSAGE__DOC:
        return doc != null;
      case MapperPackage.MESSAGE__DEPRECATED:
        return deprecated != null;
      case MapperPackage.MESSAGE__RETURN_VALUE:
        return returnValue != null;
      case MapperPackage.MESSAGE__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case MapperPackage.MESSAGE__SINCE:
        return since != null;
    }
    return super.eIsSet(featureID);
  }

} //MessageImpl
