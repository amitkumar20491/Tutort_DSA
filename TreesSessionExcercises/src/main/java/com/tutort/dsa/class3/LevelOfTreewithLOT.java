package com.tutort.dsa.class3;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOfTreewithLOT {
	int level = 0;

	public int levelOfTreewithLOT(TreeNode root) {
		if (root == null) {
			return 0;
		}

		TreeNode dummy = new TreeNode(-1, null, null);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(dummy);

		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();

			if (tmp == dummy && !queue.isEmpty()) {
				queue.add(dummy);
				level++;
			} else {
				if (tmp.leftNode != null) {
					queue.add(tmp.leftNode);
				}

				if (tmp.rightNode != null) {
					queue.add(tmp.rightNode);
				}
			}
		}

		return level;
	}
}
