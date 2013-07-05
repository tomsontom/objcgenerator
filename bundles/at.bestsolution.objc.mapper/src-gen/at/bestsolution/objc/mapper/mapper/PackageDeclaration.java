/**
 */
package at.bestsolution.objc.mapper.mapper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#isNative <em>Native</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#getJavaPackage <em>Java Package</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#getImports <em>Imports</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getPackageDeclaration()
 * @model
 * @generated
 */
public interface PackageDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Native</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Native</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Native</em>' attribute.
   * @see #setNative(boolean)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getPackageDeclaration_Native()
   * @model
   * @generated
   */
  boolean isNative();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#isNative <em>Native</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Native</em>' attribute.
   * @see #isNative()
   * @generated
   */
  void setNative(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getPackageDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Java Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Package</em>' attribute.
   * @see #setJavaPackage(String)
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getPackageDeclaration_JavaPackage()
   * @model
   * @generated
   */
  String getJavaPackage();

  /**
   * Sets the value of the '{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#getJavaPackage <em>Java Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Package</em>' attribute.
   * @see #getJavaPackage()
   * @generated
   */
  void setJavaPackage(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.objc.mapper.mapper.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getPackageDeclaration_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.objc.mapper.mapper.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see at.bestsolution.objc.mapper.mapper.MapperPackage#getPackageDeclaration_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

} // PackageDeclaration
