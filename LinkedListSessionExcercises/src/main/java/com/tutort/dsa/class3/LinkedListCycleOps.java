package com.tutort.dsa.class3;

import java.util.*;

public class LinkedListCycleOps {
	public boolean findCycle(ListNode head) {
		ListNode slow_p = head, fast_p = head;

		while (slow_p != null && fast_p != null && fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if (slow_p == fast_p) {
				return true;
			}
		}

		return false;
	}

	public int lengthOfCycle(ListNode head) {
		Map<ListNode, Integer> map = new HashMap<>();
		ListNode current = head;
		if (head.next == head) {
			return 1;
		}

		int index = 2;
		while (current.next != null) {
			if (map.containsKey(current.next)) {
				return index - (map.get(current.next) - 1);
			}
			map.put(current, index);
			index++;
			current = current.next;
		}
		return 0;
	}

	public ListNode startingPointOfCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();
		ListNode current = head;

		while (current != null) {
			if (set.contains(current)) {
				return current;
			}

			set.add(current);
			current = current.next;
		}

		return null;
	}

	public void removeCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();
		ListNode current = head;

		while (current != null) {
			if (set.contains(current.next)) {
				current.next = null;
				break;
			}

			set.add(current);
			current = current.next;
		}
	}
}
