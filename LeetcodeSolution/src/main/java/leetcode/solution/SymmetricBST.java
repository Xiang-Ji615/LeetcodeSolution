package main.java.leetcode.solution;

import main.java.leetcode.common.util.BSTBuilder;
import main.java.leetcode.common.util.TreeNode;

public class SymmetricBST {

	public static void main(String[] args) {
		BSTBuilder builder = new BSTBuilder();
		int[] nums = {1,2,2,3,4,4,3};
		TreeNode bst = builder.buildTree(nums, 0, nums.length - 1);
		System.out.println(isSymmetric(bst));
	}
	
	static boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;
		else
			return helper(root.getLeft(), root.getRight());
	}
	
	static boolean helper(TreeNode left, TreeNode right) {
		if(left == null && right == null)
			return true;
		else if(left == null || right == null) {
			return false;
		}else {
			return left.getLeft() == right.getRight() && helper(left.getLeft(), right.getRight()) && helper(left.getRight(), right.getLeft());
		}
	}

}
