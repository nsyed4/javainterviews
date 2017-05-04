package com.noor.algorithms.recursion;

public class ReduceByOne {

	public static void main(String args[]) {
		reduceByOne(4);
	}

	public static void reduceByOne(int n) {
		if (n >= 0) {
			reduceByOne(n - 1);
		}

		printStackTrace();
		System.out.println(n);

	}
	
	
	public static void printStackTrace() {
		
		StackTraceElement[] elements = Thread.currentThread().getStackTrace();
		  for (int i = 1; i < elements.length; i++) {
		    StackTraceElement s = elements[i];
		    System.out.println("\tat " + s.getClassName() + "." + s.getMethodName()
		        + "(" + s.getFileName() + ":" + s.getLineNumber() + ")");
		  }
		
	}
}
