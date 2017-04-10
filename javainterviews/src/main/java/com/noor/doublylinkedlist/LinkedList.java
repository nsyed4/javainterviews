package com.noor.doublylinkedlist;

public class LinkedList {

	private Node first;
	private Node last;

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			last = newNode;
		} else {
			first.setPrevious(newNode);
		}

		newNode.setNext(first);
		first = newNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			first = newNode;
		} else {
			last.setNext(newNode);
			newNode.setPrevious(last);

		}
		last = newNode;

	}

}
