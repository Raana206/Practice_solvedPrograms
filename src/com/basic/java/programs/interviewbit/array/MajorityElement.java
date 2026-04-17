package com.basic.java.programs.interviewbit.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {

		MajorityElement element = new MajorityElement();
		System.out.println(element.majorityElement(new int[] { 2, 1, 1 }));
	}

	public int majorityElement(final int[] A) {

		Map<Integer, Integer> counts = new HashMap<>();

		int n = A.length;

		for (int num : A) {
			counts.put(num, counts.getOrDefault(num, 0) + 1);

			if (counts.get(num) > n / 2) {
				return num;
			}
		}

		return -1;
	}

}
