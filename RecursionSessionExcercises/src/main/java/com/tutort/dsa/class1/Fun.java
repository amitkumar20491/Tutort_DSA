package com.tutort.dsa.class1;

public class Fun {
	public void printFun(int test) {
		if (test < 1)
			return;
		else {
			System.out.printf("%d ", test);
			printFun(test - 1);
			System.out.printf("%d ", test);
			return;
		}
	}

	public int fun1(int n) {
		if (n == 1) {
			return 0;
		} else {
			return 1 + fun1(n/2);
		}
	}
}
