package com.basic.java.programs.leetCode.binary;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String binary = Integer.toBinaryString(2); // this method converts the decimal number to binary Number. eg 2-->
													// 1 0
		System.out.println(binary);

		BinaryGap binaryGap = new BinaryGap();
		System.out.println(binaryGap.binaryGap(22));
		System.out.println(binaryGap.way2binaryGap(22));
	}

	public int binaryGap(int n) {

//		“Maximum distance between consecutive set bits (1s) in the binary representation of a number.”

		char ch[] = new StringBuilder().append(Integer.toBinaryString(n)).toString().toCharArray();

		int max = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '1')
				continue;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] == '1') {

					max = Math.max(j - i, max);

					break;
				}
			}

		}
		return max;
	}

	public int way2binaryGap(int n) { // chatGpt

		int max = 0;
		int prev = -1;
		int index = 0;

		while (n > 0) {

			if ((n & 1) == 1) { // check last bit
				if (prev != -1) {
					max = Math.max(max, index - prev);
				}
				prev = index;
			}

			n = n >> 1; // right shift
			index++;
		}

		return max;
	}

}
