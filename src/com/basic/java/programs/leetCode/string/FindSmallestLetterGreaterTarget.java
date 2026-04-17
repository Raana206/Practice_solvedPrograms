package com.basic.java.programs.leetCode.string;

public class FindSmallestLetterGreaterTarget {

	public static void main(String[] args) {

		FindSmallestLetterGreaterTarget d = new FindSmallestLetterGreaterTarget();

		d.nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'a');
	}

//	👉 Find the smallest element > target in a sorted array (with circular wrap-around).

	public char nextGreatestLetter(char[] letters, char target) {

		for (int i = 0; i < letters.length; i++) {

			if (target < letters[i]) {
				return letters[i];
			}
		}
		return letters[0];

	}

}
