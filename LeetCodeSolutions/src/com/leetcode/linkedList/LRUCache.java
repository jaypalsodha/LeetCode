package com.leetcode.linkedList;

import java.util.HashMap;

public class LRUCache {

	private class Node {

		Node prev;
		Node next;
		int key;
		int val;

		public Node(int key, int val) {
			this.key = key;
			this.val = val;
			this.prev = null;
			this.next = null;
		}
	}

	private int capacity;
	HashMap<Integer, Node> hm = new HashMap<>();
	private Node head = new Node(-1, -1);
	private Node tail = new Node(-1, -1);

	public LRUCache(int capacity) {
		this.capacity = capacity;
		tail.prev = head;
		head.next = tail;
	}

	public int get(int key) {
		if (!hm.containsKey(key)) {
			return -1;
		}
		Node current = hm.get(key);
		current.prev.next = current.next;
		current.next.prev = current.prev;
		moveToTail(current);
		return hm.get(key).val;
	}

	public void put(int key, int value) {
		if (get(key) != -1) {
			hm.get(key).val = value;
			return;
		}

		if (hm.size() == capacity) {
			hm.remove(head.next.key);
			head.next = head.next.next;
			head.next.prev = head;
		}

		Node insert = new Node(key, value);
		hm.put(key, insert);
		moveToTail(insert);
	}

	private void moveToTail(Node current) {
		current.prev = tail.prev;
		tail.prev = current;
		current.prev.next = current;
		current.next = tail;
	}

}
