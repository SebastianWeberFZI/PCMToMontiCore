/*
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MontiArcDSLStandaloneSetup extends MontiArcDSLStandaloneSetupGenerated {

	public static void doSetup() {
		new MontiArcDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
