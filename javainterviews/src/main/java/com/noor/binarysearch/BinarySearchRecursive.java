package com.noor.binarysearch;

public class BinarySearchRecursive {

	
	public boolean search(int number, int[] sortedArray, int startIdx, int endIdx) {
		
		if(startIdx>endIdx) {
			return false;
		}
		
		int midIdx = (startIdx+endIdx)/2;
		
		if(number == sortedArray[midIdx]) {
			return true;
		}else if(number > sortedArray[midIdx]){
			return search(number,sortedArray,midIdx+1,endIdx);
		}else{
			return search(number,sortedArray,startIdx,midIdx-1);
		}
		
	}
}
