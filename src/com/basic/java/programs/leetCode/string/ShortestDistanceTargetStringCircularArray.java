package com.basic.java.programs.leetCode.string;

public class ShortestDistanceTargetStringCircularArray {

	public static void main(String[] args) {

		ShortestDistanceTargetStringCircularArray array = new ShortestDistanceTargetStringCircularArray();

		System.out.println(array.closestTarget(new String[] { "i", "eat", "leetcode" }, "ate", 0));
	}

	public int closestTarget(String[] words, String target, int startIndex) { // importants

		int n = words.length;

		int minDistance = Integer.MAX_VALUE;

		for (int i = 0; i < words.length; i++) {

			if (words[i].equals(target)) {

				int clockwise = (i - startIndex + n) % n;
				int antiClockWise = (startIndex - i + n) % n;

				int distance = Math.min(clockwise, antiClockWise);

				minDistance = Math.min(distance, minDistance);

			}

		}

		return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
	}

}
