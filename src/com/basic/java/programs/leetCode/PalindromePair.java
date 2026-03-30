package com.basic.java.programs.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PalindromePair {
	
	public static void main(String[] args) {
		
		String words[]= {"abcd","dcba","lls","s","sssll"};
		
		palindromePairs(words);
	}

    public static List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> result = new ArrayList<>();
         
        Map<String, Integer> map = new HashMap<>();

        // store word -> index
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = 0; j <= word.length(); j++) {

                String prefix = word.substring(0, j);
                String suffix = word.substring(j);

                // Case 1: prefix palindrome
                if (isPalindrome(prefix)) {

                    String revSuffix = new StringBuilder(suffix).reverse().toString();

                    if (map.containsKey(revSuffix) && map.get(revSuffix) != i) {

                        result.add(Arrays.asList(map.get(revSuffix), i));
                    }
                }

                // Case 2: suffix palindrome
                try {
					if (suffix.length() != 0 && isPalindrome(suffix)) {

					    String revPrefix = new StringBuilder(prefix).reverse().toString();

					    if (map.containsKey(revPrefix) && map.get(revPrefix) != i) {

					        result.add(Arrays.asList(i, map.get(revPrefix)));
					    }
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }

        return result;
    }

    private static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}