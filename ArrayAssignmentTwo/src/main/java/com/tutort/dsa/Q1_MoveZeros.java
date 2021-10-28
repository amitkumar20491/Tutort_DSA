package com.tutort.dsa;

/*
 * https://leetcode.com/problems/move-zeroes/
 */
public class Q1_MoveZeros {
	public void moveZeroes(int[] nums) {
		int zerothPosition = 0;

		if (nums.length > 1) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 0) {
					zerothPosition++;
				} else {

					if (zerothPosition != 0) {
						nums[i - zerothPosition] = nums[i];
						nums[i] = 0;
					}
				}
			}
		}
	}
}
