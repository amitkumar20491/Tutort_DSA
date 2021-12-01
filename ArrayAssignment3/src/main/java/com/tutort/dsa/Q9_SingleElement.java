package com.tutort.dsa;

/*
 * https://leetcode.com/problems/single-number
 */
public class Q9_SingleElement {
	public int singleNumber(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] ^= nums[i - 1];
		}

		return nums[nums.length - 1];
	}
}
