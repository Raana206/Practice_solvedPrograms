package com.basic.java.programs.leetCode.string;

/**
 *
 * 
 * You are given a string s consisting of lowercase English letters and the
 * special characters: *, #, and %.
 * 
 * Build a new string result by processing s according to the following rules
 * from left to right:
 * 
 * If the letter is a lowercase English letter append it to result. A '*'
 * removes the last character from result, if it exists. A '#' duplicates the
 * current result and appends it to itself. A '%' reverses the current result.
 * Return the final string result after processing all characters in s.
 * 
 * 
 * @author nadim
 *
 */

public class ProcessStringWithSpecialOperationsI {

	public static void main(String[] args) {

		System.out.println(processStr("a#b%*"));
		
		System.out.println(processStr1("a#b%*"));

		System.out.println(processStr3("a#b%*"));

	}

	public static String processStr(String s) {

		StringBuilder sb = new StringBuilder();

		for (char ch : s.toCharArray()) {

			if (Character.isLetter(ch)) {
				sb.append(ch);
			} else if (ch == '*' && !sb.isEmpty()) {
				sb.deleteCharAt(sb.toString().length() - 1); // delete() instead of deleteCharAt();
			} else if (ch == '#' && !sb.isEmpty()) {
				sb.append(sb.toString());
			} else if (ch == '%') {
				sb.reverse();
			}
		}

		return sb.toString();

	}
	
	
	public static String processStr1(String s) {
		
		StringBuilder sb= new StringBuilder();
		
		s.chars()
				.mapToObj(ch -> (char) ch)
				.forEach(ch -> {
				
					if (Character.isLetter(ch)) {
						sb.append(ch);
					} else if (ch == '*' && sb.length() != 0) {
						sb.deleteCharAt(sb.toString().length() - 1);
					} else if (ch == '#' && sb.length() != 0) {

						sb.append(sb.toString());
					} else if (ch == '%' && sb.length() != 0) {
					
						sb.reverse();
					}

				});
		
		
		
		return sb.toString();
	}
	
	
	
	public static String processStr3(String s) {

	    return s.chars()
	            .mapToObj(ch -> (char) ch)
	            .reduce(
	                    new StringBuilder(),
	                    (sb, ch) -> {

	                        if (Character.isLetter(ch)) {

	                            sb.append(ch);

	                        } else if (ch == '*') {

	                            if (sb.length() > 0) {
	                                sb.deleteCharAt(sb.length() - 1);
	                            }

	                        } else if (ch == '#') {

	                            sb.append(sb.toString());

	                        } else if (ch == '%') {

	                            sb.reverse();
	                        }

	                        return sb;
	                    },
	                    StringBuilder::append
	            )
	            .toString();
	}

}
