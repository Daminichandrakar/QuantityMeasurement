package com.quantitymesurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
	@Test
	public void given0FeetAnd0Feet_ShouldReturnEqual() {
		QuantityMeasurement feet1 = new QuantityMeasurement(LengthComparision.FEET, 0.0);
		QuantityMeasurement feet2 = new QuantityMeasurement(LengthComparision.FEET, 0.0);
		Assert.assertEquals(feet1, feet2);
	}

	@Test
	public void given0FeetAndNullFeet_ShouldReturnNotEqual() {
		QuantityMeasurement feet1 = new QuantityMeasurement(LengthComparision.FEET, 0.0);
		QuantityMeasurement feet2 = null;
		Assert.assertNotEquals(feet1, feet2);
	}

	@Test
	public void givenReference0FeetAnd1Feet_ShouldReturnNotEqual() {
		QuantityMeasurement feet1 = new QuantityMeasurement(LengthComparision.FEET, 0.0);
		QuantityMeasurement feet2 = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		Assert.assertNotEquals(feet1, feet2);
	}

	@Test
	public void givenType0FeetAnd1Feet_ShouldReturnEqual() {
		QuantityMeasurement feet1 = new QuantityMeasurement(LengthComparision.FEET, 0.0);
		QuantityMeasurement feet2 = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		Assert.assertEquals(feet1.getClass(), feet2.getClass());
	}

	@Test
	public void givenValue0FeetAnd1Feet_ShouldReturnNotEqual() {
		QuantityMeasurement feet1 = new QuantityMeasurement(LengthComparision.FEET, 0.0);
		QuantityMeasurement feet2 = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		Assert.assertNotEquals(feet1, feet2);
	}

	@Test
	public void given0InchAnd0Inch_ShouldReturnEqual() {
		QuantityMeasurement inch1 = new QuantityMeasurement(LengthComparision.INCH, 0.0);
		QuantityMeasurement inch2 = new QuantityMeasurement(LengthComparision.INCH, 0.0);
		Assert.assertEquals(inch1, inch2);
	}

	@Test
	public void given0InchAndNullInch_ShouldReturnNotEqual() {
		QuantityMeasurement inch1 = new QuantityMeasurement(LengthComparision.INCH, 0.0);
		QuantityMeasurement inch2 = null;
		Assert.assertNotEquals(inch1, inch2);
	}

	@Test
	public void givenReference0InchAnd1Inch_ShouldReturnNotEqual() {
		QuantityMeasurement inch1 = new QuantityMeasurement(LengthComparision.INCH, 0.0);
		QuantityMeasurement inch2 = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		Assert.assertNotEquals(inch1, inch2);
	}

	@Test
	public void givenType0InchAnd1Inch_ShouldReturnEqual() {
		QuantityMeasurement inch1 = new QuantityMeasurement(LengthComparision.INCH, 0.0);
		QuantityMeasurement inch2 = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		Assert.assertEquals(inch1.getClass(), inch2.getClass());
	}

	@Test
	public void givenValue0InchAnd1Inch_ShouldReturnNotEqual() {
		QuantityMeasurement inch1 = new QuantityMeasurement(LengthComparision.INCH, 0.0);
		QuantityMeasurement inch2 = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		Assert.assertNotEquals(inch1, inch2);
	}

	@Test
	public void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotEqual() {
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		Assert.assertFalse(feet.compare(feet, inch));
	}

	@Test
	public void given0FeetAnd0Inch_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 0.0);
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 0.0);
		Assert.assertTrue(feet.compare(feet, inch));
	}

	@Test
	public void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqualQuantityMeasurement() {
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		Assert.assertFalse(inch.compare(inch, feet));
	}

	@Test
	public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement feet1 = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		QuantityMeasurement feet2 = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		Assert.assertTrue(feet1.compare(feet1, feet2));
	}

	@Test
	public void given1InchAnd1Inch_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement inch1 = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		QuantityMeasurement inch2 = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		Assert.assertTrue(inch1.compare(inch1, inch2));
	}

	@Test
	public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 12.0);
		Assert.assertTrue(feet.compare(feet, inch));
	}

	@Test
	public void given12InchAnd1Feet_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET,0.083);
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH,1.0);
		Assert.assertTrue(feet.compare(feet, inch));
	}

	@Test
	public void given0YardAnd0Yard_ShouldReturnEqual() {
		QuantityMeasurement yard1 = new QuantityMeasurement(LengthComparision.YARD, 0.0);
		QuantityMeasurement yard2 = new QuantityMeasurement(LengthComparision.YARD, 0.0);
		Assert.assertEquals(yard1, yard2);
	}

	@Test
	public void givenValue0YardAnd1Yard_ShouldReturnNotEqual() {
		QuantityMeasurement yard1 = new QuantityMeasurement(LengthComparision.YARD, 0.0);
		QuantityMeasurement yard2 = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		Assert.assertNotEquals(yard1, yard2);
	}

	@Test
	public void given0YardAndNullYard_ShouldReturnNotEqual() {
		QuantityMeasurement yard1 = new QuantityMeasurement(LengthComparision.YARD, 0.0);
		QuantityMeasurement yard2 = null;
		Assert.assertNotEquals(yard1, yard2);
	}

	@Test
	public void givenReference0YardAnd1Yard_ShouldReturnNotEqual() {
		QuantityMeasurement yard1 = new QuantityMeasurement(LengthComparision.YARD, 0.0);
		QuantityMeasurement yard2 = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		Assert.assertNotEquals(yard1, yard2);
	}

	@Test
	public void givenType0YardAnd1Yard_ShouldReturnEqual() {
		QuantityMeasurement yard1 = new QuantityMeasurement(LengthComparision.YARD, 0.0);
		QuantityMeasurement yard2 = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		Assert.assertEquals(yard1.getClass(), yard2.getClass());
	}

	@Test
	public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 3.0);
		QuantityMeasurement yard = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		Assert.assertTrue(feet.compare(feet, yard));
	}

	@Test
	public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqualQuantityMeasurement() {
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		QuantityMeasurement yard = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		Assert.assertFalse(feet.compare(feet, yard));
	}

	@Test
	public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqualQuantityMeasurement() {
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		QuantityMeasurement yard = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		Assert.assertFalse(inch.compare(inch, yard));
	}

	@Test
	public void given36InchAnd1Yard_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 36.0);
		QuantityMeasurement yard = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		Assert.assertTrue(inch.compare(inch, yard));
	}

	@Test
	public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement yard = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 36.0);
		Assert.assertTrue(yard.compare(yard, inch));
	}

	@Test
	public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement yard = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 3.0);
		Assert.assertTrue(yard.compare(yard, feet));
	}
	
	@Test
	public void given0CentimeterAnd0Centimeter_WhenCompare_ShouldEqual() {
		QuantityMeasurement centimeter1 = new QuantityMeasurement(LengthComparision.CENTIMETER, 0.0);
		QuantityMeasurement centimeter2 = new QuantityMeasurement(LengthComparision.CENTIMETER, 0.0);
		Assert.assertTrue(centimeter1.compare(centimeter1, centimeter2));
	}
	
}
