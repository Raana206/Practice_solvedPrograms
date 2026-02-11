package com.basic.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringPrograms {

	public static void main(String[] args) {

		Program4 program4 = new Program4();

		program4.nEqualParts();// imp
		program4.subSetOfStrings();// imp
//		program1.findAllThePermutations();
		program4.lowerToUpper();
		program4.MaxAndMinOccurence(); // imp
		program4.longestSubString(); // imp
	}

}

class Program4 {

	public void nEqualParts() {

		String str = "abcdef";

		int equalParts = 2;
		System.out.println(str.length());

		if (str.length() % equalParts != 0) {

			System.out.println("We can not divide this String into NEqual Parts");
			return;
		}

		int parts = str.length() / equalParts;

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < str.length(); i += parts) {

			list.add(str.substring(i, i + parts));
		}

		for (String subStrins : list) {
			System.out.println(subStrins);
		}

	}

	public void subSetOfStrings() {

		String str = "1234";

		ArrayList<String> list = new ArrayList<>();

		list.add(" ");

		for (int i = 0; i < str.length(); i++) {

			int currentSize = list.size();
			int currentChar = str.charAt(i);

			for (int j = 0; j < currentSize; j++) {

				list.add(list.get(j) + (currentChar - '0')); // here we are applying asccii concept .because my String
																// is Integer
																// String .
			}
		}

		for (String values : list) {

			System.out.println(values);
		}
	}

	public void lowerToUpper() {

		String lowerCase = "display";

		char ch[] = lowerCase.toCharArray();
		String upperCase = " ";

		for (int i = 0; i < lowerCase.length(); i++) {

			if (ch[i] >= 'a' && ch[i] <= 'z') {

				upperCase = upperCase + (char) (ch[i] - 32);
			}
		}
		System.out.println(upperCase);
	}

	public void MaxAndMinOccurence() { // imp

		String str = "programming";

		char ch[] = str.toCharArray();

		char visited = '\0';

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {

			if (visited != ch[i]) {
				int count = 1;
				for (int j = i + 1; j < ch.length; j++) {

					if (ch[i] == ch[j]) {
						ch[j] = visited;
						count++;

					}
				}
				map.put(ch[i], count);

			}
		}

		char maxChar = ' ';
		char minChar = ' ';

		int maxCount = 0;
		int minCount = Integer.MAX_VALUE;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > maxCount) {

				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}

			if (entry.getValue() < minCount) {
				minCount = entry.getValue();
				minChar = entry.getKey();
			}
		}

		System.out.println("MaxChar:" + maxChar + "-" + maxCount);
		System.out.println("MinChar:" + minChar + "-" + minCount);

	}

	public void withOutMapFindMaxAndMin() {

	}

	public void longestSubString() { // imp

		String str = "abcabcbb";

		String longestSubString = " ";

		for (int i = 0; i < str.length(); i++) {

			boolean visited[] = new boolean[256];

			String currentString = " ";

			for (int j = i; j < str.length(); j++) {

				char ch = str.charAt(j);

				if (visited[ch]) {
					break;
				}

				visited[ch] = true;

				currentString += ch;

				if (currentString.length() > longestSubString.length()) {

					longestSubString = currentString;
				}

			}
		}
		System.out.println(longestSubString);

	}

}
