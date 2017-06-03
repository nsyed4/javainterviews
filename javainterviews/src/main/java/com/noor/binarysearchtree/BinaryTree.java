package com.noor.binarysearchtree;

import java.util.LinkedList;

public class BinaryTree {

	private Node root;

	public void insert(int data) {
		Node nodeToAdd = new Node(data);
		if (root == null) {
			root = nodeToAdd;
		} else {

			traverse(root, nodeToAdd);
		}
	}

	private void traverse(Node node, Node nodeToAdd) {

		if (nodeToAdd.data <= node.data) {
			if (node.left == null) {
				node.left = nodeToAdd;
			} else {
				traverse(node.left, nodeToAdd);
			}
		} else {
			if (node.right == null) {
				node.right = nodeToAdd;
			} else {
				traverse(node.right, nodeToAdd);
			}

		}

	}

	// Breath First Traversal Requires a queue
	public void breadthFirstTraversal(Node node) {

		if (node == null)
			return;

		// add node to the queue
		LinkedList<Node> ll = new LinkedList<Node>();
		ll.add(node);

		while (!ll.isEmpty()) {

			Node n = ll.removeFirst();
			print(n);
			if (n.left != null)
				ll.addLast(n.left);
			if (n.right != null)
				ll.addLast(n.right);

		}

	}

	public void inOrder(Node root) {

		if (root == null) {
			return;
		}
		inOrder(root.left);
		print(root);
		inOrder(root.right);

	}

	public void postOrder(Node root) {

		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		print(root);

	}

	public void preOrder(Node root) {

		if (root == null) {
			return;
		}
		print(root);
		preOrder(root.left);
		preOrder(root.right);

	}

	public Node lookup(Node root, int data) {

		if (root == null)
			return null;

		if (root.data == data) {
			return root;
		}

		if (data <= root.data) {
			return lookup(root.left, data);
		} else {
			return lookup(root.right, data);
		}

	}

	public void print(Node node) {

		System.out.print(node.data + "  ");
		
	}

	public Node getRoot() {
		return root;
	}

}
