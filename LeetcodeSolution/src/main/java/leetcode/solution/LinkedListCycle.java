package main.java.leetcode.solution;

import main.java.leetcode.common.util.ListNode;

public class LinkedListCycle {

	public static void main(String[] args) {

	}
	
	static boolean hasCycle(ListNode head) {
		ListNode fast = head, slow = head;
		while(fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(slow == fast)
				return true;
		}
		return false;
	}

}
