package com.noor.linkedlist;

public class App {

	public static void main(String[] args) {

		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);

		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);

		System.out.println("length of n1 - "+listLength(n1));;
		System.out.println("length of n2 - "+listLength(n2));
		System.out.println("length of n3 - "+listLength(n3));
		System.out.println("length of n4 - "+listLength(n4));

		
		  //SinglyLinkedList ll = new SinglyLinkedList();
		  
		  
		  
		  CircularLinkedList cl = new CircularLinkedList();

		  cl.insertFirst(100);
		  cl.insertFirst(200);
		  cl.insertFirst(300);
		  cl.insertFirst(400);
		  cl.insertLast(500);

		  cl.displayList();
	}

	public static int listLength(Node aNode) {

		int length = 0;
		Node currentNode = aNode;
		
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}

}
