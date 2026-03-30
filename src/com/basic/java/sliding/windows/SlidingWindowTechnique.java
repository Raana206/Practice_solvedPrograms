package com.basic.java.sliding.windows;

public class SlidingWindowTechnique {

	public static void main(String[] args) {

		SlidingWindowTechnique slidingWindowTechnique = new SlidingWindowTechnique();

		slidingWindowTechnique.maxSum();
		slidingWindowTechnique.factorial(5, 1);
		slidingWindowTechnique.miniSubArray();
		slidingWindowTechnique.longestSubArray();

	}

	public void maxSum() {

		int arr[] = { 4, 2, 1, 7, 8, 1, 2 };

//		System.out.println(arr[-1]);

		int sum = arr[0] + arr[1];
		int max = sum;
		int left = 0;
		for (int right = 2; right < arr.length; right++) {

			sum = sum - arr[left] + arr[right];
			left++;

			if (sum > max) {
				max = sum;
			}
		}
		System.out.println(max);
	}

	public void factorial(int n, int fact) {

		if (n <= 0) {
			System.out.println(fact);
			return;
		}

		factorial(n - 1, fact * n);

	}

	public void miniSubArray() {

		int[] arr = { 2, 3, 1, 2, 4, 3 };

		int k = 7;

		int minLength = Integer.MAX_VALUE;

		int left = 0;
		int sum = 0;

		for (int right = 0; right < arr.length; right++) {
			sum += arr[right];
			while (sum >= k) {

				minLength = Math.min(minLength, right - left + 1);
				sum -= arr[left];
				left++;

			}

		}
		if (minLength == Integer.MAX_VALUE) {
			System.out.println(0);
		} else {
			System.out.println(minLength);
		}
	}

	public void longestSubArray() {

		int arr[] = { 4, 1, 1, 1, 2, 3, 5 };

		int k = 5;

		int maxLength = Integer.MIN_VALUE;

		int left = 0;
		int sum = 0;

		for (int right = 0; right < arr.length; right++) {

			sum += arr[right];
			while (sum > k) {

				sum -= arr[left];
				left++;
			}
			maxLength = Math.max(maxLength, right - left + 1);

		}

		System.out.println(maxLength);

	}

}
