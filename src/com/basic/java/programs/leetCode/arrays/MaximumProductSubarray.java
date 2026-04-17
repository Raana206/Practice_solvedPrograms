package com.basic.java.programs.leetCode.arrays;

public class MaximumProductSubarray {

	public static void main(String[] args) {

		MaximumProductSubarray maximum= new MaximumProductSubarray();
		System.out.println(maximum.maxProduct(new int[] {2,3,-2,4}));
	}

	public int maxProduct(int[] nums) {
		if (nums.length == 0)
			return 0;

		// Initialize with the first element
		int maxSoFar = nums[0];
		int minSoFar = nums[0];
		int result = maxSoFar;

		for (int i = 1; i < nums.length; i++) {
			int curr = nums[i];

			/*
			 * When we encounter a negative number, the maximum and minimum values swap
			 * roles when multiplied.
			 */
			if (curr < 0) {
				int temp = maxSoFar;
				maxSoFar = minSoFar;
				minSoFar = temp;
			}

			/*
			 * Decide: start a new subarray at current element, or continue the existing
			 * one?
			 */
			maxSoFar = Math.max(curr, maxSoFar * curr);
			minSoFar = Math.min(curr, minSoFar * curr);

			// Update the global maximum
			result = Math.max(maxSoFar, result);
		}

		return result;
	}

}
