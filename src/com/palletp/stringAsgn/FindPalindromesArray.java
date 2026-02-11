package com.palletp.stringAsgn;

public class FindPalindromesArray {

	public static void main(String[] args) {

		int arr[] = { 121, 123, 321, 1221, 222, 1234 };

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 != 0) {

				int arrayValue = arr[i];
				int reverseValue = 0;
				int originalValue = arr[i];

				while (arrayValue > 0) {

					int remainder = arrayValue % 10;
					reverseValue = (reverseValue * 10) + remainder;
					arrayValue = arrayValue / 10;
				}

				if (originalValue == reverseValue) {
					System.out.println(reverseValue);
				}
			}
		}
	}
}
