package com.noor.interviewcake;

import java.util.Arrays;

public class ProductOfIntsExceptOne {
	
	public static void main(String args[]) {
		int array[] = {1,2,3,4,5};
		int[] products = getProductsOfAllIntsExceptAtIndex(array);
		System.out.println(Arrays.toString(products));
		
	}

	  public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

		    // make sure we have at least 2 numbers
		    if (intArray.length < 2) {
		        throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers");
		    }

		    // we make an array with the length of the input array to
		    // hold our products
		    int[] productsOfAllIntsExceptAtIndex = new int[intArray.length];

		    // for each integer, we find the product of all the integers
		    // before it, storing the total product so far each time
		    int productSoFar = 1;
		    for (int i = 0; i < intArray.length; i++) {
		        productsOfAllIntsExceptAtIndex[i] = productSoFar;
		        productSoFar = productSoFar * intArray[i];
		    }

		    // for each integer, we find the product of all the integers
		    // after it. since each index in products already has the
		    // product of all the integers before it, now we're storing
		    // the total product of all other integers
		    productSoFar = 1;
		    for (int i = intArray.length - 1; i >= 0; i--) {
		        productsOfAllIntsExceptAtIndex[i] =  productsOfAllIntsExceptAtIndex[i] * productSoFar;
		        productSoFar = productSoFar * intArray[i];
		    }

		    return productsOfAllIntsExceptAtIndex;
		}
	

}
