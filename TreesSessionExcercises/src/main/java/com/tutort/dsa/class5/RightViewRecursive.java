package com.tutort.dsa.class5;

public class RightViewRecursive {
	int max_level = -1;

	public void rightViewOfTree(TreeNode root) {
		if (root == null) {
			return;
		}

		helper(root, 0);
	}

	void helper(TreeNode root, int level) {
		if (root == null) {
			return;
		}

		if (max_level < level) {
			System.out.println(root.val);
			max_level = level;
		}

		// call right first
		helper(root.right, level++);
		helper(root.left, level++);
	}
}
