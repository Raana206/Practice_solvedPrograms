package com.basic.java.programs.leetCode.string;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {

	public static void main(String[] args) {

		System.out.println(maxNumberOfBalloons("balllllllllllloooooooooon"));

	}

	public static int maxNumberOfBalloons(String text) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : text.toCharArray()) {

			if ("balloon".indexOf(ch) != -1)

				map.put(ch, map.getOrDefault(ch, 0) + 1);

		}

//		int sum = map.values().stream().mapToInt(n -> n).sum();

		return Math.min(
                Math.min(map.getOrDefault('b', 0),
                         map.getOrDefault('a', 0)),
                Math.min(
                        Math.min(map.getOrDefault('l', 0) / 2,
                                 map.getOrDefault('o', 0) / 2),
                        map.getOrDefault('n', 0)
                )
        );
	}

}
