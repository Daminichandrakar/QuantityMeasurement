package com.quantitymesurment;

/**
 * Purpose : To simulate Quantity Measurement Program
 *
 * @author DAMINI CHANDRAKAR
 * @version 11.0.11
 * @since 2021-10-31
 */
public class QuantityMeasurement {

	public final double value;
	public LengthComparision lengthComparision;

	public QuantityMeasurement(LengthComparision lengthComparision, Double value) {
		this.value = value;
		this.lengthComparision = lengthComparision;
	}

	/**
	 * Purpose : This method is created to compare the length
	 * 
	 * @param QuantityMeasurement object
	 * @return boolean
	 */
	public boolean compare(QuantityMeasurement converter1, QuantityMeasurement converter2) {
		return lengthComparision.compare(converter1, converter2);
	}

	/**
	 * Purpose : This method is created to compare two object is equal or not
	 * 
	 * @param Object
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		QuantityMeasurement qMeasurement = (QuantityMeasurement) obj;
		return Double.compare(qMeasurement.value, value) == 0;
	}

}
