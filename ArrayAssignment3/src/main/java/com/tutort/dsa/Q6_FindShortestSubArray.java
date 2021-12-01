package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/degree-of-an-array/
 * Bad Runtime : Need to improve
 */
public class Q6_FindShortestSubArray {
	public int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int degree = 0;
		for (int i = 0; i < nums.length; i++) {
			int freq = 0;
			if (map.containsKey(nums[i])) {
				freq = map.get(nums[i]) + 1;
			} else {
				freq = 1;
			}
			map.put(nums[i], freq);
			if (freq > degree) {
				degree = freq;
			}
		}

		int subsetSize = Integer.MAX_VALUE;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == degree) {
				for (int i = 0; i < nums.length; i++) {
					if (nums[i] == entry.getKey()) {
						int j = i + 1;
						int degreefreq = degree - 1;
						while (j < nums.length && degreefreq != 0) {
							if (nums[j] == entry.getKey()) {
								degreefreq--;
							}
							j++;
						}

						if (degreefreq == 0 && subsetSize > (j - i)) {
							subsetSize = j - i;
						}
					}
				}
			}
		}

		return subsetSize;
	}
}
