package com.tutort.dsa;

import java.util.*;

public class Q11_3Sum {
	public List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		int length = nums.length;
		Map<Integer, Integer> hashMap = new HashMap<>();

		// handle if length is less than 3
		if (nums.length < 3) {
			return new ArrayList<List<Integer>>();
		}

		// record frequency of elements in hashmap
		for (int i = 0; i < length; i++) {
			if (hashMap.containsKey(nums[i])) {
				hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
			} else {
				hashMap.put(nums[i], 1);
			}
		}

		for (int i = 0; i < length; i++) {
			// remove current ith element from hashmap or reduce frequency
			if (hashMap.containsKey(nums[i]) && hashMap.get(nums[i]) > 1) {
				hashMap.put(nums[i], hashMap.get(nums[i]) - 1);
			} else {
				hashMap.remove(nums[i]);
			}

			for (int j = i+1; j < length; j++) {
				// remove current jth element from hashmap or reduce frequency
				if (hashMap.containsKey(nums[j]) && hashMap.get(nums[j]) > 1) {
					hashMap.put(nums[j], hashMap.get(nums[j]) - 1);
				} else {
					hashMap.remove(nums[j]);
				}

				int diff = -(nums[i] + nums[j]);

				if (hashMap.containsKey(diff)) {
					List<Integer> resultList = new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], diff));
					Collections.sort(resultList);
					set.add(resultList);
				}

				// add current jth element back to hashmap or increase frequency
				if (hashMap.containsKey(nums[j]) && hashMap.get(nums[j]) > 0) {
					hashMap.put(nums[j], hashMap.get(nums[j]) + 1);
				} else {
					hashMap.put(nums[j], 1);
				}
			}

			// add current ith element back to hashmap or increase frequency
			if (hashMap.containsKey(nums[i]) && hashMap.get(nums[i]) > 0) {
				hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
			} else {
				hashMap.put(nums[i], 1);
			}

		}

		return new ArrayList<List<Integer>>(set);
	}
}
