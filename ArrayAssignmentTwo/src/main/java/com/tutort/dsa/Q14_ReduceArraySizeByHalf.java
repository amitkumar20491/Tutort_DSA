package com.tutort.dsa;

import java.util.*;
/*
 * https://leetcode.com/problems/reduce-array-size-to-the-half/
 */
public class Q14_ReduceArraySizeByHalf {
	public int minSetSize(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		
		List<Integer> list = new ArrayList<>(map.values());
		Collections.sort(list);
		
		int sum = 0;
		int index = 0;
		for(int i = list.size() - 1; i >= 0 ; i--) {
			sum += list.get(i);
			index++;
			if(sum >= arr.length/2) {
				break;
			}
		}
		return index;
	}
}
