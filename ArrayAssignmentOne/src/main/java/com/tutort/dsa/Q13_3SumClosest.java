package com.tutort.dsa;

/*
 * https://leetcode.com/problems/3sum-closest
 */
public class Q13_3SumClosest {
	public int threeSumClosest(int[] nums, int target) {
		int length = nums.length;
		int closest = Integer.MAX_VALUE;
		int result = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				for (int k = j + 1; k < length; k++) {
					int diff = Math.abs((nums[i] + nums[j] + nums[k]) - target);
					if (closest > diff) {
						closest = diff;
						result = (nums[i] + nums[j] + nums[k]);
					}
				}
			}
		}

		return result;
	}
}
