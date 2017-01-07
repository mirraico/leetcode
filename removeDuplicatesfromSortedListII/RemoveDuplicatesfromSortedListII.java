package com.mirraico.leetcode;

public class RemoveDuplicatesfromSortedListII {

	/**
	 * 不补头部的做法，不好理解
	 *
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		boolean headFlag = true;
		ListNode p = head, q = head;
		while(true) {
			while(q != null && q.next != null) {
				if(q.val != q.next.val) break; //连续的去完为止
				while(q.next != null && q.val == q.next.val) q = q.next;
				q = q.next;
			}
			if(headFlag) head = q;
			else p.next = q;
			if(q == null || q.next == null) break;
			p = q; q = q.next;
			headFlag = false;
		}
		return head;
	}
	*/
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode fakeHead = new ListNode(0);
		fakeHead.next = head;
		ListNode p = fakeHead, q = head;
		while(true) {
			while(q != null && q.next != null) {
				if(q.val != q.next.val) break; //连续的去完为止
				while(q.next != null && q.val == q.next.val) q = q.next;
				q = q.next;
			}
			p.next = q;
			if(q == null) break;
			p = p.next; q = q.next;
		}
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
