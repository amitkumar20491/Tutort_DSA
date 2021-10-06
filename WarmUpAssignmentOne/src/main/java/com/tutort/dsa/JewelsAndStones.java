package com.tutort.dsa;

// https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {
	public int numJewelsInStones(String jewels, String stones) {
		char[] stonesArr = stones.toCharArray();
		int sum = 0;
		for (int i = 0; i < stonesArr.length; i++) {
			if (jewels.indexOf(stonesArr[i]) > -1) {
				sum++;
			}
		}

		return sum;
	}
}
