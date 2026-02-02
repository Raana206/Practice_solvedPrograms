package com.palletp.stringAsgn;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size OF Array:");
		int arraySize = sc.nextInt();

		int nums[] = new int[arraySize];

		System.out.println("Enter Array Elements:");

		for (int i = 0; i < arraySize; i++) {

			nums[i] = sc.nextInt();
		}

		System.out.println("Enter Here TargetValue:");

		Set<Integer> list = new LinkedHashSet();

		int targetValue = sc.nextInt();

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				int tempValue = nums[i] + nums[j];

				if (tempValue == targetValue) {
					list.add(i);
					list.add(j);
					
				}
			}
		}

		if (list.size() == 0) {
			System.out.println(-1 + " ," + -1);

		} else {
			System.out.println(list);
		}

	}

}
