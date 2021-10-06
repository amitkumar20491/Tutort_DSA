package com.tutort.dsa;

/*
 * Given an array of size N and you have to tell whether the array is perfect or not. An array is said
to be perfect if it's reverse array matches the original array. If the array is perfect then print
"PERFECT" else print "NOT PERFECT".
 */
public class Q6_PerfectArray {

	private static final String perfect = "PERFECT";
	private static final String not_perfect = "NOT PERFECT";

	public String isPerfectArray(int[] arr) {
		if (arr.length % 2 == 0) {
			return not_perfect;
		} else {
			for (int i = 0, j = arr.length - 1; i < arr.length / 2 && j > arr.length / 2; i++, j--) {
				if (arr[i] == arr[j]) {
					continue;
				} else {
					return not_perfect;
				}
			}
		}

		return perfect;
	}
}
