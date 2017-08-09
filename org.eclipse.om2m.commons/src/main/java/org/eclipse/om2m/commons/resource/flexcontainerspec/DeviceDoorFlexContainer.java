/*
Device : DeviceDoor



A door is a door.

Created: 2017-08-09 15:38:05
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.om2m.commons.resource.AbstractFlexContainer;
import org.eclipse.om2m.commons.resource.AbstractFlexContainerAnnc;


@XmlRootElement(name = DeviceDoorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = DeviceDoorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class DeviceDoorFlexContainer extends AbstractFlexContainer {
	
	public static final String LONG_NAME = "deviceDoor";
	public static final String SHORT_NAME = "devDr";
	
	public DeviceDoorFlexContainer () {
		setContainerDefinition("org.onem2m.home.device." + DeviceDoorFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
		getBattery();
		getDoorStatus();
		getLock();
	}
	
	@XmlElement(name="batty", required=true, type=BatteryFlexContainer.class)
	private BatteryFlexContainer battery;
	
	
	public void setBattery(BatteryFlexContainer battery) {
		this.battery = battery;
		getFlexContainerOrContainerOrSubscription().add(battery);
	}
	
	public BatteryFlexContainer getBattery() {
		this.battery = (BatteryFlexContainer) getResourceByName(BatteryFlexContainer.SHORT_NAME);
		return battery;
	}
	
	@XmlElement(name="dooSs", required=true, type=DoorStatusFlexContainer.class)
	private DoorStatusFlexContainer doorStatus;
	
	
	public void setDoorStatus(DoorStatusFlexContainer doorStatus) {
		this.doorStatus = doorStatus;
		getFlexContainerOrContainerOrSubscription().add(doorStatus);
	}
	
	public DoorStatusFlexContainer getDoorStatus() {
		this.doorStatus = (DoorStatusFlexContainer) getResourceByName(DoorStatusFlexContainer.SHORT_NAME);
		return doorStatus;
	}
	
	@XmlElement(name="lock", required=true, type=LockFlexContainer.class)
	private LockFlexContainer lock;
	
	
	public void setLock(LockFlexContainer lock) {
		this.lock = lock;
		getFlexContainerOrContainerOrSubscription().add(lock);
	}
	
	public LockFlexContainer getLock() {
		this.lock = (LockFlexContainer) getResourceByName(LockFlexContainer.SHORT_NAME);
		return lock;
	}
	
}