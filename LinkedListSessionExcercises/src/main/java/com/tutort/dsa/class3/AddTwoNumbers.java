package com.tutort.dsa.class3;

/*
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
		return dummy.next;
	}
}
