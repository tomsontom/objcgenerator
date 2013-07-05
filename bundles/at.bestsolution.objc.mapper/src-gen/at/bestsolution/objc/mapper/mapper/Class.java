/**
 */
package at.bestsolution.objc.mapper.mapper;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Class#getDoc <em>Doc</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Class#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Class#getSince <em>Since</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Class#getParent <em>Parent</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Class#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Class#getInitializerMessages <em>Initializer Messages</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Class#getProperties <em>Properties</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Class#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Type
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
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getClass_Doc()
   * @model containment="true"
   * @generated
   */
  Docu getDoc();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Class#getDoc <em>Doc</em>}' containment reference.
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
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getClass_Deprecated()
   * @model containment="true"
   * @generated
   */
  Version getDeprecated();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Class#getDeprecated <em>Deprecated</em>}' containment reference.
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
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getClass_Since()
   * @model containment="true"
   * @generated
   */
  Version getSince();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Class#getSince <em>Since</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Since</em>' containment reference.
   * @see #getSince()
   * @generated
   */
  void setSince(Version value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Class)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getClass_Parent()
   * @model
   * @generated
   */
  Class getParent();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Class#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Class value);

  /**
   * Returns the value of the '<em><b>Protocols</b></em>' reference list.
   * The list contents are of type {@link at.bestsolution.objc.mapper.mapper.Protocol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocols</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocols</em>' reference list.
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getClass_Protocols()
   * @model
   * @generated
   */
  EList<Protocol> getProtocols();

  /**
   * Returns the value of the '<em><b>Initializer Messages</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.objc.mapper.mapper.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initializer Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initializer Messages</em>' containment reference list.
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getClass_InitializerMessages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getInitializerMessages();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.objc.mapper.mapper.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getClass_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

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
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getClass_Messages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getMessages();

} // Class
