package com.tutort.dsa;

import java.util.*;
import java.util.stream.Collectors;

/*
 * https://leetcode.com/problems/contains-duplicate/
 */
public class Q2_ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
		if (nums.length != set.size()) {
			return true;
		} else {
			return false;
		}
	}
}
