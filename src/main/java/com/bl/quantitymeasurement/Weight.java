package com.bl.quantitymeasurement;

/**
 * Purpose : create enum class to calculate Weight that implements
 * MeasurementSystem class
 *
 */
public enum Weight implements MeasurementSystem {

	GRAM(0.001), KILOGRAM(1.0), TONNE(1000.0);

	private double baseUnit;

	private Weight(double baseUnit) {
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
