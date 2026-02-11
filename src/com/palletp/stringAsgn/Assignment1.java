package com.palletp.stringAsgn;

public class Assignment1 {

	public static void main(String[] args) {

		char ch[] = { 'a', 'g', 'v', 'o' };

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {
				System.out.println(ch[i]);
			}
		}

		int consume = 350;

		int bill = 0;

		int j = 1;

		while (j <= 3) {

			if (j == 1) {

				bill += 100 * 5;
				consume = consume - 100;

			} else if (j == 2) {

				bill += 100 * 7;
				consume = consume - 100;
			} else if (j == 3) {

				bill += 100 * 10;
				consume = consume - 100;
			} else {
				break;
			}
			j++;

		}

		bill += consume * 12;
		System.out.println(bill);

		int x = 10;
		int y = 30;
		int z = 40;
		int k = 35;

		int copyValue = 0;

		copyValue = (x > y) ? x : y;
		copyValue = (copyValue > z) ? copyValue : z;
//		copyValue=(copyValue>k)?copyValue

	}

}
