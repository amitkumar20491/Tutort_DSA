package com.tutort.dsa;

/*
 * Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
 */
public class Q9_SeriesSum {

	public int sumOfSeries(int seriesLength) {
		int sum = 0;

		for (int i = 1; i <= seriesLength; i++) {
			sum = sum + i;
		}

		return sum;
	}
}
