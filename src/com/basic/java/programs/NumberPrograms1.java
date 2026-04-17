package com.basic.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberPrograms1 {

	public static void main(String[] args) {

		Programs1 program = new Programs1();
		program.autoGraphicalNumber();
		program.emirpNumber();
		program.findSmallestOfThreeNumber();
		program.greatestCommonFactor();
		program.greatestCommonFactor1();
		program.swapOfTwoNumber();
		program.findSquareRoot();
		program.findPrimeNo();
		program.sphenicNumbers();

	}
}

class Programs1 {

	public String atmProgram() {

//		int withdraw;
//		int depositAmount;
//		int exit;

		Scanner sc = new Scanner(System.in);

		int options = sc.nextInt();

		System.out.println("1" + "-" + "Check Your Balance");
		System.out.println("2" + "-" + "Withdraw Your Amount");
		System.out.println("3" + "-" + "Diposit Your Amount");
		System.out.println("4" + "-" + "Exist");

		switch (options) {

		case 1:
			balanceEnquiry();
			break;
		case 2:

			withdraw();

			break;
		case 3:

			deposit();
			break;

		case 4:
			exit();

		default:
			break;
		}
		return "";

	}

	private void exit() {

	}

	private int balanceEnquiry() {

		return 0;

	}

	private int deposit() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Sir ," + " You want to Depost Amount lets Proced...");

		return 0;

	}

	private int withdraw() {

		return 0;

	}

	public void autoGraphicalNumber() {

		int number = 1234;

		int temp = number;

		int digitsCount = 0;

		while (temp > 0) {

			digitsCount++;

			temp /= 10;

		}
		int arr[] = new int[digitsCount];

		if (checkPattern(arr, number)) {
			System.out.println("AutoGraphicalNumber");
		} else {
			System.out.println("Not AutoGraphical Number");
		}

	}

	private boolean checkPattern(int[] arr, int number) {
		int index = arr.length - 1;

		while (number > 0) {

			arr[index--] = number % 10;
			number /= 10;

		}
		int fre[] = new int[10];
		for (int i = 0; i < arr.length; i++) {

			fre[arr[i]]++;
		}

		for (int i = 0; i < arr.length; i++) {

			if (fre[i] != arr[i])
				return false;

		}

		return true;
	}

	public boolean checkPrimeNumber(int number) {

		if (number <= 1) {
			return false;
		}

		int limit = (int) Math.sqrt(number);

		for (int i = 2; i <= limit; i++) {

			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}

	public void emirpNumber() {

		int number = 79;

		if (!checkPrimeNumber(number)) {
			System.out.println(" Not emirpNumber");
			return;
		}

		int temp = number;

		int reverse = 0;

		while (temp > 0) {

			int remainder = temp % 10;
			reverse = (reverse * 10) + remainder;

			temp /= 10;
		}

		if (number == reverse) {
			System.out.println("Not emirpNumber");
			return;
		}

		if (!checkPrimeNumber(reverse)) {
			System.out.println(" Not emirpNumber");
			return;
		}

		System.out.println("emirpNumber");

	}

	public void twinPrimeNumbers() {

		int a = 5;
		int b = 7;

		if (!checkPrimeNumber(a) || !checkPrimeNumber(b)) {
			System.out.println("Not Twin Prime Number");
			return;
		}

		int difference = a - b;
		if (Math.abs(difference) != 2) {
			System.out.println("Not Twin Prime Number");
			return;
		}
		System.out.println("Twin Prime Number");

	}

	public void findSmallestOfThreeNumber() {

		int no1 = 2;

		int no2 = 10;

		int no3 = 1;

		int c = (no1 < no2) ? ((no1 < no3) ? no1 : no3) : ((no2 < no3) ? no2 : no3);

		System.out.println(c);
	}

	public void greatestCommonFactor() {

		int a = 12;
		int b = 8;

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		System.out.println(a);
	}

	public void greatestCommonFactor1() {

		int number1 = 12;
		int number2 = 8;

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < number1; i++) {

			if (number1 % i == 0) {

				list.add(i);
			}
		}

		for (int i = 1; i < number2; i++) {

			if (number2 % i == 0) {
				list.add(i);
			}
		}

		ArrayList<Integer> macthedValue = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i) == list.get(j)) {
					macthedValue.add(list.get(i));
				}
			}
		}

		int hcf = Collections.max(macthedValue);
		System.out.println(hcf);

	}

	public void swapOfTwoNumber() {

		int a = 12;
		int b = 8;

		int temp = a;
		a = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);

		// with out using third variable
		b = a + b;
		a = b - a;
		b = b - a;
		System.out.println(a);
		System.out.println(b);

	}

	public void findSquareRoot() {

		int number = 25;

		int i = 1;
		while (i * i <= number) {

			if (i * i == number) {
				System.out.println(i);
				return;
			}
			i++;
		}
	}

	public void findPrimeNo() {

		for (int i = 1; i <= 40; i++) {
			if (i <= 1) {
				continue;
			}
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}

			}

			if (isPrime) {
				System.out.println(i);
			}
		}
	}

	public void sphenicNumbers() { // pending

//		 1.
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 2; i < 30; i++) {

			if (30 % i == 0) {
				list.add(i);
			}

			list.indexOf(list);
//
		}
	}
}
