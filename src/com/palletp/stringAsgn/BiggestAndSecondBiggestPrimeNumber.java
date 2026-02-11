package com.palletp.stringAsgn;

public class BiggestAndSecondBiggestPrimeNumber {

	public static void main(String[] args) {

		int arr[] = { 7, 7, 7, 5 };

		int biggestNumber = 0;
		int secondBiggestNumber = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= 1) {
				continue;
			}
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(arr[i]); j++) {

				if (arr[i] % j == 0) {

					flag = false;
					break;
				}

			}
			if (flag) {

				if (arr[i] > biggestNumber) {

					secondBiggestNumber = biggestNumber;

					biggestNumber = arr[i];

				} else if (arr[i] > secondBiggestNumber && arr[i] != biggestNumber) {

					secondBiggestNumber = arr[i];
				}

			}

		}

		if (biggestNumber == 0 && secondBiggestNumber == 0) {

			System.out.println("Not Found Prime Numbers");
			return;
		}
		if (biggestNumber == 0 || secondBiggestNumber == 0) {
			System.out.println("not enough Prime Numbers");
			return;
		}

		System.out.println(biggestNumber + "\n" + secondBiggestNumber);

	}

}
