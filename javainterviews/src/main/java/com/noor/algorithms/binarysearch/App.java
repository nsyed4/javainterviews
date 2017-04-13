package com.noor.algorithms.binarysearch;

public class App {

	public static void main(String args[]) {
		// Assume that the array is sorted
		int[] sortedArray = new int[] { 1, 2, 3, 4, 5 };
		int find=5;
		int index = binarySearch(sortedArray, find);
		//System.out.println(index);
		
		int index1 = recursiveBinarySearch(sortedArray, find,0,sortedArray.length-1);
		System.out.println(index1);
		
	}

	public static int binarySearch(int array[], int x) {
		int p = 0;
		int r = array.length - 1;

		while (p <= r) {
			int q = (p + r) / 2;
			if (array[q] == x) {
				return q;
			} else if (array[q] > x) {
				r = q - 1;
			} else {
				p = q + 1;
			}

		}

		return -1;
	}

	public static int recursiveBinarySearch(int array[], int x, int p, int r) {
		System.out.println(p+".."+r);
		if (p > r) {
			return -1;
		} else {
			int q = (p + r) / 2;
			if (array[q] == x) {
				return q;
			} else if (x < array[q]) {
				r = q - 1;
				
				return recursiveBinarySearch(array, x, p, r);
			} else {
				p = q + 1;
				
				return recursiveBinarySearch(array, x, p, r);
			}

		}

	}
}
