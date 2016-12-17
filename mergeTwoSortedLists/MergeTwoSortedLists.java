package com.mirraico.leetcode;

public class MergeTwoSortedLists {
	
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
