package com.palletp.patterns;

public class Level4NumberAndPatterns {

	public static void main(String[] args) {

		TestPattern level4 = new TestPattern();
		level4.hourglassNumberPattern();
		level4.xPattern();
		level4.spiralNumberBorder();
		level4.zigZagWave();
	}

}

class TestPattern {

	public void hourglassNumberPattern() {

		int n = 7;

		int mid = n / 2;

//		 upper Half
		for (int i = 0; i <= mid; i++) {

			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}

			for (int j = i + 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();

		}

//		lowerHalf

		for (int i = mid - 1; i >= 0; i--) {

			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}
			for (int j = i + 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

	public void xPattern() {

		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j == i || (i + j) == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public void spiralNumberBorder() {

		int n = 7;

		int left = 0;
		int right = n - 1;
		int top = 0;
		int bottom = n - 1;

		char max[][] = new char[n][n];
		char index = 'A';

		while (left <= right && top <= bottom) {

			for (int i = left; i <= right; i++) {
				max[top][i] = index;

			}
			top++;

			for (int i = top; i <= bottom; i++) {

				max[i][right] = index;

			}
			right--;

			for (int i = right; i >= left; i--) {
				max[bottom][i] = index;

			}
			bottom--;

			for (int i = bottom; i >= top; i--) {
				max[i][left] = index;

			}
			left++;
			index++;

		}

		for (int i = 0; i < max.length; i++) {
			for (int j = 0; j < max[i].length; j++) {
				System.out.print(max[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void zigZagWave() {

		int n = 4;
		int num = 1;

		for (int i = 0; i < n; i++) {

			if (i % 2 != 0) {

				System.out.print(" ");
			}
			int iValue = num;

			for (int j = num; j <= 10; j += 4) {

				System.out.print(iValue + " ");
				iValue += 4;
			}
			System.out.println();
			num++;
		}

	}
}
