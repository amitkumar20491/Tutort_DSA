package com.tutort.dsa.class3;

import java.util.*;

public class PalindromeLinkedList {
	public boolean isPalindromeLinkedList(ListNode head) {
		ListNode current = head;
		Stack<Integer> stack = new Stack<>();

		while (current != null) {
			stack.push(current.val);
			current = current.next;
		}

		current = head;

		while (current != null) {
			int val = stack.pop();

			if (val != current.val) {
				return false;
			}

			current = current.next;
		}

		return true;
	}
}
