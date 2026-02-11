package com.palletp.stringAsgn;

public class MergeOfForwardAndBackWardArraysValues {

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.way2Solve();
		System.out.println();

		t1.way3Solve();

		System.out.println();

		int x[] = { 1, 2, 3, 4, 5 };
		int y[] = { 9, 8 };

		int z[] = new int[x.length + y.length];

		int j = 0;

		int k = y.length - 1;

		for (int i = 0; i < z.length; i++) {

			// take from x if:
			// 1) even index AND x still has elements
			// OR
			// 2) y is already exhausted

			if ((i % 2 == 0 && j < x.length) || k < 0) {

				z[i] = x[j++];

			} else {

				// take from y if:
				// 1) odd index AND y still has elements
				// OR
				// 2) x is already exhausted

				if ((k >= 0 && i % 2 != 0) || j >= x.length) {
					z[i] = y[k--];
				}
			}

		}

		for (int values : z) {
			System.out.print(values + " ");
		}

	}

}

class Test {

	public void way2Solve() {

		int x[] = { 1, 2, 3, 4, 5 };

		int y[] = { 9, 8 };

		int z[] = new int[x.length + y.length];

		int j = 0;

		int k = y.length - 1;

		int index = 0;

		boolean flag = true;

		while ((j < x.length || k >= 0) && index < z.length) {

			if (flag && j < x.length) {

				z[index++] = x[j++];
				flag = false;

			} else if (!flag && k >= 0) {

				z[index++] = y[k--];

				flag = true;
			} else if (j < x.length) {

				z[index++] = x[j++];

			} else if (k >= 0) {

				z[index++] = y[k--];
			}

		}

		for (int values : z) {
			System.out.print(values + " ");
		}

	}

	public void way3Solve() {

		int x[] = { 1, 2, 3, 4, 5 };

		int y[] = { 9, 8 };

		int z[] = new int[x.length + y.length];

		int j = 0;

		int k = y.length - 1;

		int index = 0;

		while (index < z.length) {

			if (j < x.length) {
				z[index++] = x[j++];
			}
			if (k >= 0 && index < z.length) {
				z[index++] = y[k--];
			}
		}

		for (int values : z) {
			System.out.print(values + " ");
		}

	}
}
