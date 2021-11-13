package com.tutort.dsa;

/*
 * https://leetcode.com/problems/remove-linked-list-elements/
 */
public class Q6_RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode current = head, result = null, tmp = null;

		while (current != null) {
			if (current.val != val) {
				if (result == null) {
					result = current;
					tmp = result;
				} else {
					result.next = current;
					result = result.next;
				}
			}

			current = current.next;
		}

		if (result != null) {
			result.next = null;
		}
		return tmp;
	}
}
