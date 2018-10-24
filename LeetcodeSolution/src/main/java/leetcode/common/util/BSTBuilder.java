package main.java.leetcode.common.util;

public class BSTBuilder {

	public TreeNode buildTree(int[] nums, int left, int right) {
		int mid = left + (right-left)/2;
		if(left>right) {
			return null;
		}
		TreeNode root = new TreeNode(nums[mid]);
		root.setLeft(buildTree(nums, left, mid-1));
		root.setRight(buildTree(nums, mid+1, right));
		return root;
	}
}


