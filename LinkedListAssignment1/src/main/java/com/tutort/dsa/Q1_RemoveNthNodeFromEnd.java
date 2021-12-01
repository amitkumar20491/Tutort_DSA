package com.tutort.dsa;

/*
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class Q1_RemoveNthNodeFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode current = head;
		ListNode target = null;
		int targetPos = 1;

		while (true) {
			if (current.next == null) {
				break;
			} else {
				if (target != null) {
					target = target.next;
				}

				if (targetPos == n) {
					target = head;
				}
				current = current.next;
				targetPos++;
			}
		}

		if (target == null) {
			head = head.next;
		} else if (target.next == current) {
			target.next = null;
		} else {
			target.next = target.next.next;
		}

		return head;
	}
}
