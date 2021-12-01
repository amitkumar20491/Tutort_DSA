package com.tutort.dsa;

import java.util.HashMap;
import java.util.Map;


/*
 * https://leetcode.com/problems/copy-list-with-random-pointer
 */
public class Q15_CopyLinkListWithRandomPointers {
	public Node copyRandomList(Node head) {
		Map<Node, Node> map = new HashMap<>();
		Node current = head, cloned_head = null, tail = null;

		while (current != null) {
			if (cloned_head == null) {
				cloned_head = new Node(current.val);
				tail = cloned_head;
			} else {
				tail.next = new Node(current.val);
				tail = tail.next;
			}
			map.put(current, tail);
			current = current.next;
		}

		current = head;
		tail = cloned_head;

		while (current != null) {
			tail.random = map.get(current.random);
			current = current.next;
			tail = tail.next;
		}

		return cloned_head;
	}
}
