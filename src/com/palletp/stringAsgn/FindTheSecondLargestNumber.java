package com.palletp.stringAsgn;

public class FindTheSecondLargestNumber {

	public static void main(String[] args) {

		int x = Integer.MAX_VALUE;
		int y = 0;
		int z = -1;
		int k = Integer.MIN_VALUE;

		int largestNumber = 0;

		if (x >= y && x >= z && x >= k) {
			largestNumber = x;
		} else if (y >= x && y >= z && y >= k) {

			largestNumber = y;
		} else if (z >= x && z >= y && z >= k) {
			largestNumber = z;
		} else {
			largestNumber = k;
		}

		int secondLargsest = 0;

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
