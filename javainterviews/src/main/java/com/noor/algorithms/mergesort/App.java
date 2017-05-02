package com.noor.algorithms.mergesort;

import java.util.Arrays;

public class App {

	public static void main(String args[]) {
		int[] A = new int[] { 8,5,2,35,2,5,1,66,78,34,4  };
		sort(A, 0, A.length - 1);

	}

	public static void sort(int A[], int start, int end) {
		if (end <= start) {
			return;
		}
		int mid = (start + end) / 2;
		//System.out.println("Sorting left half "+start+"..."+mid);
		sort(A, start, mid);
		//System.out.println("Sorting right half "+(mid+1)+"..."+end);
		sort(A, mid + 1, end);
		//System.out.println("Merge "+start+"..."+end);
		merge(A, start, mid, end);

	}

	public static void merge(int A[], int start, int mid, int end) {
		if (A.length == 1) {
			System.out.println(Arrays.toString(A));
		} else {

			int[] B = new int[A.length];
			int j = 0;
			int leftSlot = start;
			int rightSlot = mid + 1;

			while (leftSlot <= mid && rightSlot <= end) {
				//System.out.println(leftSlot + "-" + rightSlot);
				if (A[leftSlot] <= A[rightSlot]) {
					//System.out.println(A[leftSlot] + "<=" + A[rightSlot]);
					B[j] = A[leftSlot];
					leftSlot++;
				} else {
					//System.out.println(A[leftSlot] + ">" + A[rightSlot]);
					B[j] = A[rightSlot];
					rightSlot++;

				}
				j++;
			}

			while (leftSlot <= mid) {
				B[j] = A[leftSlot];
				j++;
				leftSlot++;
			}

			while (rightSlot <= end) {
				B[j] = A[rightSlot];
				j++;
				rightSlot++;
			}

			System.out.println(Arrays.toString(B));
		}
	}
}
