/**
 */
package at.bestsolution.objc.mapper.mapper;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Protocol#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Protocol#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Protocol#getSince <em>Since</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Protocol#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends Type
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
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getProtocol_Doc()
   * @model containment="true"
   * @generated
   */
  Docu getDoc();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Protocol#getDoc <em>Doc</em>}' containment reference.
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
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getProtocol_Deprecated()
   * @model containment="true"
   * @generated
   */
  Version getDeprecated();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Protocol#getDeprecated <em>Deprecated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprecated</em>' containment reference.
   * @see #getDeprecated()
   * @generated
   */
  void setDeprecated(Version value);

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
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getProtocol_Since()
   * @model containment="true"
   * @generated
   */
  Version getSince();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Protocol#getSince <em>Since</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Since</em>' containment reference.
   * @see #getSince()
   * @generated
   */
  void setSince(Version value);

  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.objc.mapper.mapper.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getProtocol_Messages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getMessages();

} // Protocol
