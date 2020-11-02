package com.btm.generics;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaxIntegerTest {

	static MaxInteger obj;

	@BeforeClass
	public static void createMaxIntegerObj() {
		obj = new MaxInteger();
	}

	// TC 1.1
	@Test
	public void givenInteger_ReturnsFirstMaximum1() {
		assertTrue(obj.firstMax(90, 36, 74));
	}

	// TC 1.2
	@Test
	public void givenInteger_ReturnsSecondMaximum1() {
		assertTrue(obj.secondMax(40, 50, 30));
	}

	// TC 1.3
	@Test
	public void givenInteger__ReturnsThirdMaximum2() {
		assertTrue(obj.thirdMax(30, 40, 80));
	}
}
