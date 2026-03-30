package com.palletp.strings;

import java.util.HashMap;
import java.util.Map;

public class Level1String {

	public static void main(String[] args) {

		LevelTest levelTest = new LevelTest();
		levelTest.reverseString();
		levelTest.isPalindrome();
		levelTest.Way2SlovedPalindrome();
		levelTest.countVowelsAndConsonants();
		levelTest.removeDuplicates();
		levelTest.areStringsEqual();
		levelTest.SecondLongestWord();
		levelTest.convertToUpper();
		levelTest.countFrequency();
		levelTest.way2CountFrequency();
		levelTest.way3CountFrequnecy();
	}

}

class LevelTest {

	public void reverseString() {

		String str = "Madam";

		if (str == null || str.isEmpty()) {
			return;
		}

		int index = str.length() - 1;

		StringBuilder reverseString = new StringBuilder();

		while (index >= 0) {

			reverseString.append(str.charAt(index--));
		}
		System.out.println(reverseString.toString());
	}

	public void isPalindrome() { // general Way of Approach

		String str = "Madam";

		if (str == null || str.isEmpty()) {
			System.out.println("False");
			return;
		}

		int index = str.length() - 1;

		StringBuilder reverseString = new StringBuilder();

		while (index >= 0) {

			reverseString.append(str.charAt(index--));
		}

		System.out.println(str.equalsIgnoreCase(reverseString.toString()));

	}

	public void Way2SlovedPalindrome() {

		String str = "Madam";

		if (str == null || str.isEmpty()) {
			System.out.println("False");
			return;
		}

		int left = 0;

		int right = str.length() - 1;

		while (left < right) {

			if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {

				System.out.print("False");
				return;
			}
			left++;
			right--;
		}
		System.out.println("True");

	}

	public void countVowelsAndConsonants() {

		String str = "Java Programming";

		int index = 0;
		int vCount = 0;
		int cCount = 0;

		if (str == null || str.isEmpty()) {
			System.out.println("Vowels:" + vCount + "\n" + "Consonants:" + cCount);
			return;
		}

		while (index < str.length()) {

			if (("AEIOU".indexOf(Character.toUpperCase(str.charAt(index))) != -1)) {
				vCount++;
			} else if (Character.isLetter(str.charAt(index))) {
				cCount++;
			}

			index++;

		}
		System.out.println("Vowels:" + vCount + "\n" + "Consonants:" + cCount);

	}

	public void removeDuplicates() {

		String str = "hello";

		if (str == null || str.isEmpty()) {

			return;
		}

		int index = 0;

		boolean visited[] = new boolean[256];

		StringBuilder sb = new StringBuilder();

		while (index < str.length()) {

			if (!visited[str.charAt(index)]) {

				visited[str.charAt(index)] = true;

				sb.append(str.charAt(index));

			}

			index++;

		}
		System.out.println(sb.toString());

	}

	public void areStringsEqual() {

		String str1 = null;
		String str2 = "";

		int index = 0;

		if (str1 == null && str2 == null) {
			System.out.println("True");
			return;
		}

		if (str1 == null || (str2 == null)) {
			System.out.println("false");
			return;
		}

		if (str1.length() != str2.length()) {
			System.out.println("false");
			return;
		}

		while (index < str1.length()) {

			if (str1.charAt(index) != str2.charAt(index)) {

				System.out.println("false");
				return;
			}

			index++;

		}

		System.out.println("True");
	}

	public void SecondLongestWord() {

		String str = "Java Program word";

		String word[] = str.split("\\s+");

		String biggestWord = "";
		String secondLongestWord = "";

		for (int i = 0; i < word.length; i++) {

			if (word[i].length() > biggestWord.length()) {
				secondLongestWord = biggestWord;
				biggestWord = word[i];
			} else if (word[i].length() >= secondLongestWord.length() && word[i].length() < biggestWord.length()) {
				secondLongestWord = word[i];
			}
		}
		System.out.println(secondLongestWord.isEmpty() ? null : secondLongestWord);

	}

	public void convertToUpper() {

		String str = "Java";

		if (str == null) {
			System.out.println(" ");
			return;
		}

		int index = 0;
		StringBuilder sb = new StringBuilder();
		while (index < str.length()) {

			if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
				sb.append((char) (str.charAt(index++) - ('a' - 'A'))); // instead of (char)(str.charAt(index++) - 32)
			} else {
				sb.append(str.charAt(index++));
			}
		}
		System.out.println(sb.toString());
	}

	public void countFrequency() {

		String str = "java";

		int index = 0;
		boolean visited[] = new boolean[256];
		while (index < str.length()) {

			if (!visited[str.charAt(index)]) {
				int count = 1;
				visited[str.charAt(index)] = true;
				int j = index + 1;
				while (j < str.length()) {

					if (str.charAt(index) == str.charAt(j)) {

						count++;

					}
					j++;
				}

				if (visited[str.charAt(index)]) {
					System.out.println(str.charAt(index) + "-" + count);
				}

			}
			index++;
		}

	}

	public void way2CountFrequency() {

		String str = "".toLowerCase();

		int fre[] = new int[256];

		for (int i = 0; i < str.length(); i++) {

			fre[str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {

			if (fre[str.charAt(i)] != 0) {

				System.out.println(str.charAt(i) + "-" + fre[str.charAt(i)]);

				fre[str.charAt(i)] = 0; // why here fre[]=0 because of same character again repeat. that character value
										// again print. i have avoid.
			}
		}

	}

	public void way3CountFrequnecy() {

		String str = "Java";

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
               
			System.out.println(entry.getKey() +"-"+entry.getValue());
		}

	}
}
