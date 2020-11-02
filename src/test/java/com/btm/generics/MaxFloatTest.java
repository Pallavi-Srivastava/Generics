package com.btm.generics;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaxFloatTest {

	static MaxFloat obj;

	@BeforeClass
	public static void createMaxFloatObj() {
		obj = new MaxFloat();
	}

	// TC 1.1
	@Test
	public void givenFloat_ReturnsFirstMaximum() {
		assertTrue(obj.firstMax(93.5, 30.7, 72.0));
	}

	// TC 1.2
	@Test
	public void givenFloat_ReturnsSecondMaximum() {
		assertTrue(obj.secondMax(42.8, 52.7, 33.3));
	}

	// TC 1.3
	@Test
	public void givenFloat__ReturnsThirdMaximum() {
		assertTrue(obj.thirdMax(39.1, 40.0, 80.5));
	}
}
