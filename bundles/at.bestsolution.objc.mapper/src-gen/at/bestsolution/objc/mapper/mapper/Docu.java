/**
 */
package at.bestsolution.objc.mapper.mapper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Docu#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getDocu()
 * @model
 * @generated
 */
public interface Docu extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getDocu_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Docu#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

} // Docu
