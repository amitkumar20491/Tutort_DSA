package com.tutort.dsa;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/third-maximum-number/
 */
public class Q2_ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		Arrays.sort(nums);

		int i = nums.length - 2;
		int j = 1;

		while (i >= 0 && j != 3) {
			if (nums[i] != nums[i + 1]) {
				j++;
			}
			i--;
		}

		return (j == 3) ? nums[i + 1] : nums[nums.length - 1];
	}
}
