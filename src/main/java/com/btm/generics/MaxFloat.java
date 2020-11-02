package com.btm.generics;

public class MaxFloat {

	// First Max Position
	public boolean firstMax(Double x, Double y, Double z) {
		return (x.compareTo(y) > 0 && x.compareTo(z) > 0 ? true : false);
	}

	// Second Max Position
	public boolean secondMax(Double x, Double y, Double z) {
		return (y.compareTo(x) > 0 && y.compareTo(z) > 0 ? true : false);
	}

	// Third Max Position
	public boolean thirdMax(Double x, Double y, Double z) {
		return (z.compareTo(x) > 0 && z.compareTo(y) > 0 ? true : false);
	}
}
