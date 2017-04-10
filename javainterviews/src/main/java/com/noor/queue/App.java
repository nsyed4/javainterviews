package com.noor.queue;

public class App {
	public static void main(String args[]) {
		CircularQueue q = new CircularQueue(4);
		q.insert(5);
		q.insert(33);
		q.insert(42);
		q.insert(4);
		q.insert(30);
		int removedItem = q.remove();
		System.out.println(removedItem);
		removedItem = q.remove();
		System.out.println(removedItem);
		q.view();

	}
}
