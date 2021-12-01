package com.tutort.dsa;

import java.util.*;
/*
 * https://leetcode.com/problems/binary-tree-inorder-traversal
 */
public class Q2_InOrderTraversal {
	List<Integer> result = new ArrayList<>();

	public List<Integer> inorderTraversal(TreeNode root) {
		inOrderTraversal(root);
		return result;
	}

	public void inOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}

		inOrderTraversal(root.left);
		result.add(root.val);
		inOrderTraversal(root.right);
	}
}
