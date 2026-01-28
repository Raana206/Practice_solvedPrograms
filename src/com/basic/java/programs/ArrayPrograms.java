package com.basic.java.programs;

import java.util.Arrays;

public class ArrayPrograms {

	public static void main(String[] args) {
		Programs2 p = new Programs2();
		p.leftRotateOfArray();
		p.rightRotationOfArray();
		p.sortOfDescArray();

	}
}

class Programs2 {

	public void leftRotateOfArray() {

		int arr[] = { 1, 2, 3, 4, 5 };
		int rotation = 3; // No of Positions Shifted
		while (rotation > 0) {

			
			int pos = arr[0];
			for ( int i = 0; i < arr.length - 1; i++) {

				arr[i] = arr[i + 1];
			}
			arr[arr.length-1] = pos;
			rotation--;
		}

		System.out.println(Arrays.toString(arr));
	}

	public void rightRotationOfArray() {

		int arr[] = { 1, 2, 3, 4, 5 };

		int rotation = 3;

		while (rotation > 0) {

			
			int pos = arr[arr.length - 1];

			for (int i = arr.length - 1; i > 0; i--) {

				arr[i] = arr[i - 1];

			}
			arr[0] = pos;
			rotation--;
		}

		System.out.println(Arrays.toString(arr));

	}

	public void sortOfDescArray() {

		int arr[] = { 4, 5, 2, 6, 1, 10, 3 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
