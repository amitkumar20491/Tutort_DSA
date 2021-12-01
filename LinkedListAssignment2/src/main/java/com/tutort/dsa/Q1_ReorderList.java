package com.tutort.dsa;

/*
 * https://leetcode.com/problems/reorder-list
 * TODO :  Bad Time Complexity : do it again
 */
public class Q1_ReorderList {
	public void reorderList(ListNode head) {
		ListNode middle = findMiddle(head);
		ListNode reverse = reverse(middle.next);
		middle.next = reverse;
		ListNode current = head;

		while (reverse != null && current != null) {
			ListNode next = current.next;
			ListNode revNext = reverse.next;
			if (reverse == next) {
				break;
			}
			current.next = reverse;
			reverse.next = next;
			reverse = revNext;
			current = next;

			if (next == middle) {
				middle.next = null;
			}
		}
	}

	public ListNode findMiddle(ListNode head) {
		ListNode fast_ptr = head, slow_ptr = head;

		while (fast_ptr != null && fast_ptr.next != null && fast_ptr.next.next != null) {
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}

		return slow_ptr;
	}

	public ListNode reverse(ListNode head) {
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
