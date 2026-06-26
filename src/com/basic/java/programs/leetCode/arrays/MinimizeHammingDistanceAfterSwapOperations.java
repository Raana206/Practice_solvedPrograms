package com.basic.java.programs.leetCode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimizeHammingDistanceAfterSwapOperations {

	public static void main(String[] args) {

		System.out.println(minimumHammingDistance(new int[] { 5, 1, 2, 4, 3 }, new int[] { 1, 5, 4, 2, 3 },
				new int[][] { { 0, 4 }, { 4, 2 }, { 1, 3 }, { 1, 4 } }));

	}

	public static int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {

		List<Integer> list = new ArrayList<Integer>();
		if (allowedSwaps.length != 0) {

			for (int[] arr : allowedSwaps) {
				for (int n : arr) {
					if (!list.contains(n))
						list.add(n);
				}
			}
		}

		if (list.size() == source.length) {
			Arrays.sort(source);
			Arrays.sort(target);
		}
//		for (int i = 0; i < list.size() - 1; i++) {
//
//			int temp = source[list.get(i)];
//			source[list.get(i)] = source[list.get(i + 1)];
//			source[list.get(i + 1)] = temp;
//		}
		int count = 0;
		for (int i = 0; i < source.length; i++) {

			if (source[i] != target[i]) {
				count++;
			}

		}
		return count;
	}

}
