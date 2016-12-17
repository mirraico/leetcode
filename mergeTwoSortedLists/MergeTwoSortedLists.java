package com.mirraico.leetcode;

public class MergeTwoSortedLists {
	
	/**
	 * 本以为这个写法会更快，结果效率更低
	 *
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode head = new ListNode(0);
		ListNode ptr = head;
		while(l1 != null && l2 != null) {
			if(l1.val <= l2.val) {
				ptr.next = l1;
				l1 = l1.next;
				ptr = ptr.next;
			} else {
				ptr.next = l2;
				l2 = l2.next;
				ptr = ptr.next;
			}
		}
		if(l1 == null) ptr.next = l2;
		if(l2 == null) ptr.next = l1;
		return head.next;
	}
	*/

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		if(l1.val <= l2.val) {
			l1.next = this.mergeTwoLists(l1.next, l2);
			return l1;
		}
		else {
			l2.next = this.mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

	public static void main(String[] args) {
	}

}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; next = null; }
}
