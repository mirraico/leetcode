package com.mirraico.leetcode;

public class RemoveDuplicatesfromSortedList.java {
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode p = head, q = head.next;
		while(true) {
			while(q != null && q.val == p.val) q = q.next;
			p.next = q;
			if(q == null) break;
			p = p.next; q = q.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; next = null; }
}
