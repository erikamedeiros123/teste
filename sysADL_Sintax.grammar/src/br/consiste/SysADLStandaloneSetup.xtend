/*
 * generated by Xtext 2.10.0
 */
package br.consiste


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SysADLStandaloneSetup extends SysADLStandaloneSetupGenerated {

	def static void doSetup() {
		new SysADLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
