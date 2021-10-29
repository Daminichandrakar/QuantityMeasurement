package com.quantitymesurment;

/**
 * declaring the Feet class to call value
 */
public class Feet {

	private final double value;

	public Feet(double value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass())
			return false;
		// type cast object to Feet to compare the data members
		Feet feet = (Feet) obj;
		// compare data member
		return Double.compare(feet.value, value) == 0;
	}

	//override the hashCode method
	@Override
	public int hashCode() {
		return (int) this.value;
	}
}
