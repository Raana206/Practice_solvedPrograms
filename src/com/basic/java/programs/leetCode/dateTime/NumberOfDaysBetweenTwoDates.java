package com.basic.java.programs.leetCode.dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * Write a program to count the number of days between two dates.
 * 
 * The two dates are given as strings, their format is YYYY-MM-DD as shown in
 * the examples.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: date1 = "2019-06-29", date2 = "2019-06-30" Output: 1 Example 2:
 * 
 * Input: date1 = "2020-01-15", date2 = "2019-12-31" Output: 15
 * 
 * @author nadim
 *
 */

public class NumberOfDaysBetweenTwoDates {

	public static void main(String[] args) {

		System.out.println(daysBetweenDates("2019-06-29", "2019-06-30"));
	}

	public static int daysBetweenDates(String date1, String date2) {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);

		LocalDate d1 = LocalDate.parse(date1, format);

		LocalDate d2 = LocalDate.parse(date2, format);

		long daysBetween = ChronoUnit.DAYS.between(d1, d2);

		return (int) Math.abs(daysBetween);

	}

}
