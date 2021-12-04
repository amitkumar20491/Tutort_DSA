package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/average-of-levels-in-binary-tree
 */
public class Q7_AverageOfLevels {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<>();
		int count = 0;
		Double sum = 0.0;

		if (root == null) {
			return result;
		}

		TreeNode dummy = new TreeNode(-1, null, null);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(dummy);
		count++;
		sum += root.val;
		result.add(sum / count);
		count = 0;
		sum = 0.0;

		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();

			if (tmp == dummy && !queue.isEmpty()) {
				queue.add(dummy);
				result.add(sum / count);
				sum = 0.0;
				count = 0;
			}

			if (tmp.left != null) {
				queue.add(tmp.left);
				count++;
				sum += tmp.left.val;
			}

			if (tmp.right != null) {
				queue.add(tmp.right);
				count++;
				sum += tmp.right.val;
			}
		}

		return result;
	}
}
