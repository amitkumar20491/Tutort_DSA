package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/contains-duplicate/
 */
public class Q2_ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		if (nums.length != set.size()) {
			return true;
		} else {
			return false;
		}
	}
}
