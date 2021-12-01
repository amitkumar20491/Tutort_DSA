package com.tutort.dsa;

/*
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class Q6_SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
		ListNode current = head;

		if (head == null || head.next == null) {
			return head;
		}

		ListNode result = head.next;
		ListNode prev = null;
		while (current != null && current.next != null) {
			ListNode next = current.next;
			current.next = next.next;
			next.next = current;
			if (prev != null) {
				prev.next = next;
			}
			prev = current;
			current = current.next;

		}

		return result;
	}
}
