/*
 * generated by Xtext
 */
package at.bestsolution.objc.mapper.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import at.bestsolution.objc.mapper.ui.internal.MapperActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MapperExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MapperActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MapperActivator.getInstance().getInjector(MapperActivator.AT_BESTSOLUTION_OBJC_MAPPER_MAPPER);
	}
	
}
