package com.tutort.dsa.class4;

/*
 * https://leetcode.com/problems/missing-number/
 */
public class MissingElement {
	public int missingNumber(int[] nums) {
		int length = nums.length;
		int[] fullSet = new int[length + 1];

		for (int i = 0; i < length + 1; i++) {
			fullSet[i] = i;
		}

		return XOR(fullSet) ^ XOR(nums);
	}

	public int XOR(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] ^ nums[i - 1];
		}

		return nums[nums.length - 1];
	}
}
