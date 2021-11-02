package com.bl.quantitymeasurement;

/**
 * Purpose : create enum class to check Temprature that implements
 * MeasurementSystem class
 *
 */
public enum Temperature implements MeasurementSystem {

	FAHRENHEIT(true), CELCIUS(false);

	private boolean baseUnit;

	private Temperature(boolean baseUnit) {
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
		if (baseUnit) {
			System.out.println("Temprature" + (value - 32) * 5 / 9);
			return (value - 32) * 5 / 9;
		}
		return value;
	}

}
