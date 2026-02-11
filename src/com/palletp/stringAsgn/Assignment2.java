package com.palletp.stringAsgn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Assignment2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name");

		String name = sc.nextLine();

		StringConcepts concept = new StringConcepts();

		String str = concept.checkPalindrome(name);
		System.out.println(str);

		int count = concept.chacracterCount(name);
		System.out.println(count);

		Map<String, Integer> mapCount = concept.countVowelsAndConsonants(name);

		Set<Map.Entry<String, Integer>> setMap = mapCount.entrySet();
		Iterator<Map.Entry<String, Integer>> it = setMap.iterator();

		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		int dCount = concept.countDigits(name);

		System.out.println(dCount);

		int sCount = concept.countSpace(name);

		System.out.println(sCount);

		String reSpace = concept.removeSpace(name);
		System.out.println(reSpace);

		String reSpaceialChar = concept.removeSpecialChars(name);
		System.out.println(reSpaceialChar);

		String reverseOfString = concept.reverseString(name);
		System.out.println(reverseOfString);

		int wordsCount = concept.countWords(name);
		System.out.println(wordsCount);

		boolean checkingAnagram = concept.checkAnagram("Listen", "silent");

		System.out.println(checkingAnagram);

		String findLongestWord = concept.findLongestWord(name);
		System.out.println(findLongestWord);

		concept.findFrequencyOfCharacters(name);
		concept.findFrequencyOfWords(name);
		char ch = concept.firstNonRepeatedCharacter(name);
		System.out.println(ch);
		String logestSubString = concept.findLongestSubString(name);
		System.out.println(logestSubString);

		boolean checkDigits = concept.checkDigits(name);
		System.out.println(checkDigits);

		String removeDuplicate = concept.removeDuplicateCharacters(name);
		System.out.println(removeDuplicate);

		boolean checkRotation = concept.checkRotationalString("abcd", "cdab");
		System.out.println(checkRotation);

		String leftRotation = concept.leftShiftRotattion(name, 1);
		System.out.println(leftRotation);

		String rightRotation = concept.rightShiftRotattion(name, 1);
		System.out.println(rightRotation);

		String longestSubString = concept.longestCommonPrefix(new String[] { "flower", "flow", "flight" });
		System.out.println(longestSubString);

		boolean checkAlphabets = concept.checkAlphabets(name);
		System.out.println(checkAlphabets);

		boolean checkingPalindrome = concept.checkingPalindrome(name);

		System.out.println(checkingPalindrome);

		ArrayList<String> printAllPermutattions = concept.printAllpermutations(name);

		for (int i = 0; i < printAllPermutattions.size(); i++) {

			System.out.println(printAllPermutattions.get(i));
		}

		String usingCharacterCount = concept.usingCharacterCount(name);
		System.out.println(usingCharacterCount);

		boolean checkSubString = concept.findsubString("abc", "ahbgdc");

		System.out.println(checkSubString);
		sc.close();

	}
}

class StringConcepts {

	public String checkPalindrome(String str1) {

		char ch[] = new char[str1.length()];

		for (int i = str1.length() - 1; i >= 0; i--) {
			ch[i] = str1.charAt(i);

		}
		StringBuilder sb = new StringBuilder();
		String str2 = sb.append(ch).toString();

		if (str2.equals(str1)) {
			return "Palindrome";
		} else {
			return "Not Palindrome";
		}

	}

	public int chacracterCount(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			count++;

		}

		return count;
	}

	public Map<String, Integer> countVowelsAndConsonants(String str) {

		int vCount = 0;
		int cCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
						|| (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
					vCount++;
				} else {
					cCount++;
				}

			}
		}

		Map<String, Integer> mapCount = new HashMap<>();

		mapCount.put("Vowels", vCount);
		mapCount.put("Consonant", cCount);

		return mapCount;

//		Simple 2nd Approach

