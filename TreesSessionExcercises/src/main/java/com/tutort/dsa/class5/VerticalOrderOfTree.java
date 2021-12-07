package com.tutort.dsa.class5;

import java.util.*;

public class VerticalOrderOfTree {
	Map<Integer, List<Integer>> map = new TreeMap<>();

	public void verticalOrderOfATree(TreeNode root) {
		if (root == null) {
			return;
		}

		helper(root, 0);
		map.values().stream().forEach(l -> l.forEach(System.out::println));
	}

	void helper(TreeNode root, int order) {
		if (root == null) {
			return;
		}

		map.computeIfAbsent(order, x -> new ArrayList<Integer>()).add(root.val);

		helper(root.left, order + 1);
		helper(root.right, order + 1);
	}
}
