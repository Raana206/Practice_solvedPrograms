package com.basic.java.programs.leetCode.string;

public class CheckStringsMadeEqualWithOperationsII {

	public static void main(String[] args) {

		CheckStringsMadeEqualWithOperationsII check = new CheckStringsMadeEqualWithOperationsII();

		System.out.println(check.canBeEqual("abcd", "cdab"));
	}

	public boolean canBeEqual(String s1, String s2) {

//		 Two strings are equal if and only if the frequency of characters at even indices and odd indices are the same in both strings.

		if (s1.length() != s2.length()) {
			return false;
		}

		int[] even = new int[26];
		int[] odd = new int[26];

		for (int i = 0; i < s1.length(); i++) {

			if (i % 2 == 0) {
				even[s1.charAt(i) - 'a']++;
				even[s2.charAt(i) - 'a']--;
			} else {
				odd[s1.charAt(i) - 'a']++;
				odd[s2.charAt(i) - 'a']--;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (even[i] != 0 || odd[i] != 0) {
				return false;
			}
		}

		return true;
	}

}
