package com.tutort.dsa.class2;

public class TreeLevel {
	static int max = -1;

	public void treeLevel(TreeNode root, int level) {

		if (root == null) {
			return;
		}

		if (max < level) {
			max = level;
		}

		treeLevel(root.leftNode, level + 1);
		treeLevel(root.rightNode, level + 1);
	}
}
