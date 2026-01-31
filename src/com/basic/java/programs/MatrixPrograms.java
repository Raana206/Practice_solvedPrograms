package com.basic.java.programs;

import java.util.Arrays;

public class MatrixPrograms {

	public static void main(String[] args) {

		program3 program3 = new program3();

		program3.additionOfTwoMatrix();
		program3.lowerTrianglerMatrix();
		program3.upperTrianglerMatrix();
		program3.identityMatrix();
		program3.sumOfRowAndCol();
		program3.checkleapYear();
	}
}

class program3 {

	public void additionOfTwoMatrix() {

		int matx1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int matx2[][] = { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } };

		if (matx1.length != matx2.length) {

			if (matx1[0].length != matx2[0].length) {
				System.out.println("Not PerForm Addition operation");
				return;
			}
		}

		int addMatx[][] = new int[matx1.length][matx1[0].length];

		for (int i = 0; i < matx1.length; i++) {
			for (int j = 0; j < matx1[i].length; j++) {

				addMatx[i][j] = matx1[i][j] + matx2[i][j];
			}
		}

		for (int i = 0; i < addMatx.length; i++) {

			for (int j = 0; j < addMatx[i].length; j++) {

				System.out.print(addMatx[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void lowerTrianglerMatrix() {

		int matx1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < matx1.length; i++) {

			for (int j = 0; j < matx1[i].length; j++) {

				if (j <= i) { 
					System.out.print(matx1[i][j] + " ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();

		}
		System.out.println(" ");
	}

	public void upperTrianglerMatrix() {

		int matx1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < matx1.length; i++) {

			for (int j = 0; j <matx1[i].length; j++) {

				if (j >= i) {
					System.out.print(matx1[i][j] + " ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();

		}
	}

	public void identityMatrix() {

		int matx1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < matx1.length; i++) {

			for (int j = 0; j <= matx1[0].length - 1; j++) {

				if (j == i) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

	public void sumOfRowAndCol() {

		int matx1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int row[] = new int[matx1.length];

		int col[] = new int[matx1[0].length];

		for (int i = 0; i < row.length; i++) {

			for (int j = 0; j < col.length; j++) {

				row[i] += matx1[i][j];
				col[j] += matx1[i][j];

			}

		}

		System.out.println(Arrays.toString(row));
		System.out.println(Arrays.toString(col));

	}

	public void checkleapYear() {

		int year = 2020;

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}

	}

}
