package com.tutort.dsa.class4;

public class Isomorphic {
	public boolean isomorphic(TreeNode p, TreeNode q) {
		boolean leftResult = false, rightResult = false;

		if (p == null && q == null) {
			return true;
		}

		if (p == null || q == null) {
			return false;
		}

		if (p.val == q.val) {
			leftResult = isomorphic(p.left, q.right);
			if (leftResult) {
				rightResult = isomorphic(p.right, q.left);
			}
			return (leftResult && rightResult);
		} else {
			return false;
		}
	}
}
