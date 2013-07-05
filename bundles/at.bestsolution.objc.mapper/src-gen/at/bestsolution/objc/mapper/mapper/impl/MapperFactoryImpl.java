/**
 */
package at.bestsolution.objc.mapper.mapper.impl;

import at.bestsolution.objc.mapper.mapper.Docu;
import at.bestsolution.objc.mapper.mapper.EnumElement;
import at.bestsolution.objc.mapper.mapper.Import;
import at.bestsolution.objc.mapper.mapper.MapperFactory;
import at.bestsolution.objc.mapper.mapper.MapperPackage;
import at.bestsolution.objc.mapper.mapper.Message;
import at.bestsolution.objc.mapper.mapper.MessageElement;
import at.bestsolution.objc.mapper.mapper.PackageDeclaration;
import at.bestsolution.objc.mapper.mapper.Property;
import at.bestsolution.objc.mapper.mapper.PropertyAttribute;
import at.bestsolution.objc.mapper.mapper.Protocol;
import at.bestsolution.objc.mapper.mapper.Type;
import at.bestsolution.objc.mapper.mapper.TypeDef;
import at.bestsolution.objc.mapper.mapper.TypeRef;
import at.bestsolution.objc.mapper.mapper.TypeStructAttribute;
import at.bestsolution.objc.mapper.mapper.Version;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapperFactoryImpl extends EFactoryImpl implements MapperFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MapperFactory init()
  {
    try
    {
      MapperFactory theMapperFactory = (MapperFactory)EPackage.Registry.INSTANCE.getEFactory(MapperPackage.eNS_URI);
      if (theMapperFactory != null)
      {
        return theMapperFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MapperFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapperFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MapperPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case MapperPackage.IMPORT: return createImport();
      case MapperPackage.TYPE: return createType();
      case MapperPackage.TYPE_REF: return createTypeRef();
      case MapperPackage.PROTOCOL: return createProtocol();
      case MapperPackage.MESSAGE: return createMessage();
      case MapperPackage.MESSAGE_ELEMENT: return createMessageElement();
      case MapperPackage.CLASS: return createClass();
      case MapperPackage.VERSION: return createVersion();
      case MapperPackage.PROPERTY: return createProperty();
      case MapperPackage.PROPERTY_ATTRIBUTE: return createPropertyAttribute();
      case MapperPackage.ENUM: return createEnum();
      case MapperPackage.ENUM_ELEMENT: return createEnumElement();
      case MapperPackage.TYPE_DEF: return createTypeDef();
      case MapperPackage.TYPE_STRUCT_ATTRIBUTE: return createTypeStructAttribute();
      case MapperPackage.DOCU: return createDocu();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol createProtocol()
  {
    ProtocolImpl protocol = new ProtocolImpl();
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageElement createMessageElement()
  {
    MessageElementImpl messageElement = new MessageElementImpl();
    return messageElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public at.bestsolution.objc.mapper.mapper.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version createVersion()
  {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyAttribute createPropertyAttribute()
  {
    PropertyAttributeImpl propertyAttribute = new PropertyAttributeImpl();
    return propertyAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public at.bestsolution.objc.mapper.mapper.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumElement createEnumElement()
  {
    EnumElementImpl enumElement = new EnumElementImpl();
    return enumElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef createTypeDef()
  {
    TypeDefImpl typeDef = new TypeDefImpl();
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeStructAttribute createTypeStructAttribute()
  {
    TypeStructAttributeImpl typeStructAttribute = new TypeStructAttributeImpl();
    return typeStructAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Docu createDocu()
  {
    DocuImpl docu = new DocuImpl();
    return docu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapperPackage getMapperPackage()
  {
    return (MapperPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MapperPackage getPackage()
  {
    return MapperPackage.eINSTANCE;
  }

} //MapperFactoryImpl
