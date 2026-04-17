package com.basic.java.programs.leetCode.arrays;

import java.util.HashMap;

public class MinimumAbsoluteDistanceBetweenMirrorPairs {

	public static void main(String[] args) {

		MinimumAbsoluteDistanceBetweenMirrorPairs pairs = new MinimumAbsoluteDistanceBetweenMirrorPairs();

		System.out.println(pairs.minMirrorPairDistance(new int[] { 12, 21, 45, 33, 54 }));
		System.out.println(pairs.Way2MinMirrorPairDistance(new int[] { 12, 21, 45, 33, 54 }));
	}

	public int minMirrorPairDistance(int[] nums) {

		int minDistance = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {

			int no = nums[i];
			int reverseNo = reverseDigits(no);
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == reverseNo) {
					minDistance = Math.min(minDistance, Math.abs(i - j));
					if (minDistance == 1)
						return minDistance;
				}
			}

		}

		return (minDistance != Integer.MAX_VALUE) ? minDistance : -1;

	}

	private int reverseDigits(int no) {
		
		int reverseNo = 0;
		while (no > 0) {

			reverseNo = (reverseNo * 10) + no % 10;
			
			no /= 10;

		}
		return reverseNo;
	}

	public int Way2MinMirrorPairDistance(int[] nums) { // ChatGpt

		int n = nums.length;

		int minDistance = Integer.MAX_VALUE;

		// Map stores: The REVERSED value we are looking for -> The index of the source
		// Key: reverseDigits(nums[i]), Value: i
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int j = 0; j < n; j++) {
			// Check if the current number is a mirror of any previous number
			if (map.containsKey(nums[j])) {
				minDistance = Math.min(minDistance, j - map.get(nums[j]));
			}

			// Store the mirror we ARE LOOKING FOR from this index
			int targetMirror = Way2ToReverseDigits(nums[j]);

			// We update the map with the latest index to keep distance minimal
			map.put(targetMirror, j);

			if (minDistance == 1)
				return 1;
		}

		return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
	}

	private int Way2ToReverseDigits(int no) {
		if (no == 0)
			return 0;
		int reverseNo = 0;
		while (no > 0) {
			reverseNo = (reverseNo * 10) + (no % 10);
			no /= 10;
		}
		return reverseNo;
	}
}
