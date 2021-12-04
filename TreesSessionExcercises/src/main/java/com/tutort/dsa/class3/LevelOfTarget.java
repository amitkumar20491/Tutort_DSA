package com.tutort.dsa.class3;

public class LevelOfTarget {
	public int levelOfTarget(TreeNode root, TreeNode target) {
		if (root == null) {
			return -1;
		}

		return helper(root, target, 0);
	}

	int helper(TreeNode root, TreeNode target, int level) {
		if (root == null) {
			return -1;
		}

		if (target == root) {
			return level;
		}

		int ls = helper(root.leftNode, target, level + 1);

		if (ls != -1) {
			return ls;
		}

		int rs = helper(root.rightNode, target, level + 1);

		if (rs != -1) {
			return rs;
		}

		return -1;
	}
}
