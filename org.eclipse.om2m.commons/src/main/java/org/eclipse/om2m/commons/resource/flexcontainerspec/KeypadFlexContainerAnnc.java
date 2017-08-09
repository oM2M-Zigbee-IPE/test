/*
ModuleClass : KeypadAnnc



This ModuleClass provides the capability to require a user  defined service through the key-in number. For example, a user can  define key 1 as "require a takeout from restaurant XXX with combo  meal 1". The IoT service provider or user can define the services.

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


@XmlRootElement(name = KeypadFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = KeypadFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class KeypadFlexContainerAnnc extends AbstractFlexContainerAnnc {
	
	public static final String LONG_NAME = "keypadAnnc";
	public static final String SHORT_NAME = "keypdAnnc";
	
	public KeypadFlexContainerAnnc () {
		setContainerDefinition("org.onem2m.home.moduleclass." + KeypadFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
	}
	
}