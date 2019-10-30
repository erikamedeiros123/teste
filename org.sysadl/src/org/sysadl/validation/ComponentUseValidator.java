/**
 *
 * $Id$
 */
package org.sysadl.validation;

import org.eclipse.emf.common.util.EList;

import org.sysadl.ComponentDef;
import org.sysadl.PortUse;

/**
 * A sample validator interface for {@link org.sysadl.ComponentUse}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComponentUseValidator {
	boolean validate();

	boolean validateDefinition(ComponentDef value);
	boolean validatePorts(EList<PortUse> value);
}
