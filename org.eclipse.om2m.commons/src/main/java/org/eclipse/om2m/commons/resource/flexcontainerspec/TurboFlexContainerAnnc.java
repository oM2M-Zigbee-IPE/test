/*
ModuleClass : TurboAnnc



This ModuleClass provides capabilities to enalbe turbo mode and  monitor the current status of the turbo function. It is intended to  be part of objects which use turbo function such as an air  conditioner, a washing machine etc.

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


@XmlRootElement(name = TurboFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TurboFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class TurboFlexContainerAnnc extends AbstractFlexContainerAnnc {
	
	public static final String LONG_NAME = "turboAnnc";
	public static final String SHORT_NAME = "turboAnnc";
	
	public TurboFlexContainerAnnc () {
		setContainerDefinition("org.onem2m.home.moduleclass." + TurboFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
	}
	
}