package com.tutort.dsa;

/*
 * https://leetcode.com/problems/odd-even-linked-list/
 */
public class Q10_OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode oddTail = head;
		ListNode evenTail = (head != null) ? head.next : null;
		ListNode even = evenTail;

		while (oddTail.next != null && evenTail.next != null) {
			oddTail.next = oddTail.next.next;
			evenTail.next = evenTail.next.next;
			oddTail = oddTail.next;
			evenTail = evenTail.next;
		}

		if (evenTail != null) {
			evenTail.next = null;
		}
		oddTail.next = even;

		return head;
	}
}
