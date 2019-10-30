/**
 *
 * $Id$
 */
package org.sysadl.validation;

import org.eclipse.emf.common.util.EList;

import org.sysadl.AllocationTable;
import org.sysadl.ElementDef;
import org.sysadl.Requirement;
import org.sysadl.Style;

/**
 * A sample validator interface for {@link org.sysadl.Model}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModelValidator {
	boolean validate();

	boolean validatePackages(EList<org.sysadl.Package> value);
	boolean validateRequirements(EList<Requirement> value);
	boolean validateInvolvedElements(EList<ElementDef> value);
	boolean validateAllocation(AllocationTable value);
	boolean validateStyles(EList<Style> value);
}
