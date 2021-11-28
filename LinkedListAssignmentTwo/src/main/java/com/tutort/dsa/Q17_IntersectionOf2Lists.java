package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * TODO :  Bad Time Complexity : do it again
 */
public class Q17_IntersectionOf2Lists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = headA;
        
        while(current != null){
            set.add(current);
            current = current.next;
        }
        
        current = headB;
        while(current != null){
            if(set.contains(current)){
                return current;
            }
            current = current.next;
        }
        
        return null;
    }
}
