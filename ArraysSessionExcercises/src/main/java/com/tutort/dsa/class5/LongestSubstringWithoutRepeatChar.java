package com.tutort.dsa.class5;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatChar {
	public int lengthOfLongestSubstring(String s) {
		char[] chars = s.toCharArray();
		
		if(chars.length <= 1){
            return chars.length;
        }
		
		HashMap<Character, Integer> map = new HashMap<>();
		int size = 0, start = 0, end = 0;

		for (int i = 0; i < chars.length - 1; i++) {
			end = start = i;

			while (start < chars.length && end < chars.length) {
				if (map.containsKey(chars[end])) {
					if ((end - start) > size) {
						size = end - start;
					}
					start = end - 1;
					end = start;
					map = new HashMap<>();
					break;
				} else {
					map.put(chars[end], end);
					end++;
				}
			}
			
			if(end == chars.length) {
				if ((end - start) > size) {
					size = end - start;
				}
			}
		}
		return size;
	}
}
