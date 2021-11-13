package com.tutort.dsa.class2;

/*
 * https://leetcode.com/problems/odd-even-linked-list/
 */
public class OddEvenLinkedList {
	/*
	 * Optimum : In Place
	 */
	public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        
        ListNode oddTail = head;
        ListNode evenTail = (head != null) ? head.next : null;
        ListNode even = evenTail;
        
        while(oddTail.next != null && evenTail.next != null){
            oddTail.next = oddTail.next.next;
            evenTail.next = evenTail.next.next;
            oddTail = oddTail.next;
            evenTail = evenTail.next;
        }
        
        if(evenTail != null){
            evenTail.next =null;
        }
        oddTail.next = even;
        
        return head;
    }

	
	/*
	 *  Brute force: 2 lists evenHead , outHead and merge both
	 */
	/*
	public ListNode oddEvenList(ListNode head) {
		ListNode oddHead = new ListNode(0);
		ListNode evenHead = new ListNode(0);
		ListNode odd = oddHead, even = evenHead;
		ListNode current = head;
		int pos = 1;
		while (true) {
			if (current == null) {
				break;
			}

			if (pos % 2 == 0) {
				evenHead.next = new ListNode(current.val);
				evenHead = evenHead.next;
			} else {
				oddHead.next = new ListNode(current.val);
				oddHead = oddHead.next;
			}

			current = current.next;
			pos++;
		}

		current = odd;
		while (true) {
			if (current.next == null) {
				current.next = even.next;
				break;
			}

			current = current.next;
		}

		return odd.next;
	}*/
}
