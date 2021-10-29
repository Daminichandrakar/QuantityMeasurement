package com.quantitymesurment;

public class Length {

	private final double value;
	private final Unit unit;

	enum Unit {
		Feet, Inch,Null
	};

	public Length(Unit unit, double value) {
		this.unit = unit;
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
		Length length = (Length) obj;
		// compare data member
		return Double.compare(length.value, value) == 0 && unit == length.unit;
	}

	// override the hashCode method
	@Override
	public int hashCode() {
		return (int) this.value;
	}
}
