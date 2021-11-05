package com.tutort.dsa;

/*
 * https://leetcode.com/problems/remove-element/
 */
public class Q7_RemoveElements {
	public int removeElement(int[] nums, int val) {
		int temp = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[temp++] = nums[i];
			}
		}
		return temp;
	}
}
