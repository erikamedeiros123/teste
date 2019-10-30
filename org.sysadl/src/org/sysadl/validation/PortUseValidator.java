/**
 *
 * $Id$
 */
package org.sysadl.validation;

import org.sysadl.AbstractPortUse;
import org.sysadl.PortDef;

/**
 * A sample validator interface for {@link org.sysadl.PortUse}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PortUseValidator {
	boolean validate();

	boolean validateDefinition(PortDef value);
	boolean validateAbstractPort(AbstractPortUse value);
}
