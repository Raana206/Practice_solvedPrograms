package com.basic.java.programs.leetCode.arrays;

import java.util.Arrays;

public class SetMatrixZeroes {

	public static void main(String[] args) {

		SetMatrixZeroes matrixZeroes = new SetMatrixZeroes();
		matrixZeroes.setZeroes(new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } });
		matrixZeroes.way2setZeroes(new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } });
	}

	public void setZeroes(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;

		int arr[][] = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j]=matrix[i][j];
			}
		}
   
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					setZeroMatrix(arr, i, j);
				}
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j]=arr[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(matrix));
	}

	private int[][] setZeroMatrix(int[][] arr,int row, int col) {

		int m = arr.length;
		int n = arr[0].length;

		for (int i = 0; i < n; i++) {

			arr[row][i] = 0;
			if (i < m)
				arr[i][col] = 0;
		}

		return arr;
	}
	

	public void way2setZeroes(int[][] matrix) { //chatGpt suggested 
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Step 1: Identify which rows and columns need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 2: Actually update the original matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        System.out.println(Arrays.deepToString(matrix));
	}
}
