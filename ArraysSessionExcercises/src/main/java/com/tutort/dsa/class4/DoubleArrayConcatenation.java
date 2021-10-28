package com.tutort.dsa.class4;

/*
 * https://leetcode.com/problems/concatenation-of-array/
 */
public class DoubleArrayConcatenation {
	public int[] getConcatenation(int[] nums) {
		int length = nums.length;
		int[] result = new int[2 * length];

		for (int i = 0; i < length; i++) {
			result[i + length] = result[i] = nums[i];
		}

		return result;
	}
}
