package com.palletp.stringAsgn;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size OF Array:");

		int arraySize = sc.nextInt();

		int prices[] = new int[arraySize];

		System.out.println("Enter price values:");

		for (int i = 0; i < arraySize; i++) {

			prices[i] = sc.nextInt();
		}

		if (prices.length == 0) {
			System.out.println(0);
			return;
		}

		int buyingPrice = prices[0];

		int profit = 0;

		for (int i = 1; i < prices.length; i++) {

			int tempProfit = 0;

			if (buyingPrice < prices[i]) {
				tempProfit = prices[i] - buyingPrice;
			} else {
				buyingPrice = prices[i];
			}
			if (profit < tempProfit) {
				profit = tempProfit;
			}
		}
		System.out.println(profit);

//		ArrayList<Integer> profitList1 = new ArrayList<Integer>();
//
//		for (int i = 1; i < prices.length; i++) {
//
//			if (buyingPrice >prices[i]) {
//
//				buyingPrice = prices[i];
//
//				for (int j = i + 1; j < prices.length; j++) {
//
//					int profit = prices[j] - buyingPrice;
//					if (profit >= 0) {
//						profitList1.add(profit);
//					}
//				}
//
//			}
//
//		}
//
//		Collections.sort(profitList1);
//
//		if (!profitList1.isEmpty()) {
//
//			System.out.println("profit:" + profitList1.get(profitList1.size() - 1));
//		} else {
//			System.out.println("Profit:" + 0);
//		}

	}

}
