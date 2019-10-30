/**
 *
 * $Id$
 */
package org.sysadl.validation;

import org.sysadl.Expression;
import org.sysadl.NamedElement;

/**
 * A sample validator interface for {@link org.sysadl.FeatureReference}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FeatureReferenceValidator {
	boolean validate();

	boolean validateFeature(NamedElement value);
	boolean validateField(NamedElement value);
	boolean validateExpr(Expression value);
}
