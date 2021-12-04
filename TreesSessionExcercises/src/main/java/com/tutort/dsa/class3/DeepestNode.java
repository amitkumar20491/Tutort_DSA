package com.tutort.dsa.class3;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {
	public TreeNode deepestNode(TreeNode root) {
		TreeNode result = null;
		if (root == null) {
			return root;
		}

		TreeNode dummy = new TreeNode(-1, null, null);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		result = root;
		queue.add(dummy);

		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();

			if (tmp != dummy) {
				result = tmp;
			}

			if (tmp == dummy && !queue.isEmpty()) {
				queue.add(dummy);
			} else {
				if (tmp.leftNode != null) {
					queue.add(tmp.leftNode);
				}

				if (tmp.rightNode != null) {
					queue.add(tmp.rightNode);
				}
			}
		}

		return result;
	}
}
