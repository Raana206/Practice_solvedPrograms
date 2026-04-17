package com.basic.java.programs.leetCode.arrays;

import java.util.Arrays;

public class MatrixSimilarityAfterCyclicShifts {

	public static void main(String[] args) {

		MatrixSimilarityAfterCyclicShifts shifts= new MatrixSimilarityAfterCyclicShifts();
		
		int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(shifts.areSimilar(mat, 3));
	}

	public boolean areSimilar(int[][] mat, int k) {

		int arr[][] = new int[mat.length][mat[0].length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				arr[i][j] = mat[i][j];
			}
		}

		k = k % mat[0].length; // why here we did module, this it depends on number of colums 

		while (k-- > 0) {

			for (int i = 0; i < arr.length; i++) {

				if (i % 2 == 0) {
					int left = arr[i][0];

					for (int j = 0; j < arr[0].length - 1; j++) {

						arr[i][j] = arr[i][j + 1];

					}
					arr[i][arr[0].length - 1] = left;

				} else {

					int right = arr[i][arr[0].length - 1];
					for (int j = arr[0].length - 1; j > 0; j--) {

						arr[i][j] = arr[i][j - 1];

					}
					arr[i][0] = right;
				}

			}

		}

		if (Arrays.deepEquals(mat, arr)) { // import method ,it compares the 2D Matrix of each row and row elements
			return true;
		}

		return false;
	}

}
