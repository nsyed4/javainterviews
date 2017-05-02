package com.noor.interviewcake;

public class StocksProblem {

	public static void main(String args[]) {

		int a[] = { 2, 3, 5, 8, 9, 1, 7, 5, 6, 4 };

		int lowestBuy = a[0];
		int highestSell = a[1];
		int lowestBuyIdx = 0;
		int highestSellIdx = 0;
		for (int i = 0; i < a.length; i++) {

			int current = a[i];
			if (lowestBuy >= current) {
				if(highestSellIdx > i) {
				lowestBuy = current;
				lowestBuyIdx = i;
				}
			}

			if (highestSell < current) {
				if (lowestBuyIdx < i) {
					highestSell = current;
					highestSellIdx = i;
				}

			}
		}
		int profit = highestSell-lowestBuy;
		System.out.println((profit));
	}

}
