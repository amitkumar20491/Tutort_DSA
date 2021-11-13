package com.tutort.dsa.class2;

/*
 * Given a link list find the weather list is of even length or odd length. 
 */
public class FindOddEvenLength {
	public String findLength(ListNode head) {
		ListNode fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
			}
			if (fast_ptr == null) {
				return "even";
			}
			if (fast_ptr.next == null) {
				return "odd";
			}
		}
		return "";
	}
}
