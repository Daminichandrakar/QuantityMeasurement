package com.quantitymesurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

	@Test
	 public void givenValueInFeet_WhenEqual_ShouldReturnEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }
	
	@Test
	 public void givenValueIn0FeetAnd1Feet_WhenNotEqual_ShouldReturnNotEquals() {
       Feet feet1 = new Feet(0.0);
       Feet feet2 = new Feet(1.0);
       Assert.assertNotEquals(feet1, feet2);
   }
}
