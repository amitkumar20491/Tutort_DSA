package com.tutort.dsa.class1;

public class DecimalToBinary {
	public void decimalToBinary(int n) {
		if (n == 0) {
			return;
		}
		decimalToBinary(n / 2);
		System.out.printf("%d", n % 2);
	}
}
