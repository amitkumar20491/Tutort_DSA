package com.tutort.dsa;

/*
 * https://leetcode.com/problems/contains-duplicate-ii/  
 */
public class Q3_ContainsDuplicate2 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		int length = nums.length;

		for (int i = 0; i < length - 1; i++) {
			int j = i + 1;
			int l = Math.abs(k + i) + 1;
			while (j < length && j < l) {
				if (nums[i] == nums[j]) {
					return true;
				}
				j++;
			}
		}

		return false;
	}
}
