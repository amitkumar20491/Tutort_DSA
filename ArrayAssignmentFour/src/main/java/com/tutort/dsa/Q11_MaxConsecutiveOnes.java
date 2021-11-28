package com.tutort.dsa;

/*
 * https://leetcode.com/problems/max-consecutive-ones
 */
public class Q11_MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 0;
			}

			if (i == (nums.length - 1)) {
				if (count > max) {
					max = count;
				}
			}
		}

		return max;
	}
}
