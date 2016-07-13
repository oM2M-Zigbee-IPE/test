package org.eclipse.om2m.ipe.sdt.testsuite.subscription;

import java.util.Date;

import org.eclipse.om2m.commons.resource.FlexContainer;
import org.onem2m.sdt.DataPoint;

public class ReceivedNotification {
	// all cases
	private Date date;
	
	// case FlexContainer
	private FlexContainer flexContainer;
	
	// case SDT
	private DataPoint dataPoint;
	private Object value;

	public ReceivedNotification(final FlexContainer pFlexContainer, final Date pDate) {
		this.flexContainer = pFlexContainer;
		this.date = pDate;
	}
	
	public ReceivedNotification(final DataPoint pDataPoint, final Object pValue, final Date pDate) {
		this.dataPoint = pDataPoint;
		this.value = pValue;
		this.date = pDate;
	}

	public FlexContainer getFlexContainer() {
		return flexContainer;
	}

	public DataPoint getDataPoint() {
		return dataPoint;
	}

	public Object getValue() {
		return value;
	}

	public Date getDate() {
		return date;
	}

	
	
	
}
