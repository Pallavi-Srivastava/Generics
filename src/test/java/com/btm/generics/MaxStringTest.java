package com.btm.generics;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaxStringTest {

	static MaxString obj;

	@BeforeClass
	public static void createMaxStringObj() {
		obj = new MaxString();
	}

	// TC 1.1
	@Test
	public void givenString_ReturnsFirstMaximum() {
		assertTrue(obj.firstMax("Orange", "Apple", "Banana"));
	}

	// TC 1.2
	@Test
	public void givenString_ReturnsSecondMaximum() {
		assertTrue(obj.secondMax("Beetroot", "Turnip", "Carrot"));
	}

	// TC 1.3
	@Test
	public void givenString__ReturnsThirdMaximum() {
		assertTrue(obj.thirdMax("Close", "On", "Save"));
	}
}
