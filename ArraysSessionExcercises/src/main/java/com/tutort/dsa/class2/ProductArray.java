package com.tutort.dsa.class2;

/*
 * Given an array of integers, update every element with multiplication of previous and next elements with following exceptions. 
 * a) First element is replaced by multiplication of first and second. 
 * b) Last element is replaced by multiplication of last and second last. 
 * Time complexity O(n) and space complexity O(1)
 */
public class ProductArray {
	void arrayMultiplication(int[] arr) {
		int length = arr.length;

		if (length >= 2) { // no action if array of size 0 or 1
			int previous = arr[0];
			for (int i = 0; i < length; i++) {
				if (i == 0) { // first
					arr[i] = arr[i] * arr[i + 1];
				} else if (i == length - 1) { // last , previous is going to be first for size 2 else length -1 original
												// value
					arr[i] = previous * arr[i];
				} else {
					int temp = arr[i]; // store current in temp , use previous to update current and update previous
										// with temp
					arr[i] = previous * arr[i + 1];
					previous = temp;
				}
			}
		}
	}
}
