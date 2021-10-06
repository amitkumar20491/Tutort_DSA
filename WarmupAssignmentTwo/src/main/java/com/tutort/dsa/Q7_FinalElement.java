package com.tutort.dsa;

import java.util.Arrays;

/*
 * Given an array of length N, at each step it is reduced by 1 element. In the first step the maximum
element would be removed, while in the second step minimum element of the remaining array would
be removed, in the third step again the maximum and so on. Continue this till the array contains only 1
element. And find the final element remaining in the array.
 */
public class Q7_FinalElement {
	
	public int finalElement(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		if (arr.length % 2 == 0) {
			return arr[(arr.length/2) - 1];
		}else {
			return arr[arr.length/2];
		}
	}
}
