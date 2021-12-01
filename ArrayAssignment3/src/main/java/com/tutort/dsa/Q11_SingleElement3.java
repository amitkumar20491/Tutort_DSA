package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/single-number-iii
 */
public class Q11_SingleElement3 {
	public int[] singleNumber(int[] nums) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (frequencyMap.containsKey(nums[i])) {
				frequencyMap.put(nums[i], frequencyMap.get(nums[i]) + 1);
			} else {
				frequencyMap.put(nums[i], 1);
			}
		}

		int count = 0;
		for (Integer a : frequencyMap.keySet()) {
			if (frequencyMap.get(a) == 1) {
				result[count] = a.intValue();
				count++;
			}
			if (count == 2) {
				break;
			}
		}

		return result;
	}
}
