package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/binary-tree-level-order-traversal
 */
public class Q4_LevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}

		TreeNode dummy = new TreeNode(-1, null, null);

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(dummy);
		List<Integer> level = new ArrayList<>();
		level.add(root.val);
		result.add(level);
		level = new ArrayList<>();

		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();

			if (tmp == dummy && !queue.isEmpty()) {
				queue.add(dummy);
				result.add(level);
				level = new ArrayList<>();
			} else {
				if (tmp.left != null) {
					level.add(tmp.left.val);
					queue.add(tmp.left);
				}

				if (tmp.right != null) {
					level.add(tmp.right.val);
					queue.add(tmp.right);
				}
			}
		}

		return result;
	}
}
