package com.tutort.dsa;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem : https://leetcode.com/problems/two-sum
 */

public class Q1_TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		int length = nums.length;

		for (int i = 0; i < length; i++) {
			if (hashMap.containsKey(target - nums[i])) {
				return new int[] { i, hashMap.get(target - nums[i]) };
			}
 
			hashMap.put(nums[i], i);
		}

		return new int[] {};
	}
}
