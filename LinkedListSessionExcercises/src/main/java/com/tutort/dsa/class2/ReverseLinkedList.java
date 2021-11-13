package com.tutort.dsa.class2;

/*
 * https://leetcode.com/problems/reverse-linked-list/ 
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode current = head, rev = null, next = null;

		while (current != null) {
			next = current.next;
			current.next = rev;
			rev = current;
			current = next;
		}

		return rev;
	}
}
