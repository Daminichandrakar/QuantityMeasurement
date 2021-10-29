package com.quantitymesurment;

public class Length {

	private final double value;
	private final Unit unit;

	private static final double FEET_INCH = 12;
	private static final double YARD_FEET = 3;
	
	enum Unit {
		Feet, Inch, Yard , Null
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

	
	public boolean compare(Length obj) {
		if (this.unit.equals(obj.unit))
			return Double.compare(this.value, obj.value) == 0;
		if(this.unit.equals(Unit.Feet) && obj.unit.equals(Unit.Inch))
            return Double.compare(Math.round(this.value* FEET_INCH),obj.value) == 0;
        if(this.unit.equals(Unit.Inch) && obj.unit.equals(Unit.Feet))
            return Double.compare(this.value,Math.round(obj.value* FEET_INCH)) == 0;
        if(this.unit.equals(Unit.Yard) && obj.unit.equals(Unit.Feet))
            return Double.compare(Math.round(this.value* YARD_FEET),obj.value) == 0;
        if(this.unit.equals(Unit.Feet) && obj.unit.equals(Unit.Yard))
            return Double.compare(this.value,Math.round(obj.value* YARD_FEET)) == 0;
		return false;
	}

	// override the hashCode method
	@Override
	public int hashCode() {
		return (int) this.value;
	}
}
