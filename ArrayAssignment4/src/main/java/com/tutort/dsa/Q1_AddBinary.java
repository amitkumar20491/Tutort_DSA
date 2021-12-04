package com.tutort.dsa;

import java.math.BigInteger;
/*
 * https://leetcode.com/problems/add-binary
 * TODO : Do it with bit manipulation
 */
public class Q1_AddBinary {
	public String addBinary(String a, String b) {
		BigInteger one = new BigInteger(a, 2);
		BigInteger two = new BigInteger(b, 2);
		BigInteger sum = one.add(two);
		return sum.toString(2);
	}
}
