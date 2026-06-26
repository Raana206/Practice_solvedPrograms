package com.basic.java.programs.leetCode.arrays;

import java.util.Arrays;

public class MaximumIceCreamBars {

	public static void main(String[] args) {
		System.out.println(maxIceCream(new int[] { 1, 6, 3, 1, 2, 5 }, 20));

	}

	public static int maxIceCream(int[] costs, int coins) {

		Arrays.sort(costs);

		int iceCreamBars = 0;

		for (int cost : costs) {

			if (coins < cost) {
				break;
			}

			coins -= cost;

			iceCreamBars++;

		}
		return iceCreamBars;

	}

}
