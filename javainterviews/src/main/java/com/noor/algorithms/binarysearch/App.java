package com.noor.algorithms.binarysearch;

public class App {

	public static void main(String args[]) {

		// For binary search to work the array should always be sorted
		int[] sortedArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 11, 12 };
		int find = 5;
		int index = binarySearch(sortedArray, find);
		System.out.println("Found " + index);

		int index1 = recursiveBinarySearch(sortedArray, find, 0, sortedArray.length - 1);
		System.out.println("FoundR " + index1);

	}

	public static int binarySearch(int array[], int x) {
		int p = 0;
		int r = array.length - 1;
		// Loop from the first element till the last element in the array
		while (p <= r) {
			// find midpoint and store in q
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
		// System.out.println(p+".."+r);
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
