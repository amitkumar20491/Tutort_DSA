package com.tutort.dsa.class3;

/*
 * https://leetcode.com/problems/find-the-winner-of-the-circular-game/
 */
public class JosephusCircle {
	public int findTheWinner(int n, int k) {
		ListNode head = new ListNode(1);
		ListNode p = head;

		for (int i = 2; i <= n; i++) {
			p.next = new ListNode(i);
			p = p.next;
		}

		p.next = head;
		ListNode tail = p;
		p = p.next;
		
		while(n > 1) {
			int j = k%n == 0  ? n : k%n;
			
			while(j > 1) {
				p = p.next;
				tail = tail.next;
				j--;
			}
			
			p = p.next;
			tail.next = tail;
			n--;
		}
				
		return p.val;
	}
}
