package com.bl.quantitymeasurement;

import java.util.Objects;

/**
 * Purpose : To simulate Quantity Measurement Program
 *
 * @author DAMINI CHANDRAKAR
 * @version 11.0.11
 * @since 2021-10-31
 */
public class QuantityMeasurement {

	public final double value;
	public MeasurementSystem lengthComparision;

	public QuantityMeasurement(MeasurementSystem lengthComparision, Double value) {
		this.value = value;
		this.lengthComparision = lengthComparision;
	}

	/**
	 * Purpose : This method is created to compare the length
	 * 
	 * @param QuantityMeasurement object
	 * @return boolean
	 */
	public boolean compare(QuantityMeasurement converter1) {
		return (Double.compare(this.lengthComparision.convertToBaseUnit(this.value),
				converter1.lengthComparision.convertToBaseUnit(converter1.value)) == 0);
	}

	/**
	 * Purpose : This method is created to override the equals method for checking
	 * the equality of references and the value of two objects
	 * 
	 * @param Object
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuantityMeasurement qMeasurement = (QuantityMeasurement) obj;
		return Double.compare(qMeasurement.value, value) == 0 && lengthComparision.equals(qMeasurement.lengthComparision);
	}

	/**
	 * Purpose : This method is created for addition of two unit
	 * 
	 * @param QuantityMeasurement qMeasurement
	 * @return double
	 */
	public double addition(QuantityMeasurement qMeasurement) {
		return this.lengthComparision.convertToBaseUnit(this.value)
				+ qMeasurement.lengthComparision.convertToBaseUnit(qMeasurement.value);
	}

}
