package at.bestsolution.objc.mapper.serializer;

import at.bestsolution.objc.mapper.mapper.Docu;
import at.bestsolution.objc.mapper.mapper.EnumElement;
import at.bestsolution.objc.mapper.mapper.Import;
import at.bestsolution.objc.mapper.mapper.MapperPackage;
import at.bestsolution.objc.mapper.mapper.Message;
import at.bestsolution.objc.mapper.mapper.MessageElement;
import at.bestsolution.objc.mapper.mapper.PackageDeclaration;
import at.bestsolution.objc.mapper.mapper.Property;
import at.bestsolution.objc.mapper.mapper.PropertyAttribute;
import at.bestsolution.objc.mapper.mapper.Protocol;
import at.bestsolution.objc.mapper.mapper.TypeDef;
import at.bestsolution.objc.mapper.mapper.TypeRef;
import at.bestsolution.objc.mapper.mapper.TypeStructAttribute;
import at.bestsolution.objc.mapper.mapper.Version;
import at.bestsolution.objc.mapper.services.MapperGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MapperSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MapperGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MapperPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MapperPackage.CLASS:
				if(context == grammarAccess.getClassRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Class(context, (at.bestsolution.objc.mapper.mapper.Class) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.DOCU:
				if(context == grammarAccess.getDocuRule()) {
					sequence_Docu(context, (Docu) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.ENUM:
				if(context == grammarAccess.getEnumRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Enum(context, (at.bestsolution.objc.mapper.mapper.Enum) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.ENUM_ELEMENT:
				if(context == grammarAccess.getEnumElementRule()) {
					sequence_EnumElement(context, (EnumElement) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.MESSAGE:
				if(context == grammarAccess.getMessageRule()) {
					sequence_Message(context, (Message) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.MESSAGE_ELEMENT:
				if(context == grammarAccess.getMessageElementRule()) {
					sequence_MessageElement(context, (MessageElement) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.PROPERTY_ATTRIBUTE:
				if(context == grammarAccess.getPropertyAttributeRule()) {
					sequence_PropertyAttribute(context, (PropertyAttribute) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.PROTOCOL:
				if(context == grammarAccess.getProtocolRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Protocol(context, (Protocol) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.TYPE_DEF:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_TypeDef(context, (TypeDef) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.TYPE_REF:
				if(context == grammarAccess.getTypeRefRule()) {
					sequence_TypeRef(context, (TypeRef) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.TYPE_STRUCT_ATTRIBUTE:
				if(context == grammarAccess.getTypeStructAttributeRule()) {
					sequence_TypeStructAttribute(context, (TypeStructAttribute) semanticObject); 
					return; 
				}
				else break;
			case MapperPackage.VERSION:
				if(context == grammarAccess.getVersionRule()) {
					sequence_Version(context, (Version) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         doc=Docu? 
	 *         deprecated=Version? 
	 *         name=ID 
	 *         since=Version 
	 *         parent=[Class|QualifiedName]? 
	 *         (protocols+=[Protocol|QualifiedName] protocols+=[Protocol|QualifiedName]*)? 
	 *         initializerMessages+=Message* 
	 *         properties+=Property* 
	 *         messages+=Message*
	 *     )
	 */
	protected void sequence_Class(EObject context, at.bestsolution.objc.mapper.mapper.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     content=JDOC
	 */
	protected void sequence_Docu(EObject context, Docu semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MapperPackage.Literals.DOCU__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapperPackage.Literals.DOCU__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDocuAccess().getContentJDOCTerminalRuleCall_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=INT?)
	 */
	protected void sequence_EnumElement(EObject context, EnumElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=EnumElement elements+=EnumElement*)
	 */
	protected void sequence_Enum(EObject context, at.bestsolution.objc.mapper.mapper.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName)
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (type=TypeRef variable=ID)?)
	 */
	protected void sequence_MessageElement(EObject context, MessageElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=Docu? deprecated=Version? returnValue=TypeRef elements+=MessageElement+ since=Version)
	 */
	protected void sequence_Message(EObject context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (native?='native'? name=ID javaPackage=QualifiedName imports+=Import* types+=Type+)
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=ID?)
	 */
	protected void sequence_PropertyAttribute(EObject context, PropertyAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=Docu? 
	 *         deprecated=Version? 
	 *         (attributes+=PropertyAttribute attributes+=PropertyAttribute*)? 
	 *         type=TypeRef 
	 *         name=ID 
	 *         since=Version
	 *     )
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=Docu? deprecated=Version? name=ID since=Version messages+=Message*)
	 */
	protected void sequence_Protocol(EObject context, Protocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=Docu? 
	 *         (
	 *             (struct?='struct' attributes+=TypeStructAttribute+) | 
	 *             (block?='void' attributes+=TypeStructAttribute attributes+=TypeStructAttribute*) | 
	 *             typeRef=TypeRef
	 *         ) 
	 *         name=ID
	 *     )
	 */
	protected void sequence_TypeDef(EObject context, TypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|QualifiedName]? | (type=[Type|QualifiedName] genericType=TypeRef?) | builtin=BuiltinType)
	 */
	protected void sequence_TypeRef(EObject context, TypeRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeRef=TypeRef name=ID)
	 */
	protected void sequence_TypeStructAttribute(EObject context, TypeStructAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MapperPackage.Literals.TYPE_STRUCT_ATTRIBUTE__TYPE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapperPackage.Literals.TYPE_STRUCT_ATTRIBUTE__TYPE_REF));
			if(transientValues.isValueTransient(semanticObject, MapperPackage.Literals.TYPE_STRUCT_ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapperPackage.Literals.TYPE_STRUCT_ATTRIBUTE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeStructAttributeAccess().getTypeRefTypeRefParserRuleCall_0_0(), semanticObject.getTypeRef());
		feeder.accept(grammarAccess.getTypeStructAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sinceMajor=INT sinceMinor=INT)
	 */
	protected void sequence_Version(EObject context, Version semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MapperPackage.Literals.VERSION__SINCE_MAJOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapperPackage.Literals.VERSION__SINCE_MAJOR));
			if(transientValues.isValueTransient(semanticObject, MapperPackage.Literals.VERSION__SINCE_MINOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapperPackage.Literals.VERSION__SINCE_MINOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVersionAccess().getSinceMajorINTTerminalRuleCall_0_0(), semanticObject.getSinceMajor());
		feeder.accept(grammarAccess.getVersionAccess().getSinceMinorINTTerminalRuleCall_2_0(), semanticObject.getSinceMinor());
		feeder.finish();
	}
}
