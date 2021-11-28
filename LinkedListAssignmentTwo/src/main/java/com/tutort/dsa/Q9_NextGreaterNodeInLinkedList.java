package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/next-greater-node-in-linked-list
 * TODO :  Bad Time Complexity : do it again
 */
public class Q9_NextGreaterNodeInLinkedList {
	public int[] nextLargerNodes(ListNode head) {
		List<Integer> result = new ArrayList<>();
		while (head != null) {
			ListNode current = head.next;
			int greater = 0;
			int currentVal = head.val;

			if (greater > currentVal) {
				result.add(greater);
			} else {
				while (current != null) {
					if (current.val > currentVal) {
						greater = current.val;
						break;
					}
					current = current.next;
				}

				if (current == null) {
					greater = 0;
				}

				result.add(greater);
			}

			head = head.next;
		}

		return result.stream().mapToInt(i -> i).toArray();
	}
}
