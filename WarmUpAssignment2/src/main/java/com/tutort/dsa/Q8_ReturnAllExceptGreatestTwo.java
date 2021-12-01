package com.tutort.dsa;

import java.util.Arrays;

/*
 * Given an array of N distinct elements, the task is to find all elements in array except two greatest
elements in sorted order.
 */
public class Q8_ReturnAllExceptGreatestTwo {

	public int[] allExpectGreatestTwo(int[] arr) {
		int[] result = new int[arr.length - 2];
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 2; i++) {
			result[i] = arr[i];
		}
		return result;
	}
}
