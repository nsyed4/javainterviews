package com.noor.binarysearchtree;

public class BinaryTree {

	private Node root;
	
	
	
	public void addNode(int data) {
		
		Node node = new Node(data);
		if(root == null) {
			root = node;
		}else{
			Node focusNode = root;
			Node n = new Node(data);
			
			if(data<=focusNode.getValue()) {
				 root.setLeftChild(n);
			}else{
				root.setRightChild(n);
			}
			focusNode = n;
		}
	}
	
	
	
	
	
	public void removeNode(int data) {
		
	}
	
	public void findValue(int data) {
		
	}
	
	
	
}
