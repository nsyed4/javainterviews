package com.noor;

import org.junit.Before;
import org.junit.Test;

import com.noor.linkedlist1.SinglyLinkedList;
import com.noor.linkedlist1.Node;

import junit.framework.TestCase;

public class LinkedListTest extends TestCase {
	
	SinglyLinkedList sl; 
	
	@Before
	public void setup() {
		
	}
	
	@Test
	public void testInsert() {
		sl = new SinglyLinkedList();
		//Red, yellow, gree
		//AAA = Assign, Arrange, Assert
		sl.insert(10);
		sl.insert(10);
		sl.insert(10);
		
		Node root = sl.getFirst();
		int answer = 0;
		while(root != null){
			int data = root.data;
			answer = answer+data;
			root = root.next;
		}
		
		System.out.println(answer);
		assertEquals(30, answer);
		
	}

}
