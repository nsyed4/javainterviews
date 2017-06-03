package com.noor.amazon;

import java.util.HashSet;
import java.util.Set;

import com.noor.binarysearchtree.Node;

/*
 * A perfect binary tree is where each node has 2 children.
 *  A superbalances binary tree is where the max difference between two leafs is 1 or less
 * In a perfect binary tree if n is the number of nodes then the height can be determined or vice
 * versa.
 */
public class SuperBalancedTree {

	private Set<Integer> depths = new HashSet<>();
	int currentDepthOfLeftChild = 0;
	int currentDepthOfRightChild = 0;

	public static void main(String args) {

	}

	public void inOrder(Node root) {

		if (root == null) {
			// Leaf node found?

		}

		if(root.left!=null) {
			currentDepthOfLeftChild++;
		}
		
		if(root.right!=null) {
			currentDepthOfRightChild++;
		}
		
		if (root.left == null || root.right == null) {
			Integer currentDepth = null;
			// Leaf node found
			depths.add(currentDepth);
		}

		
		inOrder(root.left);
		print(root.data);
		inOrder(root.right);
	}

	private void print(int data) {
		
		System.out.print(data + " ");

	}

}
