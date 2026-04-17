package com.basic.java.programs.leetCode.string;

public class DeleteColumnsToMakeSorted {

	public static void main(String[] args) {

		DeleteColumnsToMakeSorted sorted = new DeleteColumnsToMakeSorted();

		String strs[] = { "rrjk", "furt", "guzm" };

		System.out.println(sorted.minDeletionSize(strs));
		System.out.println(sorted.way2minDeletionSize(strs));
	}

	public int minDeletionSize(String[] strs) {

		int r = strs.length;
		int cl = strs[0].length();

		char ch[][] = new char[r][cl];
		int column = 0;
		int index = 0;
		for (String word : strs) {

			char c[] = word.toCharArray();

			for (int j = 0; j < c.length; j++) {
				ch[index][j] = c[j];
			}
			index++;
		}

		for (int i = 0; i < cl; i++) {

			for (int j = 0; j < r - 1; j++) {

				if (ch[j][i] > ch[j + 1][i]) {
					column++;
					break;
				}
			}
		}
		return column;
	}

	public int way2minDeletionSize(String[] strs) { // chatGpt

		int rows = strs.length;
		int cols = strs[0].length();

		int count = 0;

		for (int col = 0; col < cols; col++) {

			for (int row = 0; row < rows - 1; row++) {

				if (strs[row].charAt(col) > strs[row + 1].charAt(col)) {
					count++;
					break;
				}
			}
		}

		return count;
	}

}
