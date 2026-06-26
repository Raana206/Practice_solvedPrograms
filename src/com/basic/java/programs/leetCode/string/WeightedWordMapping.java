package com.basic.java.programs.leetCode.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WeightedWordMapping {

	public static void main(String[] args) {

		System.out.println(WeightedWordMapping.mapWordWeights(new String[] { "abcd", "def", "xyz" },
				new int[] { 5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2 }));
		
		System.out.println(WeightedWordMapping.mapWordWeights2(new String[] { "abcd", "def", "xyz" },
				new int[] { 5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2 }));
		
		System.out.println(WeightedWordMapping.mapWordWeights3(new String[] { "abcd", "def", "xyz" },
				new int[] { 5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2 }));

	}

	public static String mapWordWeights(String[] words, int[] weights) { // i did this 
		
	

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char ch = 'a';

		for (int no : weights) {

			map.put(ch++, no);
		}

		int wordIndex = 0;
		int wordsLength = words.length;

		StringBuilder result = new StringBuilder();
		
		while (wordsLength > wordIndex) {
			int sumOfWordWeight = 0;
			for (char ch1 : words[wordIndex++].toCharArray()) {

				sumOfWordWeight += map.getOrDefault(ch1, 0);

			}

			result.append((char) (122 - (sumOfWordWeight % 26)));
		}

		return result.toString();

	}
	
	
	    public static String mapWordWeights2(String[] words, int[] weights) { // chatgpt gaves us

	        StringBuilder result = new StringBuilder();

	        for (String word : words) {

	            int sum = 0;

	            for (char ch : word.toCharArray()) {
	                sum += weights[ch - 'a'];
	            }

	            result.append((char) ('z' - (sum % 26)));
	        }

	        return result.toString();
	    }
	
	    public static String mapWordWeights3(String[] words, int[] weights) { // Using Stream Api
	    	
	    	
			return Arrays
					.stream(words)
					.map(word -> {
						int sum = word.chars()
								.map(ch -> weights[ch - 'a'])
								.sum();
	    		
						return String.valueOf((char) ('z' - (sum % 26)));
					})
					.collect(Collectors.joining());
	    	
	    	
	    }

}
