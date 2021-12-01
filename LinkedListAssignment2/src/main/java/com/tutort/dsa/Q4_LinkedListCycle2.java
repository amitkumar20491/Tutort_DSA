package com.tutort.dsa;

/*
 * https://leetcode.com/problems/linked-list-cycle-ii
 */
public class Q4_LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
		ListNode slow_p = head, fast_p = head;

		while (fast_p != null && fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;

			if (slow_p == fast_p) {
				while (slow_p != head) {
					slow_p = slow_p.next;
					head = head.next;
				}
				return head;
			}
		}

		return null;
	}
}
