package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalInterative {

	public static void main(String[] args) {

	}

	public void preOrderTraversalIterative(TreeNode root) {

		Stack<TreeNode> stack = new Stack<>();
		List<Integer> list = new ArrayList<Integer>();
		while (root != null) {
			list.add(root.val);
			if (root.right != null) {
				stack.push(root.right);
			}
			if (root.left == null && !stack.isEmpty()) {
				root = stack.pop();
			} else {
				root = root.left;
			}
		}
	}
}
