/**
 */
package at.bestsolution.objc.mapper.mapper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Message#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Message#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Message#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Message#getElements <em>Elements</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Message#getSince <em>Since</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject
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
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getMessage_Doc()
   * @model containment="true"
   * @generated
   */
  Docu getDoc();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Message#getDoc <em>Doc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc</em>' containment reference.
   * @see #getDoc()
   * @generated
   */
  void setDoc(Docu value);

  /**
   * Returns the value of the '<em><b>Deprecated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deprecated</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprecated</em>' containment reference.
   * @see #setDeprecated(Version)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getMessage_Deprecated()
   * @model containment="true"
   * @generated
   */
  Version getDeprecated();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Message#getDeprecated <em>Deprecated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprecated</em>' containment reference.
   * @see #getDeprecated()
   * @generated
   */
  void setDeprecated(Version value);

  /**
   * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Value</em>' containment reference.
   * @see #setReturnValue(TypeRef)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getMessage_ReturnValue()
   * @model containment="true"
   * @generated
   */
  TypeRef getReturnValue();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Message#getReturnValue <em>Return Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Value</em>' containment reference.
   * @see #getReturnValue()
   * @generated
   */
  void setReturnValue(TypeRef value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.objc.mapper.mapper.MessageElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getMessage_Elements()
   * @model containment="true"
   * @generated
   */
  EList<MessageElement> getElements();

  /**
   * Returns the value of the '<em><b>Since</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Since</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Since</em>' containment reference.
   * @see #setSince(Version)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getMessage_Since()
   * @model containment="true"
   * @generated
   */
  Version getSince();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Message#getSince <em>Since</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Since</em>' containment reference.
   * @see #getSince()
   * @generated
   */
  void setSince(Version value);

} // Message
