package com.basic.java.programs.leetCode.binary;

public class CountBinarySubstrings {

	public static void main(String[] args) {

		CountBinarySubstrings binarySubstrings = new CountBinarySubstrings();

		System.out.println(binarySubstrings.countBinarySubstrings("10101"));
		;
	}

	public int countBinarySubstrings(String s) {

		int count = 0;
		int prevGroupLength = 0;
		int currGroupLength = 1;

		for (int i = 1; i < s.length(); i++) {
			// If the character changed, the current group is finished
			if (s.charAt(i) != s.charAt(i - 1)) {
				// Add the minimum of the two adjacent groups to our total
				count += Math.min(prevGroupLength, currGroupLength);

				// Move current group length to previous, reset current
				prevGroupLength = currGroupLength;
				currGroupLength = 1;
			} else {
				// Same character, keep counting the group
				currGroupLength++;
			}
		}

		// Add the comparison for the final group
		return count + Math.min(prevGroupLength, currGroupLength);

	}

}
