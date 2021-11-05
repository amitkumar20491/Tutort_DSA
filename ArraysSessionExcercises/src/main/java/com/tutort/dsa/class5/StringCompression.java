package com.tutort.dsa.class5;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/string-compression/
 */
public class StringCompression {
	public int compress(char[] chars) {
		int result = 0;
		int j = 0, k = 0;
		for (int i = 0; i < chars.length; i++) {
			while (j < chars.length && chars[i] == chars[j]) {
				j++;
			}

			int size = (j - i);
			result += size;
			chars[k] = chars[i];
			k++;

			if (size > 1) {
				chars[k] = Integer.toString(size).charAt(0);
				k++;
				i = j;
			}
		}
		System.out.println(Arrays.toString(chars));
		return result;
	}
}
