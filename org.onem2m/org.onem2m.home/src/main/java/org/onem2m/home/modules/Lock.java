/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.onem2m.home.modules;

import java.util.Map;

import org.onem2m.home.types.LockState;
import org.onem2m.home.types.ModuleType;
import org.onem2m.sdt.DataPoint;
import org.onem2m.sdt.Domain;
import org.onem2m.sdt.Module;
import org.onem2m.sdt.impl.AccessException;
import org.onem2m.sdt.impl.DataPointException;

public class Lock extends Module {
	
	private LockState lockState;

	public Lock(final String name, final Domain domain, LockState lock) {
		super(name, domain, ModuleType.lock.getDefinition());
		
		this.lockState = lock;
		this.lockState.setDoc("Status of the lock (Locked / Unlocked)");
		addDataPoint(this.lockState);
	}
	
	public Lock(final String name, final Domain domain, Map<String, DataPoint> dps) {
		this(name, domain, (LockState) dps.get("lockState"));
	}

	public void setLockState(int c) throws DataPointException, AccessException {
		lockState.setValue(c);
	}
	
	public int getLockState() throws DataPointException, AccessException {
		return lockState.getValue();
	}

}