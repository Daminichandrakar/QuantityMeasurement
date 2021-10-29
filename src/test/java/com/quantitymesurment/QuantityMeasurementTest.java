package com.quantitymesurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

	@Test
	 public void givenValueInFeet_WhenEqual_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }
}
