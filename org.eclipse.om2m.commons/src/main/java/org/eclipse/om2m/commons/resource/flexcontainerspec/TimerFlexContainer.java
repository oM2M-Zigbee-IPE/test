/*
ModuleClass : Timer



This ModuleClass provides capabilities to monitor and control  the times when the appliance executes its operations (i.e. when it  starts, when it ends).

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


@XmlRootElement(name = TimerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TimerFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class TimerFlexContainer extends AbstractFlexContainer {
	
	public static final String LONG_NAME = "timer";
	public static final String SHORT_NAME = "timer";
	
	public TimerFlexContainer () {
		setContainerDefinition("org.onem2m.home.moduleclass." + TimerFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
		getActivateClockTimer();
		getDeactivateClockTimer();
	}
	
	@XmlElement(name=ActivateClockTimerFlexContainer.SHORT_NAME, required=true, type=ActivateClockTimerFlexContainer.class)
	private ActivateClockTimerFlexContainer activateClockTimer;
	
	
	public void setActivateClockTimer(ActivateClockTimerFlexContainer activateClockTimer) {
		this.activateClockTimer = activateClockTimer;
		getFlexContainerOrContainerOrSubscription().add(activateClockTimer);
	}
	
	public ActivateClockTimerFlexContainer getActivateClockTimer() {
		this.activateClockTimer = (ActivateClockTimerFlexContainer) getResourceByName(ActivateClockTimerFlexContainer.SHORT_NAME);
		return activateClockTimer;
	}
	
	@XmlElement(name=DeactivateClockTimerFlexContainer.SHORT_NAME, required=true, type=DeactivateClockTimerFlexContainer.class)
	private DeactivateClockTimerFlexContainer deactivateClockTimer;
	
	
	public void setDeactivateClockTimer(DeactivateClockTimerFlexContainer deactivateClockTimer) {
		this.deactivateClockTimer = deactivateClockTimer;
		getFlexContainerOrContainerOrSubscription().add(deactivateClockTimer);
	}
	
	public DeactivateClockTimerFlexContainer getDeactivateClockTimer() {
		this.deactivateClockTimer = (DeactivateClockTimerFlexContainer) getResourceByName(DeactivateClockTimerFlexContainer.SHORT_NAME);
		return deactivateClockTimer;
	}
	
}