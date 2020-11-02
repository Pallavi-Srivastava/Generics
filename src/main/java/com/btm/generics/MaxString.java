package com.btm.generics;

public class MaxString {

	// First Max Position
	public boolean firstMax(String x, String y, String z) {
		return (x.compareTo(y) > 0 && x.compareTo(z) > 0 ? true : false);
	}

	// Second Max Position
	public boolean secondMax(String x, String y, String z) {
		return (y.compareTo(x) > 0 && y.compareTo(z) > 0 ? true : false);
	}

	// Third Max Position
	public boolean thirdMax(String x, String y, String z) {
		return (z.compareTo(x) > 0 && z.compareTo(y) > 0 ? true : false);
	}
}
