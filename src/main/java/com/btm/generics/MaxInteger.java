package com.btm.generics;

public class MaxInteger {
	
	//First Max Position
	public boolean firstMax(Integer x, Integer y, Integer z) {
		return (x.compareTo(y) > 0 && x.compareTo(z) > 0 ? true : false);
	}

	//Second Max Position
	public boolean secondMax(Integer x, Integer y, Integer z) {
		return (y.compareTo(x) > 0 && y.compareTo(z) > 0 ? true : false);
	}

	//Third Max Position
	public boolean thirdMax(Integer x, Integer y, Integer z) {
		return (z.compareTo(x) > 0 && z.compareTo(y) > 0 ? true : false);
	}
}
