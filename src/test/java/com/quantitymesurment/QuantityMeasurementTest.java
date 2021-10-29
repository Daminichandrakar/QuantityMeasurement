package com.quantitymesurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

	@Test
	public void givenValueInFeet_WhenEqual_ShouldReturnEquals() {
		Length feet1 = new Length(Length.Unit.Feet, 0.0);
		Length feet2 = new Length(Length.Unit.Feet, 0.0);
		Assert.assertEquals(feet1, feet2);
	}

	@Test
	public void givenValueIn0FeetAnd1Feet_WhenNotEqual_ShouldReturnNotEquals() {
		Length feet1 = new Length(Length.Unit.Feet, 0.0);
		Length feet2 = new Length(Length.Unit.Feet, 1.0);
		Assert.assertNotEquals(feet1, feet2);
	}

	@Test
	public void givenOneNullFeetValue_ShouldReturnNotEquals() {
		Length feet1 = new Length(Length.Unit.Feet, 0.0);
		Length feet2 = null;
		boolean result = feet1.equals(feet2);
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenValueInInch_ShouldReturnEquals() {
		Length inch1 = new Length(Length.Unit.Inch, 0.0);
		Length inch2 = new Length(Length.Unit.Inch, 0.0);
		Assert.assertEquals(inch1, inch2);
	}

	@Test
	public void given2DifferentValueInInch_ShouldReturnNotEquals() {
		Length inch1 = new Length(Length.Unit.Inch, 0.0);
		Length inch2 = new Length(Length.Unit.Inch, 1.0);
		Assert.assertNotEquals(inch1, inch2);
	}

	@Test
	public void givenNullValueInInch_ShouldNotEqual() {
		Length inch1 = new Length(Length.Unit.Inch, 0.0);
		Length inch2 = new Length(Length.Unit.Null, 0.0);
		boolean result = inch1.equals(inch2);
		Assert.assertEquals(false, result);
	}

}
