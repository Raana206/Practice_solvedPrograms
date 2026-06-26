package com.basic.java.programs.leetCode.dateTime;

import java.util.StringJoiner;

public class ConvertDateToBinary {

	public static void main(String[] args) {

		System.out.println(convertDateToBinary("2080-02-29"));
		
		System.out.println(convertDateToBinary1("2080-02-29"));
	}
	
	
	public static String convertDateToBinary1(String date) { // I did this

        StringBuilder sb = new StringBuilder();

        String arr[] = date.split("-");

        for (int i = 0; i < arr.length; i++) {

            sb.append(Integer.toBinaryString(Integer.parseInt(arr[i])));
            if (i != arr.length - 1) {
                sb.append('-');
            }

        }

        return sb.toString();

    }

	public static String convertDateToBinary(String date) { // chatGPt suugest

		StringJoiner result = new StringJoiner("-");

		for (String part : date.split("-")) {
			result.add(Integer.toBinaryString(Integer.parseInt(part)));
		}

		return result.toString();
	}

}
