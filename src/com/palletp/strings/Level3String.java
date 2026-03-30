package com.palletp.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Level3String {

	public static void main(String[] args) {

		Level3String l3 = new Level3String();

		l3.longestSubstring();
		l3.way2LongestSubstring();
		l3.minimumSubString();
		l3.groupAnagramsTogether();
		l3.way2groupAnagramsTogether();
		l3.stringCompression();
		l3.way2stringCompression();
		l3.longestPalindromicSubtring();
		l3.way2LongestPalindromicSubString();
		l3.generateAllPermutations();
		l3.checTwoStringsIsomorphic();
		l3.letterCombinations();
		l3.way2letterCombinations();
	}

	public void longestSubstring() {

		String str = "tmmzuxt";

		if (str == null || str.length() == 0) {

			System.out.println(0);
			return;
		}
		int count = 0;
		String longestString = "";

		for (int i = 0; i < str.length(); i++) {

			boolean visited[] = new boolean[256];

			String currentString = "";

			for (int j = i; j < str.length(); j++) {

				char ch = str.charAt(j);

				if (visited[ch]) {
					break;
				}

				visited[ch] = true;
				currentString += ch;

			}

			if (currentString.length() > longestString.length()) {

				longestString = currentString;

			}

		}
		System.out.println(longestString + "-" + longestString.length());

	}

	public void way2LongestSubstring() {

		String str = "programming";

		if (str == null || str.length() == 0) {
			System.out.println(0);
			return;
		}

		boolean[] visited = new boolean[256];

		int left = 0;
		int maxLength = 0;

		for (int right = 0; right < str.length(); right++) { // imp

			char ch = str.charAt(right);

			while (visited[ch]) {
				visited[str.charAt(left)] = false;
				left++;
			}

			visited[ch] = true;
			maxLength = Math.max(maxLength, right - left + 1);
		}

		System.out.println(maxLength);
		int max = Math.max(5, 3);
		System.out.println(max);
	}

	public void minimumSubString() { // Pending

//		String str = "ADOBECODEBANC";
//
//		if (str == null || str.length() == 0) {
//			System.out.println(0);
//			return;
//		}
//
//		String minString = "";
//
//		int minLength = Integer.MAX_VALUE;
//		for (int right = 0; right < str.length(); right++) {
//
//			boolean[] visited = new boolean[256];
//			String currentString = "";
//
//			for (int left = right; left < str.length(); left++) {
//
//				char ch = str.charAt(left);
//
//				if (visited[ch]) {
//
//					break;
//				}
//				visited[ch] = true;
//				currentString += ch;
//			}
//
//			if (currentString.length() < minLength) {
//
//				minString = currentString;
//				minLength = minString.length();
//
//				Arrays.sort(minString.toCharArray());
//				if (minString.startsWith("ABC")) {
//					System.out.println(minString);
//					return;
//				}
//			}
//
//		}

//		System.out.println(minString);

		int arr[] = { 2, 1, 5, 1, 3, 2 };

		int sum = arr[0] + arr[1] + arr[2];

		int max = sum;
		int left = 0;

		for (int right = 3; right < arr.length; right++) {

			sum = sum - arr[left++] + arr[right];
			if (sum > max) {
				max = sum;
			}
		}

		System.out.println(max);

	}

	public void groupAnagramsTogether() {

		String arr[] = { "aab", "aba", "baa", "abb" };

		if (arr == null || arr.length == 0) {
			System.out.println(arr);
			return;
		}

		ArrayList<HashSet<String>> list = new ArrayList<HashSet<String>>();

		for (int i = 0; i < arr.length; i++) {

			if (!arr[i].equals("")) {

				char ch1[] = arr[i].toLowerCase().toCharArray();

				Arrays.sort(ch1);
				String str = new String(ch1);

				HashSet<String> arrayList = new HashSet<String>();

				arrayList.add(arr[i]);

				for (int j = i + 1; j < arr.length; j++) {

					char ch2[] = arr[j].toLowerCase().toCharArray();

					Arrays.sort(ch2);
					String str1 = new String(ch2);

					if (str.equals(str1)) {

						arrayList.add(arr[j]);
						arr[j] = "";
					}

				}

				list.add(arrayList);
			}

		}

		System.out.println(list);

	}

	public void way2groupAnagramsTogether() {

		String arr[] = { " ", " " };

		Map<String, ArrayList<String>> map = new LinkedHashMap<String, ArrayList<String>>();

		for (String word : arr) {

			char[] ch = word.toLowerCase().toCharArray();

			Arrays.sort(ch);

			String str = new String(ch);

			if (!map.containsKey(str)) {

				map.put(str, new ArrayList<String>());
			}

			map.get(str).add(word);

		}
		System.out.println(map.values());
	}

	public void stringCompression() { // imp

		String str = "aaabb";

		if (str == null || str.length() == 0) {
			System.out.println(str);
			return;
		}

		StringBuilder sb = new StringBuilder();

		int index = 0;
		int count = 1;
		for (int i = 0; i < str.length(); i = index) { // here i did index Improvement;

			int innerIndex = 1;
			for (int j = i + 1; j < str.length(); j++, innerIndex++) {

				if (str.charAt(i) == str.charAt(j)) {
					count++;

				} else {

					break;
				}

			}
			index += innerIndex;
			sb.append(str.charAt(i));
			if (count > 1) {

				sb.append(count);
				count = 1;
			}

		}

		System.out.println(sb.toString());
	}

	public void way2stringCompression() { // imp

		String str = "a";

		if (str == null || str.length() == 0) {
			System.out.println(str);
			return;
		}

		StringBuilder sb = new StringBuilder();
		int count = 1;

		for (int i = 1; i <= str.length(); i++) {

			if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				sb.append(str.charAt(i - 1)).append(count);
				count = 1;
			}
		}

		System.out.println(sb.toString());
	}

	public void longestPalindromicSubtring() {

		String str = "racecar";

		if (str == null || str.length() == 0) {

			System.out.println(str);
			return;
		}

		String maxWord = "";

		for (int i = 0; i < str.length(); i++) {

			String currentword = "";

			for (int j = i; j < str.length(); j++) {

				currentword += str.charAt(j);
				int left = 0;

				int right = currentword.length() - 1;
				boolean flag = true;
				while (left < right) {

					if (currentword.charAt(left) != currentword.charAt(right)) {
						flag = false;
						break;
					}
					left++;
					right--;
				}

				if (flag && currentword.length() > maxWord.length()) {

					maxWord = currentword;
				}
			}

		}

		System.out.println(maxWord);
	}

	public void way2LongestPalindromicSubString() {

		String s = "racecar";

		if (s == null || s.length() < 1) {
			System.out.println(s);
			return;
		}
		int start = 0;
		int end = 0;

		for (int i = 0; i < s.length(); i++) {

			int len1 = expandFromCenter(s, i, i);
			int len2 = expandFromCenter(s, i, i + 1);

			int maxLen = Math.max(len1, len2);

			if (maxLen > end - start) {
				start = i - (maxLen - 1) / 2;
				end = i + maxLen / 2;
			}
		}

		System.out.println(s.substring(start, end + 1));
	}

	private int expandFromCenter(String s, int left, int right) {

		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

			left--;
			right++;
		}

		return right - left - 1;
	}

	public void generateAllPermutations() { // pendings

	}

	public void checTwoStringsIsomorphic() {

		String str = "egg";
		String t = "add";

		Map<Character, Character> map = new LinkedHashMap<Character, Character>();

		char ch[] = t.toCharArray();
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {

				if (map.get(str.charAt(i)) != ch[i]) {
					System.out.println("false");
					return;
				}

			} else {
				map.put(str.charAt(i), ch[i]);
			}

		}

		Map<Character, Character> map1 = new LinkedHashMap<Character, Character>();

		char ch1[] = str.toCharArray();

		for (int i = 0; i < t.length(); i++) {

			if (map1.containsKey(t.charAt(i))) {

				if (map1.get(t.charAt(i)) != ch1[i]) {
					System.out.println("false");
					return;
				}

			} else {
				map1.put(t.charAt(i), ch1[i]);
			}

		}

		System.out.println(flag);
	}

	public List<String> letterCombinations() { // i did this 

		String digits = "23";
		List<String> list = new ArrayList<String>();
		Map<Integer, String> map = Map.of(2, "abc", 3, "def", 4, "ghi", 5, "jkl", 6, "mno", 7, "pqrs", 8, "tuv", 9,
				"wxyz");

		char ch[] = digits.toCharArray();
		String arr[] = new String[ch.length];
		int index = 0;
		for (char key : ch) {
			if (key-'0' > 1) {

				arr[index++] = map.get(key - '0');

			}
		}

		for (String word : arr) {
			char ch1[] = word.toCharArray();
               List<String> temp= new ArrayList<String>();
			if (!list.isEmpty()) {
				for(String existing :list) {
				for (char r : ch1) {
					temp.add(existing+r);
				}
				
				}
				list=temp;
			} else {
				for (char c : ch1) {
					list.add("" + c);
				}
			}
		}
		return list;
	}
	
	public List<String> way2letterCombinations() { // chatgpt gave like this

		String digits="23";
	    List<String> result = new ArrayList<>();

	    if(digits == null || digits.length() == 0)
	        return result;

	    String[] map = {
	        "", "", "abc", "def", "ghi",
	        "jkl", "mno", "pqrs", "tuv", "wxyz"
	    };

	    result.add("");

	    for(char digit : digits.toCharArray()){

	        String letters = map[digit - '0'];

	        List<String> temp = new ArrayList<>();

	        for(String prefix : result){
	            for(char c : letters.toCharArray()){
	                temp.add(prefix + c);
	            }
	        }

	        result = temp;
	    }

	    return result;
	}

}
