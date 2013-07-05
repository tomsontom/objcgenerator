package at.bestsolution.objc.mapper.generator

import java.util.HashMap
import java.util.ArrayList
import java.util.Collections
import at.bestsolution.objc.mapper.mapper.Type
import at.bestsolution.objc.mapper.mapper.PackageDeclaration

class ImportManager {
	val map = new HashMap<String,String>()
	
	def shorten(Type type) {
		val fqnName = type.fqn;
		val currentVal = map.get(type.name);
		if( currentVal == null ) {
			map.put(type.name,fqnName);
			return type.name
		} else if( currentVal == fqnName ) {
			return type.name;
		}
		
		return fqnName;
	}
	
	def shorten(String fqnName, String simpleName) {
		val currentVal = map.get(simpleName);
		if( currentVal == null ) {
			map.put(simpleName,fqnName);
			return simpleName
		} else if( currentVal == fqnName ) {
			return simpleName;
		}
		
		return fqnName;
	}
	
	def imports() {
		val c = new ArrayList(map.values);
		Collections.sort(c);
		return c;
	}
	
	def static javaPackage(Type type) {
		val p = type.eResource.contents.get(0) as PackageDeclaration
		return p.javaPackage;
	}
	
	def static String fqn(Type t) {
		return t.javaPackage + "." + t.name
	}
	
}