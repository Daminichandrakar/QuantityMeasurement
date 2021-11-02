package com.bl.quantitymeasurement;

/**
 * Purpose : create enum class to calculate lengthComparision that implements
 * MeasurementSystem class
 *
 */
public enum LengthComparision implements MeasurementSystem {

	INCH(1.0), FEET(12.0), YARD(36.0), CENTIMETER(0.4);

	private double baseUnit;

	private LengthComparision(double baseUnit) {
		this.baseUnit = baseUnit;
	}

	/**
	 * Purpose : To override the convertToBaseUnit() method
	 *
	 * @param value
	 * @return double
	 */
	@Override
	public double convertToBaseUnit(double value) {
		return value * baseUnit;
	}

}
