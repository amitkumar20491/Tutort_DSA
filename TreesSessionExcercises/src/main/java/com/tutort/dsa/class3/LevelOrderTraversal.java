package com.tutort.dsa.class3;

import java.util.*;

public class LevelOrderTraversal {
	public void levelOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode tmp = null;
			tmp = queue.poll();
			
			System.out.println(tmp.data);
			
			if(tmp.leftNode != null) {
				queue.add(tmp.leftNode);
			}
			
			if(tmp.rightNode != null) {
				queue.add(tmp.rightNode);
			}
		}
	}
}
