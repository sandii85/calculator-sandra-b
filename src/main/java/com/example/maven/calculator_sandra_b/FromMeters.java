package com.example.maven.calculator_sandra_b;
//calculations
/**
 *17 December 2017 calculations to convert from meters to length units 
 * @author Sandra Bjorklund
 * @verision 2.3
 *
 */
public class FromMeters implements BasicCalculationsFromMeters {
	/**
	 * This is a calculation to convert meters to inches
	 * 
	 * @param ValueMeterToInch
	 * @return Returns the result of the calculation
	 */
	public double meterToInch(double valueMeterToInch) {
		double result = valueMeterToInch / 0.0254;
		return result;
	}

	/**
	 * This is a calculation to convert meters to Foot
	 * 
	 * @param ValueMeterToFoot
	 * @return Returns the result of the calculation
	 */
	public double meterToFoot(double valueMeterToFoot) {
		double result = valueMeterToFoot / 0.3048;
		return result;
	}

	/**
	 * This is a calculation to convert meters to Mm
	 * 
	 * @param ValueMeterToMm
	 * @return Returns the result of the calculation
	 */

	public double meterToMm(double valueMeterToMm) {
		double result = valueMeterToMm / 0.001;
		return result;
	}

	/**
	 * This is a calculation to convert meters to Cm
	 * 
	 * @param ValueMeterToCm
	 * @return Returns the result of the calculation
	 */
	public double meterToCm(double valueMeterToCm) {
		double result = valueMeterToCm / 0.01;
		return result;
	}

	/**
	 * This is a calculation to convert meters to Mile
	 * 
	 * @param ValueMeterToMile
	 * @return Returns the result of the calculation
	 */
	public double meterToMile(double valueMeterToMile) {
		double result = valueMeterToMile / 1609.344;
		return result;
	}

	/**
	 * This is a calculation to convert meters to Yard
	 * 
	 * @param ValueMeterToYard
	 * @return Returns the result of the calculation
	 */

	public double meterToYard(double valueMeterToYard) {
		double result = valueMeterToYard / 0.9144;
		return result;
	}

	/**
	 * This is a calculation to convert meters to Km
	 * 
	 * @param ValueMeterToKm
	 * @return Returns the result of the calculation
	 */
	public double meterToKm(double valueMeterToKm) {
		double result = valueMeterToKm / 1000;
		return result;
	}

}