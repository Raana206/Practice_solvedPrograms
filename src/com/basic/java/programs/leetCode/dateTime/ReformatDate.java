package com.basic.java.programs.leetCode.dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ReformatDate {

	public static void main(String[] args) {

		System.out.println(reformatDate("20th Oct 2052"));
	}

	public static String reformatDate(String date) {

		date = date.replaceAll("(\\d+)(st|nd|rd|th)", "$1"); // vvvvimportant

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);

		String d = LocalDate.parse(date, format).toString();

		return d;
	}

}
