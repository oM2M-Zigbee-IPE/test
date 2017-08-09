/*
ModuleClass : BinarySwitch



This ModuleClass provides capabilities to control and monitor  the state of power.

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


@XmlRootElement(name = BinarySwitchFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = BinarySwitchFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class BinarySwitchFlexContainer extends AbstractFlexContainer {
	
	public static final String LONG_NAME = "binarySwitch";
	public static final String SHORT_NAME = "binSh";
	
	public BinarySwitchFlexContainer () {
		setContainerDefinition("org.onem2m.home.moduleclass." + BinarySwitchFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
		getToggle();
	}
	
	@XmlElement(name=ToggleFlexContainer.SHORT_NAME, required=true, type=ToggleFlexContainer.class)
	private ToggleFlexContainer toggle;
	
	
	public void setToggle(ToggleFlexContainer toggle) {
		this.toggle = toggle;
		getFlexContainerOrContainerOrSubscription().add(toggle);
	}
	
	public ToggleFlexContainer getToggle() {
		this.toggle = (ToggleFlexContainer) getResourceByName(ToggleFlexContainer.SHORT_NAME);
		return toggle;
	}
	
}