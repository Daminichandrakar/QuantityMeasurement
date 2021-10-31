package com.quantitymesurment;

/**
 * Purpose : To simulate Quantity Measurement Program
 *
 * @author DAMINI CHANDRAKAR
 * @version 11.0.11
 * @since 2021-10-31
 */
public enum LengthComparision {

	FEET(12.0), YARD(36.0), INCH(1.0);

	private double baseUnit;

	private LengthComparision(double baseUnit) {
		this.baseUnit = baseUnit;
	}

	/**
	 * Purpose : This method is created to convert one unit to another unit and
	 * check value is same or not
	 * 
	 * @param QuantityMeasurement object
	 * @return boolean
	 */
	public boolean compare(QuantityMeasurement converter1, QuantityMeasurement converter2) {
		return (Double.compare(converter1.value * converter1.lengthComparision.baseUnit,
				converter2.value * converter2.lengthComparision.baseUnit) == 0);
	}
}
