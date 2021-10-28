package com.tutort.dsa.class1;

/*
 * given an array replace every element by greater element on left side (not including the element) 
 * optimal approach - time complexity O(n) , space complexity O(1)
 */
public class GreaterElementLeftHandSide {
	void greatestElementLeftHandSide(int[] arr) {
		int length = arr.length;
		int max = arr[0];
		arr[0] = -1;

		for (int i = 1; i < length; i++) {
			int temp = arr[i];
			// update first current with max
			arr[i] = max;
			// update max based on current element
			if (temp > max) {
				max = temp;
			}
		}
	}
}
