package com.palletp.arrayloop;

import java.util.Arrays;

public class CopyElements {

	public static void main(String[] args) {

		int arr1[] = new int[10];

		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = (int)( Math.random() * 10);
		}

		int arr2[] = new int[arr1.length];

		for (int i = 0; i <arr2.length; i++) {

			arr2[i] = (int) (Math.random() * 10);

		}

		int arr3[] = new int[arr1.length];

		for (int i = 0; i < arr3.length; i++) {

			arr3[i] = arr1[i] + arr2[i];
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
