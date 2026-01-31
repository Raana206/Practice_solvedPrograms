package com.basic.java.programs;

public class ConditionalStatements {

	public static void main(String[] args) {

		SolvedPrograms programs = new SolvedPrograms();
		programs.secondLargest();
		programs.SecondLargestOfFour();
		programs.findTheLargestOfFour();

		programs.findTheSmallestNumber();
		programs.findTheSecondSmallestNumber();

	}
}

class SolvedPrograms {

	public void secondLargest() {

		int x = 20;
		int y = 40;
		int z = 30;

		if ((x > y && x < z) || (x < y && x > z)) {
			System.out.println(x);
		} else if ((y > x && y < z) || (y < x && y > z)) {
			System.out.println(y);
		} else {
			System.out.println(z);
		}

	}

	public void findTheSecondSmallestNumber() {

		int x = 10;
		int y = 10;
		int z = 5;
		int k = 15;

		int smallestNo = 0;
		if (x <= y && x <= z && x <= k) {
			smallestNo = x;
		} else if (y <= x && y <= z && y <= k) {
			smallestNo = y;
		} else if (z <= x && z <= y && z <= k) {

			smallestNo = z;
		} else {
			smallestNo = k;
		}

		int secondSmallestNo = 0;

		if (smallestNo == x) {
			secondSmallestNo = (y < z && y < k) ? y : ((z < k) ? z : k);
		} else if (smallestNo == y) {
			secondSmallestNo = (x < z && x < k) ? x : ((z < k) ? z : k);
		} else if (smallestNo == z) {
			secondSmallestNo = (x < y && x < k) ? x : ((y < k) ? y : k);
		} else {
			secondSmallestNo = k;
		}
		System.out.println("Second Smallest Number" + secondSmallestNo);
	}

	public void findTheSmallestNumber() {

		int x = 20;
		int y = 40;
		int z = 30;
		int k = 45;

		if (x < y && x < z && x < k) {
			System.out.println("SmallestOf" + x);
		} else if (y < x && y < z && y < k) {
			System.out.println("SmallestOf" + y);
		} else if (z < x && z < y && z < k) {

			System.out.println("SmallestOf" + z);
		} else {
			System.out.println("SmallestOf" + k);
		}

	}

	public void findTheLargestOfFour() {

		int x = 10;
		int y = 20;
		int z = 10;
		int k = 20;

		if (x > y && x > z && x > k) {
			System.out.println("LargestOf" + x);
		} else if (y > x && y > z && y > k) {
			System.out.println("LargestOf" + y);
		} else if (z > x && z > y && z > k) {
			System.out.println("LargestOf" + z);
		} else {
			System.out.println("LargestOf" + k);
		}
	}

	public void SecondLargestOfFour() {

		int x = 20;
		int y = 40;
		int z = 30;
		int k = 45;

		int largestNumber = 0;
		int secondLargsest = 0;

		if (x >= y && x >= z && x >= k) {
			largestNumber = x;
		} else if (y >= x && y >= z && y >= k) {

			largestNumber = y;
		} else if (z >= x && z >= y && z >= k) {
			largestNumber = z;
		} else {
			largestNumber = k;
		}

		if (largestNumber == x) {

			secondLargsest = ((y > z && y > k)) ? y : ((z > k) ? z : k);

		} else if (largestNumber == y) {

			secondLargsest = (x > z && x > k) ? x : ((z > k) ? z : k);
		} else if (largestNumber == z) {
			secondLargsest = (x > y && x > k) ? x : ((k > y) ? k : y);
		} else {
			secondLargsest = (x > z && x > z) ? x : ((y > z) ? y : z);
		}

		System.out.println(secondLargsest);

	}

}