package com.tutort.dsa.class5;

/*
 * https://leetcode.com/problems/string-compression/
 */
public class StringCompression {
	public int compress(char[] chars) {
		int k = 0;
		for (int i = 0; i < chars.length; i++) {
			int j = i + 1;
			while (j < chars.length && chars[i] == chars[j]) {
				j++;
			}
			
			int size = (j +1) - (i+1);
			chars[k] = chars[i];
			k++;

			if (size > 1 && size < 10) {
				chars[k] = Integer.toString(size).charAt(0);
				k++;
			}else if(size > 9) {
				char[] charArray = Integer.toString(size).toCharArray();
				for(int l = 0 ; l < charArray.length ; l++) {
					chars[k] = charArray[l];
					k++;
				}
			}
			
			i = j - 1;
		}

		return k;
	}
}
