/**
 */
package at.bestsolution.objc.mapper.mapper;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.TypeDef#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.TypeDef#isStruct <em>Struct</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.TypeDef#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.TypeDef#isBlock <em>Block</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.TypeDef#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getTypeDef()
 * @model
 * @generated
 */
public interface TypeDef extends Type
{
  /**
   * Returns the value of the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc</em>' containment reference.
   * @see #setDoc(Docu)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getTypeDef_Doc()
   * @model containment="true"
   * @generated
   */
  Docu getDoc();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.TypeDef#getDoc <em>Doc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc</em>' containment reference.
   * @see #getDoc()
   * @generated
   */
  void setDoc(Docu value);

  /**
   * Returns the value of the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' attribute.
   * @see #setStruct(boolean)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getTypeDef_Struct()
   * @model
   * @generated
   */
  boolean isStruct();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.TypeDef#isStruct <em>Struct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' attribute.
   * @see #isStruct()
   * @generated
   */
  void setStruct(boolean value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.objc.mapper.mapper.TypeStructAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getTypeDef_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<TypeStructAttribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Block</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' attribute.
   * @see #setBlock(boolean)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getTypeDef_Block()
   * @model
   * @generated
   */
  boolean isBlock();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.TypeDef#isBlock <em>Block</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' attribute.
   * @see #isBlock()
   * @generated
   */
  void setBlock(boolean value);

  /**
   * Returns the value of the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Ref</em>' containment reference.
   * @see #setTypeRef(TypeRef)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getTypeDef_TypeRef()
   * @model containment="true"
   * @generated
   */
  TypeRef getTypeRef();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.TypeDef#getTypeRef <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' containment reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(TypeRef value);

} // TypeDef
