package com.noor.binarysearch;

public class App {
	public static void main(String args[]) {
		
		int number = 47;
		BinarySearch bs = new BinarySearch();
		boolean found = bs.search(number, new int[] {1,4,5,6,21,22,23,24,45,47,48});
		System.out.println(found);
		
		BinarySearchRecursive bsr = new BinarySearchRecursive();
		int[] sortedArray = new int[] {1,4,5,6,21,22,23,24,45,47,48};
		boolean found1 = bsr.search(number, sortedArray,0,sortedArray.length-1);
		System.out.println(found1);
	}
}
