package com.palletp.conditional;

import java.util.Scanner;

public class FruitShop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Choose Fruit");
		String fruitName = scanner.next();
		System.out.println("Please enter Quantity");

		int quantity = scanner.nextInt();

		FindFruitCost fCost = new FindFruitCost();
		int cost = fCost.getTotalCostOfFruits(fruitName, quantity);
		System.out.println(cost);
	}

}

class FindFruitCost {

	public int getTotalCostOfFruits(String fruitName, int quantity) {
            
		int totalCost=0;
		if (fruitName.equalsIgnoreCase("apple")) {
			if (quantity >= 12) {

				totalCost = quantity * 12;
				return totalCost;
			} else if (quantity <= 10) {
				totalCost = quantity * 15;
				return totalCost;
			}

		} else if (fruitName.equalsIgnoreCase("orange")) {
			if (quantity >= 20) {
				totalCost= quantity * 7;
				return totalCost;
			} else if (quantity > 10) {
				totalCost= quantity * 8;
				return totalCost;
			}else if(quantity <= 10) {
				totalCost = quantity * 8;
				return totalCost;
			}
		}
		return totalCost;

		
	}
}
