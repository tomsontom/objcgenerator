/*
 * generated by Xtext
 */
package at.bestsolution.objc.mapper.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import at.bestsolution.objc.mapper.mapper.PackageDeclaration
import at.bestsolution.objc.mapper.mapper.TypeDef

import static extension at.bestsolution.objc.mapper.generator.ImportManager.*
import at.bestsolution.objc.mapper.mapper.Protocol
import at.bestsolution.objc.mapper.mapper.TypeRef
import org.eclipse.emf.ecore.EObject
import java.util.StringTokenizer

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MapperGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val dec = resource.contents.get(0) as PackageDeclaration
		if( ! dec.native ) {
			dec.types.filter[t|!(t instanceof TypeDef) || (t as TypeDef).typeRef == null].forEach[t | fsa.generateFile(t.fqn.replace('.','/')+".java",t.doGenerate)]
		}
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	}
		
	def dispatch doGenerate(at.bestsolution.objc.mapper.mapper.Class clazz) '''
	package «clazz.javaPackage»;
	«val importManager = new ImportManager()»
	«val content = clazz.doClassContent(importManager)»
	
	«FOR i : importManager.imports»
	import «i»;
	«ENDFOR»
	
	«content»
	'''
	
	def doClassContent(at.bestsolution.objc.mapper.mapper.Class clazz, extension ImportManager mgr) '''
	/*<library>*/@«"org.robovm.rt.bro.annotation.Library".shorten("Library")»("«clazz.findPackageDeclaration.name»")/*</library>*/
	public class «clazz.name» extends «IF clazz.parent != null»«clazz.parent.shorten»«ELSE»«"org.robovm.cocoatouch.foundation.NSObject".shorten("NSObject")»«ENDIF» {
		static {
			«"org.robovm.objc.ObjCRuntime".shorten("ObjCRuntime")».bind(/*<name>*/ «clazz.name» /*</name>*/.class);
		}

		private static final boolean X86 = «"org.robovm.rt.bro.Bro".shorten("Bro")».IS_X86;
		private static final «"org.robovm.objc.ObjCClass".shorten("ObjCClass")» objCClass = «"org.robovm.objc.ObjCClass".shorten("ObjCClass")».getByType(/*<name>*/ «clazz.name» /*</name>*/.class);
		
		«FOR p : clazz.properties»
		private static final «"org.robovm.objc.Selector".shorten("Selector")» «p.name» = «"org.robovm.objc.Selector".shorten("Selector")».register("«p.name»");
		@«"org.robovm.rt.bro.annotation.Bridge".shorten("Bridge")»(symbol = "objc_msgSend") private native static «p.type.toType(mgr)» objc_get«p.name.toFirstUpper»(«clazz.name» __self__, «"org.robovm.objc.Selector".shorten("Selector")» __cmd__);
		@«"org.robovm.rt.bro.annotation.Bridge".shorten("Bridge")»(symbol = "objc_msgSendSuper") private native static «p.type.toType(mgr)» objc_get«p.name.toFirstUpper»Super(«"org.robovm.objc.ObjCSuper".shorten("ObjCSuper")» __super__, «"org.robovm.objc.Selector".shorten("Selector")» __cmd__);
		/**
		 * «p?.doc?.content?.fixJDoc?.trim»
		 * @since Available in iOS «p.since.sinceMajor».«p.since.sinceMinor» and later.
		 */
		public «p.type.toType(mgr)» get«p.name.toFirstUpper»() {
			if (customClass) { return objc_get«p.name.toFirstUpper»Super(getSuper(), «p.name»); } else { return objc_get«p.name.toFirstUpper»(this, «p.name»); }
		}
		
		«IF ! p.readonly»
		private static final «"org.robovm.objc.Selector".shorten("Selector")» set«p.name.toFirstUpper»$ = «"org.robovm.objc.Selector".shorten("Selector")».register("set«p.name.toFirstUpper»:");
		@Bridge(symbol = "objc_msgSend") private native static void objc_set«p.name.toFirstUpper»(«clazz.name» __self__, «"org.robovm.objc.Selector".shorten("Selector")» __cmd__, «p.type.toType(mgr)» «p.name»);
		@Bridge(symbol = "objc_msgSendSuper") private native static void objc_set«p.name.toFirstUpper»Super(«"org.robovm.objc.ObjCSuper".shorten("ObjCSuper")» __super__, «"org.robovm.objc.Selector".shorten("Selector")» __cmd__, «p.type.toType(mgr)» «p.name»);
		public void set«p.name.toFirstUpper»(«p.type.toType(mgr)» «p.name») {
			if (customClass) { objc_set«p.name.toFirstUpper»Super(getSuper(), set«p.name.toFirstUpper»$, «p.name»); } else { objc_set«p.name.toFirstUpper»(this, set«p.name.toFirstUpper»$, «p.name»); }
		}
		«ENDIF»
		
		«ENDFOR»
		
		static class Callbacks {
			«FOR p : clazz.properties»
			@«"org.robovm.rt.bro.annotation.Callback".shorten("Callback")» @«"org.robovm.objc.annotation.BindSelector".shorten("BindSelector")»("«p.name»") public static «p.type.toType(mgr)» get«p.name.toFirstUpper»(«clazz.name» __self__, «"org.robovm.objc.Selector".shorten("Selector")» __cmd__) { return __self__.get«p.name.toFirstUpper»(); }
			«IF ! p.readonly»
				@«"org.robovm.rt.bro.annotation.Callback".shorten("Callback")» @«"org.robovm.objc.annotation.BindSelector".shorten("BindSelector")»("«p.name»:") public static void set«p.name.toFirstUpper»(«clazz.name» __self__, «"org.robovm.objc.Selector".shorten("Selector")» __cmd__, «p.type.toType(mgr)» «p.name») { __self__.set«p.name.toFirstUpper»(«p.name»); }
			«ENDIF»
			«ENDFOR»
		}
	}
	'''
	
	def dispatch doGenerate(Protocol protocol) '''
	package «protocol.javaPackage»;
	
	public interface «protocol.name» {
		
	}
	'''
	
	def dispatch doGenerate(at.bestsolution.objc.mapper.mapper.Enum enumeration) '''
	package «enumeration.javaPackage»;
	«val importManager = new ImportManager()»
	«val content = enumeration.doEnumContent(importManager)»
	
	«FOR i : importManager.imports»
	import «i»;
	«ENDFOR»
	
	«content»
	
	'''
	
	def doEnumContent(at.bestsolution.objc.mapper.mapper.Enum enumeration, extension ImportManager mgr) '''
	public enum «enumeration.name» implements «"org.robovm.rt.bro.ValuedEnum".shorten("ValuedEnum")» {
		«var start = enumeration.elements.head.value»
		«FOR i : enumeration.elements»
		«i.name»(«start») «IF enumeration.elements.last != i»,«ELSE»;«ENDIF»
		«val b = start = start + 1»
		«ENDFOR»

		private final int n;

		private «enumeration.name»(int n) { this.n = n; }
		public int value() { return n; }
	}
	'''
	
	def dispatch doGenerate(TypeDef typeDef) '''
	package «typeDef.javaPackage»;
	
	public class «typeDef.name» {
		
	}
	'''
	
	def static readonly(at.bestsolution.objc.mapper.mapper.Property p) {
		return p.attributes.findFirst[a|a.name=="readonly"] != null;
	}
	
	def static toType(TypeRef typeRef, extension ImportManager mgr) {
		if( typeRef.builtin != null ) {
			switch(typeRef.builtin) {
				case "BOOL": return boolean
				default: return typeRef.builtin
			}
		} else {
			if( typeRef.type instanceof TypeDef && (typeRef.type as TypeDef).typeRef != null ) {
				return (typeRef.type as TypeDef).typeRef.toType(mgr)
			}
			val rv = typeRef.type.shorten
			if( typeRef.genericType != null ) {
				return rv + "<" + typeRef.genericType.toType(mgr) + ">"
			}
			return rv
		}
	}
	
	def static findPackageDeclaration(EObject e) {
		return e.eResource.contents.get(0) as PackageDeclaration
	} 
	
	def static fixJDoc(String doc) {
		val result = new StringBuffer();
		val linetokenizer = new StringTokenizer(doc, "\r\n");
		
		while (linetokenizer.hasMoreElements()) {
			var line = linetokenizer.nextToken();
			
			line = line.replaceFirst("^/[*][*]", "");
			line = line.replaceFirst("[*][/]$", "");
			line = line.replaceFirst("^.*[*]\t*", "");
			
			if (line.length() == 0 && result.length() > 0) {
				result.append("<br/>");
			}
			else {
				result.append(line);
			}
		}
		return result.toString();
	}
}