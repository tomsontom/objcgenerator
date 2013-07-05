/**
 */
package at.bestsolution.objc.mapper.mapper.impl;

import at.bestsolution.objc.mapper.mapper.Docu;
import at.bestsolution.objc.mapper.mapper.MapperPackage;
import at.bestsolution.objc.mapper.mapper.TypeDef;
import at.bestsolution.objc.mapper.mapper.TypeRef;
import at.bestsolution.objc.mapper.mapper.TypeStructAttribute;

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
 * An implementation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.TypeDefImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.TypeDefImpl#isStruct <em>Struct</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.TypeDefImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.TypeDefImpl#isBlock <em>Block</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.TypeDefImpl#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefImpl extends TypeImpl implements TypeDef
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
   * The default value of the '{@link #isStruct() <em>Struct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStruct()
   * @generated
   * @ordered
   */
  protected static final boolean STRUCT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStruct() <em>Struct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStruct()
   * @generated
   * @ordered
   */
  protected boolean struct = STRUCT_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<TypeStructAttribute> attributes;

  /**
   * The default value of the '{@link #isBlock() <em>Block</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBlock()
   * @generated
   * @ordered
   */
  protected static final boolean BLOCK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBlock() <em>Block</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBlock()
   * @generated
   * @ordered
   */
  protected boolean block = BLOCK_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeRef()
   * @generated
   * @ordered
   */
  protected TypeRef typeRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDefImpl()
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
    return MapperPackage.Literals.TYPE_DEF;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.TYPE_DEF__DOC, oldDoc, newDoc);
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
        msgs = ((InternalEObject)doc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.TYPE_DEF__DOC, null, msgs);
      if (newDoc != null)
        msgs = ((InternalEObject)newDoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.TYPE_DEF__DOC, null, msgs);
      msgs = basicSetDoc(newDoc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.TYPE_DEF__DOC, newDoc, newDoc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStruct()
  {
    return struct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct(boolean newStruct)
  {
    boolean oldStruct = struct;
    struct = newStruct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.TYPE_DEF__STRUCT, oldStruct, struct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeStructAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<TypeStructAttribute>(TypeStructAttribute.class, this, MapperPackage.TYPE_DEF__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(boolean newBlock)
  {
    boolean oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.TYPE_DEF__BLOCK, oldBlock, block));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getTypeRef()
  {
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeRef(TypeRef newTypeRef, NotificationChain msgs)
  {
    TypeRef oldTypeRef = typeRef;
    typeRef = newTypeRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperPackage.TYPE_DEF__TYPE_REF, oldTypeRef, newTypeRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeRef(TypeRef newTypeRef)
  {
    if (newTypeRef != typeRef)
    {
      NotificationChain msgs = null;
      if (typeRef != null)
        msgs = ((InternalEObject)typeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperPackage.TYPE_DEF__TYPE_REF, null, msgs);
      if (newTypeRef != null)
        msgs = ((InternalEObject)newTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperPackage.TYPE_DEF__TYPE_REF, null, msgs);
      msgs = basicSetTypeRef(newTypeRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.TYPE_DEF__TYPE_REF, newTypeRef, newTypeRef));
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
      case MapperPackage.TYPE_DEF__DOC:
        return basicSetDoc(null, msgs);
      case MapperPackage.TYPE_DEF__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case MapperPackage.TYPE_DEF__TYPE_REF:
        return basicSetTypeRef(null, msgs);
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
      case MapperPackage.TYPE_DEF__DOC:
        return getDoc();
      case MapperPackage.TYPE_DEF__STRUCT:
        return isStruct();
      case MapperPackage.TYPE_DEF__ATTRIBUTES:
        return getAttributes();
      case MapperPackage.TYPE_DEF__BLOCK:
        return isBlock();
      case MapperPackage.TYPE_DEF__TYPE_REF:
        return getTypeRef();
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
      case MapperPackage.TYPE_DEF__DOC:
        setDoc((Docu)newValue);
        return;
      case MapperPackage.TYPE_DEF__STRUCT:
        setStruct((Boolean)newValue);
        return;
      case MapperPackage.TYPE_DEF__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends TypeStructAttribute>)newValue);
        return;
      case MapperPackage.TYPE_DEF__BLOCK:
        setBlock((Boolean)newValue);
        return;
      case MapperPackage.TYPE_DEF__TYPE_REF:
        setTypeRef((TypeRef)newValue);
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
      case MapperPackage.TYPE_DEF__DOC:
        setDoc((Docu)null);
        return;
      case MapperPackage.TYPE_DEF__STRUCT:
        setStruct(STRUCT_EDEFAULT);
        return;
      case MapperPackage.TYPE_DEF__ATTRIBUTES:
        getAttributes().clear();
        return;
      case MapperPackage.TYPE_DEF__BLOCK:
        setBlock(BLOCK_EDEFAULT);
        return;
      case MapperPackage.TYPE_DEF__TYPE_REF:
        setTypeRef((TypeRef)null);
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
      case MapperPackage.TYPE_DEF__DOC:
        return doc != null;
      case MapperPackage.TYPE_DEF__STRUCT:
        return struct != STRUCT_EDEFAULT;
      case MapperPackage.TYPE_DEF__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case MapperPackage.TYPE_DEF__BLOCK:
        return block != BLOCK_EDEFAULT;
      case MapperPackage.TYPE_DEF__TYPE_REF:
        return typeRef != null;
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
    result.append(" (struct: ");
    result.append(struct);
    result.append(", block: ");
    result.append(block);
    result.append(')');
    return result.toString();
  }

} //TypeDefImpl
