package com.basic.java.programs.leetCode.binary;

public class ReverseBits {

	public static void main(String[] args) {

		ReverseBits bits = new ReverseBits();
		System.out.println(bits.reverseBits(43261596));

	}

	public int reverseBits(int n) {

		String binary = new StringBuilder().append(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'))
				.reverse().toString();

		return Integer.parseInt(binary, 2);

	}

}
