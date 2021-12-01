package com.tutort.dsa;

/*
 * https://leetcode.com/problems/next-greater-element-ii
 */
public class Q11_NextGreaterElement2 {
	public int[] nextGreaterElements(int[] nums) {
		Node head = new Node(nums[0]);
		Node curr = head;

		for (int i = 1; i < nums.length; i++) {
			Node newNode = new Node(nums[i]);
			curr.next = newNode;
			curr = newNode;
		}

		curr.next = head;

		curr = head;
		Node temp = curr.next;

		for (int i = 0; i < nums.length; i++) {
			while (temp != curr) {
				if (temp.data > curr.data) {
					nums[i] = temp.data;
					break;
				}
				temp = temp.next;
			}

			if (temp == curr) {
				nums[i] = -1;
			}

			curr = curr.next;
			temp = curr.next;
		}
		return nums;
	}
}

class Node {
	int data;
	Node next;

	Node(int val) {
		this.data = val;
	}
}