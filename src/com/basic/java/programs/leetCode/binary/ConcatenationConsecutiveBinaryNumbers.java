package com.basic.java.programs.leetCode.binary;

public class ConcatenationConsecutiveBinaryNumbers {

	public static void main(String[] args) {

		ConcatenationConsecutiveBinaryNumbers binaryNumbers = new ConcatenationConsecutiveBinaryNumbers();
		System.out.println(binaryNumbers.concatenatedBinary(12));
	}

	public int concatenatedBinary(int n) {

		int mod = (int) 1e9 + 7;

		long result = 0;

		for (int i = 1; i <= n; i++) {

			int bit = Integer.toBinaryString(i).length();

			result = ((result << bit) + i) % mod;
		}
		return (int) result;
	}

}
