package com.basic.java.programs.leetCode;

public class RotationMatrix {

	public static void main(String[] args) {

		RotationMatrix matrix = new RotationMatrix();

//		int mat[][] = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
//		int target[][] = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };

		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 9, 10 } };
		int target[][] = { { 0, 0 }, { 1, 0 }, };

		matrix.findRotation(mat, target);
	}

	public boolean findRotation(int[][] mat, int[][] target) {

		if (mat.length != target.length) {

			return false;
		}

		// Tranpose Matrix

		for (int i = 0; i < mat.length; i++) {

			for (int j = i; j < mat[0].length; j++) {

				int temp = mat[i][j];

				mat[i][j] = mat[j][i];

				mat[j][i] = temp;

			}
		}

//		 Reverse row

		for (int i = 0; i < mat.length; i++) {

			int left = 0;
			int right = mat.length - 1;

			while (left < right) {

				int temp = mat[i][left];

				mat[i][left] = mat[i][right];
				mat[i][right] = temp;

				left++;
				right--;
			}
		}

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] != target[i][j]) {
					return false;
				}
			}

		}

		return true;

	}
}
