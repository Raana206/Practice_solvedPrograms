package com.basic.java.programs.leetCode.string;

public class FindKthBitNthBinaryString {

	public static void main(String[] args) {

		FindKthBitNthBinaryString binaryString = new FindKthBitNthBinaryString();
		System.out.println(binaryString.findKthBit(4, 11));
		System.out.println(binaryString.way2findKthBit(4, 11));
	}

	public char findKthBit(int n, int k) {

		String binary = "0";

		while (n > 1) {

			if (binary.length() >= k) {
				return binary.charAt(k - 1);
			}

			StringBuilder sb = new StringBuilder();
			sb.append(binary).append("1");

			for (int j = binary.length() - 1; j >= 0; j--) {

				sb.append((binary.charAt(j) == '1' ? '0' : '1'));

			}
			binary = sb.toString();

			n--;

		}

		return binary.charAt(k - 1);

	}

	public char way2findKthBit(int n, int k) {

		if (n == 1)
			return '0';

		int len = (1 << n) - 1;
		int mid = (len / 2) + 1;

		if (k == mid)
			return '1';

		if (k < mid) {
			return way2findKthBit(n - 1, k);
		} else {
			char ch = way2findKthBit(n - 1, len - k + 1);
			return ch == '0' ? '1' : '0';
		}
	}

}
