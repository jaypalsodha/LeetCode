package com.leetcode.queue;

public class QueueByArray {

	private int[] array;
	private int size;
	private int front;
	private int rear;

	public QueueByArray(int size) {
		array = new int[size];
		size = 0;
		front = 0;
		rear = 0;
	}

	public int length() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == array.length;
	}

	public void enqueue(int x) {
		if (isFull()) {
			System.out.println("Queue is full we can not add more elements");
		} else {
			array[rear++] = x;
			size++;
		}
	}

	public int dequeue() {

		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			int e = array[front];
			front++;
			size--;
			return e;
		}

	}

	public int first() {
		return 0;
	}

	public void display() {
		for (int i = front; i < rear; i++) {
			System.out.print(array[i] + "---");
		}
		System.out.println();
	}

}
