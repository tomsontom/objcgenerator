/**
 */
package at.bestsolution.objc.mapper.mapper;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Enum#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends Type
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.objc.mapper.mapper.EnumElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getEnum_Elements()
   * @model containment="true"
   * @generated
   */
  EList<EnumElement> getElements();

} // Enum
