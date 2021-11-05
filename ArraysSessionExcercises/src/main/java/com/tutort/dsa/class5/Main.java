package com.tutort.dsa.class5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//printArray(new DecompessRLEList().decompressRLElist(new int[] {1,2,3,4}));
		//System.out.println(new StringCompression().compress(new char[] {'a','a','b','b','c','c','c'}));
		//System.out.println(new FirstUniqueCharacter().firstUniqChar("loveleetcode"));
		System.out.println(new LongestSubstringWithoutRepeatChar().lengthOfLongestSubstring("au"));
	}
	
	public static void printArray(int[] nums) {
		System.out.println(Arrays.toString(nums));
	}

}
