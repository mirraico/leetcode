package com.mirraico.leetcode;

public class ReverseLinkedListII {
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if(head.next == null || n == m) return head;
		ListNode fakeHead = new ListNode(0);
		fakeHead.next = head;
		ListNode l = fakeHead, p, q, r;
		for(int i = 1; i < m; i++) {
			l = l.next;
		}
		p = l.next; q = p.next; r = q.next;
		int t = n - m;
		for(int i = 0; i < t; i++) {
			q.next = p;
			p = q; q = r; 
			if(r != null) r = r.next;
			else break;
		}
		l.next.next = q;
		l.next = p;
		
		return fakeHead.next;
	}
	
	public static void main(String[] args) {
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; next = null; }
}