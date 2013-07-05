/**
 */
package at.bestsolution.objc.mapper.mapper;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.objc.mapper.mapper.MapperFactory
 * @model kind="package"
 * @generated
 */
public interface MapperPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mapper";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/objc/mapper/Mapper";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mapper";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MapperPackage eINSTANCE = at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.PackageDeclarationImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Native</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NATIVE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Java Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__JAVA_PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__IMPORTS = 3;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__TYPES = 4;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.ImportImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.TypeImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.TypeRefImpl <em>Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.TypeRefImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getTypeRef()
   * @generated
   */
  int TYPE_REF = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__TYPE = 0;

  /**
   * The feature id for the '<em><b>Generic Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__GENERIC_TYPE = 1;

  /**
   * The feature id for the '<em><b>Builtin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__BUILTIN = 2;

  /**
   * The number of structural features of the '<em>Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.ProtocolImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__DOC = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__DEPRECATED = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Since</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__SINCE = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__MESSAGES = TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.MessageImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 5;

  /**
   * The feature id for the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__DOC = 0;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__DEPRECATED = 1;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__RETURN_VALUE = 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__ELEMENTS = 3;

  /**
   * The feature id for the '<em><b>Since</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__SINCE = 4;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.MessageElementImpl <em>Message Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.MessageElementImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getMessageElement()
   * @generated
   */
  int MESSAGE_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_ELEMENT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_ELEMENT__VARIABLE = 2;

  /**
   * The number of structural features of the '<em>Message Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.ClassImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__DOC = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__DEPRECATED = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Since</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SINCE = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__PARENT = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Protocols</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__PROTOCOLS = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Initializer Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__INITIALIZER_MESSAGES = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__PROPERTIES = TYPE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__MESSAGES = TYPE_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.VersionImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 8;

  /**
   * The feature id for the '<em><b>Since Major</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__SINCE_MAJOR = 0;

  /**
   * The feature id for the '<em><b>Since Minor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__SINCE_MINOR = 1;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.PropertyImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DOC = 0;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DEPRECATED = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ATTRIBUTES = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 4;

  /**
   * The feature id for the '<em><b>Since</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__SINCE = 5;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.PropertyAttributeImpl <em>Property Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.PropertyAttributeImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getPropertyAttribute()
   * @generated
   */
  int PROPERTY_ATTRIBUTE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Property Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.EnumImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__ELEMENTS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.EnumElementImpl <em>Enum Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.EnumElementImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getEnumElement()
   * @generated
   */
  int ENUM_ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ELEMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Enum Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.TypeDefImpl <em>Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.TypeDefImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getTypeDef()
   * @generated
   */
  int TYPE_DEF = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__DOC = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__STRUCT = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__ATTRIBUTES = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Block</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__BLOCK = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__TYPE_REF = TYPE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.TypeStructAttributeImpl <em>Type Struct Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.TypeStructAttributeImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getTypeStructAttribute()
   * @generated
   */
  int TYPE_STRUCT_ATTRIBUTE = 14;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STRUCT_ATTRIBUTE__TYPE_REF = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STRUCT_ATTRIBUTE__NAME = 1;

  /**
   * The number of structural features of the '<em>Type Struct Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STRUCT_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.objc.mapper.mapper.impl.DocuImpl <em>Docu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.objc.mapper.mapper.impl.DocuImpl
   * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getDocu()
   * @generated
   */
  int DOCU = 15;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCU__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Docu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCU_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see at.bestsolution.objc.mapper.mapper.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#isNative <em>Native</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Native</em>'.
   * @see at.bestsolution.objc.mapper.mapper.PackageDeclaration#isNative()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Native();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.objc.mapper.mapper.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#getJavaPackage <em>Java Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java Package</em>'.
   * @see at.bestsolution.objc.mapper.mapper.PackageDeclaration#getJavaPackage()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_JavaPackage();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see at.bestsolution.objc.mapper.mapper.PackageDeclaration#getImports()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.objc.mapper.mapper.PackageDeclaration#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see at.bestsolution.objc.mapper.mapper.PackageDeclaration#getTypes()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Types();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Ref</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeRef
   * @generated
   */
  EClass getTypeRef();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.objc.mapper.mapper.TypeRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeRef#getType()
   * @see #getTypeRef()
   * @generated
   */
  EReference getTypeRef_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.TypeRef#getGenericType <em>Generic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Generic Type</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeRef#getGenericType()
   * @see #getTypeRef()
   * @generated
   */
  EReference getTypeRef_GenericType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.TypeRef#getBuiltin <em>Builtin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Builtin</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeRef#getBuiltin()
   * @see #getTypeRef()
   * @generated
   */
  EAttribute getTypeRef_Builtin();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Protocol#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doc</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Protocol#getDoc()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Doc();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Protocol#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Deprecated</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Protocol#getDeprecated()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Deprecated();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Protocol#getSince <em>Since</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Since</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Protocol#getSince()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Since();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.objc.mapper.mapper.Protocol#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Protocol#getMessages()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Messages();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Message#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doc</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Message#getDoc()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Doc();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Message#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Deprecated</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Message#getDeprecated()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Deprecated();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Message#getReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Value</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Message#getReturnValue()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_ReturnValue();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.objc.mapper.mapper.Message#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Message#getElements()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Elements();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Message#getSince <em>Since</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Since</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Message#getSince()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Since();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.MessageElement <em>Message Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Element</em>'.
   * @see at.bestsolution.objc.mapper.mapper.MessageElement
   * @generated
   */
  EClass getMessageElement();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.MessageElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.objc.mapper.mapper.MessageElement#getName()
   * @see #getMessageElement()
   * @generated
   */
  EAttribute getMessageElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.MessageElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bestsolution.objc.mapper.mapper.MessageElement#getType()
   * @see #getMessageElement()
   * @generated
   */
  EReference getMessageElement_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.MessageElement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see at.bestsolution.objc.mapper.mapper.MessageElement#getVariable()
   * @see #getMessageElement()
   * @generated
   */
  EAttribute getMessageElement_Variable();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Class#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doc</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Class#getDoc()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Doc();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Class#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Deprecated</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Class#getDeprecated()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Deprecated();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Class#getSince <em>Since</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Since</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Class#getSince()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Since();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.objc.mapper.mapper.Class#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Class#getParent()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Parent();

  /**
   * Returns the meta object for the reference list '{@link at.bestsolution.objc.mapper.mapper.Class#getProtocols <em>Protocols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Protocols</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Class#getProtocols()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Protocols();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.objc.mapper.mapper.Class#getInitializerMessages <em>Initializer Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initializer Messages</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Class#getInitializerMessages()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_InitializerMessages();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.objc.mapper.mapper.Class#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Class#getProperties()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.objc.mapper.mapper.Class#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Class#getMessages()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Messages();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.Version#getSinceMajor <em>Since Major</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Since Major</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Version#getSinceMajor()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_SinceMajor();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.Version#getSinceMinor <em>Since Minor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Since Minor</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Version#getSinceMinor()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_SinceMinor();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Property#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doc</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Property#getDoc()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Doc();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Property#getDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Deprecated</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Property#getDeprecated()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Deprecated();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.objc.mapper.mapper.Property#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Property#getAttributes()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.Property#getSince <em>Since</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Since</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Property#getSince()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Since();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.PropertyAttribute <em>Property Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Attribute</em>'.
   * @see at.bestsolution.objc.mapper.mapper.PropertyAttribute
   * @generated
   */
  EClass getPropertyAttribute();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.PropertyAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.objc.mapper.mapper.PropertyAttribute#getName()
   * @see #getPropertyAttribute()
   * @generated
   */
  EAttribute getPropertyAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.PropertyAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.objc.mapper.mapper.PropertyAttribute#getValue()
   * @see #getPropertyAttribute()
   * @generated
   */
  EAttribute getPropertyAttribute_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.objc.mapper.mapper.Enum#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Enum#getElements()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Elements();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.EnumElement <em>Enum Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Element</em>'.
   * @see at.bestsolution.objc.mapper.mapper.EnumElement
   * @generated
   */
  EClass getEnumElement();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.EnumElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.objc.mapper.mapper.EnumElement#getName()
   * @see #getEnumElement()
   * @generated
   */
  EAttribute getEnumElement_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.EnumElement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.objc.mapper.mapper.EnumElement#getValue()
   * @see #getEnumElement()
   * @generated
   */
  EAttribute getEnumElement_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Def</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeDef
   * @generated
   */
  EClass getTypeDef();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.TypeDef#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doc</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeDef#getDoc()
   * @see #getTypeDef()
   * @generated
   */
  EReference getTypeDef_Doc();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.TypeDef#isStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Struct</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeDef#isStruct()
   * @see #getTypeDef()
   * @generated
   */
  EAttribute getTypeDef_Struct();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.objc.mapper.mapper.TypeDef#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeDef#getAttributes()
   * @see #getTypeDef()
   * @generated
   */
  EReference getTypeDef_Attributes();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.TypeDef#isBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Block</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeDef#isBlock()
   * @see #getTypeDef()
   * @generated
   */
  EAttribute getTypeDef_Block();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.TypeDef#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeDef#getTypeRef()
   * @see #getTypeDef()
   * @generated
   */
  EReference getTypeDef_TypeRef();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.TypeStructAttribute <em>Type Struct Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Struct Attribute</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeStructAttribute
   * @generated
   */
  EClass getTypeStructAttribute();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.objc.mapper.mapper.TypeStructAttribute#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeStructAttribute#getTypeRef()
   * @see #getTypeStructAttribute()
   * @generated
   */
  EReference getTypeStructAttribute_TypeRef();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.TypeStructAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.objc.mapper.mapper.TypeStructAttribute#getName()
   * @see #getTypeStructAttribute()
   * @generated
   */
  EAttribute getTypeStructAttribute_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.objc.mapper.mapper.Docu <em>Docu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Docu</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Docu
   * @generated
   */
  EClass getDocu();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.objc.mapper.mapper.Docu#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see at.bestsolution.objc.mapper.mapper.Docu#getContent()
   * @see #getDocu()
   * @generated
   */
  EAttribute getDocu_Content();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MapperFactory getMapperFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.PackageDeclarationImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NATIVE = eINSTANCE.getPackageDeclaration_Native();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Java Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__JAVA_PACKAGE = eINSTANCE.getPackageDeclaration_JavaPackage();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__IMPORTS = eINSTANCE.getPackageDeclaration_Imports();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__TYPES = eINSTANCE.getPackageDeclaration_Types();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.ImportImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.TypeImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.TypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.TypeRefImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getTypeRef()
     * @generated
     */
    EClass TYPE_REF = eINSTANCE.getTypeRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REF__TYPE = eINSTANCE.getTypeRef_Type();

    /**
     * The meta object literal for the '<em><b>Generic Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REF__GENERIC_TYPE = eINSTANCE.getTypeRef_GenericType();

    /**
     * The meta object literal for the '<em><b>Builtin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_REF__BUILTIN = eINSTANCE.getTypeRef_Builtin();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.ProtocolImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getProtocol()
     * @generated
     */
    EClass PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__DOC = eINSTANCE.getProtocol_Doc();

    /**
     * The meta object literal for the '<em><b>Deprecated</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__DEPRECATED = eINSTANCE.getProtocol_Deprecated();

    /**
     * The meta object literal for the '<em><b>Since</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__SINCE = eINSTANCE.getProtocol_Since();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__MESSAGES = eINSTANCE.getProtocol_Messages();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.MessageImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__DOC = eINSTANCE.getMessage_Doc();

    /**
     * The meta object literal for the '<em><b>Deprecated</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__DEPRECATED = eINSTANCE.getMessage_Deprecated();

    /**
     * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__RETURN_VALUE = eINSTANCE.getMessage_ReturnValue();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__ELEMENTS = eINSTANCE.getMessage_Elements();

    /**
     * The meta object literal for the '<em><b>Since</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__SINCE = eINSTANCE.getMessage_Since();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.MessageElementImpl <em>Message Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.MessageElementImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getMessageElement()
     * @generated
     */
    EClass MESSAGE_ELEMENT = eINSTANCE.getMessageElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_ELEMENT__NAME = eINSTANCE.getMessageElement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_ELEMENT__TYPE = eINSTANCE.getMessageElement_Type();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_ELEMENT__VARIABLE = eINSTANCE.getMessageElement_Variable();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.ClassImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__DOC = eINSTANCE.getClass_Doc();

    /**
     * The meta object literal for the '<em><b>Deprecated</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__DEPRECATED = eINSTANCE.getClass_Deprecated();

    /**
     * The meta object literal for the '<em><b>Since</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__SINCE = eINSTANCE.getClass_Since();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__PARENT = eINSTANCE.getClass_Parent();

    /**
     * The meta object literal for the '<em><b>Protocols</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__PROTOCOLS = eINSTANCE.getClass_Protocols();

    /**
     * The meta object literal for the '<em><b>Initializer Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__INITIALIZER_MESSAGES = eINSTANCE.getClass_InitializerMessages();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__PROPERTIES = eINSTANCE.getClass_Properties();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__MESSAGES = eINSTANCE.getClass_Messages();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.VersionImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getVersion()
     * @generated
     */
    EClass VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em><b>Since Major</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__SINCE_MAJOR = eINSTANCE.getVersion_SinceMajor();

    /**
     * The meta object literal for the '<em><b>Since Minor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__SINCE_MINOR = eINSTANCE.getVersion_SinceMinor();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.PropertyImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DOC = eINSTANCE.getProperty_Doc();

    /**
     * The meta object literal for the '<em><b>Deprecated</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DEPRECATED = eINSTANCE.getProperty_Deprecated();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__ATTRIBUTES = eINSTANCE.getProperty_Attributes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Since</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__SINCE = eINSTANCE.getProperty_Since();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.PropertyAttributeImpl <em>Property Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.PropertyAttributeImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getPropertyAttribute()
     * @generated
     */
    EClass PROPERTY_ATTRIBUTE = eINSTANCE.getPropertyAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_ATTRIBUTE__NAME = eINSTANCE.getPropertyAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_ATTRIBUTE__VALUE = eINSTANCE.getPropertyAttribute_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.EnumImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__ELEMENTS = eINSTANCE.getEnum_Elements();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.EnumElementImpl <em>Enum Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.EnumElementImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getEnumElement()
     * @generated
     */
    EClass ENUM_ELEMENT = eINSTANCE.getEnumElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ELEMENT__NAME = eINSTANCE.getEnumElement_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ELEMENT__VALUE = eINSTANCE.getEnumElement_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.TypeDefImpl <em>Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.TypeDefImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getTypeDef()
     * @generated
     */
    EClass TYPE_DEF = eINSTANCE.getTypeDef();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEF__DOC = eINSTANCE.getTypeDef_Doc();

    /**
     * The meta object literal for the '<em><b>Struct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEF__STRUCT = eINSTANCE.getTypeDef_Struct();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEF__ATTRIBUTES = eINSTANCE.getTypeDef_Attributes();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEF__BLOCK = eINSTANCE.getTypeDef_Block();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEF__TYPE_REF = eINSTANCE.getTypeDef_TypeRef();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.TypeStructAttributeImpl <em>Type Struct Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.TypeStructAttributeImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getTypeStructAttribute()
     * @generated
     */
    EClass TYPE_STRUCT_ATTRIBUTE = eINSTANCE.getTypeStructAttribute();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_STRUCT_ATTRIBUTE__TYPE_REF = eINSTANCE.getTypeStructAttribute_TypeRef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_STRUCT_ATTRIBUTE__NAME = eINSTANCE.getTypeStructAttribute_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.objc.mapper.mapper.impl.DocuImpl <em>Docu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.objc.mapper.mapper.impl.DocuImpl
     * @see at.bestsolution.objc.mapper.mapper.impl.MapperPackageImpl#getDocu()
     * @generated
     */
    EClass DOCU = eINSTANCE.getDocu();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCU__CONTENT = eINSTANCE.getDocu_Content();

  }

} //MapperPackage
