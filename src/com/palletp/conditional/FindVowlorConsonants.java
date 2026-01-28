package com.palletp.conditional;

import java.util.Scanner;

public class FindVowlorConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character :");
		char ch = sc.next().charAt(0);
		String str=FindCharacter.findChar(ch);
		System.out.println(str);
	}
}

class FindCharacter {

	public static String findChar(char ch) {

		if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				|| (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {

			return "This Character is Vowel:" + ch;
		} else {
			return "This Character is  Not Vowel:" + ch;
		}

	}
}