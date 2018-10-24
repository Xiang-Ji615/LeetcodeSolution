package main.java.leetcode.common.util;

public class LinkedListBuilder {

	public ListNode buildLinkedList(int[] nums) {
		return helper(nums, 0);
	}
	
	ListNode helper(int[] nums, int cur) {
		if(cur > nums.length-1) {
			return null;
		}
		ListNode node = new ListNode(nums[cur]);
		node.next = helper(nums, cur+1);
		return node;
	}
}
