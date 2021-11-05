package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/summary-ranges/
 */
public class Q4_SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
		List<String> result = new ArrayList<>();
		int length = nums.length;

		if (length == 0) {
		} else if (length == 1) {
			result.add(String.valueOf(nums[0]));
		} else {
			int start = 0;
			for (int i = 0; i < length; i++) {
				if (i != (length - 1) && (nums[i + 1] - nums[i] == 1)) {
					continue;
				} else {
					if (start == i) {
						result.add(String.valueOf(nums[i]));
					} else {
						result.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[i]));
					}
					start = i + 1;
				}
			}
		}
		return result;

	}
}
