package com.tutort.dsa;

/*
 * https://leetcode.com/problems/merge-two-sorted-lists
 */
public class Q2_MergeTwoSortedLists {
	ListNode root = new ListNode(0);
	ListNode result = root;

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		} else if (l1 == null && l2 != null) {
			return l2;
		} else if (l1 != null && l2 == null) {
			return l1;
		} else {
			if (l1.val <= l2.val) {
				insert(l1.val);
				l1 = l1.next;
			} else {
				insert(l2.val);
				l2 = l2.next;
			}
		}

		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				insert(l1.val);
				l1 = l1.next;
			} else {
				insert(l2.val);
				l2 = l2.next;
			}
		}

		if (l1 != null) {
			root.next = l1;
		}

		if (l2 != null) {
			root.next = l2;
		}

		return result.next;
	}

	void insert(int data) {
		root.next = new ListNode(data);
		root = root.next;
	}
}
