package com.tutort.dsa.class5;

/*
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacter {
	public int firstUniqChar(String s) {
		char[] charArray = s.toCharArray();
		int[] freq = new int[26];

		for (int i = 0; i < freq.length; i++) {
			freq[i] = -1;
		}
		/*
		 * -1 : not evaluated ,-2 : duplicates , 0->n : first index
		 */
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < charArray.length; i++) {
			if (freq[charArray[i] - 'a'] == -1) {
				freq[charArray[i] - 'a'] = i;
			} else if (freq[charArray[i] - 'a'] == -2) {
			} else {
				freq[charArray[i] - 'a'] = -2;
			}
		}
				
		for (int i = 0; i < freq.length; i++) {
			if(freq[i] != -1 && freq[i] != -2 && freq[i] <= result) {
				result = freq[i];
			}
		}
		return result == Integer.MAX_VALUE ? -1 : result;
	}
}
