package com.tutort.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * https://leetcode.com/problems/majority-element-ii
 */
public class Q9_MajorityElement2 {
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Integer> countMap = new HashMap<>();
		int length = nums.length;
		int requiredFrequency = (int) Math.floor(1.0 * length / 3);

		for (int i = 0; i < length; i++) {
			if (!countMap.containsKey(nums[i])) {
				countMap.put(nums[i], 1);
			} else {
				int temp = countMap.get(nums[i]);
				countMap.put(nums[i], temp + 1);
			}
		}

		for (int entryKey : countMap.keySet()) {
			if (countMap.get(entryKey) > requiredFrequency) {
				result.add(entryKey);
			}
		}

		return result;
	}
}
