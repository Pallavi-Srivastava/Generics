package com.btm.generics;

import java.util.Comparator;

public class MaxInteger<T extends Comparator<T>> {

	public static <T extends Comparable<T>> T checkMaximum(T var1, T var2, T var3) {
		T maximum = var1;
		if (var2.compareTo(maximum) > 0)
			maximum = var2;
		if (var3.compareTo(maximum) > 0)
			maximum = var3;
		return maximum;
	}
}
