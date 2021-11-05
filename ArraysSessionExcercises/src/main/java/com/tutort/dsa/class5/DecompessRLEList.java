package com.tutort.dsa.class5;

/*
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 */
public class DecompessRLEList {
	public int[] decompressRLElist(int[] nums) {
		int length = 0;
		for (int i = 0; i < nums.length; i += 2) {
			length += nums[i];
		}

		int[] result = new int[length];

		int k = 0, j = 0;
		for (int i = 0; i < nums.length; i += 2) {
			j = nums[i];

			while (j > 0) {
				result[k] = nums[i + 1];
				k++;
				j--;
			}
		}

		return result;
	}
}
