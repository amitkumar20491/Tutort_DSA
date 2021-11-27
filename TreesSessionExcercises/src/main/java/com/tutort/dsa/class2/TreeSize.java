package com.tutort.dsa.class2;

public class TreeSize {

	public int treeSize(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftSize = treeSize(root.leftNode);
		int rightSize = treeSize(root.rightNode);

		return 1 + leftSize + rightSize;
	}
}
