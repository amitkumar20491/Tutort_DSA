package com.tutort.dsa.class1;

/*
 * given an array replace every element by greater element on right side (not including the element) All elements are positive. Array can not be empty 
 * optimal approach - time complexity O(n) , space complexity O(1)
 */
public class GreaterElementRightHandSide {
	void greatestElementRightHandSide(int[] arr) {
		int length = arr.length;
		int maxelement = arr[length - 1]; // last elemnt
		arr[length - 1] = -1;

		// loop will start from second last
		for (int i = (length - 2); i > -1; i--) {
			int temp = arr[i]; // stores the current
			// replace first and than update max
			arr[i] = maxelement;

			if (temp > maxelement) {
				maxelement = temp;
			}
		}
	}
}