//		if ("aeiou".indexOf(ch) != -1) {
//		    vCount++;
//		} else {
//		    cCount++;
//		}
	}

	public int countDigits(String str) {

		int dCount = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				dCount++;
			}
		}

		return dCount;
	}

	public int countSpace(String str) {

		int sCount = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isSpaceChar(ch)) { // isSpaceChar/ ch==' '/iswhiteSpace
				sCount++;
			}
		}

		return sCount;
	}

	public String removeSpace(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (!Character.isSpaceChar(ch)) {
				sb.append(ch);
			}
		}

//	  for(int i=0;i<str.length();i++) {
//		  
//		  if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')) {
//			  sb.append(str.charAt(i));
//		  }
//	  }

		return sb.toString();
	}

	public String removeSpecialChars(String str) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isDigit(ch) || Character.isSpaceChar(ch) || Character.isLetter(ch)) {
//				Character.isLetterOrDigit(ch);
				sb.append(ch);

			}

		}

//		str.replaceAll("[^a-zA-Z0-9 ]", ""); // Another Way;

		return sb.toString();
	}

	public String reverseString(String str) {

		String split[] = str.split(" ");

//		StringTokenizer st= new StringTokenizer(str)

//		ArrayList<String> listOfString = new ArrayList<>();

		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (String word : split) {

			StringBuilder sb1 = new StringBuilder();

			for (int i = word.length() - 1; i >= 0; i--) {

				sb1.append(word.charAt(i));
			}
			sb.append(sb1.toString());

			if (j < split.length - 1) {
				sb.append(" ");
			}
			j++;

		}

		return sb.toString();
	}

	public int countWords(String str) {

		String splitWords[] = str.split(" ");

		int wordCount = 0;

		for (String word : splitWords) {
			wordCount++;
		}
		return wordCount;
	}

	public boolean checkAnagram(String str1, String str2) {

		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();

		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String as1 = new StringBuilder().append(ch1).toString();

		String as2 = new StringBuilder().append(ch2).toString();

		if (as1.equals(as2)) {

			return true;
		} else {
			return false;
		}

	}

	public String findLongestWord(String str) {

		String split[] = str.split(" ");

		String longestWord = split[0];

		for (String word : split) {

			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}

	public void findFrequencyOfCharacters(String str) {

		char ch[] = str.toCharArray();

		char visited = '\0';

		int arr[] = new int[ch.length];

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != visited) {
				int frCount = 1;
				for (int j = i + 1; j < ch.length; j++) {

					if (ch[i] == ch[j]) {
						frCount++;
						ch[j] = visited;
					}
				}
				arr[i] = frCount;
			}

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				System.out.println(ch[i] + "->" + arr[i]);
			}
		}

	}

	public void findFrequencyOfWords(String str) {

//		Convert input to lowercase first
//		OR
//
//		Use another array for visited flags (boolean[])

//		String words[] = str.trim().split("\\s+");

		String words[] = str.split(" ");

		String visited = "-";

		int arr[] = new int[words.length];

		for (int i = 0; i < words.length; i++) {

			if (!words[i].equals(visited)) {
				int freCount = 1;
				for (int j = i + 1; j < words.length; j++) {

					if (words[i].equalsIgnoreCase(words[j])) {
						freCount++;
						words[j] = visited;
					}
				}
				arr[i] = freCount;

			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				System.out.println(words[i] + "->" + arr[i]);
			}
		}
	}

	public char firstNonRepeatedCharacter(String str) {

		str = str.toLowerCase();// handle the case-sensitive
		char ch[] = str.toCharArray();

		char visited = '\0';

		int arr[] = new int[ch.length];

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != visited && ch[i] != ' ') {
				int frCount = 1;
				for (int j = i + 1; j < ch.length; j++) {

					if (ch[i] == ch[j]) {
						frCount++;
						ch[j] = visited;
					}
				}
				arr[i] = frCount;
			}

		}

