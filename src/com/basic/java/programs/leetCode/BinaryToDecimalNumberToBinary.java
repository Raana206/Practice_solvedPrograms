package com.basic.java.programs.leetCode;

import com.basic.java.programs.leetCode.arrays.MinimumDistanceBetweenThreeEqualElementsI;

public class BinaryToDecimalNumberToBinary {

	public static void main(String[] args) {

		BinaryToDecimalNumberToBinary binary = new BinaryToDecimalNumberToBinary();
		String a = "11";
		String b = "1";
		System.out.println(binary.addBinary(a, b));

		A ab = new A();

		ab.display();

	}

	public String addBinary(String a, String b) {

		StringBuilder sb = new StringBuilder();

		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;

		while (i >= 0 || j >= 0 || carry == 1) {

			int sum = carry;

			if (i >= 0)
				sum += a.charAt(i--) - '0';
			if (j >= 0)
				sum += b.charAt(j--) - '0';

			sb.append(sum % 2);
			carry = sum / 2;
		}

		return sb.reverse().toString();
	}

}

class A extends MinimumDistanceBetweenThreeEqualElementsI {

	public void display() {
		System.out.println(dis);
	}
}
