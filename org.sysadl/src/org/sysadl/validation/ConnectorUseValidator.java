/**
 *
 * $Id$
 */
package org.sysadl.validation;

import org.eclipse.emf.common.util.EList;

import org.sysadl.ConnectorBinding;
import org.sysadl.ConnectorDef;
import org.sysadl.PortUse;

/**
 * A sample validator interface for {@link org.sysadl.ConnectorUse}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConnectorUseValidator {
	boolean validate();

	boolean validateDefinition(ConnectorDef value);
	boolean validatePorts(EList<PortUse> value);
	boolean validateBindings(EList<ConnectorBinding> value);
}
