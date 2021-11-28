package com.tutort.dsa;

/*
 * https://leetcode.com/problems/add-two-numbers-ii/
 */
public class Q13_AddTwoNumbers2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		l1 = reverseList(l1);
		l2 = reverseList(l2);

		int carry = 0;
		ListNode dummy = new ListNode(0);
		ListNode p = dummy;
		int sum = 0;

		while (l1 != null || l2 != null || carry != 0) {
			sum = carry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			p.next = new ListNode(sum % 10);
			carry = sum / 10;
			p = p.next;
		}
		return reverseList(dummy.next);
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
