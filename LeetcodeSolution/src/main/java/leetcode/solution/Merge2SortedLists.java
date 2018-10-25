package main.java.leetcode.solution;

import main.java.leetcode.common.util.LinkedListBuilder;
import main.java.leetcode.common.util.ListNode;

public class Merge2SortedLists {

	public static void main(String[] args) {
		LinkedListBuilder builder = new LinkedListBuilder();
		int[] nums1 = {1,2,4};
		ListNode l1 = builder.buildLinkedList(nums1);
		int[] nums2 = {1,3,4};
		ListNode l2 = builder.buildLinkedList(nums2);
		ListNode res = mergeTwoLists(l1, l2);
		while(res != null) {
			System.out.println(res.getVal());
			res = res.getNext();
		}
	}
	
	static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		if(l1.getVal() < l2.getVal()) {
			l1.setNext(mergeTwoLists(l1.getNext(), l2));
			return l1;
		}else {
			l2.setNext(mergeTwoLists(l1, l2.getNext()));
			return l2;
		}
	}

}
