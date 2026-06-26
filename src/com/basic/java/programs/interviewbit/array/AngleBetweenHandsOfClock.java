package com.basic.java.programs.interviewbit.array;


/**
 * Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.

Answers within 10-5 of the actual value will be accepted as correct.

 
 * @author nadim
 *
 */
public class AngleBetweenHandsOfClock {

	public static void main(String[] args) {
		System.out.println(angleClock(4, 50));

	}

	public static double angleClock(int hour, int minutes) {

//	       LocalTime t=LocalTime.of(hour, minutes);

		double actualAngle = Math.abs(30 * (hour) - 5.5 * (minutes));

		return Math.min(actualAngle, 360 - actualAngle);
	}

}
