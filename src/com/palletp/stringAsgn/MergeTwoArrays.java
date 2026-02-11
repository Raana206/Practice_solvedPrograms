package com.palletp.stringAsgn;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int firstArray[] = {2, 4, 6};

		int secondArray[] = {};

		int visited = Integer.MIN_VALUE;

		int merge[] = new int[firstArray.length + secondArray.length];

		int index = 0;

		for (int i = 0; i < firstArray.length; i++) {

			merge[index] = firstArray[i];
			index++;

		}

		for (int i = 0; i < secondArray.length; i++) {

			merge[index] = secondArray[i];
			index++;

		}

		int countLength = 0;

		for (int i = 0; i < merge.length; i++) {

			if (merge[i] != visited) {
				countLength++;
				for (int j = i + 1; j < merge.length; j++) {

					if (merge[i] == merge[j]) {

						merge[j] = visited;
					}
				}
			}

		}

		int thirdArray[] = new int[countLength];
		int size = 0;
		for (int i = 0; i < merge.length; i++) {
			if (merge[i] != visited) {
				thirdArray[size] = merge[i];
				size++;
			}
		}

		for (int i = 0; i < thirdArray.length; i++) {

			System.out.println(thirdArray[i]);
		}



	}

}
