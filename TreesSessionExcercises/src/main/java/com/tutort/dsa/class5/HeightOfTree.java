package com.tutort.dsa.class5;

public class HeightOfTree {
	public int height(TreeNode root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}

		int lh = height(root.left);
		int rh = height(root.right);

		return Math.max(lh, rh) + 1;
	}
}
