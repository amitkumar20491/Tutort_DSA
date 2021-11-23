package com.tutort.dsa.class3;

/*
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		ListNode slow_p = head, fast_p = head;

		while (slow_p != null && fast_p != null && fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if (slow_p == fast_p) {
				return true;
			}
		}

		return false;
	}
}
