/*
Device : DeviceMotionDetector



A MotionDetector is a device that triggers alarm in case of motion detection.

Created: 2017-08-09 15:38:06
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.om2m.commons.resource.AbstractFlexContainer;
import org.eclipse.om2m.commons.resource.AbstractFlexContainerAnnc;


@XmlRootElement(name = DeviceMotionDetectorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = DeviceMotionDetectorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class DeviceMotionDetectorFlexContainer extends AbstractFlexContainer {
	
	public static final String LONG_NAME = "deviceMotionDetector";
	public static final String SHORT_NAME = "deMDr";
	
	public DeviceMotionDetectorFlexContainer () {
		setContainerDefinition("org.onem2m.home.device." + DeviceMotionDetectorFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
		getMotionSensor();
	}
	
	@XmlElement(name="motSr", required=true, type=MotionSensorFlexContainer.class)
	private MotionSensorFlexContainer motionSensor;
	
	
	public void setMotionSensor(MotionSensorFlexContainer motionSensor) {
		this.motionSensor = motionSensor;
		getFlexContainerOrContainerOrSubscription().add(motionSensor);
	}
	
	public MotionSensorFlexContainer getMotionSensor() {
		this.motionSensor = (MotionSensorFlexContainer) getResourceByName(MotionSensorFlexContainer.SHORT_NAME);
		return motionSensor;
	}
	
}