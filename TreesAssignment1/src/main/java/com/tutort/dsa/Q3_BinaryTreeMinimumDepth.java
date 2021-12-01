package com.tutort.dsa;

/*
 * https://leetcode.com/problems/minimum-depth-of-binary-tree
 * TODO : Bad Time Complexity
 */
public class Q3_BinaryTreeMinimumDepth {
	int min = Integer.MAX_VALUE;

	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		findDepth(root, 1);
		return min;
	}

	void findDepth(TreeNode root, int level) {
		if (root == null) {
			return;
		}

		if (min > level && root.left == null && root.right == null) {
			min = level;
		}

		findDepth(root.left, level + 1);
		findDepth(root.right, level + 1);
	}
}
