package com.mirraico.leetcode;

public class PartitionList {
	
	public ListNode partition(ListNode head, int x) {
		if(head == null || head.next == null) return head;
		ListNode p1, h1, p2, h2, p;
		p1 = h1 = new ListNode(0); p2 = h2 = new ListNode(0); p = head;
		while(p != null) {
			if(p.val < x) {
				p1.next = p; p1 = p;
			} else {
				p2.next = p; p2 = p;
			}
			p = p.next;
		}
		p1.next = h2.next; p2.next = null;
		return h1.next;
	}
	
	public static void main(String[] args) {
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; next = null; }
}
