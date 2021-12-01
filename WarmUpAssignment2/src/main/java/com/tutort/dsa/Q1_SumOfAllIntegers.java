package com.tutort.dsa;

/*
 * Given an array of N integers. Your task is to print the sum of all of the integers
 */
public class Q1_SumOfAllIntegers {

	public int findSum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
