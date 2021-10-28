package com.tutort.dsa.class2;

/*
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int length = nums.length;
		int[] leftArray = new int[length];
		int[] rightArray = new int[length];

		leftArray[0] = 1;
		rightArray[length - 1] = 1;

		for (int i = 1; i < length; i++) {
			leftArray[i] = nums[i - 1] * leftArray[i - 1];
		}

		for (int i = length - 2; i >= 0; i--) {
			rightArray[i] = nums[i + 1] * rightArray[i + 1];
		}

		for (int i = 0; i < length; i++) {
			nums[i] = leftArray[i] * rightArray[i];
		}

		return nums;
	}
}
