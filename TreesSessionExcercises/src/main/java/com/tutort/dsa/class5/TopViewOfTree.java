package com.tutort.dsa.class5;

import java.util.*;

public class TopViewOfTree {
	Map<Integer, Node> map = new TreeMap<>();

	public void topViewOfTree(TreeNode root) {
		if (root == null) {
			return;
		}

		map.put(0, new Node(root.val, 0));
		helper(root, 0, 0);

		map.forEach((k, v) -> System.out.println(v.value));
	}

	void helper(TreeNode root, int level, int order) {
		if (root == null) {
			return;
		}

		if (map.containsKey(order)) {
			Node node = map.get(order);
			if (node.level > level) {
				map.put(order, new Node(root.val, level));
			}
		} else {
			map.put(order, new Node(root.val, level));
		}

		helper(root.left, level + 1, order - 1);
		helper(root.right, level + 1, order + 1);
	}
}

class Node {
	int value;
	int level;

	Node(int value, int level) {
		this.level = level;
		this.value = value;
	}
}