package com.basic.java.programs.leetCode;

public class TransformedArray {

	public static void main(String[] args) {

	
		TransformedArray array = new TransformedArray();
		int nums[] = { 3, -2, 1, 1 };
		System.out.println(array.constructTransformedArray(nums));

	}

	public int[] constructTransformedArray(int[] nums) {

		int result[] = new int[nums.length];

		for (int i = 0, r = 0; i < nums.length; i++, r++) {

			int indexValue = nums[i];

			if (indexValue > 0) {
				int count = 0;
				for (int j = i; j < nums.length; j++, count++) {

					if (count == indexValue) {

						result[r] = nums[j];
						break;

					}
					if (j == nums.length - 1) {
						j = -1;
					}

				}
			} else if (indexValue < 0) {
				int count = 0;
				for (int j = i; j < nums.length; j--, count--) {

					if (count == indexValue) {

						result[r] = nums[j];
						break;

					}
					if (j == 0) {
						j = nums.length;
					}

				}
			} else {

				result[r] = nums[i];
			}
		}

		return result;
	}

}
