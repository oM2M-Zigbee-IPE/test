/*
Device : DeviceSmartElectricMeterAnnc



A smart electric meter is a metering device that is used to measure consumption data for electrictricity.

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


@XmlRootElement(name = DeviceSmartElectricMeterFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = DeviceSmartElectricMeterFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class DeviceSmartElectricMeterFlexContainerAnnc extends AbstractFlexContainerAnnc {
	
	public static final String LONG_NAME = "deviceSmartElectricMeterAnnc";
	public static final String SHORT_NAME = "dSEMrAnnc";
	
	public DeviceSmartElectricMeterFlexContainerAnnc () {
		setContainerDefinition("org.onem2m.home.device." + DeviceSmartElectricMeterFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
		getFaultDetection();
		getFaultDetectionAnnc();
		getBinarySwitch();
		getBinarySwitchAnnc();
		getRunMode();
		getRunModeAnnc();
		getClock();
		getClockAnnc();
		getEnergyConsumption();
		getEnergyConsumptionAnnc();
		getEnergyGeneration();
		getEnergyGenerationAnnc();
	}
	
	@XmlElement(name="fauDn", required=true, type=FaultDetectionFlexContainerAnnc.class)
	private FaultDetectionFlexContainer faultDetection;
	
	
	public void setFaultDetection(FaultDetectionFlexContainer faultDetection) {
		this.faultDetection = faultDetection;
		getFlexContainerOrContainerOrSubscription().add(faultDetection);
	}
	
	public FaultDetectionFlexContainer getFaultDetection() {
		this.faultDetection = (FaultDetectionFlexContainer) getResourceByName(FaultDetectionFlexContainer.SHORT_NAME);
		return faultDetection;
	}
	
	@XmlElement(name="fauDnAnnc", required=true, type=FaultDetectionFlexContainerAnnc.class)
	private FaultDetectionFlexContainerAnnc faultDetectionAnnc;
	
	
	public void setFaultDetection(FaultDetectionFlexContainerAnnc faultDetectionAnnc) {
		this.faultDetectionAnnc = faultDetectionAnnc;
		getFlexContainerOrContainerOrSubscription().add(faultDetectionAnnc);
	}
	
	public FaultDetectionFlexContainerAnnc getFaultDetectionAnnc() {
		this.faultDetectionAnnc = (FaultDetectionFlexContainerAnnc) getResourceByName(FaultDetectionFlexContainerAnnc.SHORT_NAME);
		return faultDetectionAnnc;
	}
	
	@XmlElement(name="binSh", required=true, type=BinarySwitchFlexContainerAnnc.class)
	private BinarySwitchFlexContainer binarySwitch;
	
	
	public void setBinarySwitch(BinarySwitchFlexContainer binarySwitch) {
		this.binarySwitch = binarySwitch;
		getFlexContainerOrContainerOrSubscription().add(binarySwitch);
	}
	
	public BinarySwitchFlexContainer getBinarySwitch() {
		this.binarySwitch = (BinarySwitchFlexContainer) getResourceByName(BinarySwitchFlexContainer.SHORT_NAME);
		return binarySwitch;
	}
	
	@XmlElement(name="binShAnnc", required=true, type=BinarySwitchFlexContainerAnnc.class)
	private BinarySwitchFlexContainerAnnc binarySwitchAnnc;
	
	
	public void setBinarySwitch(BinarySwitchFlexContainerAnnc binarySwitchAnnc) {
		this.binarySwitchAnnc = binarySwitchAnnc;
		getFlexContainerOrContainerOrSubscription().add(binarySwitchAnnc);
	}
	
	public BinarySwitchFlexContainerAnnc getBinarySwitchAnnc() {
		this.binarySwitchAnnc = (BinarySwitchFlexContainerAnnc) getResourceByName(BinarySwitchFlexContainerAnnc.SHORT_NAME);
		return binarySwitchAnnc;
	}
	
	@XmlElement(name="runMe", required=true, type=RunModeFlexContainerAnnc.class)
	private RunModeFlexContainer runMode;
	
	
	public void setRunMode(RunModeFlexContainer runMode) {
		this.runMode = runMode;
		getFlexContainerOrContainerOrSubscription().add(runMode);
	}
	
	public RunModeFlexContainer getRunMode() {
		this.runMode = (RunModeFlexContainer) getResourceByName(RunModeFlexContainer.SHORT_NAME);
		return runMode;
	}
	
	@XmlElement(name="runMeAnnc", required=true, type=RunModeFlexContainerAnnc.class)
	private RunModeFlexContainerAnnc runModeAnnc;
	
	
	public void setRunMode(RunModeFlexContainerAnnc runModeAnnc) {
		this.runModeAnnc = runModeAnnc;
		getFlexContainerOrContainerOrSubscription().add(runModeAnnc);
	}
	
	public RunModeFlexContainerAnnc getRunModeAnnc() {
		this.runModeAnnc = (RunModeFlexContainerAnnc) getResourceByName(RunModeFlexContainerAnnc.SHORT_NAME);
		return runModeAnnc;
	}
	
	@XmlElement(name="clock", required=true, type=ClockFlexContainerAnnc.class)
	private ClockFlexContainer clock;
	
	
	public void setClock(ClockFlexContainer clock) {
		this.clock = clock;
		getFlexContainerOrContainerOrSubscription().add(clock);
	}
	
	public ClockFlexContainer getClock() {
		this.clock = (ClockFlexContainer) getResourceByName(ClockFlexContainer.SHORT_NAME);
		return clock;
	}
	
	@XmlElement(name="clockAnnc", required=true, type=ClockFlexContainerAnnc.class)
	private ClockFlexContainerAnnc clockAnnc;
	
	
	public void setClock(ClockFlexContainerAnnc clockAnnc) {
		this.clockAnnc = clockAnnc;
		getFlexContainerOrContainerOrSubscription().add(clockAnnc);
	}
	
	public ClockFlexContainerAnnc getClockAnnc() {
		this.clockAnnc = (ClockFlexContainerAnnc) getResourceByName(ClockFlexContainerAnnc.SHORT_NAME);
		return clockAnnc;
	}
	
	@XmlElement(name="eneCn", required=true, type=EnergyConsumptionFlexContainerAnnc.class)
	private EnergyConsumptionFlexContainer energyConsumption;
	
	
	public void setEnergyConsumption(EnergyConsumptionFlexContainer energyConsumption) {
		this.energyConsumption = energyConsumption;
		getFlexContainerOrContainerOrSubscription().add(energyConsumption);
	}
	
	public EnergyConsumptionFlexContainer getEnergyConsumption() {
		this.energyConsumption = (EnergyConsumptionFlexContainer) getResourceByName(EnergyConsumptionFlexContainer.SHORT_NAME);
		return energyConsumption;
	}
	
	@XmlElement(name="eneCnAnnc", required=true, type=EnergyConsumptionFlexContainerAnnc.class)
	private EnergyConsumptionFlexContainerAnnc energyConsumptionAnnc;
	
	
	public void setEnergyConsumption(EnergyConsumptionFlexContainerAnnc energyConsumptionAnnc) {
		this.energyConsumptionAnnc = energyConsumptionAnnc;
		getFlexContainerOrContainerOrSubscription().add(energyConsumptionAnnc);
	}
	
	public EnergyConsumptionFlexContainerAnnc getEnergyConsumptionAnnc() {
		this.energyConsumptionAnnc = (EnergyConsumptionFlexContainerAnnc) getResourceByName(EnergyConsumptionFlexContainerAnnc.SHORT_NAME);
		return energyConsumptionAnnc;
	}
	
	@XmlElement(name="eneGn", required=true, type=EnergyGenerationFlexContainerAnnc.class)
	private EnergyGenerationFlexContainer energyGeneration;
	
	
	public void setEnergyGeneration(EnergyGenerationFlexContainer energyGeneration) {
		this.energyGeneration = energyGeneration;
		getFlexContainerOrContainerOrSubscription().add(energyGeneration);
	}
	
	public EnergyGenerationFlexContainer getEnergyGeneration() {
		this.energyGeneration = (EnergyGenerationFlexContainer) getResourceByName(EnergyGenerationFlexContainer.SHORT_NAME);
		return energyGeneration;
	}
	
	@XmlElement(name="eneGnAnnc", required=true, type=EnergyGenerationFlexContainerAnnc.class)
	private EnergyGenerationFlexContainerAnnc energyGenerationAnnc;
	
	
	public void setEnergyGeneration(EnergyGenerationFlexContainerAnnc energyGenerationAnnc) {
		this.energyGenerationAnnc = energyGenerationAnnc;
		getFlexContainerOrContainerOrSubscription().add(energyGenerationAnnc);
	}
	
	public EnergyGenerationFlexContainerAnnc getEnergyGenerationAnnc() {
		this.energyGenerationAnnc = (EnergyGenerationFlexContainerAnnc) getResourceByName(EnergyGenerationFlexContainerAnnc.SHORT_NAME);
		return energyGenerationAnnc;
	}
	
}