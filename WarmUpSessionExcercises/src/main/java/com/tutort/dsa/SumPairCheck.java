package com.tutort.dsa;

//Given an array and a target value, return true/false, if there exist a pair whose sum is equals to the target value. 
public class SumPairCheck {

	public boolean isSumPairExist(int[] arr, int target) {
		boolean result = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
}
