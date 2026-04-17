package com.basic.java.programs.leetCode.arrays;

public class FlipSquareSubmatrixVertically {

	public static void main(String[] args) {

		FlipSquareSubmatrixVertically f = new FlipSquareSubmatrixVertically();

//		{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}
//		{{3,4,2,3},{2,3,4,2}}
//		[[6,16,14],[1,2,19],[14,17,15],[18,7,6],[14,12,5]]
		int arr[][] = { { 6, 16, 14 }, { 1, 2, 19 }, { 14, 17, 15 }, { 18, 7, 6 }, { 14, 12, 5 } };
		System.out.println(f.reverseSubmatrix(arr, 2, 1, 2));

	}

	public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

		for (int i = 0; i < k / 2; i++) {

			for (int j = 0; j < k; j++) {

				int temp = grid[x + i][y + j];
				grid[x + i][y + j] = grid[x + k - 1 - i][y + j];
				grid[x + k - 1 - i][y + j] = temp;

			}

		}

		return grid;

	}
}
