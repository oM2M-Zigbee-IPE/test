/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.onem2m.home.actions;

import org.onem2m.sdt.impl.AccessException;
import org.onem2m.sdt.impl.ActionException;
import org.onem2m.sdt.impl.Command;

public abstract class Toggle extends Command {

	public Toggle(String name) {
		super(name, "org.onem2m.home.actions.toggle");
		setDoc("Toggle the switch.");
	}

	public final void toggle() throws ActionException, AccessException {
		invoke();
	}
	
	abstract protected void doToggle() throws ActionException;
	
	@Override
	protected Object doInvoke() throws ActionException {
		// toggle does not have any argument
		doToggle();
		return null;
	}

}