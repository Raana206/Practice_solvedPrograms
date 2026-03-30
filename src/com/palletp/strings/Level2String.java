package com.palletp.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Level2String {

	public static void main(String[] args) {

		Level2String l2 = new Level2String();
		l2.checkAnagram();
		l2.way2CheckAnagram();
		l2.way3CheckAnagram();
		l2.checkRotationalString();
		l2.firstNonRepeatedCharacter();
		l2.way2FirstNonRepeatedCharacter();
		l2.findlongestWord();
		l2.countOccurrenceOfSubstring();
		l2.way2CountOccurrenceOfSubstring();
		l2.way3CountOccurrenceOfSubstring();
		l2.toggleCaseWithoutLibraryFunctions();
		l2.removeAllWhitespacesWithoutMethods();
		l2.way2removeAllWhitespacesWithoutMethods();
	}

	public void checkAnagram() {

		String str1 = "triangle";
		String str2 = "integral";

		if (str1 == null || str2 == null) {

			System.out.println("False");
			return;
		}

		if (str1.length() != str2.length()) {

			System.out.println("False");
			return;
		}

		char ch1[] = str1.toLowerCase().toCharArray();
		Arrays.sort(ch1);

		char ch2[] = str2.toLowerCase().toCharArray();
		Arrays.sort(ch2);

		int index = 0;
		while (index < ch1.length) {

			if (ch1[index] != ch2[index]) {
				System.out.println("False");
				return;
			}
			index++;
		}

		System.out.println("true");

	}

	public void way2CheckAnagram() {

		String str1 = "triangle";
		String str2 = "integral";

		if (str1 == null || str2 == null) {

			System.out.println("False");
			return;
		}

		if (str1.length() != str2.length()) {

			System.out.println("False");
			return;
		}

		char ch1[] = str1.toLowerCase().toCharArray();
		Arrays.sort(ch1);

		char ch2[] = str2.toLowerCase().toCharArray();
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {

			System.out.println("true");
		} else {
			System.out.println("False");
		}
	}

	public void way3CheckAnagram() {

		String str1 = "triangle";
		String str2 = "integral";

		if (str1 == null || str2 == null || str1.length() != str2.length()) {

			System.out.println("False");
			return;
		}

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		int freq[] = new int[26];

		for (int i = 0; i < str1.length(); i++) {

			freq[str1.charAt(i) - 'a']++;
			freq[str2.charAt(i) - 'a']--;

		}

		for (int i = 0; i < str2.length(); i++) {

			if (freq[str2.charAt(i) - 'a'] != 0) {
				System.out.println("False");
				return;
			}

		}
		System.out.println("True");

	}

	public void checkRotationalString() {

		String str1 = "abc";
		String str2 = "acb";

		if (str1 == null || str2 == null || str1.length() != str2.length()) {

			System.out.println("False");
			return;
		}

		String str3 = str1 + str1;

//		if (str3.indexOf(str2) != -1) {// This is also Fine 
//			System.out.println("true");
//			return;
//		}

		if (str3.contains(str2)) {
			System.out.println("true");

		} else {
			System.out.println("False");
		}

	}

	public void firstNonRepeatedCharacter() {

		String str = "xxyz";

		if (str == null || str.length() == 0) {

			System.out.println("No Unique Character");
			return;
		}

		str = str.toLowerCase();

		int freq[] = new int[256];

		for (int i = 0; i < str.length(); i++) {

			freq[str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] == 1) {
				System.out.println(str.charAt(i));
				return;
			}
		}
		System.out.println("No Unique Character");
	}

	public void way2FirstNonRepeatedCharacter() {

		String str = "xxyz";

		if (str == null || str.length() == 0) {

			System.out.println("No Unique Character");
			return;
		}

		str = str.toLowerCase();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				return;
			}
		}
		System.out.println("No Unique Character");

	}

	public void findlongestWord() {

		String str = "  ";

		if (str == null || str.trim().length() == 0) {

			System.out.println("No words found");
			return;
		}

//		String split[] = str.split("\\s+");

		String longestWord = "";

		for (String word : str.trim().split("\\s+")) {

			if (word.length() > longestWord.length()) {

				longestWord = word;
			}
		}

		if (longestWord.length() != 0) {
			System.out.println(longestWord);
		} else {
			System.out.println("No words found");
		}

	}

	public void countOccurrenceOfSubstring() {

		String str = "";
		String subString = "a";

		if (str == null || subString == null || str.length() == 0 || subString.length() == 0) {

			System.out.println(0);
			return;
		}

//		str = str.toLowerCase();
//		subString = subString.toLowerCase();

		int count = 0;
		int size = subString.length();
		for (int i = 0; i <= str.length() - size; i++) {

			String sub = str.substring(i, i + size);

			if (sub.contentEquals(subString)) {

				count++;
			}
		}

		System.out.println(count);

	}

	public void way2CountOccurrenceOfSubstring() {

		String str = "aaaa";
		String subString = "a";

		if (str == null || subString == null || str.length() == 0 || subString.length() == 0) {

			System.out.println(0);
			return;
		}

		int count = 0;
		int size = subString.length();
		for (int i = 0; i <= str.length() - size; i++) {

//			String sub = str.substring(i, i + size);

			if (str.startsWith(subString, i)) {

				count++;
			}
		}
		System.out.println(count);
	}

	public void way3CountOccurrenceOfSubstring() {

		String str = "banana";
		String subString = "ana";

		if (str == null || subString == null || str.length() == 0 || subString.length() == 0) {

			System.out.println(0);
			return;
		}

		int count = 0;
		int index = 0;

		while ((index = str.indexOf(subString, index)) != -1) {
			count++;
			index++; // move one step for overlapping
		}

		System.out.println(count);
	}

	public void toggleCaseWithoutLibraryFunctions() {

		String str = "java";

		if (str == null || str.length() == 0) {

			System.out.println(str);
			return;
		}

		StringBuilder sb = new StringBuilder();

		int diff = 'a' - 'A'; // 32

		for (char ch : str.toCharArray()) {

			if (ch >= 'A' && ch <= 'Z') {
				sb.append((char) (ch + diff));
			} else if (ch >= 'a' && ch <= 'z') {
				sb.append((char) (ch - diff));
			} else {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());

	}

	public void removeAllWhitespacesWithoutMethods() { // manual Check

		String str = " \tHello \n World\t\r ";

		if (str == null || str.length() == 0) {

			System.out.println(str);
			return;
		}

		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {

			if (ch != ' ' && ch != '\t' && ch != '\n' && ch != '\r') {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());

	}

	public void way2removeAllWhitespacesWithoutMethods() {

		String str = " \tHello \n World\t\r ";

		if (str == null || str.length() == 0) {

			System.out.println(str);
			return;
		}

		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {

			if (!Character.isWhitespace(ch)) {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());

	}

}
