package com.btm.generics;

public class MaxInteger<T extends Comparable<T>> {

	public static <T extends Comparable<T>> T checkMaximum(T... types) {
		T maximum = types[0];
		for (T type : types)
			if (type.compareTo(maximum) > 0)
				maximum = type;
		return maximum;
	}
}
