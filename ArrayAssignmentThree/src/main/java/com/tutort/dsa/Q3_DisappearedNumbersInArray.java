package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/ 
 */
public class Q3_DisappearedNumbersInArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> results = new ArrayList<>();
		int[] freq = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (freq[nums[i] - 1] != 0) {
				freq[nums[i] - 1] += freq[nums[i] - 1];
			} else {
				freq[nums[i] - 1] = 1;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (freq[i] == 0) {
				results.add(i + 1);
			}
		}

		return results;
	}
}
