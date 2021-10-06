package com.tutort.dsa;

//Given two sorted array, where the size of first array is enough to include all the element of two array. Return the first array in sorted by merging  second array to the first array. 
public class MergeSortedArrays {
	public int[] mergeArray(int[] arr1, int[] arr2) {
		int i = 0;
		int j = arr2.length - 1;
		int k = arr1.length - 1;

		while (arr1[i] != 0) {
			i++;
		}
		i = i - 1;

		while (k > -1) {
			if (i > -1 && j > -1 && arr1[i] > arr2[j]) {
				arr1[k] = arr1[i];
				arr1[i] = 0;
				k--;
				i--;
			}

			if (i > -1 && j > -1 && arr1[i] < arr2[j]) {
				arr1[k] = arr2[j];
				k--;
				j--;
			}

			if (i <= -1) {
				arr1[k] = arr2[j];
				j--;
				k--;
			}

		}
		return arr1;
	}
}
