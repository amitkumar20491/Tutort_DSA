package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/find-common-characters/
 */
public class Q1_FindCommonCharacters {
	public List<String> commonChars(String[] words) {
		List<String> result = new ArrayList<>();
		int[][] freq = new int[words.length][26];

		for(int i = 0; i < freq.length ; i++) {
			char[] charArray = words[i].toCharArray();
			for(int j = 0 ; j < charArray.length ; j++) {
				if(freq[i][charArray[j] - 'a'] != 0) {
					freq[i][charArray[j] - 'a']++;
				}else {
					freq[i][charArray[j] - 'a'] = 1;
				}
			}
		}
			
		for(int i = 0; i < freq[0].length  ; i++) {
			int min = Integer.MAX_VALUE;
			for(int j = 0 ; j < freq.length ; j++) {
				if(freq[j][i] == 0) {
					min = Integer.MAX_VALUE;
					break;
				}else if(freq[j][i] < min) {
					min = freq[j][i];
				}
			}
			
			if(min != Integer.MAX_VALUE) {
				for(int k = 0 ; k < min ; k++) {
					result.add(Character.toString((char) (i + 'a')));
				}
			}
		}
		
		return result;
	}
}
