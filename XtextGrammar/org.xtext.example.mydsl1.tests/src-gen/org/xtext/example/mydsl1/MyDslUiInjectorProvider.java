/*
* generated by Xtext
*/
package org.xtext.example.mydsl1;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MyDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.example.mydsl1.ui.internal.MyDslActivator.getInstance().getInjector("org.xtext.example.mydsl1.MyDsl");
	}
	
}
