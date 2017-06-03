package com.noor;

import org.junit.Before;
import org.junit.Test;

import com.noor.binarysearchtree.BinaryTree;
import com.noor.binarysearchtree.Node;

public class BinaryTreeTest {

	BinaryTree bt = new BinaryTree();

	@Before
	public void testBinaryTreeInsertions() {

		bt.insert(50);
		bt.insert(10);
		bt.insert(30);
		bt.insert(70);
		bt.insert(60);
		bt.insert(120);
		bt.insert(5);
		
	}

	@Test
	public void testLookup() {
		Node root = bt.getRoot();
		Node found = bt.lookup(root, 10);
		if (found != null) {
			System.out.println(" ");
			System.out.println("Found:"+found.data);
		}

	}

	@Test
	public void testBreadthFirstTraversal() {
		System.out.println("Breadth First Traversal");
		Node root = bt.getRoot();
		bt.breadthFirstTraversal(root);
	}
	
	@Test
	public void testDepthFirstTraversal() {
		System.out.println("Depth First Traversal");
		Node root = bt.getRoot();
		System.out.print("PreOrder: ");
		bt.preOrder(root);
		System.out.println("\n");
		System.out.print("PostOrder: ");
		bt.postOrder(root);
		System.out.println("\n");
		System.out.print("InOrder: ");
		bt.inOrder(root);
		System.out.println("\n");
		
	}
	
	
	
}
