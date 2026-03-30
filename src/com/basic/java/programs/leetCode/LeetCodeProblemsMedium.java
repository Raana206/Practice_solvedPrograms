package com.basic.java.programs.leetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LeetCodeProblemsMedium {

	static int i = 0;

	static class A {
		public void d() {
			System.out.println(i);
		}
	}

	class B {

		static int n = 10;

		public static void f() {
//			C c= new C();
			class C {
				public void g() {
					System.out.println(90);
				}
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		int nums[] = { -100,-2,-3,1 };

		if (nums.length < 3) {
			System.out.println(0);
			return;
		}
		int maxProduct = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length - 2; i++) {

			int product = nums[i] * nums[i + 1];

			for (int j = i + 2; j < nums.length; j++) {

				if (product * nums[j] > maxProduct) {
					maxProduct = product * nums[j];

				}
			}

		}

		countAndSay();
		divisionMethod();
		maxArea();
	}

	public static void divisionMethod() {
		int count = 0;

		int dividend = -2147483648;

		int divisor = -1;
		boolean flag = true;

		if (dividend <= Integer.MIN_VALUE || divisor <= Integer.MIN_VALUE) {
			System.out.println(Integer.MIN_VALUE);
			return;
		}
		if (dividend >= Integer.MAX_VALUE || divisor >= Integer.MAX_VALUE) {
			System.out.println(Integer.MAX_VALUE);
			return;
		}

		if (dividend < 0 && divisor < 0) {
			divisor = -divisor;
			dividend = -dividend;

		}
		if (divisor < 0) {
			divisor = -divisor;
			flag = false;
		}

		if (dividend < 0) {
			dividend = -dividend;
			flag = false;
		}

		while (dividend >= divisor) {

			dividend = dividend - divisor;
			count++;

		}
		if (!flag) {
			System.out.println(count = -count);
		} else {
			System.out.println(count);
		}
	}

	public static void countAndSay() {

		int n = 4;
		String sequence = "";

		if (n == 0) {
			System.out.println(sequence);
			return;
		}
		int index = 1;
		String t = "1";
		while (index <= 4) {
			String digit = t;
			sequence += digit;
			for (int i = 0; i < digit.length(); i++) {
				int count = 1;
				for (int j = i + 1; j < digit.length(); j++) {

					if (digit.charAt(i) == digit.charAt(j)) {
						count++;

					} else {
						break;
					}
				}

				t = "" + count + digit.charAt(i);

			}
			index++;
		}
		System.out.println(sequence);
	}

	public static void maxArea() { // water Container

		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		int maxAreaOfWater = Integer.MIN_VALUE;

		int left = 0;
		int right = height.length - 1;

		while (left < right) {

			int width = right - left;

			int calHeight = Math.min(height[left], height[right]);

			int area = width * calHeight;

			maxAreaOfWater = Math.max(area, maxAreaOfWater);

			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}

		}

		System.out.println(maxAreaOfWater);

	}
}
