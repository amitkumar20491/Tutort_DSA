package com.tutort.dsa;

/*
 * https://leetcode.com/problems/shuffle-the-array
 */
public class Q2_ShuffleTheArray {
	public int[] shuffle(int[] nums, int n) {
		int[] result = new int[2 * n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			result[count] = nums[i];
			result[count + 1] = nums[i + n];
			count += 2;
		}

		return result;
	}
}
