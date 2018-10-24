package main.java.leetcode.solution;

import main.java.leetcode.common.util.LinkedListBuilder;
import main.java.leetcode.common.util.ListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListBuilder builder = new LinkedListBuilder();
		int[] nums = {1,2,3,4,5};
		ListNode node = builder.buildLinkedList(nums);
		node = reverseList(node);
		while(node != null) {
			System.out.println(node.getVal());
			node = node.getNext();
		}
	}
	
	static ListNode reverseList(ListNode head) {
		ListNode res = null;
		while(head != null) {
			ListNode temp = head.getNext();
			head.setNext(res);
			res = head;
			head = temp;
		}
		return res;
	}

}
