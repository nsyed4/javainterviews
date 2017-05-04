package com.noor.binarysearchtree;

public class BinaryTree {

	private Node root;
	
	public void addNode(int data) {
		Node n = new Node(data);
		if(root==null) {
			System.out.print("\t\t\t\t"+n.getValue());
		}
		System.out.println("");
		root = insertNode(root,n);
	}
	
	public Node insertNode(Node head, Node node) {
		
		if(head==null) {
			
			return node;
		}
		
		if(node.getValue()<=head.getValue()) {
			Node n = insertNode(head.getLeftChild(),node);
			head.setLeftChild(n);
			System.out.print("\t\t\t"+head.getLeftChild().getValue());
		}else{
			Node n = insertNode(head.getRightChild(),node);
			head.setRightChild(n);
			System.out.print("\t\t\t\t\t\t"+head.getRightChild().getValue());
		}
		
		return head;
		
		
	}
	
	
	
	
	
	public void removeNode(int data) {
		
	}
	
	public void findValue(int data) {
		
	}
	
	
	
}
