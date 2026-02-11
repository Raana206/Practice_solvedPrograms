package com.palletp.patterns;

import java.util.ArrayList;

public class Patterns {

	public static void main(String[] args) {

		BasicPattern basicPattern = new BasicPattern();

		basicPattern.SquarePattern();
		basicPattern.invertedRightTriangle();
		basicPattern.numberPattern();
		basicPattern.numberTriangle();
		basicPattern.pyramidPattern();
		basicPattern.invertedPyramid();
		basicPattern.diamondPattern();
		basicPattern.hollowSquarePattern();
		basicPattern.hollowPyramidPattern();
		basicPattern.floydsTriangle();
		basicPattern.butterflyPattern();//imp
		basicPattern.invertedNumberPyramid();
		basicPattern.alphabetTrianglePattern();
		basicPattern.hollowDiamondPattern();
		basicPattern.hourglassPattern();
		basicPattern.xPattern();//imp
		basicPattern.plusPattern();
		basicPattern.snakeNumberPattern();
		basicPattern.snakeNumberPatternOtherway2();//imp
		basicPattern.spiralPattern();// imp
		basicPattern.antiSpiralMatrix();

//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i + " ");
//			}
//
//			System.out.println();
//
//		}
	}
}

class BasicPattern {

	public void SquarePattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void invertedRightTriangle() {

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

	}

	public void numberPattern() {

		for (int i = 1; i <= 5; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println();

	}

	public void numberTriangle() {

		for (int i = 1; i <= 5; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();

	}

	public void pyramidPattern() {

		for (int i = 1; i <= 5; i++) {

			for (int k = 4; k >= i; k--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

	}

	public void invertedPyramid() {

		for (int i = 1; i <= 5; i++) {

			for (int k = 2; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

	}

	public void diamondPattern() {

		for (int i = 1; i <= 5; i++) {

			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {

			for (int k = 2; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

	}

	public void hollowSquarePattern() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				if (i == 1 || i == 5) {
					System.out.print("* ");

				} else if (j == 1 || j == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void hollowPyramidPattern() {

		for (int i = 1; i <= 5; i++) {

			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {

				if (j == 1 || j == i || i == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void floydsTriangle() {

		int k = 1;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++, k++) {
				System.out.print(k + " ");

			}
			System.out.println();
		}

		System.out.println();

	}

	public void butterflyPattern() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int s = 4; s >= i; s--) {
				System.out.print("    ");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 2; i <= 5; i++) { // why here i was took start index 2; remove if Condition

			for (int j = 5; j >= i; j--) {
//				if (i != 1)
					System.out.print("* ");
			}
			for (int s = 2; s <= i; s++) {
				System.out.print("    ");
			}
			for (int k = 5; k >= i; k--) {
				if (i != 1)
					System.out.print("* ");
			}
//			if (i != 1)
				System.out.println();
		}

	}

	public void invertedNumberPyramid() {

		for (int i = 1; i <= 5; i++) {
			int s = 1;
			for (int k = 2; k <= i; k++) {
				System.out.print("");
			}
			for (int j = 5; j >= i; j--, s++) {
				System.out.print(s + " ");
			}
			System.out.println();
		}

		System.out.println();

	}

	public void alphabetTrianglePattern() {

		for (int i = 1; i <= 5; i++) {
			char ch = 'E';

			for (int j = 1; j <= i; j++, ch--) {
				System.out.print(ch + " ");
			}

			System.out.println();
		}

		System.out.println();

	}

	public void hollowDiamondPattern() {

		for (int i = 1; i <= 5; i++) {

			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == i || j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			if (i != 1) {
				for (int k = 2; k <= i; k++) {
					System.out.print(" ");
				}
				for (int j = 5; j >= i; j--) {

					if (j == i || j == 5) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
		System.out.println();

	}

	public void hourglassPattern() {
		for (int i = 1; i <= 5; i++) {

			for (int k = 2; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {

				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			if (i != 1) {
				for (int k = 4; k >= i; k--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {

					System.out.print("* ");
				}

				System.out.println();
			}
		}
		System.out.println();

	}

	public void xPattern() { // imp

		int n = 5;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= n; j++) {

				if (i == j || (i + j) == n + 1) { // imp logic
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

	public void plusPattern() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 3) {
					System.out.print("*");
				} else if (j == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void snakeNumberPattern() {
		int k = 1;
		for (int i = 1; i <= 4; i++) {

			if (i % 2 != 0) {
				for (int j = 1; j <= 4; j++) {
					System.out.print(k + " ");
					k++;
				}
			} else {
				int arr[] = new int[4];
				for (int j = arr.length - 1; j >= 0; j--) {

					arr[j] = k;

					k++;
				}

				for (int s = 0; s < arr.length; s++) {
					System.out.print(arr[s] + " ");

				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void snakeNumberPatternOtherway2() { // imp
		int k = 1;
		int n = 4;
		for (int i = 1; i <= n; i++) {

			if (i % 2 != 0) {
				for (int j = 1; j <= n; j++) {
					System.out.print(k + " ");
					k++;
				}
			} else {

				int temp = k + n - 1;

				for (int j = 1; j <= n; j++) {

					System.out.print(temp + " ");

					temp--;
				}
				k = k + n;

			}
			System.out.println();
		}
		System.out.println();
	}

	public void spiralPattern() {

		int n = 4;

		int temp = 1;

		int left = 0;
		int right = n - 1;

		int top = 0;
		int bottom = n - 1;

		int arr[][] = new int[4][4];

		while (left <= right && top <= bottom) {

			// left -->right
			for (int i = left; i <= right; i++) {

				arr[top][i] = temp;
				temp++;
			}
			top++;

//			 top to Bottom
			for (int i = top; i <= bottom; i++) {

				arr[i][right] = temp;
				temp++;
			}

			right--;

//		    right -->left
			for (int i = right; i >= left; i--) {

				arr[bottom][i] = temp;
				temp++;
			}
			bottom--;

//			bottom -->top
			for (int i = bottom; i >= top; i--) {

				arr[i][left] = temp;
				temp++;
			}
			left++;
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void antiSpiralMatrix() {

		int n = 4;

		int temp = 1;

		int left = 0;
		int right = n - 1;

		int top = 0;
		int bottom = n - 1;

		int arr[][] = new int[4][4];

		ArrayList<Integer> list = new ArrayList<>();

		while (left <= right && top <= bottom) {

			// left -->right
			for (int i = left; i <= right; i++) {

				list.add(temp);
				temp++;

			}
			top++;

//			 top to Bottom
			for (int i = top; i <= bottom; i++) {

				list.add(temp);
				temp++;

			}

			right--;

//		    right -->left
			for (int i = right; i >= left; i--) {

				list.add(temp);
				temp++;

			}
			bottom--;

//			bottom -->top
			for (int i = bottom; i >= top; i--) {

				list.add(temp);
				temp++;
			}
			left++;
		}

		int index = list.size() - 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = list.get(index--);
			}
		}

		System.out.println("Anti Spiral");
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
