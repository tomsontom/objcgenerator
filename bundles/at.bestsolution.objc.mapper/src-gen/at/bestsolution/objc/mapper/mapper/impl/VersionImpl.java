/**
 */
package at.bestsolution.objc.mapper.mapper.impl;

import at.bestsolution.objc.mapper.mapper.MapperPackage;
import at.bestsolution.objc.mapper.mapper.Version;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.VersionImpl#getSinceMajor <em>Since Major</em>}</li>
 *   <li>{@link at.bestsolution.objc.mapper.mapper.impl.VersionImpl#getSinceMinor <em>Since Minor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends MinimalEObjectImpl.Container implements Version
{
  /**
   * The default value of the '{@link #getSinceMajor() <em>Since Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSinceMajor()
   * @generated
   * @ordered
   */
  protected static final int SINCE_MAJOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSinceMajor() <em>Since Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSinceMajor()
   * @generated
   * @ordered
   */
  protected int sinceMajor = SINCE_MAJOR_EDEFAULT;

  /**
   * The default value of the '{@link #getSinceMinor() <em>Since Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSinceMinor()
   * @generated
   * @ordered
   */
  protected static final int SINCE_MINOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSinceMinor() <em>Since Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSinceMinor()
   * @generated
   * @ordered
   */
  protected int sinceMinor = SINCE_MINOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VersionImpl()
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
    return MapperPackage.Literals.VERSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSinceMajor()
  {
    return sinceMajor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSinceMajor(int newSinceMajor)
  {
    int oldSinceMajor = sinceMajor;
    sinceMajor = newSinceMajor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.VERSION__SINCE_MAJOR, oldSinceMajor, sinceMajor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSinceMinor()
  {
    return sinceMinor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSinceMinor(int newSinceMinor)
  {
    int oldSinceMinor = sinceMinor;
    sinceMinor = newSinceMinor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperPackage.VERSION__SINCE_MINOR, oldSinceMinor, sinceMinor));
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
      case MapperPackage.VERSION__SINCE_MAJOR:
        return getSinceMajor();
      case MapperPackage.VERSION__SINCE_MINOR:
        return getSinceMinor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MapperPackage.VERSION__SINCE_MAJOR:
        setSinceMajor((Integer)newValue);
        return;
      case MapperPackage.VERSION__SINCE_MINOR:
        setSinceMinor((Integer)newValue);
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
      case MapperPackage.VERSION__SINCE_MAJOR:
        setSinceMajor(SINCE_MAJOR_EDEFAULT);
        return;
      case MapperPackage.VERSION__SINCE_MINOR:
        setSinceMinor(SINCE_MINOR_EDEFAULT);
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
      case MapperPackage.VERSION__SINCE_MAJOR:
        return sinceMajor != SINCE_MAJOR_EDEFAULT;
      case MapperPackage.VERSION__SINCE_MINOR:
        return sinceMinor != SINCE_MINOR_EDEFAULT;
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
    result.append(" (sinceMajor: ");
    result.append(sinceMajor);
    result.append(", sinceMinor: ");
    result.append(sinceMinor);
    result.append(')');
    return result.toString();
  }

} //VersionImpl
