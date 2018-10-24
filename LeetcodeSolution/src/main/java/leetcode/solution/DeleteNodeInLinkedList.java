package main.java.leetcode.solution;

import main.java.leetcode.common.util.LinkedListBuilder;
import main.java.leetcode.common.util.ListNode;

public class DeleteNodeInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListBuilder builder = new LinkedListBuilder();
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		ListNode node = builder.buildLinkedList(nums);
		deleteNode(node);
		while (node != null) {
			System.out.println(node.getVal());
			node = node.getNext();
		}
	}

	static void deleteNode(ListNode node) {
		node.setVal(node.getNext().getVal());
		node.setNext(node.getNext().getNext());
	}

}
