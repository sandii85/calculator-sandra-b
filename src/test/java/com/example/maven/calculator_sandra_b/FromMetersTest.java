package com.example.maven.calculator_sandra_b;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;
/**
 * 17 December 2017 
 * @Tests with add zero, addition and subtraction for each method
 * @author Sandra Bjorklund
 * @verision 2.3

 */
public class FromMetersTest {

	FromMeters fM = new FromMeters();
	Random random = new Random();
	private static final Logger LOG = Logger.getLogger(FromMetersTest.class.getName());

	@Test
	public void testMeterToInch() {
		double tempValueMeterToInch = 0.0;
		double tempMeterToInchResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToInch = random.nextDouble() * 35;
			tempMeterToInchResult = tempValueMeterToInch / 0.0254;
			LOG.info("Testing the method meterToInch with the value = " + tempValueMeterToInch);
			assertEquals(fM.meterToInch(tempValueMeterToInch), tempMeterToInchResult,tempMeterToInchResult);
		}
	}
	@Test
	public void testMeterToInchWithZero() {
		double tempValueMeterToInch = 0.0;
		double tempMeterToInchResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToInch = random.nextDouble() * 0;
			tempMeterToInchResult = tempValueMeterToInch / 0.0254;
			LOG.info("Testing the method meterToInchZero = " + tempValueMeterToInch);
			assertEquals(fM.meterToInch(tempValueMeterToInch), tempMeterToInchResult,tempMeterToInchResult);
		}
	}
	@Test
	public void testMeterToInchSubtract() {
		double tempValueMeterToInch = 0.0;
		double tempMeterToInchResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToInch =  -random.nextDouble() * 35;
			tempMeterToInchResult = tempValueMeterToInch / 0.0254;
			LOG.info("Testing the method meterToInchSub with the value = " + tempValueMeterToInch);
			assertEquals(fM.meterToInch(tempValueMeterToInch), tempMeterToInchResult,tempMeterToInchResult);
		}
	}

	@Test
	public void testMeterToFoot() {
		double tempValueMeterToFoot = 0.0;
		double tempMeterToFootResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToFoot = random.nextDouble() * 39;
			tempMeterToFootResult = tempValueMeterToFoot / 0.3048;
			LOG.info("Testing the method meterToFoot with the value = " + tempValueMeterToFoot);
			assertEquals(fM.meterToFoot(tempValueMeterToFoot), tempMeterToFootResult,tempMeterToFootResult);
		}
	}
	@Test
	public void testMeterToFootWithZero() {
		double tempValueMeterToFoot = 0.0;
		double tempMeterToFootResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToFoot = random.nextDouble() * 0;
			tempMeterToFootResult = tempValueMeterToFoot / 0.3048;
			LOG.info("Testing the method meterToFootZero= " + tempValueMeterToFoot);
			assertEquals(fM.meterToFoot(tempValueMeterToFoot), tempMeterToFootResult,tempMeterToFootResult);
		}
	}
	@Test
	public void testMeterToFootSubtract() {
		double tempValueMeterToFoot = 0.0;
		double tempMeterToFootResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToFoot = -random.nextDouble() * 35;
			tempMeterToFootResult = tempValueMeterToFoot / 0.3048;
			LOG.info("Testing the method meterToFootSub with the value = " + tempValueMeterToFoot);
			assertEquals(fM.meterToFoot(tempValueMeterToFoot), tempMeterToFootResult,tempMeterToFootResult);
		}
	}
	@Test
	public void testMeterToMm() {
		double tempValueMeterToMm = 0.0;
		double tempMeterToMmResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToMm = random.nextDouble() * 35;
			tempMeterToMmResult = tempValueMeterToMm / 0.001;
			LOG.info("Testing the method meterToMm with the value = " + tempValueMeterToMm);
			assertEquals(fM.meterToMm(tempValueMeterToMm), tempMeterToMmResult,tempMeterToMmResult);
		}
	}
	@Test
	public void testMeterToMmWithZero() {
		double tempValueMeterToMm = 0.0;
		double tempMeterToMmResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToMm = random.nextDouble() * 0;
			tempMeterToMmResult = tempValueMeterToMm / 0.001;
			LOG.info("Testing the method meterToMmZero = " + tempValueMeterToMm);
			assertEquals(fM.meterToMm(tempValueMeterToMm), tempMeterToMmResult,tempMeterToMmResult);
		}
	}
	@Test
	public void testMeterToMmSubtract() {
		double tempValueMeterToMm = 0.0;
		double tempMeterToMmResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToMm = -random.nextDouble() * 35;
			tempMeterToMmResult = tempValueMeterToMm / 0.001;
			LOG.info("Testing the method meterToMmSub with the value = " + tempValueMeterToMm);
			assertEquals(fM.meterToMm(tempValueMeterToMm), tempMeterToMmResult,tempMeterToMmResult);
		}
	}
	@Test
	public void testMeterToCm() {
		double tempValueMeterToCm = 0.0;
		double tempMeterToCmResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToCm = random.nextDouble() * 35;
			tempMeterToCmResult = tempValueMeterToCm / 0.01;
			LOG.info("Testing the method meterToCm with the value = " + tempValueMeterToCm);
			assertEquals(fM.meterToCm(tempValueMeterToCm), tempMeterToCmResult,tempMeterToCmResult);
		}
	}
	@Test
	public void testMeterToCmWithZero() {
		double tempValueMeterToCm = 0.0;
		double tempMeterToCmResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToCm = random.nextDouble() * 0;
			tempMeterToCmResult = tempValueMeterToCm / 0.01;
			LOG.info("Testing the method meterToCmZero = " + tempValueMeterToCm);
			assertEquals(fM.meterToCm(tempValueMeterToCm), tempMeterToCmResult,tempMeterToCmResult);
		}
	}
	@Test
	public void testMeterToCmSubtract() {
		double tempValueMeterToCm = 0.0;
		double tempMeterToCmResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToCm = - random.nextDouble() * 35;
			tempMeterToCmResult = tempValueMeterToCm / 0.01;
			LOG.info("Testing the method meterToCmSub with the value = " + tempValueMeterToCm);
			assertEquals(fM.meterToCm(tempValueMeterToCm), tempMeterToCmResult,tempMeterToCmResult);
		}
	}
	@Test
	public void testMeterToMile() {
		double tempValueMeterToMile = 0.0;
		double tempMeterToMileResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToMile = random.nextDouble() * 35;
			tempMeterToMileResult = tempValueMeterToMile / 1609.344;
			LOG.info("Testing the method meterToMile with the value = " + tempValueMeterToMile);
			assertEquals(fM.meterToMile(tempValueMeterToMile), tempMeterToMileResult,tempMeterToMileResult);
		}
	}
	@Test
	public void testMeterToMileWithZero() {
		double tempValueMeterToMile = 0.0;
		double tempMeterToMileResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToMile = random.nextDouble() * 0;
			tempMeterToMileResult = tempValueMeterToMile / 1609.344;
			LOG.info("Testing the method meterToMileZero = " + tempValueMeterToMile);
			assertEquals(fM.meterToMile(tempValueMeterToMile), tempMeterToMileResult,tempMeterToMileResult);
		}
	}
	@Test
	public void testMeterToMileSubtract() {
		double tempValueMeterToMile = 0.0;
		double tempMeterToMileResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToMile = -random.nextDouble() * 98;
			tempMeterToMileResult = tempValueMeterToMile / 1609.344;
			LOG.info("Testing the method meterToMileSub with the value = " + tempValueMeterToMile);
			assertEquals(fM.meterToMile(tempValueMeterToMile), tempMeterToMileResult,tempMeterToMileResult);
		}
	}

	@Test
	public void testMeterToYard() {
		double tempValueMeterToYard = 0.0;
		double tempMeterToYardResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToYard = random.nextDouble() * 35;
			tempMeterToYardResult = tempValueMeterToYard / 0.9144;
			LOG.info("Testing the method meterToYard with the value = " + tempValueMeterToYard);
			assertEquals(fM.meterToYard(tempValueMeterToYard), tempMeterToYardResult,tempMeterToYardResult);
		}
	}
	@Test
	public void testMeterToYardWithZero() {
		double tempValueMeterToYard = 0.0;
		double tempMeterToYardResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToYard = random.nextDouble() * 0;
			tempMeterToYardResult = tempValueMeterToYard / 0.9144;
			LOG.info("Testing the method meterToYardZero = " + tempValueMeterToYard);
			assertEquals(fM.meterToYard(tempValueMeterToYard), tempMeterToYardResult,tempMeterToYardResult);
		}
	}
	@Test
	public void testMeterToYardSubtract() {
		double tempValueMeterToYard = 0.0;
		double tempMeterToYardResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToYard = -random.nextDouble() * 35;
			tempMeterToYardResult = tempValueMeterToYard / 0.9144;
			LOG.info("Testing the method meterToYardSub with the value = " + tempValueMeterToYard);
			assertEquals(fM.meterToYard(tempValueMeterToYard), tempMeterToYardResult,tempMeterToYardResult);
		}
	}

	@Test
	public void testMeterToKm() {
		double tempValueMeterToKm = 0.0;
		double tempMeterToKmResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToKm = random.nextDouble() * 35;
			tempMeterToKmResult = tempValueMeterToKm / 1000;
			LOG.info("Testing the method meterToKm with the value = " + tempValueMeterToKm);
			assertEquals(fM.meterToKm(tempValueMeterToKm), tempMeterToKmResult,tempMeterToKmResult);
		}
	}
	@Test
	public void testMeterToKmSubtract() {
		double tempValueMeterToKm = 0.0;
		double tempMeterToKmResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToKm = -random.nextDouble() * 35;
			tempMeterToKmResult = tempValueMeterToKm / 1000;
			LOG.info("Testing the method meterToKmSub with the value = " + tempValueMeterToKm);
			assertEquals(fM.meterToKm(tempValueMeterToKm), tempMeterToKmResult,tempMeterToKmResult);
		}
	}
	@Test
	public void testMeterToKmWithZero() {
		double tempValueMeterToKm = 0.0;
		double tempMeterToKmResult = 0.0;
		for (int i = 0; i < 50; i++) {
			tempValueMeterToKm = random.nextDouble() * 0;
			tempMeterToKmResult = tempValueMeterToKm / 1000;
			LOG.info("Testing the method meterToKmZero =  " + tempValueMeterToKm);
			assertEquals(fM.meterToKm(tempValueMeterToKm), tempMeterToKmResult,tempMeterToKmResult);
		}
	}

}
