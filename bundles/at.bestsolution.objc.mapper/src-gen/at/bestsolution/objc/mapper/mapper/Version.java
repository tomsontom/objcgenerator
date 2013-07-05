/**
 */
package at.bestsolution.objc.mapper.mapper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Version#getSinceMajor <em>Since Major</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.Version#getSinceMinor <em>Since Minor</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject
{
  /**
   * Returns the value of the '<em><b>Since Major</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Since Major</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Since Major</em>' attribute.
   * @see #setSinceMajor(int)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getVersion_SinceMajor()
   * @model
   * @generated
   */
  int getSinceMajor();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Version#getSinceMajor <em>Since Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Since Major</em>' attribute.
   * @see #getSinceMajor()
   * @generated
   */
  void setSinceMajor(int value);

  /**
   * Returns the value of the '<em><b>Since Minor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Since Minor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Since Minor</em>' attribute.
   * @see #setSinceMinor(int)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getVersion_SinceMinor()
   * @model
   * @generated
   */
  int getSinceMinor();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.Version#getSinceMinor <em>Since Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Since Minor</em>' attribute.
   * @see #getSinceMinor()
   * @generated
   */
  void setSinceMinor(int value);

} // Version
