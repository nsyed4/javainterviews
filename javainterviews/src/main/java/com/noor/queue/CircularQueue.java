package com.noor.queue;

public class CircularQueue {

	private int myArray[];
	private int maxSize;
	private int front;
	private int rear;
	private int numOfItems;

	public CircularQueue(int maxSize) {
		this.myArray = new int[maxSize];
		this.maxSize = maxSize;
		this.front = 0;
		this.rear = -1;
		this.numOfItems = 0;
	}

	public void insert(int s) {
		if(rear==(maxSize-1)) {
			rear=-1;
		}
		rear++;
		myArray[rear] = s;
		numOfItems++;

	}
	
	public int remove() {
		
		int item = myArray[front];
		front++;
		
		
		if(front==maxSize) {
			front=0;
		}
		numOfItems--;
		return item;
		
	}

	public void view() {
		System.out.print("[ ");
		
		for (int i=0;i<myArray.length;i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println(" ]");
	}

	public boolean isFull() {
		return (numOfItems == maxSize);
	}

	public boolean isEmpty() {
		return (numOfItems == 0);
	}

	
}
