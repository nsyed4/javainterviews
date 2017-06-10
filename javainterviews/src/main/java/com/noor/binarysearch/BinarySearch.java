package com.noor.binarysearch;

public class BinarySearch {

	public boolean search(int number, int[] sortedArray) {

		int startIdx = 0;
		int endIdx = sortedArray.length - 1;
		int midIdx = (startIdx + endIdx) / 2;

		while (startIdx <= endIdx) {
			midIdx = (startIdx + endIdx) / 2;
			if (number < sortedArray[midIdx]) {
				endIdx = midIdx - 1;
			} else if (number == sortedArray[midIdx]) {
				return true;
			} else {
				startIdx = midIdx + 1;
			}

		}
		return false;

	}
}
