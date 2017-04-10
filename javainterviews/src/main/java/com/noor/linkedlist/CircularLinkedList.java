package com.noor.linkedlist;

public class CircularLinkedList {

	private Node first;
	private Node last;

	// Inserts the node in the first position in the linked list
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			last = newNode;
		}
		// The Node reference first was pointing to something earlier. We want
		// newNode to point to the same
		// node what first was pointing to. It could be another node or null.
		newNode.setNext(first);
		// Then we want first to point to the same object what newNode was
		// pointing to
		first = newNode;
		// After this assignment first and newNode references point to the same
		// object that was initialized
		// at the beginning of this method.
		

	}

	public boolean isEmpty() {
		return (first == null);
	}

	public Node deleteFirst() {
		
		Node temp = first;
		
		if(first.getNext()==null) {
			last = null;
		}
		
		first = first.getNext();
		return temp;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			first = newNode;
		}else{
			last.setNext(newNode);
			last = newNode;
		}
	
	}

	public void displayList() {
		System.out.println("[first to last]");
		Node current = first;
		while (current != null) {
			System.out.println(current.toString());
			current = current.getNext();
		}
		System.out.println();
	}

	/*
	 * public void addNode(int data) { Node n = new Node(data); if (tail ==
	 * null) { tail = n; head = n; } else { while (tail.getNext() != null) {
	 * tail = tail.getNext(); } tail.setNext(n); } }
	 * 
	 * public Node fetchNode(int data) { Node next = head.getNext(); while (next
	 * != null) { if (next.getData() == data) { return next; } } return null; }
	 * 
	 * public void view() { Node currentNode = head; while (currentNode != null)
	 * { System.out.println(currentNode.getData()); currentNode =
	 * currentNode.getNext(); }
	 * 
	 * }
	 */
}
