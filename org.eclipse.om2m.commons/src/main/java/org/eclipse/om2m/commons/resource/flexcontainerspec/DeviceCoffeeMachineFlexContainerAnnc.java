/*
Device : DeviceCoffeeMachineAnnc



A CoffeeMachine is a device that produces coffee.

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


@XmlRootElement(name = DeviceCoffeeMachineFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = DeviceCoffeeMachineFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class DeviceCoffeeMachineFlexContainerAnnc extends AbstractFlexContainerAnnc {
	
	public static final String LONG_NAME = "deviceCoffeeMachineAnnc";
	public static final String SHORT_NAME = "deCMeAnnc";
	
	public DeviceCoffeeMachineFlexContainerAnnc () {
		setContainerDefinition("org.onem2m.home.device." + DeviceCoffeeMachineFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
		getFaultDetection();
		getFaultDetectionAnnc();
		getRunMode();
		getRunModeAnnc();
		getClock();
		getClockAnnc();
		getBrewing();
		getBrewingAnnc();
		getWaterStatus();
		getWaterStatusAnnc();
		getMilkStatus();
		getMilkStatusAnnc();
		getBeansStatus();
		getBeansStatusAnnc();
		getGrinder();
		getGrinderAnnc();
		getFoamedMilk();
		getFoamedMilkAnnc();
		getMilkQuantity();
		getMilkQuantityAnnc();
		getKeepWarm();
		getKeepWarmAnnc();
		getBrewingSwitch();
		getBrewingSwitchAnnc();
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
	
	@XmlElement(name="brewg", required=true, type=BrewingFlexContainerAnnc.class)
	private BrewingFlexContainer brewing;
	
	
	public void setBrewing(BrewingFlexContainer brewing) {
		this.brewing = brewing;
		getFlexContainerOrContainerOrSubscription().add(brewing);
	}
	
	public BrewingFlexContainer getBrewing() {
		this.brewing = (BrewingFlexContainer) getResourceByName(BrewingFlexContainer.SHORT_NAME);
		return brewing;
	}
	
	@XmlElement(name="brewgAnnc", required=true, type=BrewingFlexContainerAnnc.class)
	private BrewingFlexContainerAnnc brewingAnnc;
	
	
	public void setBrewing(BrewingFlexContainerAnnc brewingAnnc) {
		this.brewingAnnc = brewingAnnc;
		getFlexContainerOrContainerOrSubscription().add(brewingAnnc);
	}
	
	public BrewingFlexContainerAnnc getBrewingAnnc() {
		this.brewingAnnc = (BrewingFlexContainerAnnc) getResourceByName(BrewingFlexContainerAnnc.SHORT_NAME);
		return brewingAnnc;
	}
	
	@XmlElement(name="watSs", required=true, type=LiquidLevelFlexContainerAnnc.class)
	private LiquidLevelFlexContainer waterStatus;
	
	
	public void setWaterStatus(LiquidLevelFlexContainer waterStatus) {
		this.waterStatus = waterStatus;
		getFlexContainerOrContainerOrSubscription().add(waterStatus);
	}
	
	public LiquidLevelFlexContainer getWaterStatus() {
		this.waterStatus = (LiquidLevelFlexContainer) getResourceByName(LiquidLevelFlexContainer.SHORT_NAME);
		return waterStatus;
	}
	
	@XmlElement(name="watSsAnnc", required=true, type=LiquidLevelFlexContainerAnnc.class)
	private LiquidLevelFlexContainerAnnc waterStatusAnnc;
	
	
	public void setWaterStatus(LiquidLevelFlexContainerAnnc waterStatusAnnc) {
		this.waterStatusAnnc = waterStatusAnnc;
		getFlexContainerOrContainerOrSubscription().add(waterStatusAnnc);
	}
	
	public LiquidLevelFlexContainerAnnc getWaterStatusAnnc() {
		this.waterStatusAnnc = (LiquidLevelFlexContainerAnnc) getResourceByName(LiquidLevelFlexContainerAnnc.SHORT_NAME);
		return waterStatusAnnc;
	}
	
	@XmlElement(name="milSs", required=true, type=LiquidLevelFlexContainerAnnc.class)
	private LiquidLevelFlexContainer milkStatus;
	
	
	public void setMilkStatus(LiquidLevelFlexContainer milkStatus) {
		this.milkStatus = milkStatus;
		getFlexContainerOrContainerOrSubscription().add(milkStatus);
	}
	
	public LiquidLevelFlexContainer getMilkStatus() {
		this.milkStatus = (LiquidLevelFlexContainer) getResourceByName(LiquidLevelFlexContainer.SHORT_NAME);
		return milkStatus;
	}
	
	@XmlElement(name="milSsAnnc", required=true, type=LiquidLevelFlexContainerAnnc.class)
	private LiquidLevelFlexContainerAnnc milkStatusAnnc;
	
	
	public void setMilkStatus(LiquidLevelFlexContainerAnnc milkStatusAnnc) {
		this.milkStatusAnnc = milkStatusAnnc;
		getFlexContainerOrContainerOrSubscription().add(milkStatusAnnc);
	}
	
	public LiquidLevelFlexContainerAnnc getMilkStatusAnnc() {
		this.milkStatusAnnc = (LiquidLevelFlexContainerAnnc) getResourceByName(LiquidLevelFlexContainerAnnc.SHORT_NAME);
		return milkStatusAnnc;
	}
	
	@XmlElement(name="beaSs", required=true, type=LiquidLevelFlexContainerAnnc.class)
	private LiquidLevelFlexContainer beansStatus;
	
	
	public void setBeansStatus(LiquidLevelFlexContainer beansStatus) {
		this.beansStatus = beansStatus;
		getFlexContainerOrContainerOrSubscription().add(beansStatus);
	}
	
	public LiquidLevelFlexContainer getBeansStatus() {
		this.beansStatus = (LiquidLevelFlexContainer) getResourceByName(LiquidLevelFlexContainer.SHORT_NAME);
		return beansStatus;
	}
	
	@XmlElement(name="beaSsAnnc", required=true, type=LiquidLevelFlexContainerAnnc.class)
	private LiquidLevelFlexContainerAnnc beansStatusAnnc;
	
	
	public void setBeansStatus(LiquidLevelFlexContainerAnnc beansStatusAnnc) {
		this.beansStatusAnnc = beansStatusAnnc;
		getFlexContainerOrContainerOrSubscription().add(beansStatusAnnc);
	}
	
	public LiquidLevelFlexContainerAnnc getBeansStatusAnnc() {
		this.beansStatusAnnc = (LiquidLevelFlexContainerAnnc) getResourceByName(LiquidLevelFlexContainerAnnc.SHORT_NAME);
		return beansStatusAnnc;
	}
	
	@XmlElement(name="grinr", required=true, type=GrinderFlexContainerAnnc.class)
	private GrinderFlexContainer grinder;
	
	
	public void setGrinder(GrinderFlexContainer grinder) {
		this.grinder = grinder;
		getFlexContainerOrContainerOrSubscription().add(grinder);
	}
	
	public GrinderFlexContainer getGrinder() {
		this.grinder = (GrinderFlexContainer) getResourceByName(GrinderFlexContainer.SHORT_NAME);
		return grinder;
	}
	
	@XmlElement(name="grinrAnnc", required=true, type=GrinderFlexContainerAnnc.class)
	private GrinderFlexContainerAnnc grinderAnnc;
	
	
	public void setGrinder(GrinderFlexContainerAnnc grinderAnnc) {
		this.grinderAnnc = grinderAnnc;
		getFlexContainerOrContainerOrSubscription().add(grinderAnnc);
	}
	
	public GrinderFlexContainerAnnc getGrinderAnnc() {
		this.grinderAnnc = (GrinderFlexContainerAnnc) getResourceByName(GrinderFlexContainerAnnc.SHORT_NAME);
		return grinderAnnc;
	}
	
	@XmlElement(name="foaMk", required=true, type=FoamingFlexContainerAnnc.class)
	private FoamingFlexContainer foamedMilk;
	
	
	public void setFoamedMilk(FoamingFlexContainer foamedMilk) {
		this.foamedMilk = foamedMilk;
		getFlexContainerOrContainerOrSubscription().add(foamedMilk);
	}
	
	public FoamingFlexContainer getFoamedMilk() {
		this.foamedMilk = (FoamingFlexContainer) getResourceByName(FoamingFlexContainer.SHORT_NAME);
		return foamedMilk;
	}
	
	@XmlElement(name="foaMkAnnc", required=true, type=FoamingFlexContainerAnnc.class)
	private FoamingFlexContainerAnnc foamedMilkAnnc;
	
	
	public void setFoamedMilk(FoamingFlexContainerAnnc foamedMilkAnnc) {
		this.foamedMilkAnnc = foamedMilkAnnc;
		getFlexContainerOrContainerOrSubscription().add(foamedMilkAnnc);
	}
	
	public FoamingFlexContainerAnnc getFoamedMilkAnnc() {
		this.foamedMilkAnnc = (FoamingFlexContainerAnnc) getResourceByName(FoamingFlexContainerAnnc.SHORT_NAME);
		return foamedMilkAnnc;
	}
	
	@XmlElement(name="milQy", required=true, type=LiquidLevelFlexContainerAnnc.class)
	private LiquidLevelFlexContainer milkQuantity;
	
	
	public void setMilkQuantity(LiquidLevelFlexContainer milkQuantity) {
		this.milkQuantity = milkQuantity;
		getFlexContainerOrContainerOrSubscription().add(milkQuantity);
	}
	
	public LiquidLevelFlexContainer getMilkQuantity() {
		this.milkQuantity = (LiquidLevelFlexContainer) getResourceByName(LiquidLevelFlexContainer.SHORT_NAME);
		return milkQuantity;
	}
	
	@XmlElement(name="milQyAnnc", required=true, type=LiquidLevelFlexContainerAnnc.class)
	private LiquidLevelFlexContainerAnnc milkQuantityAnnc;
	
	
	public void setMilkQuantity(LiquidLevelFlexContainerAnnc milkQuantityAnnc) {
		this.milkQuantityAnnc = milkQuantityAnnc;
		getFlexContainerOrContainerOrSubscription().add(milkQuantityAnnc);
	}
	
	public LiquidLevelFlexContainerAnnc getMilkQuantityAnnc() {
		this.milkQuantityAnnc = (LiquidLevelFlexContainerAnnc) getResourceByName(LiquidLevelFlexContainerAnnc.SHORT_NAME);
		return milkQuantityAnnc;
	}
	
	@XmlElement(name="keeWm", required=true, type=KeepWarmFlexContainerAnnc.class)
	private KeepWarmFlexContainer keepWarm;
	
	
	public void setKeepWarm(KeepWarmFlexContainer keepWarm) {
		this.keepWarm = keepWarm;
		getFlexContainerOrContainerOrSubscription().add(keepWarm);
	}
	
	public KeepWarmFlexContainer getKeepWarm() {
		this.keepWarm = (KeepWarmFlexContainer) getResourceByName(KeepWarmFlexContainer.SHORT_NAME);
		return keepWarm;
	}
	
	@XmlElement(name="keeWmAnnc", required=true, type=KeepWarmFlexContainerAnnc.class)
	private KeepWarmFlexContainerAnnc keepWarmAnnc;
	
	
	public void setKeepWarm(KeepWarmFlexContainerAnnc keepWarmAnnc) {
		this.keepWarmAnnc = keepWarmAnnc;
		getFlexContainerOrContainerOrSubscription().add(keepWarmAnnc);
	}
	
	public KeepWarmFlexContainerAnnc getKeepWarmAnnc() {
		this.keepWarmAnnc = (KeepWarmFlexContainerAnnc) getResourceByName(KeepWarmFlexContainerAnnc.SHORT_NAME);
		return keepWarmAnnc;
	}
	
	@XmlElement(name="breSh", required=true, type=BinarySwitchFlexContainerAnnc.class)
	private BinarySwitchFlexContainer brewingSwitch;
	
	
	public void setBrewingSwitch(BinarySwitchFlexContainer brewingSwitch) {
		this.brewingSwitch = brewingSwitch;
		getFlexContainerOrContainerOrSubscription().add(brewingSwitch);
	}
	
	public BinarySwitchFlexContainer getBrewingSwitch() {
		this.brewingSwitch = (BinarySwitchFlexContainer) getResourceByName(BinarySwitchFlexContainer.SHORT_NAME);
		return brewingSwitch;
	}
	
	@XmlElement(name="breShAnnc", required=true, type=BinarySwitchFlexContainerAnnc.class)
	private BinarySwitchFlexContainerAnnc brewingSwitchAnnc;
	
	
	public void setBrewingSwitch(BinarySwitchFlexContainerAnnc brewingSwitchAnnc) {
		this.brewingSwitchAnnc = brewingSwitchAnnc;
		getFlexContainerOrContainerOrSubscription().add(brewingSwitchAnnc);
	}
	
	public BinarySwitchFlexContainerAnnc getBrewingSwitchAnnc() {
		this.brewingSwitchAnnc = (BinarySwitchFlexContainerAnnc) getResourceByName(BinarySwitchFlexContainerAnnc.SHORT_NAME);
		return brewingSwitchAnnc;
	}
	
}