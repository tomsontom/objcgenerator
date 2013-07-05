/**
 */
package at.bestsolution.objc.mapper.mapper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.TypeRef#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.TypeRef#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.TypeRef#getBuiltin <em>Builtin</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getTypeRef()
 * @model
 * @generated
 */
public interface TypeRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getTypeRef_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.TypeRef#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Generic Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Type</em>' containment reference.
   * @see #setGenericType(TypeRef)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getTypeRef_GenericType()
   * @model containment="true"
   * @generated
   */
  TypeRef getGenericType();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.TypeRef#getGenericType <em>Generic Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Type</em>' containment reference.
   * @see #getGenericType()
   * @generated
   */
  void setGenericType(TypeRef value);

  /**
   * Returns the value of the '<em><b>Builtin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builtin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builtin</em>' attribute.
   * @see #setBuiltin(String)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getTypeRef_Builtin()
   * @model
   * @generated
   */
  String getBuiltin();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.TypeRef#getBuiltin <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Builtin</em>' attribute.
   * @see #getBuiltin()
   * @generated
   */
  void setBuiltin(String value);

} // TypeRef
