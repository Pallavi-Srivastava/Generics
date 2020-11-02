package com.btm.generics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaxIntegerTest {

	static MaxInteger obj;

	@BeforeClass
	public static void createMaxIntegerObj() {
		obj = new MaxInteger(null, null, null);
	}

	// TC 1.1
	@Test
	public void givenInteger_ReturnsFirstMaximum() {
		int res1 = (Integer) obj.checkMaximum(90, 36, 74);
		Assert.assertEquals(res1, 90);
	}

	// TC 1.2
	@Test
	public void givenInteger_ReturnsSecondMaximum() {
		int res2 = (Integer) obj.checkMaximum(40, 50, 30);
		Assert.assertEquals(res2, 50);
	}

	// TC 1.3
	@Test
	public void givenInteger__ReturnsThirdMaximum() {
		int res3 = (Integer) obj.checkMaximum(30, 40, 80);
		Assert.assertEquals(res3, 80);
	}

	// TC 2.1
	@Test
	public void givenFloat_ReturnsFirstMaximum() {
		float res1 = (Float) obj.checkMaximum(93.5f, 30.7f, 72.0f);
		Assert.assertEquals(res1, 93.5f, 0.0f);// 0.0f is delta value.
	}

	// TC 2.2
	@Test
	public void givenFloat_ReturnsSecondMaximum() {
		float res2 = (Float) obj.checkMaximum(42.8f, 52.7f, 33.3f);
		Assert.assertEquals(res2, 52.7f, 0.0f);
	}

	// TC 2.3
	@Test
	public void givenFloat__ReturnsThirdMaximum() {
		float res3 = (Float) obj.checkMaximum(39.1f, 40.0f, 80.5f);
		Assert.assertEquals(res3, 80.5f, 0.0f);
	}

	// TC 3.1
	@Test
	public void givenString_ReturnsFirstMaximum() {
		String res1 = (String) obj.checkMaximum("Orange", "Apple", "Banana");
		Assert.assertEquals(res1, "Orange");
	}

	// TC 3.2
	@Test
	public void givenString_ReturnsSecondMaximum() {
		String res2 = (String) obj.checkMaximum("Beetroot", "Turnip", "Carrot");
		Assert.assertEquals(res2, "Turnip");
	}

	// TC 3.3
	@Test
	public void givenString__ReturnsThirdMaximum() {
		String res3 = (String) obj.checkMaximum("Close", "On", "Save");
		Assert.assertEquals(res3, "Save");
	}
}
