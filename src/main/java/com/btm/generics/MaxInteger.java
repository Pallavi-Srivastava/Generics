package com.btm.generics;

public class MaxInteger<T extends Comparable<T>> {

	T var1, var2, var3;

	public MaxInteger(T var1, T var2, T var3) {
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}

	public T checkMaximum() {
		return (T) MaxInteger.checkMaximum(var1, var2, var3);
	}

	public static <T extends Comparable<T>> T checkMaximum(T var1, T var2, T var3) {
		T maximum = var1;
		if (var2.compareTo(maximum) > 0)
			maximum = var2;
		if (var3.compareTo(maximum) > 0)
			maximum = var3;
		return maximum;
	}
}
