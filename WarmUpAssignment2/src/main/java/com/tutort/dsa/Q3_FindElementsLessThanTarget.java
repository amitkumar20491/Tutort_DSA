package com.tutort.dsa;

/*
 * Given an sorted array A of size N. Find number of elements which are less than or equal to given
element X
 */
public class Q3_FindElementsLessThanTarget {

	public int findElementLessThanTarget(int[] arr, int target) {
		int newLength = arr.length;
		while (true) {
			if (arr[(newLength) / 2] > target) {
				newLength = newLength / 2;
			} else {
				break;
			}
		}
		
		System.out.println(newLength);
		for (int i = newLength - 1; i > -1; i--) {
			if (arr[i] <= target) {
				return i + 1;
			}
		}

		return 0;

	}
}
