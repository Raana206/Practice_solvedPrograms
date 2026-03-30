package com.basic.java.programs.leetCode;

import java.util.Arrays;

public class EqualSumGridPartitionII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EqualSumGridPartitionII tt = new EqualSumGridPartitionII();

		int arr[][] = { { 5, 5, 6, 2, 2, 2 } };

		tt.canPartitionGrid(arr);

	}

	public boolean canPartitionGrid(int[][] grid) {

		int m = grid.length, n = grid[0].length;

		long total = 0;
		for (int[] row : grid) {
			for (int val : row)
				total += val;
		}

		long sum = 0;

		// 🔹 Horizontal Cuts
		for (int i = 0; i < m - 1; i++) {

			for (int j = 0; j < n; j++) {
				sum += grid[i][j];
			}

			long top = sum;
			long bottom = total - sum;

			if (top == bottom)
				return true;

			long diff = Math.abs(top - bottom);

			if (top > bottom) {
				if (canRemove(grid, 0, i, 0, n - 1, diff))
					return true;
			} else {
				if (canRemove(grid, i + 1, m - 1, 0, n - 1, diff))
					return true;
			}
		}

		sum = 0;

		// 🔹 Vertical Cuts
		for (int j = 0; j < n - 1; j++) {

			for (int i = 0; i < m; i++) {
				sum += grid[i][j];
			}

			long left = sum;
			long right = total - sum;

			if (left == right)
				return true;

			long diff = Math.abs(left - right);

			if (left > right) {
				if (canRemove(grid, 0, m - 1, 0, j, diff))
					return true;
			} else {
				if (canRemove(grid, 0, m - 1, j + 1, n - 1, diff))
					return true;
			}
		}

		return false;
	}

	private boolean canRemove(int[][] grid, int r1, int r2, int c1, int c2, long diff) {

		int rows = r2 - r1 + 1;
		int cols = c2 - c1 + 1;

		// 🔴 Single row
		if (rows == 1) {
			for (int j = c1; j <= c2; j++) {
				if ((j == c1 || j == c2) && grid[r1][j] == diff)
					return true;
			}
			return false;
		}

		// 🔴 Single column
		if (cols == 1) {
			for (int i = r1; i <= r2; i++) {
				if ((i == r1 || i == r2) && grid[i][c1] == diff)
					return true;
			}
			return false;
		}

		// 🟢 General case → ANY cell allowed
		for (int i = r1; i <= r2; i++) {
			for (int j = c1; j <= c2; j++) {
				if (grid[i][j] == diff)
					return true;
			}
		}

		return false;
	}
}
