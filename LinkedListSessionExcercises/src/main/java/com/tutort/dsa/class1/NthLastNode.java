package com.tutort.dsa.class1;

/*
 * https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
 */
public class NthLastNode {
	int getNthFromLast(ListNode head, int n) {
		int length = 0;
		ListNode temp = head;
		ListNode result = null;

		while (temp != null) {
			length++;
			temp = temp.next;
			if (result != null) {
				result = result.next;
			}
			if (length == n) {
				result = head;
			}
		}

		return result != null ? result.val : -1;
	}
}
