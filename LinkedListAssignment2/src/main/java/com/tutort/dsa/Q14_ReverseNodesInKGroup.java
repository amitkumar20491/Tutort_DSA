package com.tutort.dsa;

/*
 * https://leetcode.com/problems/reverse-nodes-in-k-group
 * TODO
 */
public class Q14_ReverseNodesInKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode dummy = new ListNode(0, head);
		ListNode groupPrev = dummy, groupNext = null;

		while (true) {
			ListNode kth = getKth(groupPrev, k);
			if (kth == null) {
				break;
			}

			groupNext = kth.next;

			// reverse
			ListNode prev = kth.next, curr = groupPrev.next;
			while (curr != groupNext) {
				ListNode tmp = curr.next;
				curr.next = prev;
				prev = curr;
				curr = tmp;
			}

			ListNode prevTmp = groupPrev.next;
			groupPrev.next = kth;
			groupPrev = prevTmp;
		}

		return dummy.next;

	}

	ListNode getKth(ListNode curr, int k) {
		while (curr != null && k > 0) {
			curr = curr.next;
			k--;
		}

		return curr;
	}
}
