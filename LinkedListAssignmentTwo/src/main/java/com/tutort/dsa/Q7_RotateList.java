package com.tutort.dsa;

/*
 * https://leetcode.com/problems/rotate-list
 */
public class Q7_RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		ListNode new_tail = null, new_head = null, tail = null, current = head;

		if (head == null || head.next == null || k == 0) {
			return head;
		}

		int length = 0;
		while (current != null) {
			length++;
			current = current.next;
		}

		if (length < k) {
			k = k % length;
		}

		current = head;
		int count = 0;
		while (current != null) {
			if (new_tail != null) {
				new_tail = new_tail.next;
			}

			if (count == k) {
				new_tail = head;
			}

			if (current.next == null && new_tail != null) {
				tail = current;
			}

			if (current.next == null && new_tail == null) {
				current = head;
			} else {
				current = current.next;
			}
			count++;
		}

		if (new_tail.next != null) {
			new_head = new_tail.next;
		} else {
			return head;
		}

		tail.next = head;
		new_tail.next = null;
		return new_head;
	}
}
