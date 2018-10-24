package main.java.leetcode.solution;

import java.util.Arrays;

import main.java.leetcode.common.util.BSTBuilder;
import main.java.leetcode.common.util.TreeNode;

public class MaxiumDepthOfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,9,20,15,7};
		Arrays.sort(nums);
		BSTBuilder builder = new BSTBuilder();
		TreeNode root = builder.buildTree(nums, 0, nums.length - 1);
		System.out.println(maxDepth(root));
	}
	
	static int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return 1+Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
	}

}
