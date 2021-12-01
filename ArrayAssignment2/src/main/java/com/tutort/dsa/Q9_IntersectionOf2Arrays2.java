package com.tutort.dsa;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/next-greater-element-ii/
 */
public class Q9_IntersectionOf2Arrays2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int[] result = (nums1.length > nums2.length) ? nums2 : nums1;

		int i = 0;
		int j = 0;
		int index = 0;

		while (i < nums1.length && j < nums2.length) {

			if (nums1[i] < nums2[j]) {
				i++;
				continue;
			}

			if ((nums1[i] > nums2[j])) {
				j++;
				continue;
			}

			if (nums1[i] == nums2[j]) {
				result[index++] = nums1[i];
				i++;
				j++;
			}
		}

		return Arrays.copyOf(result, index);
	}
}
