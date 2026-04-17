package com.basic.java.programs.leetCode;

public class ComplementOfBase10Integer {

	public static void main(String[] args) {

		int n = 636;

		StringBuilder sb = new StringBuilder();
		while (n > 0) {

			int remainder = n % 2;

			if (remainder == 0) {
				sb.append(1);
			} else {
				sb.append(0);
			}

			n = n / 2;

		}

		System.out.println(sb.reverse().toString());

	}

}
