package com.noor.algorithms.quicksort;

import java.util.Arrays;

public class App {
	public static void main(String args[]) {
		int[] array = { 2, 4, 5, 6, 1, 9, 8 };
		int p = 0;
		int r = array.length - 1;
		quickSort(array, p, r);
		System.out.println(Arrays.toString(array));
	}

	public static void quickSort(int A[], int p, int r) {
		if (p < r) {

			int pivot = partition(A, p, r); // Gives the index position of the
											// correctly placed pivot value
			quickSort(A, p, pivot - 1);
			quickSort(A, pivot + 1, r);
		}
	}

	public static int partition(int A[], int start, int end) {

		int pivot = A[end];
		int i = start - 1;

		for (int j = start; j <= end - 1; j++) {
			if (A[j] <= A[end]) {
				i++;
				int iVal = A[i];
				int jVal = A[j];
				A[i] = jVal;
				A[j] = iVal;
			} else {
				j++;
			}
		}

		// put the pivot value in the correct slot and return that slot
		int iVal = A[i + 1];
		A[end] = iVal;
		A[i + 1] = pivot;

		return i + 1;

	}

}
