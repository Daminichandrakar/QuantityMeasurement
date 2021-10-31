package com.quantitymesurment;

/**
 * Purpose : To simulate Quantity Measurement Program
 *
 * @author DAMINI CHANDRAKAR
 * @version 11.0.11
 * @since 2021-10-31
 */
public enum LengthComparision {

	FEET(12.0), YARD(36.0), INCH(1.0),CENTIMETER(0.39);

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
		System.out.println(converter1.value);
		System.out.println(converter2.value);
		System.out.println(Math.round(converter1.value * converter1.lengthComparision.baseUnit));
		System.out.println(Math.round(converter2.value * converter2.lengthComparision.baseUnit));
		System.out.println(Double.compare(Math.round(converter1.value * converter1.lengthComparision.baseUnit),
				Math.round(converter2.value * converter2.lengthComparision.baseUnit)));
		return (Double.compare(Math.round(converter1.value * converter1.lengthComparision.baseUnit),
				Math.round(converter2.value * converter2.lengthComparision.baseUnit)) == 0);
	}
}