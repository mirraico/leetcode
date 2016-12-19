package com.mirraico.leetcode;

public class SwapNodesinPairs {
	/**
	 * 递归做法，空间占用更大O(n)，时间也更长
	public ListNode swapPairs(ListNode head) {
		if((head == null)||(head.next == null)) return head;
		ListNode qtr = head.next;
		head.next = swapPairs(qtr.next);
		qtr.next = head;
		return qtr;
	}
	*/
	
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode ansHead = head.next;
		ListNode ptr = head, qtr = head.next;
		while(true) {
			ptr.next = qtr.next;
			qtr.next = ptr;
			ptr = ptr.next;
			if(ptr == null || ptr.next == null) break;
			qtr.next.next = ptr.next;
			qtr = qtr.next.next;
		}
		return ansHead;
	}

	public static void main(String[] args) {
	}

}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; next = null; }
}
