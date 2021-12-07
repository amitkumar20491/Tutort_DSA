package com.tutort.dsa.class5;

import java.util.*;

public class VerticalSumOfTree {
	Map<Integer, Integer> map = new TreeMap<>();

	public void verticalSum(TreeNode root) {

		if (root == null) {
			return;
		}

		map.put(0, root.val);
		helper(root, 0);

		map.forEach((k, v) -> System.out.println("order : " + k + " ---- " + "sum : " + v));
	}

	void helper(TreeNode root, int order) {
		if (root == null) {
			return;
		}

		if (map.containsKey(order)) {
			map.put(order, map.get(order) + root.val);
		} else {
			map.put(order, root.val);
		}

		helper(root.left, order - 1);
		helper(root.right, order + 1);
	}
}
