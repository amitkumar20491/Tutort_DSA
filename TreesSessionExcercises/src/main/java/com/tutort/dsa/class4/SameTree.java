package com.tutort.dsa.class4;

/*
 * https://leetcode.com/problems/same-tree/
 */
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean leftResult = false, rightResult = false;

		if (p == null && q == null) {
			return true;
		}

		if (p == null || q == null) {
			return false;
		}

		if (p.val == q.val) {
			leftResult = isSameTree(p.left, q.left);
			if (leftResult) {
				rightResult = isSameTree(p.right, q.right);
			}
			return (leftResult && rightResult);
		} else {
			return false;
		}
	}
}
