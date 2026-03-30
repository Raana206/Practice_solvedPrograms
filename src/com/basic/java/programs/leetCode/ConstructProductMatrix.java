package com.basic.java.programs.leetCode;

import java.util.ArrayList;

public class ConstructProductMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 4, 3, 9 }, { 3, 9, 10 }, { 9, 7, 8 }, { 8, 4, 7 }, { 6, 1, 3 } };
		
		System.out.println(new ConstructProductMatrix().constructProductMatrix(arr));;
	}


	    public int[][] constructProductMatrix(int[][] grid) { // chatgpt

	        int n = grid.length;
	        int m = grid[0].length;
	        int mod = 12345;

	        int[][] result = new int[n][m];

	        int total = n * m;

	        int[] prefix = new int[total];
	        int[] suffix = new int[total];

	        // flatten index mapping
	        int[] arr = new int[total];
	        int idx = 0;

	        for (int[] row : grid) {
	            for (int val : row) {
	                arr[idx++] = val % mod;
	            }
	        }

	        // prefix
	        prefix[0] = arr[0];
	        for (int i = 1; i < total; i++) {
	            prefix[i] = (prefix[i - 1] * arr[i]) % mod;
	        }

	        // suffix
	        suffix[total - 1] = arr[total - 1];
	        for (int i = total - 2; i >= 0; i--) {
	            suffix[i] = (suffix[i + 1] * arr[i]) % mod;
	        }

	        // result
	        idx = 0;
	        for (int i = 0; i < total; i++) {

	            int left = (i == 0) ? 1 : prefix[i - 1];
	            int right = (i == total - 1) ? 1 : suffix[i + 1];

	            int val = (left * right) % mod;

	            result[idx / m][idx % m] = val;
	            idx++;
	        }

	        return result;
	    }
}

class Solution {   // i did this....
    public int[][] constructProductMatrix(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int mod = 12345;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                list.add(grid[i][j] % mod);
            }
        }

        ArrayList<Integer> productList = productOfElements(list, mod);

        return productMatrix(productList, n, m);

    }

    private ArrayList<Integer> productOfElements(ArrayList<Integer> productList, int mod) {

        ArrayList<Integer> products = new ArrayList<Integer>();
        for (int i = 0; i < productList.size(); i++) {
            int elementsOfproduct = 1;
            for (int j = 0; j < productList.size(); j++) {

                if (i != j) {

                    elementsOfproduct = (elementsOfproduct * productList.get(j)) % mod;

                }
            }

            products.add(elementsOfproduct);

        }

        return products;
    }

    private int[][] productMatrix(ArrayList<Integer> li, int n, int m) {

        int[][] p = new int[n][m];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                p[i][j] = li.get(index++);
            }
        }
        return p;
    }

}
	

