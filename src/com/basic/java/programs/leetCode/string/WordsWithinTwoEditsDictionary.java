package com.basic.java.programs.leetCode.string;

import java.util.ArrayList;
import java.util.List;

public class WordsWithinTwoEditsDictionary {

//	“A query word is valid if it differs from any dictionary word in at most two character positions.”

	public static void main(String[] args) {
		System.out.println(WordsWithinTwoEditsDictionary.twoEditWords(new String[] { "word", "note", "ants", "wood" },
				new String[] { "wood", "joke", "moat" }));

	}

	public static List<String> twoEditWords(String[] queries, String[] dictionary) {

		List<String> result = new ArrayList<String>();
		for (String words : queries) {

			if (matchingWord(words, dictionary)) {
				result.add(words);
			}
		}
		return result;
	}

	private static boolean matchingWord(String words, String[] dictionary) {

		for (String dicWord : dictionary) {
			if (words.equals(dicWord)) {
				return true;
			}
			int count = 0;

			for (int i = 0; i < words.length(); i++) {

				if (dicWord.charAt(i) != words.charAt(i)) {

					count++;
					if (count > 2)
						break;
				}

			}

			if (count <= 2) {
				return true;
			}
		}
		return false;
	}
}
