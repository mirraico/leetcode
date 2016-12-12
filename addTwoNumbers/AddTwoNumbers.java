package com.mirraico.leetcode;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ptr1 = l1, ptr2 = l2;
		ListNode head = new ListNode(-1), ansPtr = head;
		int carry = 0;
		while(ptr1 != null && ptr2 != null) {
			int val = ptr1.val + ptr2.val + carry;
			carry = val / 10;
			val %= 10;
			ansPtr.next = new ListNode(val);
			ansPtr = ansPtr.next;
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		while(ptr1 != null) {
			int val = ptr1.val + carry;
			carry = val / 10;
			val %= 10;
			ansPtr.next = new ListNode(val);
			ansPtr = ansPtr.next;
			ptr1 = ptr1.next;
		}
		while(ptr2 != null) {
			int val = ptr2.val + carry;
			carry = val / 10;
			val %= 10;
			ansPtr.next = new ListNode(val);
			ansPtr = ansPtr.next;
			ptr2 = ptr2.next;
		}
		if(carry == 1) ansPtr.next = new ListNode(1); 
	    return head.next;
	}
	
	public static void main(String[] args) {
	}

}


class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; next = null; }
}