//		char nonRepeatedChar = '\0';
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 1) {
//				nonRepeatedChar=ch[i];
//				break;
				return ch[i];

			}
		}
		return '\0';
	}

	public String findLongestSubString(String str) {// pending

		str = str.toLowerCase();

		return null;
	}

	public boolean checkDigits(String str) {

		if (str == null || str.isEmpty()) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

	public String removeDuplicateCharacters(String str) {

		if (str == null || str.isEmpty()) {
			return str;
		}

		str = str.toLowerCase().trim();

		char ch[] = str.toCharArray();
		char visited = '\0';

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < ch.length; i++) {

			if ((ch[i] != visited)) {

				for (int j = i + 1; j < ch.length; j++) {

					if (ch[i] == ch[j]) {
						ch[j] = visited;
					}
				}
				sb.append(ch[i]);
			}

		}

		return sb.toString();
	}

	public boolean checkRotationalString(String str1, String str2) {

//		“If two strings are rotations, the second string must always be a substring of the first string concatenated with itself.”
		if (str1 == null || str2 == null) {
			return false;
		}

		str1 = str1 + str1;

		if (str1.contains(str2)) {
			return true;
		}

		return false;

	}

	public String leftShiftRotattion(String str, int no) {

		if (str == null || str.isEmpty()) {
			return str;
		}

		no = no % str.length();

		String left = str.substring(0, no);
		String right = str.substring(no);

		return right + left;
	}

	public String rightShiftRotattion(String str, int no) {

		if (str == null || str.isEmpty()) {
			return str;
		}

		no = no % str.length();

		int size = str.length() - no;

		String left = str.substring(0, size);
		String right = str.substring(size);

		return right + left;
	}

	public String longestCommonPrefix(String[] strs) { // imp

		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {

			while (!strs[i].startsWith(prefix)) {

				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.isEmpty()) {
					return " ";
				}
			}
		}
		return prefix;
	}

	public boolean checkAlphabets(String str) {

		if (str.isEmpty() || str == null) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isLetter(ch)) {

				return false;
			}
		}

		return true;
	}

	public boolean isomorphicStrings(String str1, String str2) { // pending

		if ((str1 == null || str2 == null) || (str1.isEmpty() || str2.isEmpty())) {

			return false;
		}

		if (str1.length() != str2.length()) {

			return false;
		}

//		char temp = ' ';
		for (int i = 0; i < str1.length(); i++) {

//			char ch1 = str1.charAt(i);
//			char ch2 = str2.charAt(i);

			while (i < str1.length()) {

			}

		}

		return true;

	}

	public boolean checkingPalindrome(String str) {

		if (str == null || str.isEmpty()) {
			return false;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLetter(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}

		String actualString = sb.toString();

		StringBuilder reverse = sb.reverse();
		String reverseOrder = reverse.toString();

		if (actualString.toLowerCase().equals(reverseOrder.toLowerCase())) {

			return true;
		}

		return false;
	}

	public ArrayList<String> printAllpermutations(String str) {// pending

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(str.charAt(i));
			for (int j = 0; j < str.length(); j++) {

				if (i != j) {
					sb.append(str.charAt(j));
				}
			}

			list.add(sb.toString());

		}

		return list;
	}

	public String usingCharacterCount(String str) {

		if (str == null || str.isEmpty()) {
			return " ";
		}
		char ch[] = str.toCharArray();

		char visited = '\0';

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < ch.length; i++) {

			int count = 1;
			if (ch[i] != visited) {
				for (int j = i + 1; j < ch.length; j++) {

					if (ch[i] == ch[j]) {

						ch[j] = visited;
						count++;

					}
				}
				sb.append(ch[i]).append(count);
			}
		}

		return (sb.toString().length() > str.length()) ? sb.toString() : str;
	}

	public boolean findsubString(String str1, String str2) {

		int i = 0, j = 0;

		while (i < str1.length() && j < str2.length()) {

			if (str1.charAt(i) == str2.charAt(j)) {
				i++; // move in str1 only if match
			}
			j++; // always move in str2
		}

		return i == str1.length();

	}
}
