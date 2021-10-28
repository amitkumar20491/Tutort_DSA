package com.tutort.dsa.class3;

/*
 * https://leetcode.com/problems/build-array-from-permutation
 */
public class BuildArrayFromPermutation {
	public int[] buildArray(int[] nums) {
		int length = nums.length;
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			result[i] = nums[nums[i]];
		}

		return result;
	}
}
