package com.tutort.dsa.class1;

/*
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleElementOfLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode current = head;
		ListNode middle = head;

		while (current != null) {
			current = current.next;
			if (current.next == null) {
				middle = middle.next;
				break;
			} else {

			}
			current = current.next;
			middle = middle.next;
		}
		return middle;
	}
}

