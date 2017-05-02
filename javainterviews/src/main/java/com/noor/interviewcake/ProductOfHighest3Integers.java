package com.noor.interviewcake;

public class ProductOfHighest3Integers {

	public static void main(String args[]) {

		int a[] = { 1, 2, 3, 4 };
		productOfHighest3(a);

	}

	public static int[] productOfHighest3(int[] arrayOfInts) {
		// make sure we have at least 2 numbers
		if (arrayOfInts.length < 3) {
			throw new IllegalArgumentException("Getting the highest 3 products require 3 ints");
		}

		int highest = Math.max(arrayOfInts[0], arrayOfInts[1]);
		int lowest = Math.min(arrayOfInts[0], arrayOfInts[1]);

		int highestProductOf2 = arrayOfInts[0] * arrayOfInts[1];
		int lowestProductOf2 = arrayOfInts[0] * arrayOfInts[1];

		 int highestProductOf3 = arrayOfInts[0] * arrayOfInts[1] * arrayOfInts[2];
		// 6x2=12
		// now next number is 3

		int productOfHighest2 = 0;
		int productOfLowest2 = 0;

		return arrayOfInts;

	}

}
