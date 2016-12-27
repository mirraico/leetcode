package com.mirraico.leetcode;

public class RotateList {
	
	public ListNode rotateRight(ListNode head, int k) {
		
		if(head == null) return head;
		ListNode p = head, q;
		int len = 0;
		while(p != null) { p = p.next; len++; }
		k %= len;
		if(k == 0) return head;
		p = head; q = head;
		for(int i = 0; i < k; i++) {
			q = q.next;
		}
		while(q.next != null) {
			p = p.next; q = q.next;
		}
		q.next = head; head = p.next; p.next = null;
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