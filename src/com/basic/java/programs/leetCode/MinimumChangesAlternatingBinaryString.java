package com.basic.java.programs.leetCode;

public class MinimumChangesAlternatingBinaryString {

	public static void main(String[] args) {
		
		
		


//		MinimumChangesAlternatingBinaryString st = new MinimumChangesAlternatingBinaryString();
//
//		st.minOperations("10010100");
		
		
		int [][] mat= {{1,2,3},{5,5,6}};
		
		 int arr[][] = new int[mat.length][mat[0].length];
		 int i = 0;
	        for (int a[] : mat) {
	           
	            int j = 0;
	            for (int value : a) {
	                arr[i][j++] = value;

	            }
	            i++;
	        }
	}

	public int minOperations(String s) {

//		Compare with Pattern 1 (0101)
//		Index:   0 1 2 3
//		Actual:  1 1 0 0
//		Expect:  0 1 0 1

//		Compare with Pattern 2 (1010)
//		Index:   0 1 2 3
//		Actual:  1 1 0 0
//		Expect:  1 0 1 0
//		

		int count1 = 0;
		int count2 = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			int expected1 = (i % 2 == 0) ? '0' : '1';
			int expected2 = (i % 2 == 0) ? '1' : '0';

			if (ch[i] != expected1) {
				count1++;
			}
			if (ch[i] != expected2) {
				count2++;
			}

		}
		return Math.min(count1, count2);
	}
}
