package com.tutort.dsa.class1;

/*
 * Given an array replace every element by greater element on right side (including the current element) 
 * optimal approach - time complexity O(n) , space complexity O(1)
 */
public class GreaterElementRightHandSide2 {
	void greatestElementRightHandSide2(int[] arr) {
		int length = arr.length;
		// loop will start from second last
		for (int i = (length - 2); i > -1; i--) {
			if (arr[i] < arr[i + 1]) {
				arr[i] = arr[i + 1];
			}
		}
	}
}
