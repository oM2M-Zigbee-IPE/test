/*******************************************************************************
 * Copyright (c) 2014, 2016 Orange.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.onem2m.sdt.home.mocked.module;

import org.onem2m.home.modules.AlarmSpeaker;
import org.onem2m.home.types.Tone;
import org.onem2m.sdt.Domain;
import org.onem2m.sdt.datapoints.BooleanDataPoint;
import org.onem2m.sdt.home.mocked.devices.Activator;
import org.onem2m.sdt.impl.DataPointException;

public class MockedAlarmSpeaker extends AlarmSpeaker {
	
	public MockedAlarmSpeaker(String name, Domain domain) {
		super(name, domain,
			new BooleanDataPoint("alarmStatus") {
				private boolean alarmStatus = false;
				@Override
				public void doSetValue(Boolean value) throws DataPointException {
					alarmStatus = value;
					Activator.logger.info("set alarmStatus " + value);
				}
				@Override
				public Boolean doGetValue() throws DataPointException {
					return alarmStatus;
				}
			}
		);

		setTone(new Tone("tone") {
			private Integer tone = Tone.Silent;
			@Override
			public void doSetValue(Integer value) throws DataPointException {
				tone = value;
				Activator.logger.info("tone " + tone);
			}
			@Override
			public Integer doGetValue() throws DataPointException {
				return tone;
			}
		});
	}

}