package com.basic.java.programs;

import java.util.Random;

public class NumberPrograms {

	public static void main(String[] args) {

		Programs programs = new Programs();

		programs.fibonacciSeries();
		programs.primeNumber();
		programs.palindrome();
//		programs.factorial();
		programs.amstrongNumber();
		programs.randomNumbers();
		programs.printAsciiValue();
		programs.reverseNumber();
		programs.numberToWord();
		programs.automorphicNumber();
		programs.duckNumber();
		programs.petersonNumber();
//		programs.perfectSquare();
		programs.sunnyNumber();
		programs.techNumber();
		programs.fascinatingNumber();
		programs.findDuplicateNumber();
		programs.frequencyOfNumbers();
		programs.keithNumber();
		programs.neonNumber();
		programs.spyNumber();

	}

}

class Programs {

	public void fibonacciSeries() {

		int f1 = 0;
		int f2 = 1;

		System.out.println(f1);
		System.out.println(f2);

		for (int i = 1; i <= 5; i++) {

			int f3 = f1 + f2;

			System.out.println(f3);
			f1 = f2;
			f2 = f3;
		}
	}

	public void primeNumber() {
		System.out.println(Math.sqrt(5));

		for (int i = 2; i <= 10; i++) {

			boolean isPrime = true;

//			 i/2= instead of we use  Math.Sq
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

	public void palindrome() {

		int no = 1221;

		int temp = 0;

		int originalNo = no;

		while (no > 0) {

			int rem = no % 10;
			temp = (temp * 10) + rem;
			no = no / 10;
		}

		if (temp == originalNo) {
			System.out.println("Palindrome");
		} else {
			System.out.println(" Not Palindrome");
		}
	}

	public int factorial(int no) { // this code i was used in peterson

		int fact = 1;

		while (no > 0) {

			fact = fact * no;
			no--;
		}

//		System.out.println(fact);
		return fact;
	}

	public void amstrongNumber() {

		int no = 153;

		int temp = 0;

		int originalNo = no;

		while (no > 0) {

			int rem = no % 10;
			temp = temp + (rem * rem * rem);
			no = no / 10;
		}

		if (temp == originalNo) {
			System.out.println("ArmstrongNumber");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}

	public void randomNumbers() {

		int max = 6;
		int opt = (int) (Math.random() * max) + 1;
		System.out.println(opt);

//		 another way 
		Random r = new Random();

		int otp = r.nextInt(6) + 1;
		System.out.println(otp);
	}

	public void printAsciiValue() {

		char ch = 'A';
		char ch2 = 'B';

		int aValue1 = ch;
		int aValue2 = ch2;

		System.out.println(aValue1);
		System.out.println(aValue2);
		for (int i = 65; i < 91; i++) {
			System.out.println((char) i);
		}
	}

	public void reverseNumber() {

		int no = 123456;

		int reverseNo = 0;
		while (no > 0) {
			int remainder = no % 10;
			reverseNo = (reverseNo * 10) + remainder;
			no /= 10;

		}
		System.out.println(reverseNo);

	}

	public void numberToWord() {

		int number = 95000;

		String ones[] = { " ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

		String tens[] = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		String words = "";

		if (number >= 10000) {

			words += tens[number / 10000] + " ";
			number = number % 10000;
		}
		if (number >= 1000) {

			words += ones[number / 1000] + " Thousand ";

			number = number % 1000;
		}

		if (number >= 100) {

			words += ones[number / 100] + " Hundred ";
			number = number % 100;
		}

		if (number >= 20) {
			words += tens[number / 10] + " ";
			number = number % 10;

		}

		if (number > 0) {
			words += ones[number] + " ";

		}
		words = words.trim();
		System.out.println(words + " ruppees");

	}

	public void automorphicNumber() {

		int number = 25;

		int sq = (int) Math.pow(number, 2);

		boolean flag = true;

		int temp = number;
		while (temp > 0) {

			if (temp % 10 != sq % 10) {

				flag = false;
				break;
			}
			temp /= 10;
			sq /= 10;
		}

		if (flag) {
			System.out.println("AutoMorphic Number");
		} else {
			System.out.println(" Not AutoMorphic Number");
		}

	}

	public void duckNumber() { // PENDING

		int number = 3210;

	}

	public void petersonNumber() {

		int number = 145;

		int sumOfFactorial = 0;

		int originalNo = number;

		while (number > 0) {

			int remainder = number % 10;

			sumOfFactorial += factorial(remainder);

			number = number / 10;

		}

		if (sumOfFactorial == originalNo) {

			System.out.println("PetersonNumber");
		} else {
			System.out.println("Not Peterson Number");
		}

	}

	public boolean perfectSquare(int number) {

//		int number = 8;

		boolean isPerfectSquare = false;

		for (int i = 1; i * i <= number; i++) {

			if (i * i == number) {
				isPerfectSquare = true;
				break;
			}

		}

		if (isPerfectSquare) {
//			System.out.println("Perfect Square");
			return isPerfectSquare;
		} else {
			System.out.println("Not PerfectSquare");
			return isPerfectSquare;
		}

//		int square= (int)Math.sqrt(8);   //  using the predefined Method 
//		
//		if(square*square==number) {
//			System.out.println("Perfect Sqaure");
//		}else {
//			System.out.println("Not Perfect Square");
//		}
//		

	}

	public void sunnyNumber() {

//		Note

		/*
		 * A number is called a sunny number if the number next to the given number is a
		 * perfect square. In other words, a number N will be a sunny number if N+1 is a
		 * perfect square.
		 */

//		670
		int number = 670;

		int afterAddingOne = number + 1;

		boolean flag = perfectSquare(afterAddingOne);

		if (flag) {
			System.out.println("Sunny Number");
		} else {
			System.out.println("Not Sunny Number");
		}

	}

	public void techNumber() {

		/*
		 * A number is called a tech number if the given number has an even number of
		 * digits and the number can be divided exactly into two parts from the middle.
		 * After equally dividing the number, sum up the numbers and find the square of
		 * the sum. If we get the number itself as square, the given number is a tech
		 * number, else, not a tech number. For example, 3025 is a tech number
		 */

		int number = 1312;
		int temp = number;
		int digitCount = 0;

		while (temp > 0) {

			digitCount++;

			temp = temp / 10;

		}
//		System.out.println(digitCount);

		if (digitCount % 2 != 0) {

			System.out.println("Not TechNumber");
			return;
		}

		int divisor = 1;

		for (int i = 1; i <= digitCount / 2; i++) {

			divisor *= 10;
		}
//		System.out.println(divisor);

		int firstPart = number / divisor;

//		System.out.println(firstPart);

		int secondPart = number % divisor;

//		System.out.println(secondPart);

		int sumOfParts = firstPart + secondPart;

//		System.out.println(combinedNumber);

		int squareOfParts = (int) Math.pow(sumOfParts, 2);

		if (squareOfParts == number) {

			System.out.println("TechNumber");
		} else {
			System.out.println("Not Tech Number");
		}

	}

	public void fascinatingNumber() {

		int number = 327;

		if (number < 100) {
			System.out.println("Not facinatingNumber");
			return;
		}

		int multipleOfTwo = number * 2;

		int multipleOfThree = number * 3;

		StringBuilder sb = new StringBuilder();
		sb.append(number).append(multipleOfTwo).append(multipleOfThree);

		String conversionOfNumbers = sb.toString();
		System.out.println(conversionOfNumbers);

		if (conversionOfNumbers.length() != 9) {
			System.out.println("Not Facinating Number");
			return;
		}

		boolean visited[] = new boolean[10];

		for (char ch : conversionOfNumbers.toCharArray()) {

			if (ch == '0' || visited[ch - '0']) {
				System.out.println("Not Facinating Number");
				return;
			}
			visited[ch - '0'] = true;

		}
		System.out.println("Facinating Number");

	}

	public void findDuplicateNumber() { // advanced logic

		int number = 123432;

		String str = String.valueOf(number);

		StringBuilder sb1 = new StringBuilder();

		boolean visited[] = new boolean[10];

		for (char ch : str.toCharArray()) {

			if (visited[ch - '0']) {

				sb1.append(ch - '0');

			}
			visited[ch - '0'] = true;

		}
		System.out.println(sb1.toString());

	}

	public void frequencyOfNumbers() {

		int numbers = 123425431;

		String numberToString = String.valueOf(numbers);

		int freq[] = new int[10];

		for (char ch : numberToString.toCharArray()) { // counting frequency Of Numbers

			int digit = ch - '0';

			freq[digit]++;
		}

		for (int i = 0; i < freq.length; i++) { // printed frequency Count

			if (freq[i] > 0) {
				System.out.println(i + "-->" + freq[i]);
			}
		}

	}

	public void keithNumber() {

		/*
		 * A Keith Number is a special number that follows a Fibonacci-like pattern
		 * using its own digits.
		 */

		/*
		 * Take a number with n digits.
		 * 
		 * Use those n digits as the starting sequence.
		 * 
		 * Add the last n numbers to generate the next number.
		 * 
		 * Continue this process until:
		 * 
		 * the generated number becomes equal to the original number → ✅ Keith Number
		 * 
		 * or the generated number becomes greater than the original number → ❌ Not a
		 * Keith Number
		 * 
		 */
		int number = 197;

		int temp = number;

		int digitCount = 0;

		while (temp > 0) { // here i did count digits

			digitCount++;
			temp /= 10;

		}

		if (digitCount < 2) { // here i did check digitsCount
			System.out.println("Not KeithNumber");
			return;
		}

		int temp1 = number;

		int arr[] = new int[digitCount];
		int index = arr.length - 1;

		while (temp1 > 0) { // here i did digits store in Array

			arr[index] = temp1 % 10;
			temp1 /= 10;
			index--;
		}

		int result = 0;
		while (result < number) { // here i'am doing to perform fabbinocci
			result = 0;
			for (int var : arr) {
				result += var;
			}

			for (int i = 0; i < arr.length - 1; i++) {

				arr[i] = arr[i + 1];

			}

			arr[arr.length - 1] = result;

		}

		if (result == number) {
			System.out.println("Keith Number");
		} else {
			System.out.println("Not Keith Number");
		}

	}

	public void neonNumber() {

		/*
		 * A positive integer whose sum of digits of its square is equal to the number
		 * itself is called a neon number.
		 * 
		 * 
		 */

		int number = 9;

		int squareNo = number * number;

		int sumOfDigits = 0;

		if (number == 0) {
			System.out.println("NOt Neon Number");
			return;
		}

		int temp = squareNo;
		while (squareNo > 0) {

			sumOfDigits += temp % 10;
			temp /= 10;
		}

		if (sumOfDigits == number) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not Neon Number");
		}
	}

	public void spyNumber() {

		/*
		 * A positive integer is called a spy number if the sum and product of its
		 * digits are equal. In other words, a number whose sum and product of all
		 * digits are equal is called a spy number.
		 */

		int number = 1124;

		int temp = number;

		int digitsCount = 0;

		while (temp > 0) {

			digitsCount++;

			temp /= 10;

		}

		int temp1 = number;
		int arr[] = new int[digitsCount];

		int index = arr.length - 1;
		while (temp1 > 0) {

			arr[index--] = temp1 % 10;
			temp1 /= 10;
		}

		int sumOfDigits = 0;

		int productOfDigits = 1;

		for (int i = 0; i < arr.length; i++) {

			sumOfDigits += arr[i];
			productOfDigits *= arr[i];
		}

		// another way of doing with out for loop

		/*
		 * int sumofDigit=0; int productOfDigit=1;
		 * 
		 * while(temp>0) {
		 * 
		 * int digit=temp%10;
		 * 
		 * sumofDigit+=digit; productOfDigit*=digit; temp/=10;
		 * 
		 * }
		 */

		if (sumOfDigits == productOfDigits) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not Spy Number");
		}

	}

}
