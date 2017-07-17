/*
ModuleClass : ExtendedCarbonDioxideSensor



This ModuleClass provides carbon dioxide data.

Created: 2017-07-17 15:25:54
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.om2m.commons.resource.AbstractFlexContainer;


@XmlRootElement(name = ExtendedCarbonDioxideSensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ExtendedCarbonDioxideSensorFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class ExtendedCarbonDioxideSensorFlexContainer extends AbstractFlexContainer {
	
	public static final String LONG_NAME = "extendedCarbonDioxideSensor";
	public static final String SHORT_NAME = "eCDSr";
	
	public ExtendedCarbonDioxideSensorFlexContainer () {
		setContainerDefinition("org.onem2m.home.moduleclass." + LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
	}
	
}