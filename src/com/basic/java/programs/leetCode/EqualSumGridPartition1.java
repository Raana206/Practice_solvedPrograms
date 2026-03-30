package com.basic.java.programs.leetCode;

public class EqualSumGridPartition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
	class Tolution {
	    public boolean canPartitionGrid(int[][] grid) {

	        int m = grid.length;
	        int n = grid[0].length;

	        long total = 0;

	     
	        for (int[] row : grid) {
	            for (int val : row) {
	                total += val;
	            }
	        }

	        // if odd → impossible
	        if (total % 2 != 0) return false;

	        long sum = 0;

	        // horizontal cuts
	        for (int i = 0; i < m - 1; i++) {
	            for (int j = 0; j < n; j++) {
	                sum += grid[i][j];
	            }
	            if (sum * 2 == total) return true;
	        }

	        // vertical cuts
	        sum = 0;
	        for (int j = 0; j < n - 1; j++) {
	            for (int i = 0; i < m; i++) {
	                sum += grid[i][j];
	            }
	            if (sum * 2 == total) return true;
	        }

	        return false;
	    }
	}
	

