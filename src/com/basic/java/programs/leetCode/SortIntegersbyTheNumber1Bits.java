package com.basic.java.programs.leetCode;

public class SortIntegersbyTheNumber1Bits {

	public static void main(String[] args) {
		
		SortIntegersbyTheNumber1Bits bits= new SortIntegersbyTheNumber1Bits();
		 bits.sortByBits(new int []{0,1,2,3,4,5,6,7,8});

	}
	
	public int[] sortByBits(int[] arr) {

        int bits[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int n = arr[i];
            while (n > 0) {
                sum += n % 2;
                n = n / 2;
            }
            bits[i] = sum;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (bits[i] > bits[j] || (bits[i] == bits[j] && arr[i] > arr[j])) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    int t = bits[i];
                    bits[i] = bits[j];
                    bits[j] = t;

                }

            }
            
        }
        return arr;
    }

}
