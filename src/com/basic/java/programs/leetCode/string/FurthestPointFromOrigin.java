package com.basic.java.programs.leetCode.string;


/** You are given a string moves of length n consisting only of characters 'L', 'R', and '_'. The string represents your movement on a number line starting from the origin 0.

In the ith move, you can choose one of the following directions:

move to the left if moves[i] = 'L' or moves[i] = '_'
move to the right if moves[i] = 'R' or moves[i] = '_'
Return the distance from the origin of the furthest point you can get to after n moves.
*/

public class FurthestPointFromOrigin {

	public static void main(String[] args) {

		System.out.println(furthestDistanceFromOrigin("L_RL__R"));
	}

	public static int furthestDistanceFromOrigin(String moves) {

		int lCount = 0;
		int rCount = 0;
		int underScoreCount = 0;

		for (int i = 0; i < moves.length(); i++) {

			if (moves.charAt(i) == 'L') {
				lCount++;
			} else if (moves.charAt(i) == 'R') {
				rCount++;
			} else {
				underScoreCount++;
			}

		}

		return Math.abs(lCount - rCount) + underScoreCount;

	}

}
