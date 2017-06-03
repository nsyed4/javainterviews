package com.noor.linkedlist1;

public class SinglyLinkedList {

	private Node current;
	private Node root;
	
	

	public Node insert(int data) {
		
		if (current == null) {
			current = new Node(data);
			root = current;
			return current;
		} else {
			Node n = new Node(data);
			current.next = n;
			current = n;
		}
		
		return current;
	}
	
	public Node getFirst() {
		return root;
	}
	
	public Node getLast() {
		return current;
	}

}
