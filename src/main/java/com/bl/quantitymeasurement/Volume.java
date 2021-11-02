package com.bl.quantitymeasurement;

/**
 * Purpose : create enum class to calculate volume that implements
 * MeasurementSystem class
 *
 */
public enum Volume implements MeasurementSystem {

	GALLON(3.78), LITRE(1.0), MILLILITRE(0.001);

	private double baseUnit;

	private Volume(double baseUnit) {
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
