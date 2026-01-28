package com.basic.java.programs;

import java.util.ArrayList;
import java.util.Arrays;

public class StringPrograms {

	public static void main(String[] args) {

		Program4 program4 = new Program4();

		program4.nEqualParts();
		program4.subSetOfStrings();
//		program1.findAllThePermutations();
		program4.lowerToUpper();
		program4.MaxAndMinOccurence();
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

				list.add(list.get(j) + (currentChar - '0')); // here we are applying asccii concept .because my String is Integer
																// String .
			}
		}

		for (String values : list) {

			System.out.println(values);
		}
	}

//	public void findAllThePermutations() {
//
//		String str = "1234";
//
//		char ch[] = str.toCharArray();
//
//		for (int i = 0; i < ch.length; i++) {
//			for (int j = 0; i < ch.length; j++) {
//				for (int k = 0; k < ch.length; k++) {
//					for (int l = 0; i < ch.length; l++) {
//
//						if (i != j && i != k && i != l && j != k && j != l && k != l) {
//
//							System.out.println(" " + ch[i] + ch[j] + ch[k] + ch[l]);
//						}
//					}
//				}
//			}
//		}
//
//	}

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

	public void MaxAndMinOccurence() {

		String str = "grass is greener on the other side";
		
		str=str.trim();

		char copy[]=str.toCharArray();
		
		StringBuilder sb= new StringBuilder();
		
		for(char c:copy) {
			if(c!=' ') {
				sb.append(c);
			}
		}
		
		String s=sb.toString();

	char c[]=s.toCharArray();
		int arr[] = new int[c.length];

//		Arrays.sort(copy);

		char visited = '\0';

		for (int i = 0; i < c.length; i++) {
			if (c[i] != visited) {

				int index = 0;

				for (int j = i + 1; j < c.length; j++) {

					if (c[i] == c[j]) {

						c[j] = visited;
						index++;

					}
				}

				arr[i] = index;

			}

		}

		int max = arr[0];
		int min = arr[0];
		char maxChar = ' ';
		char minChar = ' ';
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > 0) {
				if (max < arr[i]) {
					max = arr[i];
					maxChar = c[i];
				}
				if (min > arr[i] && arr[i]!=0) {

					min = arr[i];
					minChar = c[i];
				}
			}
		}

		System.out.println("MaxChar"+"-"+maxChar + " " + minChar);
	}

}
