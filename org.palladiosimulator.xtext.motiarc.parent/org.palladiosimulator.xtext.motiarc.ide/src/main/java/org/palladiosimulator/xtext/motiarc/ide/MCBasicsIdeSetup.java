/*
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.palladiosimulator.xtext.motiarc.MCBasicsRuntimeModule;
import org.palladiosimulator.xtext.motiarc.MCBasicsStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MCBasicsIdeSetup extends MCBasicsStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MCBasicsRuntimeModule(), new MCBasicsIdeModule()));
	}
	
}
