package com.tutort.dsa.class3;

/*
 * https://leetcode.com/problems/wiggle-sort/ 
 * https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1 
 */
public class WiggleSort {

	public int[] wiggleSort(int[] nums) {
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			int temp;
			if (i % 2 == 0) {
				if (i + 2 < length && nums[i] < nums[i + 2]) {
					temp = nums[i];
					nums[i] = nums[i + 2];
					nums[i + 2] = temp;
				}
			} else {
				if (i + 2 < length && nums[i] > nums[i + 2]) {
					temp = nums[i];
					nums[i] = nums[i + 2];
					nums[i + 2] = temp;
				}
			}
		}

		return nums;
	}
}
