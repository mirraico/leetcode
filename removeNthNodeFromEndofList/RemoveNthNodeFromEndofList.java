package com.mirraico.leetcode;

import java.util.*;

public class Solution {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode ptr = head;
		ListNode qtr = head;
		for(int i = 0; i < n; i++) ptr = ptr.next;
		if(ptr == null) return head.next;
		while(ptr.next != null) {
			ptr = ptr.next;
			qtr = qtr.next;
		}
		qtr.next = qtr.next.next;
		return head;
	}
	
	public static void main(String[] args) {
	}

}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; next = null;}
}
