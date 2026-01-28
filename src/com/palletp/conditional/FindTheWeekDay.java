package com.palletp.conditional;

import java.util.Scanner;

public class FindTheWeekDay {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day ");
		int day = sc.nextInt();
		FindTheDayOfWeek dayOfWeek = new FindTheDayOfWeek();
		String weekDay = dayOfWeek.getDayOfWeek(day);
		System.out.println(weekDay);
		
		int s=(10>20)?((10>30)?10:30):((20>30)?20:30);
		System.out.println(s);
		
		sc.close();
	}
}

class FindTheDayOfWeek {

	public String getDayOfWeek(int day) {

		String dayName = new String();
		switch (day) {

		case 1:
			dayName = "Monday";
			break;

		case 2:
			dayName = "Tuesday";
			break;

		case 3:
			dayName = "Wednesday";
			break;

		case 4:
			dayName = "Thursday";
			break;

		case 5:
			dayName = "Friday";
			break;

		case 6:
			dayName = "Satursday";
			//break;

		case 7:
			dayName = "Sunday";
			//break;

		default:
			dayName = "Not Satishfied";
			//break;
		}
		return dayName;
	}
}
