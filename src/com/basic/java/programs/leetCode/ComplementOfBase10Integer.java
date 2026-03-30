package com.basic.java.programs.leetCode;

public class ComplementOfBase10Integer {

	public static void main(String[] args) {

		int n = 636;
		String s = "";
		while (n > 0) {

			int remainder = n % 2;

			if (remainder == 0) {
				s = 1 + s;
			} else {
				s = 0 + s;
			}

			n = n / 2;

		}
		System.out.println(s);

	}


}
