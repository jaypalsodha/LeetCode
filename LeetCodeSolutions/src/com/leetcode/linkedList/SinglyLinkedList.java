package com.leetcode.linkedList;

public class SinglyLinkedList {

	MyNode head;
	MyNode tail;
	private int size = 0;

	public SinglyLinkedList() {
		this.head = this.tail = null;
	}

	public void addAtHead(int x) {
		MyNode node = new MyNode(x, head);
		if (size == 0) {
			this.head = this.tail = node;
		} else {
			this.head = node;
		}
		++size;
	}

	public void addAtTail(int x) {
		MyNode node = new MyNode(x);
		if (size == 0) {
			this.head = this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		++size;
	}

	public int get(int index) {
		if (index < 0 || index >= size) {
			return -1;
		} else {
			MyNode p = getNode(index);
			return p.val;
		}
	}

	private MyNode getNode(int index) {
		MyNode p = head;
		for (int i = 0; i < index; ++i) {
			p = p.next;
		}
		return p;
	}

	public void addAtIndex(int index, int x) {
		if (index < 0 || index > size) {
			return;
		}
		if (index == 0) {
			addAtHead(x);
		} else if (index == size) {
			addAtTail(x);
		} else {
			MyNode p = getNode(index - 1);
			MyNode node = new MyNode(x, p.next);
			p.next = node;
			++size;
		}
	}

	public void deleteAtIndex(int index) {
		if (index < 0 | index >= size) {
			return;
		}
		if (size == 1) {
			this.head = this.tail = null;
		} else {
			MyNode p = getNode(index - 1);
			p.next = p.next.next;
			if (index == size - 1) {
				tail = p;
			}
		}
		--size;
	}

	public static void main(String[] args) {

	}
}

class MyNode {
	int val;
	MyNode next;

	public MyNode(int val) {
		this.val = val;
	}

	public MyNode(int val, MyNode next) {
		this.val = val;
		this.next = next;

	}
}
