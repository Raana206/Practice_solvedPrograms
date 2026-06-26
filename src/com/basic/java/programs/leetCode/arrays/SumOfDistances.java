package com.basic.java.programs.leetCode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfDistances {

	public static void main(String[] args) {

		SumOfDistances distances = new SumOfDistances();
		distances.distance(new int[] { 0, 5, 3 });
		distances.way2Distance(new int[] { 0, 5, 3 });
	}

	public long[] distance(int[] nums) {

		long[] arr = new long[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = 0; j < nums.length; j++) {

				if (i != j && nums[i] == nums[j]) {

					sum += Math.abs(i - j);
				}

			}
			arr[i] = sum;
		}

		return arr;
	}

	public long[] way2Distance(int[] nums) {

		int n = nums.length;
		long[] res = new long[n];

		Map<Integer, List<Integer>> map = new HashMap<>();

		// group indices
		for (int i = 0; i < n; i++) {
			map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
		}

		// process each group
		for (List<Integer> list : map.values()) {

			int size = list.size();
			long[] prefix = new long[size];

			// prefix sum
			prefix[0] = list.get(0);
			for (int i = 1; i < size; i++) {
				prefix[i] = prefix[i - 1] + list.get(i);
			}

			for (int i = 0; i < size; i++) {

				int index = list.get(i);

				long left = (long) i * index - (i > 0 ? prefix[i - 1] : 0);
				long right = (prefix[size - 1] - prefix[i]) - (long) (size - i - 1) * index;

				res[index] = left + right;
			}
		}

		return res;
	}

}
