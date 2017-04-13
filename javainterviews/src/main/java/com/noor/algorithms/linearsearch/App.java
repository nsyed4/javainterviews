package com.noor.algorithms.linearsearch;

public class App {

	public static void main(String args[]) {
		int index = linearSearch(new int[] { 1, 3, 2, 7, 5 }, 5);
		System.out.println("Index: " + index);

		int index1 = linearSearchRecursive(new int[] { 1, 3, 2, 7, 5 }, 4, 0);
		System.out.println("Index: " + index1);

	}

	public static int linearSearch(int a[], int x) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static int linearSearchRecursive(int a[], int x, int i) {

		if (i == a.length) {
			return -1;
		} else if (a[i] == x) {
			return i;
		} else {
			return linearSearchRecursive(a, x, ++i);
		}

	}

}
