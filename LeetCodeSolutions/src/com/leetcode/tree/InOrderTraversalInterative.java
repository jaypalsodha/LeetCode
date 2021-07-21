package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversalInterative {
	public static void main(String[] args) {

	}

	public List<Integer> inOrderTraversalIterative(TreeNode root) {

		Stack<TreeNode> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		TreeNode current = root;
		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			current = stack.pop();
			list.add(current.val);
			current = current.right;
		}
		return list;
	}

}
