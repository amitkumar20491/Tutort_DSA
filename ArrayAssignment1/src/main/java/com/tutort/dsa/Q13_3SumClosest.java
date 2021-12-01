package com.tutort.dsa;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/3sum-closest
 */
public class Q13_3SumClosest {
	public int threeSumClosest(int[] nums, int target) {
		int length = nums.length;
		int diff = Integer.MAX_VALUE;

		Arrays.sort(nums);
		int result = 0;
		for (int i = 0; i < length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int low = i + 1, high = length - 1;

				while (low < high) {

					int sum = nums[i] + nums[low] + nums[high];

					if (sum > target) {
						high--;
					} else if (sum < target) {
						low++;
					} else {
						return target;
					}

					if (Math.abs(target - sum) < diff) {
						result = sum;
						diff = Math.abs(target - sum);
					}
				}
			}
		}

		return result;
	}
}
