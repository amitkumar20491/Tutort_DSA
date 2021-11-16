package com.tutort.dsa.class1;

public class Fibonacci {
	public int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int k = fib(n - 1) + fib(n - 2);
		return k;
	}
}
