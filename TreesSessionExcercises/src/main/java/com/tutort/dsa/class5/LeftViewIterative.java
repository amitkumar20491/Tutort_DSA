package com.tutort.dsa.class5;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewIterative {

	public void leftViewOfTree(TreeNode root) {
		if (root == null) {
			return;
		}

		TreeNode dummy = new TreeNode(-1, null, null);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(dummy);

		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();

			if (tmp == dummy && !queue.isEmpty()) {
				TreeNode result = queue.peek();
				System.out.println(result.val);
				queue.add(dummy);
			} else {
				// insert left first
				if (tmp.left != null) {
					queue.add(tmp.left);
				}

				if (tmp.right != null) {
					queue.add(tmp.right);
				}
			}
		}
	}
}
