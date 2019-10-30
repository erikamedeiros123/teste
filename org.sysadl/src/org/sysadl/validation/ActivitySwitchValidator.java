/**
 *
 * $Id$
 */
package org.sysadl.validation;

import org.eclipse.emf.common.util.EList;

import org.sysadl.ActivitySwitchCase;

/**
 * A sample validator interface for {@link org.sysadl.ActivitySwitch}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActivitySwitchValidator {
	boolean validate();

	boolean validateCases(EList<ActivitySwitchCase> value);
}
