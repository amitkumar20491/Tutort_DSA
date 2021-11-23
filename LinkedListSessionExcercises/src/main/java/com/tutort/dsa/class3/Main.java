package com.tutort.dsa.class3;

public class Main {
	public static void main(String[] args) {
		/*
		ListNode listops_head = new ListNode(1);
		addElementsInNode(listops_head, 2);
		ListNode three = addElementsInNode(listops_head, 3);
		addElementsInNode(listops_head, 4);
		ListNode five = addElementsInNode(listops_head, 5);
		five.next = three;

		LinkedListCycleOps lco = new LinkedListCycleOps();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("Cyclic Linked List Operations");
		System.out.println("+++++++++++++++++++++++");
		System.out.println(lco.findCycle(listops_head));
		System.out.println("+++++++++++++++++++++++");
		System.out.println(lco.startingPointOfCycle(listops_head).val);
		System.out.println("+++++++++++++++++++++++");
		System.out.println(lco.lengthOfCycle(listops_head));
		System.out.println("+++++++++++++++++++++++");
		lco.removeCycle(listops_head);
		printElementOfLinkedList(listops_head);
		
		System.out.println("+++++++++++++++++++++++");
		System.out.println("Palindrome Linked List");
		ListNode pal_head = new ListNode(1);
		addElementsInNode(pal_head, 0);
		addElementsInNode(pal_head, 0);
		addElementsInNode(pal_head, 1);
		PalindromeLinkedList pll = new PalindromeLinkedList();
		System.out.println(pll.isPalindromeLinkedList(pal_head));
		*/
		
		System.out.println(new JosephusCircle().findTheWinner(6, 1));
	}

	public static ListNode addElementsInNode(ListNode head, int val) {
		ListNode current = head;
		while (true) {
			if (current.next == null) {
				current.next = new ListNode(val);
				break;
			}
			current = current.next;
		}

		return current.next;
	}

	public static void printElementOfLinkedList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
}
