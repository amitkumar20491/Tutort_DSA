package com.tutort.dsa;

import java.util.*;

// https://leetcode.com/problems/minimum-absolute-difference/
public class MinimumAbsoluteDiffrence {

	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		int minAbsoluteDiff = arr[1] - arr[0];
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < arr.length - 1; i++) {
			int diff = arr[i + 1] - arr[i];

			if (minAbsoluteDiff > diff) {
				minAbsoluteDiff = diff;
				result.clear();
			}

			if (minAbsoluteDiff == diff) {
				result.add(new ArrayList<Integer>(Arrays.asList(arr[i], arr[i + 1])));
			}
		}

		return result;
	}

}
