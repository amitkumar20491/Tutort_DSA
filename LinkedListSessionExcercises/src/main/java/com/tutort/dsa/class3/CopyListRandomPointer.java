package com.tutort.dsa.class3;

import java.util.*;

/*
 * https://leetcode.com/problems/copy-list-with-random-pointer
 */
public class CopyListRandomPointer {
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

		/*
		 * In Place Modification : Leetcode is not allowing modification of input linked
		 * list
		 */

		/*
		 * Node current = head;
		 * 
		 * while(current != null){ Node next = current.next; Node newNode = new
		 * Node(current.val); current.next = newNode; newNode.next = next; current =
		 * next; }
		 * 
		 * current = head; while(current != null && current.next != null){
		 * current.next.random = current.random != null ? current.random.next : null;
		 * current = current.next.next; }
		 * 
		 * Node org_head = head; Node org_tail = head; Node cloned_head = head.next;
		 * Node cloned_tail = head.next;
		 * 
		 * while(org_tail != null && cloned_tail != null){ org_tail = org_tail.next !=
		 * null ? org_tail.next.next : null; cloned_tail = cloned_tail.next != null ?
		 * cloned_tail.next.next : null;
		 * 
		 * org_tail = org_tail.next; cloned_tail = cloned_tail.next; }
		 * 
		 * return cloned_head;
		 */
	}
}
