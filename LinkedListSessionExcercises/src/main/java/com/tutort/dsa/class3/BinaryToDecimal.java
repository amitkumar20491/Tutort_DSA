package com.tutort.dsa.class3;

/*
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class BinaryToDecimal {
	public int getDecimalValue(ListNode head) {
		head = reverseList(head);
		int decimal = 0;
		int counter = 0;
		ListNode current = head;

		while (current != null) {
			decimal += current.val * Math.pow(2, counter);
			counter++;
			current = current.next;
		}

		return decimal;

	}

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
