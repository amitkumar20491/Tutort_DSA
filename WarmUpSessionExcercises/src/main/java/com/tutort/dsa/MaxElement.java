package com.tutort.dsa;

//Max element in an array
public class MaxElement {

	public int maxElement(int[] arr) {
		int max = -1;
		if (arr.length == 0) {
		} else {
			max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
		}

		return max;
	}
}
