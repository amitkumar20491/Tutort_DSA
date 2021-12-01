package com.tutort.dsa;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		addElementsInNode(head, 2);
		addElementsInNode(head, 3);
		addElementsInNode(head, 4);
		addElementsInNode(head, 5);
		printElementOfLinkedList(head);
		//printElementOfLinkedList(new Q1_RemoveNthNodeFromEnd().removeNthFromEnd(head, 1));
	}

	public static void addElementsInNode(ListNode head, int val) {
		ListNode current = head;
		while (true) {
			if (current.next == null) {
				current.next = new ListNode(val);
				break;
			}
			current = current.next;
		}
	}

	public static void printElementOfLinkedList(ListNode head) {
		ListNode current = head;
		while (true) {
			System.out.println(current.val);
			if(current.next == null) {
				break;
			}
			current = current.next;
			
		}
	}
}
