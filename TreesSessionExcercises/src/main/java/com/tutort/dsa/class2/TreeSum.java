package com.tutort.dsa.class2;

public class TreeSum {

	public int treeSum(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftSum = treeSum(root.leftNode);
		int rightSum = treeSum(root.rightNode);
		root.data = root.data + leftSum + rightSum;
		return root.data;
	}
}
