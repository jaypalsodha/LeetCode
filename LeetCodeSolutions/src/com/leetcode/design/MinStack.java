package com.leetcode.design;

class MinStack {
	class Node {
		int value;
		int min;
		Node next;

		Node(int x, int min) {
			this.value = x;
			this.min = min;
			next = null;
		}
	}

	Node head;

	public void push(int x) {
		if (null == head) {
			head = new Node(x, x);
		} else {
			Node n = new Node(x, Math.min(x, head.min));
			n.next = head;
			head = n;
		}
	}

	public void pop() {
		if (head != null)
			head = head.next;
	}

	public int top() {
		if (head != null)
			return head.value;
		return -1;
	}

	public int getMin() {
		if (null != head)
			return head.min;
		return -1;
	}

	/*
	 * 155. Min Stack Easy
	 * 
	 * 5415
	 * 
	 * 492
	 * 
	 * Add to List
	 * 
	 * Share Design a stack that supports push, pop, top, and retrieving the minimum
	 * element in constant time.
	 * 
	 * Implement the MinStack class:
	 * 
	 * MinStack() initializes the stack object. void push(val) pushes the element
	 * val onto the stack. void pop() removes the element on the top of the stack.
	 * int top() gets the top element of the stack. int getMin() retrieves the
	 * minimum element in the stack.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input ["MinStack","push","push","push","getMin","pop","top","getMin"]
	 * [[],[-2],[0],[-3],[],[],[],[]]
	 * 
	 * Output [null,null,null,null,-3,null,0,-2]
	 * 
	 * Explanation MinStack minStack = new MinStack(); minStack.push(-2);
	 * minStack.push(0); minStack.push(-3); minStack.getMin(); // return -3
	 * minStack.pop(); minStack.top(); // return 0 minStack.getMin(); // return -2
	 * 
	 * 
	 * Constraints:
	 * 
	 * -231 <= val <= 231 - 1 Methods pop, top and getMin operations will always be
	 * called on non-empty stacks. At most 3 * 104 calls will be made to push, pop,
	 * top, and getMin.
	 */
}