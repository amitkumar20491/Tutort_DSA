package com.tutort.dsa;

/*
 * Given an array Arr of N positive integers. Your task is to find the elements whose value is equal
to that of its index value ( Consider 1-based indexing ).

 */
public class Q5_IndexValueMatch {

	public int findIndexValueMatch(int[] arr) {
		for (int i = 1; i <= arr.length; i++) {
			if (arr[i - 1] == i) {
				return arr[i - 1];
			}
		}
		return 0;
	}
}
