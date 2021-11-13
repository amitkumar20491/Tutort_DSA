package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/assign-cookies/
 */
public class Q5_AssignCookies {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int result = 0;
		int i = 0;
		int j = 0;
		while (i < g.length && j < s.length) {
			if (s[j] >= g[i]) {
				i++;
				j++;
				result++;
				continue;
			}

			if (s[j] < g[i]) {
				j++;
			}
		}

		return result;
	}
}
