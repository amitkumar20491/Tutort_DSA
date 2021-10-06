package com.tutort.dsa;

//Find min and max in an array
public class MinMaxElement {

	public int[] minMaxElement(int[] arr) {
		int min = -1;
		int max = -1;
		if (arr.length == 0) {
		} else {
			min = arr[0];
			max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}

				if (arr[i] > max) {
					max = arr[i];
				}
			}
		}

		return new int[] { min, max };
	}

}
