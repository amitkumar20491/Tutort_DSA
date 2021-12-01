package com.tutort.dsa;

import java.util.*;
/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii
 * TODO :  Bad Time Complexity : do it again
 */
public class Q12_RemoveDuplicateFromSortedList2 {
	public ListNode deleteDuplicates(ListNode head) {
		Map<Integer, Integer> map = new HashMap<>();

		ListNode current = head;

		while (current != null) {
			if (map.containsKey(current.val)) {
				map.put(current.val, map.get(current.val) + 1);
			} else {
				map.put(current.val, 1);
			}

			current = current.next;
		}

		current = head;
		ListNode prev = null;
		while (current != null) {
			if (map.get(current.val) > 1) {
				if (current == head) {
					head = current.next;
				} else {
					current = prev;
					current.next = current.next.next;
				}
			}
			prev = current;
			current = current.next;
		}

		return head;
	}
}
