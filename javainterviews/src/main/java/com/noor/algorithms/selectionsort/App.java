package com.noor.algorithms.selectionsort;

public class App {

	public static void main(String[] args) {
		int array[] = { 9, 8, 3, 13, 24,43,21,1,44,6 };
		int[] sortedArray = selectionSort(array);
		printResults(sortedArray);
	}

	private static void printResults(int[] array) {
		for (int i : array) {
			System.out.print(i + "\t");
		}
	}

	public static int[] selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min=a[j];
					swap(a, j, i);
				}
			}

		}
		return a;

	}

	private static void swap(int a[],int i, int j) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;

	}
}
