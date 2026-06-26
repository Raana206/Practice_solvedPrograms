package com.basic.java.programs.leetCode.arrays;

import java.util.stream.IntStream;

public class LeftAndRightSumDifferences {

	public static void main(String[] args) {
	
		System.out.println(LeftAndRightSumDifferences.leftRightDifference(new int[] {10,4,8,3}));

	}

	public static int[] leftRightDifference(int[] nums) { // This is I did

		int left[] = new int[nums.length];

		int leftIndex = 1;
		int leftPrev = 0;

		int right[] = new int[nums.length];
		
		int rightIndex = nums.length - 2;
		
		int rightPrev = nums.length - 1;
		while (leftIndex < left.length && rightIndex >= 0) {

			left[leftIndex++] = left[leftPrev] + nums[leftPrev];
			right[rightIndex--] = right[rightPrev] + nums[rightPrev];
			leftPrev++;
			rightPrev--;
		}

		for (int n = 0; n < nums.length; n++) {
			nums[n] = Math.abs(left[n] - right[n]);
		}

		return nums;
	}

	public int[] leftRightDifference1(int[] nums) { // ChatGpt Gaves us

		int index = 0;
		int leftSum = 0;

		int totalSum = IntStream.of(nums).sum(); // Stream Api

		int result[] = new int[nums.length];

		for (int no : nums) {

			int rightSum = totalSum - leftSum - no;
			result[index++] = Math.abs(leftSum - rightSum);
			leftSum += no;
		}

		return result;

	}

}
