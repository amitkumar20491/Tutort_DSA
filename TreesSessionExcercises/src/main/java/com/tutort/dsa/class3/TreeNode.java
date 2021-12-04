package com.tutort.dsa.class3;

public class TreeNode {
	int data;
	TreeNode leftNode;
	TreeNode rightNode;

	public TreeNode(int data) {
		this.data = data;
		leftNode = null;
		rightNode = null;
	}

	public TreeNode(int data, TreeNode left, TreeNode right) {
		this.data = data;
		this.leftNode = left;
		this.rightNode = right;
	}
}
