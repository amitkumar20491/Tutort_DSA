package com.tutort.dsa;

/*
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class Q16_ReverseLinkedList {
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
