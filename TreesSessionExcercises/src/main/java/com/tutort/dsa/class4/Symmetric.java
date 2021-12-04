package com.tutort.dsa.class4;

/*
 * https://leetcode.com/problems/symmetric-tree
 */
public class Symmetric {
	public boolean isSymmetric(TreeNode root) {
		return helper(root.left, root.right);
	}

	boolean helper(TreeNode left, TreeNode right) {
		boolean ls = false, rs = false;
		if (left == null && right == null) {
			return true;
		}

		if (left == null || right == null) {
			return false;
		}

		if (left.val == right.val) {
			ls = helper(left.left, right.right);
			if (ls) {
				rs = helper(left.right, right.left);
			}
			return (ls && rs);
		} else {
			return false;
		}
	}
}
