package com.bl.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

import com.bl.quantitymeasurement.LengthComparision;
import com.bl.quantitymeasurement.QuantityMeasurement;

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
		Assert.assertFalse(feet.compare(inch));
	}

	@Test
	public void given0FeetAnd0Inch_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 0.0);
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 0.0);
		Assert.assertTrue(feet.compare(inch));
	}

	@Test
	public void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqualQuantityMeasurement() {
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		Assert.assertFalse(inch.compare(feet));
	}

	@Test
	public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement feet1 = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		QuantityMeasurement feet2 = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		Assert.assertTrue(feet1.compare(feet2));
	}

	@Test
	public void given1InchAnd1Inch_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement inch1 = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		QuantityMeasurement inch2 = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		Assert.assertTrue(inch1.compare(inch2));
	}

	@Test
	public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 12.0);
		Assert.assertTrue(feet.compare(inch));
	}

	@Test
	public void given12InchAnd1Feet_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 12.0);
		Assert.assertTrue(feet.compare(inch));
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
		Assert.assertTrue(feet.compare(yard));
	}

	@Test
	public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqualQuantityMeasurement() {
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		QuantityMeasurement yard = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		Assert.assertFalse(feet.compare(yard));
	}

	@Test
	public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqualQuantityMeasurement() {
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 1.0);
		QuantityMeasurement yard = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		Assert.assertFalse(inch.compare(yard));
	}

	@Test
	public void given36InchAnd1Yard_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 36.0);
		QuantityMeasurement yard = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		Assert.assertTrue(inch.compare(yard));
	}

	@Test
	public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement yard = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 36.0);
		Assert.assertTrue(yard.compare(inch));
	}

	@Test
	public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualQuantityMeasurement() {
		QuantityMeasurement yard = new QuantityMeasurement(LengthComparision.YARD, 1.0);
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 3.0);
		Assert.assertTrue(yard.compare(feet));
	}

	@Test
	public void given0CentimeterAnd0Centimeter_WhenCompare_ShouldEqual() {
		QuantityMeasurement centimeter1 = new QuantityMeasurement(LengthComparision.CENTIMETER, 0.0);
		QuantityMeasurement centimeter2 = new QuantityMeasurement(LengthComparision.CENTIMETER, 0.0);
		Assert.assertEquals(centimeter1, centimeter2);
	}

	@Test
	public void given0CentimeterAnd1Centimeter_WhenCompare_ShouldNotEqual() {
		QuantityMeasurement centimeter1 = new QuantityMeasurement(LengthComparision.CENTIMETER, 0.0);
		QuantityMeasurement centimeter2 = new QuantityMeasurement(LengthComparision.CENTIMETER, 1.0);
		Assert.assertNotEquals(centimeter1, centimeter2);
	}

	@Test
	public void given0CentimeterAndNull_WhenCompare_ShouldNotEqual() {
		QuantityMeasurement centimeter1 = new QuantityMeasurement(LengthComparision.CENTIMETER, 0.0);
		QuantityMeasurement centimeter2 = null;
		Assert.assertNotEquals(centimeter1, centimeter2);
	}

	@Test
	public void givenType0CentimeterAndNull_WhenCompare_ShouldEqual() {
		QuantityMeasurement centimeter1 = new QuantityMeasurement(LengthComparision.CENTIMETER, 0.0);
		QuantityMeasurement centimeter2 = new QuantityMeasurement(LengthComparision.CENTIMETER, 1.0);
		Assert.assertEquals(centimeter1.getClass(), centimeter2.getClass());
	}

	@Test
	public void given2InchAnd5Centimeter_WhenCompare_ShouldReturnTrue() {
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 2.0);
		QuantityMeasurement centimeter = new QuantityMeasurement(LengthComparision.CENTIMETER, 5.0);
		Assert.assertTrue(inch.compare(centimeter));
	}

	@Test
	public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 2.0);
		QuantityMeasurement inch1 = new QuantityMeasurement(LengthComparision.INCH, 2.0);
		Double result = inch.addition(inch1);
		QuantityMeasurement qMeasurement = new QuantityMeasurement(LengthComparision.INCH, 4.0);
		double result1 = qMeasurement.value;
		Assert.assertEquals(result, result1, 0.0);
	}

	@Test
	public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
		QuantityMeasurement feet = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 2.0);
		Double result = feet.addition(inch);
		QuantityMeasurement qMeasurement = new QuantityMeasurement(LengthComparision.INCH, 14.0);
		double result1 = qMeasurement.value;
		Assert.assertEquals(result, result1, 0.0);
	}

	@Test
	public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		QuantityMeasurement inch1 = new QuantityMeasurement(LengthComparision.FEET, 1.0);
		Double result = inch.addition(inch1);
		QuantityMeasurement qMeasurement = new QuantityMeasurement(LengthComparision.INCH, 24.0);
		double result1 = qMeasurement.value;
		Assert.assertEquals(result, result1, 0.0);
	}

	@Test
	public void given2InchAnd2Point5Centimeter_WhenAdded_ShouldReturn3Inch() {
		QuantityMeasurement inch = new QuantityMeasurement(LengthComparision.INCH, 2.0);
		QuantityMeasurement inch1 = new QuantityMeasurement(LengthComparision.CENTIMETER, 2.5);
		Double result = inch.addition(inch1);
		QuantityMeasurement qMeasurement = new QuantityMeasurement(LengthComparision.INCH, 3.0);
		double result1 = qMeasurement.value;
		Assert.assertEquals(result, result1, 0.0);
	}

	@Test
	public void given0GallonAnd0Gallon_ShouldReturnEqual() {
		QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
		QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 0.0);
		Assert.assertEquals(gallon1, gallon2);
	}

	@Test
	public void givenValue0GallonAnd1Gallon_ShouldReturnNotEqual() {
		QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
		QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 1.0);
		Assert.assertNotEquals(gallon1, gallon2);
	}

	@Test
	public void given0GallonAndNullGallon_ShouldReturnNotEqual() {
		QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
		QuantityMeasurement gallon2 = null;
		Assert.assertNotEquals(gallon1, gallon2);
	}

	@Test
	public void givenReference0GallonAnd1Gallon_ShouldReturnNotEqual() {
		QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
		QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 1.0);
		Assert.assertNotEquals(gallon1, gallon2);
	}

	@Test
	public void givenType0GallonAnd1Gallon_ShouldReturnEqual() {
		QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
		QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 1.0);
		Assert.assertEquals(gallon1.getClass(), gallon2.getClass());
	}

	@Test
	public void given0LitreAnd0Litre_ShouldReturnEqual() {
		QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
		QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 0.0);
		Assert.assertEquals(litre1, litre2);
	}

	@Test
	public void givenValue0LitreAnd1Litre_ShouldReturnNotEqual() {
		QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
		QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 1.0);
		Assert.assertNotEquals(litre1, litre2);
	}

	@Test
	public void given0LitreAndNullLitre_ShouldReturnNotEqual() {
		QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
		QuantityMeasurement litre2 = null;
		Assert.assertNotEquals(litre1, litre2);
	}

	@Test
	public void givenReference0LitreAnd1Litre_ShouldReturnNotEqual() {
		QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
		QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 1.0);
		Assert.assertNotEquals(litre1, litre2);
	}

	@Test
	public void givenType0LitreAnd1Litre_ShouldReturnEqual() {
		QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITRE, 0.0);
		QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITRE, 1.0);
		Assert.assertEquals(litre1.getClass(), litre2.getClass());
	}

	@Test
	public void given0MillilitreAnd0Millilitre_ShouldReturnEqual() {
		QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
		QuantityMeasurement millilitre2 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
		Assert.assertEquals(millilitre1, millilitre2);
	}

	@Test
	public void givenValue0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
		QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
		QuantityMeasurement millilitre2 = new QuantityMeasurement(Volume.MILLILITRE, 1.0);
		Assert.assertNotEquals(millilitre1, millilitre2);
	}

	@Test
	public void given0MillilitreAndNullMillilitre_ShouldReturnNotEqual() {
		QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
		QuantityMeasurement millilitre2 = null;
		Assert.assertNotEquals(millilitre1, millilitre2);
	}

	@Test
	public void givenReference0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
		QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
		QuantityMeasurement millilitre2 = new QuantityMeasurement(Volume.MILLILITRE, 1.0);
		Assert.assertNotEquals(millilitre1, millilitre2);
	}

	@Test
	public void givenType0MillilitreAnd1Millilitre_ShouldReturnEqual() {
		QuantityMeasurement millilitre1 = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
		QuantityMeasurement millilitre2 = new QuantityMeasurement(Volume.MILLILITRE, 1.0);
		Assert.assertEquals(millilitre1.getClass(), millilitre2.getClass());
	}

	@Test
	public void given0GallonAnd0Litre_WhenCompared_ShouldReturnEqualVolume() {
		QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 0.0);
		QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 0.0);
		boolean compareCheck = gallon.compare(litre);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void given0GallonAnd1Litre_WhenCompared_ShouldReturnNotEqualVolume() {
		QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 0.0);
		QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
		boolean compareCheck = gallon.compare(litre);
		Assert.assertFalse(compareCheck);
	}

	@Test
	public void given1GallonAnd3Point78Litre_WhenCompared_ShouldReturnEqualVolume() {
		QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
		QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 3.78);
		boolean compareCheck = gallon.compare(litre);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void given3Point78LitreAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
		QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 3.78);
		QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
		boolean compareCheck = litre.compare(gallon);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void given0LitreAnd0Millilitre_WhenCompared_ShouldReturnEqualVolume() {
		QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 0.0);
		QuantityMeasurement millilitre = new QuantityMeasurement(Volume.MILLILITRE, 0.0);
		boolean compareCheck = litre.compare(millilitre);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void given1LitreAnd1000Millilitre_WhenCompared_ShouldReturnEqualVolume() {
		QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
		QuantityMeasurement millilitre = new QuantityMeasurement(Volume.MILLILITRE, 1000.0);
		boolean compareCheck = litre.compare(millilitre);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void given1000MillilitreAnd1Litre_WhenCompared_ShouldReturnEqualVolume() {
		QuantityMeasurement millilitre = new QuantityMeasurement(Volume.MILLILITRE, 1000.0);
		QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
		boolean compareCheck = millilitre.compare(litre);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void given1GallonAnd3Point78Litre_WhenAdded_ShouldReturn7Point57Litre() {
		QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
		QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 3.78);
		double actualValue = gallon.addition(litre);
		QuantityMeasurement qMeasurement = new QuantityMeasurement(Volume.LITRE, 7.56);
		double expected = qMeasurement.value;
		Assert.assertEquals(actualValue, expected, 0.0);
	}

	@Test
	public void given1LitreAnd1000Millilitre_WhenAdded_ShouldReturn2Litre() {
		QuantityMeasurement litre = new QuantityMeasurement(Volume.LITRE, 1.0);
		QuantityMeasurement millilitre = new QuantityMeasurement(Volume.MILLILITRE, 1000.0);
		double actualValue = litre.addition(millilitre);
		QuantityMeasurement qMeasurement = new QuantityMeasurement(Volume.LITRE, 2.0);
		double expected = qMeasurement.value;
		Assert.assertEquals(actualValue, expected, 0.0);
	}
}
