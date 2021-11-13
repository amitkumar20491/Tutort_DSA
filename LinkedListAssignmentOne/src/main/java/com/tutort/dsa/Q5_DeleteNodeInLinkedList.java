package com.tutort.dsa;

/*
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class Q5_DeleteNodeInLinkedList {
	public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
