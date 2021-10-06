package com.tutort.dsa;

//Min element in an array
public class MinElement {

	public int minElement(int[] arr) {
		int min = -1;
		if (arr.length == 0) {
		} else {
			min = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
		}

		return min;
	}

}
