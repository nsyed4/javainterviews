package com.noor.stack;

public class Stack {

	private char myArray[];
	private int top;
	private int maxSize;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.myArray = new char[maxSize];
		this.top = -1;
	}

	public void push(char c) {
		if (isFull()) {
			throw new RuntimeException("Stack is full");
		} else {
			top++;
			myArray[top] = c;
		}
	}

	public char pop() {
		if (isEmpty()) {
			throw new RuntimeException("stack is empty");
		} else {
			int oldTop = top;
			top--;
			return myArray[oldTop];

		}

	}

	public char peek() {
		return myArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}
}
