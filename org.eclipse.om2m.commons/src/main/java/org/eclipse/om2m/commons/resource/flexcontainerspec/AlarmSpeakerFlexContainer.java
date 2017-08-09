/*
ModuleClass : AlarmSpeaker



This ModuleClass provides the capability to initiate an alarm.

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


@XmlRootElement(name = AlarmSpeakerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = AlarmSpeakerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class AlarmSpeakerFlexContainer extends AbstractFlexContainer {
	
	public static final String LONG_NAME = "alarmSpeaker";
	public static final String SHORT_NAME = "alaSr";
	
	public AlarmSpeakerFlexContainer () {
		setContainerDefinition("org.onem2m.home.moduleclass." + AlarmSpeakerFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
	}
	
}