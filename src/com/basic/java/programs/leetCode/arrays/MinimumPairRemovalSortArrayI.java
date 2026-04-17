package com.basic.java.programs.leetCode.arrays;

public class MinimumPairRemovalSortArrayI {

//	 Repeatedly merge the minimum adjacent pair until the array becomes sorted.

	public static void main(String[] args) {

		MinimumPairRemovalSortArrayI arrayI = new MinimumPairRemovalSortArrayI();

		System.out.println(arrayI.minimumPairRemoval(new int[] { -2, 1, 2, -1, -1, -2, -2, -1, -1, 1, 1 }));
		System.out.println(arrayI.way2minimumPairRemoval(new int[] { -2, 1, 2, -1, -1, -2, -2, -1, -1, 1, 1 }));

	}

	public int minimumPairRemoval(int[] nums) { // Time complexity O(N^3);

		return helper(nums, 0);

	}

	private int helper(int[] nums, int count) {

		if (isSortedArray(nums)) {
			return count;
		}
		int minSum = Integer.MAX_VALUE;
		int index = 0;
		int arr[] = new int[nums.length - 1];
		for (int i = 0; i < nums.length - 1; i++) {

			if ((nums[i] + nums[i + 1]) < minSum) {
				minSum = nums[i] + nums[i + 1];
				index = i;
			}
		}
		int k = 0;
		for (int i = 0; i < nums.length; i++) {

			if (index == i) {
				arr[k++] = minSum;
				i++;
			} else {
				arr[k++] = nums[i];
			}

		}

		return helper(arr, count + 1);

	}

	private boolean isSortedArray(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] > nums[i + 1]) {
				return false;
			}

		}
		return true;
	}

	public int way2minimumPairRemoval(int[] nums) { // ChatGpt Suggest Time Complexity O(N^2)

		int n = nums.length - 1;
		int count = 0;
		while (!isSortedArray(nums, n)) {

			int minSum = Integer.MAX_VALUE;
			int index = 0;

			for (int i = 0; i < n; i++) {

				if ((nums[i] + nums[i + 1]) < minSum) {
					minSum = nums[i] + nums[i + 1];
					index = i;
				}
			}

			nums[index] = minSum; // merge the Element

			for (int i = index + 1; i < n; i++) { // shifts the elements left

				nums[i] = nums[i + 1];

			}
			n--;
			count++;
		}

		return count;
	}

	private boolean isSortedArray(int[] nums, int n) {

		for (int i = 0; i < n; i++) {

			if (nums[i] > nums[i + 1]) {
				return false;
			}

		}
		return true;
	}

}
