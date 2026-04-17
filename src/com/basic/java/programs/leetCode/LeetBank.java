package com.basic.java.programs.leetCode;

public class LeetBank {

	public static void main(String[] args) {

		LeetBank t = new LeetBank();
		System.out.println(t.totalMoney(175));
	}

	public int totalMoney(int n) {

		int currentDeposit = 1;
		int day = 1;
		int total = 0;

		int weekStart = 1;
		
		while (day <= n) {

			total += currentDeposit++;
			if (day % 7 == 0) {

				currentDeposit = ++weekStart;

			}

			++day;

		}
		return total;

	}
}
