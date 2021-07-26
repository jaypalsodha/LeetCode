package com.leetcode.queue;

public class QueueLinked {

	private Node front;
	private Node rear;
	private int size;

	public QueueLinked(int n) {

		front = rear = null;
		size = 0;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void enqueue(int x) {

		Node node = new Node(x, null);
		if (isEmpty()) {
			front = node;
		} else {
			rear.next = node;
		}
		rear = node;
	}

	public int dequeue() {
		return -1;
	}

	class Node {

		private int data;
		private Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

	}

}
