/**
 */
package at.bestsolution.objc.mapper.mapper.impl;

import at.bestsolution.objc.mapper.mapper.Docu;
import at.bestsolution.objc.mapper.mapper.MapperPackage;
import at.bestsolution.objc.mapper.mapper.Message;
import at.bestsolution.objc.mapper.mapper.Property;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ClassImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ClassImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ClassImpl#getSince <em>Since</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ClassImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ClassImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ClassImpl#getInitializerMessages <em>Initializer Messages</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ClassImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.ClassImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends TypeImpl implements at.bestsolution.objc.mapper.mapper.Class
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
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected at.bestsolution.objc.mapper.mapper.Class parent;

  /**
   * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocols()
   * @generated
   * @ordered
   */
  protected EList<Protocol> protocols;

  /**
   * The cached value of the '{@link #getInitializerMessages() <em>Initializer Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitializerMessages()
   * @generated
   * @ordered
   */
  protected EList<Message> initializerMessages;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

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
  protected ClassImpl()
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
    return MapperPackage.Literals.CLASS;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.CLASS__DOC, oldDoc, newDoc);
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
        msgs = ((InternalEObject)doc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.CLASS__DOC, null, msgs);
      if (newDoc != null)
        msgs = ((InternalEObject)newDoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.CLASS__DOC, null, msgs);
      msgs = basicSetDoc(newDoc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.CLASS__DOC, newDoc, newDoc));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.CLASS__DEPRECATED, oldDeprecated, newDeprecated);
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
        msgs = ((InternalEObject)deprecated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.CLASS__DEPRECATED, null, msgs);
      if (newDeprecated != null)
        msgs = ((InternalEObject)newDeprecated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.CLASS__DEPRECATED, null, msgs);
      msgs = basicSetDeprecated(newDeprecated, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.CLASS__DEPRECATED, newDeprecated, newDeprecated));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.CLASS__SINCE, oldSince, newSince);
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
        msgs = ((InternalEObject)since).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.CLASS__SINCE, null, msgs);
      if (newSince != null)
        msgs = ((InternalEObject)newSince).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.CLASS__SINCE, null, msgs);
      msgs = basicSetSince(newSince, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.CLASS__SINCE, newSince, newSince));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public at.bestsolution.objc.mapper.mapper.Class getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (at.bestsolution.objc.mapper.mapper.Class)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapperPackage.CLASS__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public at.bestsolution.objc.mapper.mapper.Class basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(at.bestsolution.objc.mapper.mapper.Class newParent)
  {
    at.bestsolution.objc.mapper.mapper.Class oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.CLASS__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Protocol> getProtocols()
  {
    if (protocols == null)
    {
      protocols = new EObjectResolvingEList<Protocol>(Protocol.class, this, MapperPackage.CLASS__PROTOCOLS);
    }
    return protocols;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getInitializerMessages()
  {
    if (initializerMessages == null)
    {
      initializerMessages = new EObjectContainmentEList<Message>(Message.class, this, MapperPackage.CLASS__INITIALIZER_MESSAGES);
    }
    return initializerMessages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, MapperPackage.CLASS__PROPERTIES);
    }
    return properties;
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
      messages = new EObjectContainmentEList<Message>(Message.class, this, MapperPackage.CLASS__MESSAGES);
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
      case MapperPackage.CLASS__DOC:
        return basicSetDoc(null, msgs);
      case MapperPackage.CLASS__DEPRECATED:
        return basicSetDeprecated(null, msgs);
      case MapperPackage.CLASS__SINCE:
        return basicSetSince(null, msgs);
      case MapperPackage.CLASS__INITIALIZER_MESSAGES:
        return ((InternalEList<?>)getInitializerMessages()).basicRemove(otherEnd, msgs);
      case MapperPackage.CLASS__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case MapperPackage.CLASS__MESSAGES:
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
      case MapperPackage.CLASS__DOC:
        return getDoc();
      case MapperPackage.CLASS__DEPRECATED:
        return getDeprecated();
      case MapperPackage.CLASS__SINCE:
        return getSince();
      case MapperPackage.CLASS__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case MapperPackage.CLASS__PROTOCOLS:
        return getProtocols();
      case MapperPackage.CLASS__INITIALIZER_MESSAGES:
        return getInitializerMessages();
      case MapperPackage.CLASS__PROPERTIES:
        return getProperties();
      case MapperPackage.CLASS__MESSAGES:
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
      case MapperPackage.CLASS__DOC:
        setDoc((Docu)newValue);
        return;
      case MapperPackage.CLASS__DEPRECATED:
        setDeprecated((Version)newValue);
        return;
      case MapperPackage.CLASS__SINCE:
        setSince((Version)newValue);
        return;
      case MapperPackage.CLASS__PARENT:
        setParent((at.bestsolution.objc.mapper.mapper.Class)newValue);
        return;
      case MapperPackage.CLASS__PROTOCOLS:
        getProtocols().clear();
        getProtocols().addAll((Collection<? extends Protocol>)newValue);
        return;
      case MapperPackage.CLASS__INITIALIZER_MESSAGES:
        getInitializerMessages().clear();
        getInitializerMessages().addAll((Collection<? extends Message>)newValue);
        return;
      case MapperPackage.CLASS__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case MapperPackage.CLASS__MESSAGES:
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
      case MapperPackage.CLASS__DOC:
        setDoc((Docu)null);
        return;
      case MapperPackage.CLASS__DEPRECATED:
        setDeprecated((Version)null);
        return;
      case MapperPackage.CLASS__SINCE:
        setSince((Version)null);
        return;
      case MapperPackage.CLASS__PARENT:
        setParent((at.bestsolution.objc.mapper.mapper.Class)null);
        return;
      case MapperPackage.CLASS__PROTOCOLS:
        getProtocols().clear();
        return;
      case MapperPackage.CLASS__INITIALIZER_MESSAGES:
        getInitializerMessages().clear();
        return;
      case MapperPackage.CLASS__PROPERTIES:
        getProperties().clear();
        return;
      case MapperPackage.CLASS__MESSAGES:
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
      case MapperPackage.CLASS__DOC:
        return doc != null;
      case MapperPackage.CLASS__DEPRECATED:
        return deprecated != null;
      case MapperPackage.CLASS__SINCE:
        return since != null;
      case MapperPackage.CLASS__PARENT:
        return parent != null;
      case MapperPackage.CLASS__PROTOCOLS:
        return protocols != null && !protocols.isEmpty();
      case MapperPackage.CLASS__INITIALIZER_MESSAGES:
        return initializerMessages != null && !initializerMessages.isEmpty();
      case MapperPackage.CLASS__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case MapperPackage.CLASS__MESSAGES:
        return messages != null && !messages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassImpl
