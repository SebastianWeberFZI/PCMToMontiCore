/*
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractMontiCoreClassDiagramValidator extends MCBasicsValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(org.palladiosimulator.xtext.motiarc.montiCoreCD.MontiCoreCDPackage.eINSTANCE);
		return result;
	}
}
