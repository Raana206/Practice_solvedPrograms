package com.basic.java.programs.leetCode.arrays;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumCostOfBuyingCandiesWithDiscount {

	public static void main(String[] args) {

		System.out.println(minimumCost(new int[] { 3, 3, 3, 1 }));

	}

	public static int minimumCost(int[] cost) {

		if (cost.length == 2) {
			return cost[0] + cost[0];
		}

//		Arrays.parallelPrefix(cost,(IntBinaryOperator) Comparator.reverseOrder());;

		Stack<Integer> stack = IntStream.of(cost).boxed().collect(Collectors.toCollection(Stack::new));

		int sum = 0;
		int size = stack.size();
		while (size > 1) {

			int e1 = stack.pop();
			int e2 = stack.pop();
			int e3 = stack.pop();

			if (e1 >= e3 && e2 >= e3) {
				sum += e1 + e2;
			}
			size = stack.size();
		}

		return sum;

	}

}
