/**
 */
package at.bestsolution.objc.mapper.mapper.impl;

import at.bestsolution.objc.mapper.mapper.Docu;
import at.bestsolution.objc.mapper.mapper.MapperPackage;
import at.bestsolution.objc.mapper.mapper.Message;
import at.bestsolution.objc.mapper.mapper.Protocol;
import at.bestsolution.objc.mapper.mapper.Version;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ProtocolImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ProtocolImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ProtocolImpl#getSince <em>Since</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ProtocolImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolImpl extends TypeImpl implements Protocol
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
   * The cached value of the '{@link #getSince() <em>Since</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSince()
   * @generated
   * @ordered
   */
  protected Version since;

  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<Message> messages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtocolImpl()
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
    return MapperPackage.Literals.PROTOCOL;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.PROTOCOL__DOC, oldDoc, newDoc);
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
        msgs = ((InternalEObject)doc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROTOCOL__DOC, null, msgs);
      if (newDoc != null)
        msgs = ((InternalEObject)newDoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROTOCOL__DOC, null, msgs);
      msgs = basicSetDoc(newDoc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.PROTOCOL__DOC, newDoc, newDoc));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.PROTOCOL__DEPRECATED, oldDeprecated, newDeprecated);
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
        msgs = ((InternalEObject)deprecated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROTOCOL__DEPRECATED, null, msgs);
      if (newDeprecated != null)
        msgs = ((InternalEObject)newDeprecated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROTOCOL__DEPRECATED, null, msgs);
      msgs = basicSetDeprecated(newDeprecated, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.PROTOCOL__DEPRECATED, newDeprecated, newDeprecated));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.PROTOCOL__SINCE, oldSince, newSince);
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
        msgs = ((InternalEObject)since).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROTOCOL__SINCE, null, msgs);
      if (newSince != null)
        msgs = ((InternalEObject)newSince).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.PROTOCOL__SINCE, null, msgs);
      msgs = basicSetSince(newSince, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.PROTOCOL__SINCE, newSince, newSince));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectContainmentEList<Message>(Message.class, this, MapperPackage.PROTOCOL__MESSAGES);
    }
    return messages;
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
      case MapperPackage.PROTOCOL__DOC:
        return basicSetDoc(null, msgs);
      case MapperPackage.PROTOCOL__DEPRECATED:
        return basicSetDeprecated(null, msgs);
      case MapperPackage.PROTOCOL__SINCE:
        return basicSetSince(null, msgs);
      case MapperPackage.PROTOCOL__MESSAGES:
        return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
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
      case MapperPackage.PROTOCOL__DOC:
        return getDoc();
      case MapperPackage.PROTOCOL__DEPRECATED:
        return getDeprecated();
      case MapperPackage.PROTOCOL__SINCE:
        return getSince();
      case MapperPackage.PROTOCOL__MESSAGES:
        return getMessages();
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
      case MapperPackage.PROTOCOL__DOC:
        setDoc((Docu)newValue);
        return;
      case MapperPackage.PROTOCOL__DEPRECATED:
        setDeprecated((Version)newValue);
        return;
      case MapperPackage.PROTOCOL__SINCE:
        setSince((Version)newValue);
        return;
      case MapperPackage.PROTOCOL__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends Message>)newValue);
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
      case MapperPackage.PROTOCOL__DOC:
        setDoc((Docu)null);
        return;
      case MapperPackage.PROTOCOL__DEPRECATED:
        setDeprecated((Version)null);
        return;
      case MapperPackage.PROTOCOL__SINCE:
        setSince((Version)null);
        return;
      case MapperPackage.PROTOCOL__MESSAGES:
        getMessages().clear();
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
      case MapperPackage.PROTOCOL__DOC:
        return doc != null;
      case MapperPackage.PROTOCOL__DEPRECATED:
        return deprecated != null;
      case MapperPackage.PROTOCOL__SINCE:
        return since != null;
      case MapperPackage.PROTOCOL__MESSAGES:
        return messages != null && !messages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProtocolImpl
