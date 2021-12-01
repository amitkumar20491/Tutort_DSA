package com.tutort.dsa;

/*
 * https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
 */
public class Q3_RemoveZeroSumConsecutive {
	public ListNode removeZeroSumSublists(ListNode head) {
		ListNode prevHead = new ListNode();
		prevHead.next = head;
		ListNode pre = prevHead;
		while (head != null) {
			ListNode node = findZeroSumLastNode(head);
			if (node != head) {
				pre.next = node;
				head = node;
			} else {
				pre = head;
				head = head.next;
			}
		}
		return prevHead.next;
	}

	public ListNode findZeroSumLastNode(ListNode node) {
		int sum = 0;
		ListNode current = node;

		while (current != null) {
			sum += current.val;
			if (sum == 0) {
				return current.next;
			}
			current = current.next;
		}

		return node;
	}
}
