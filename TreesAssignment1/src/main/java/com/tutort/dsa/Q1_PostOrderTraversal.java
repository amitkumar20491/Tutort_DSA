package com.tutort.dsa;

import java.util.*;
/*
 * https://leetcode.com/problems/binary-tree-postorder-traversal
 */
public class Q1_PostOrderTraversal {
	List<Integer> result = new ArrayList<>();

	public List<Integer> postorderTraversal(TreeNode root) {
		postOrderTraversal(root);
		return result;
	}

	public void postOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}

		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		result.add(root.val);
	}
}
