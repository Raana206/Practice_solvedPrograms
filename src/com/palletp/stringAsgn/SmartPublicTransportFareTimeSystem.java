package com.palletp.stringAsgn;

import java.util.Scanner;

public class SMARTPUBLICTRANSPORTFARETIMESYSTEM {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Total Travel Distance:");

		int distance = scanner.nextInt();

		if (distance <= 0) {
			System.out.println("Total Travel distance not zero .please verify ");
			return;
		}

		System.out.println("Enter Type of Transport passenger choose:");

		int transportType = scanner.nextInt();

		if (!(transportType >= 1) && (!(transportType <= 3))) {

			System.out.println(" Type Of Transport doesn't .Please Verify");
			return;
		}

		String transportVehicle = null;
		int ratePerKm = 0;
		int speed = 0;

		switch (transportType) {

		case 1:
			transportVehicle = "Bus";
			ratePerKm = 2;
			speed = 30;
			break;
		case 2:
			transportVehicle = "Metro";
			ratePerKm = 4;
			speed = 45;
			break;
		case 3:
			transportVehicle = "Taxi";
			ratePerKm = 10;
			speed = 40;
			break;

		}

		System.out.println("Enter Time Of Travel:");

		int travelTime = scanner.nextInt();

		if (!(travelTime >= 1) && (!(travelTime >= 2))) {

			System.out.println("Please Cross Check Time Of Travel!");
			return;
		}

		String travelHours = null;

		switch (travelTime) {

		case 1:
			travelHours = "PeakHours";
			break;
		case 2:
			travelHours = "NonPeakHours";
			break;

		}

		System.out.println("Enter  Passenger Age");

		int passengerAge = scanner.nextInt();

		if (passengerAge <= 0) {
			System.out.println("Invalid Age");
			return;
		}

		System.out.println("Please Enter Is the Passenger a daily pass holder?");

		String isPassHolder = scanner.next();

		if (!(isPassHolder.equalsIgnoreCase("Yes")) && (!(isPassHolder.equalsIgnoreCase("No")))) {

			System.out.println("InValid Type");
			return;
		}

		int baseFare = calculateBaseFare(transportVehicle, distance, ratePerKm); // step 1

		if (baseFare < 20) {

			baseFare = 20;
		}

		int timeBasedFareAdjustment = calculateTimeBasedFareAdjusment(baseFare, travelHours); // step 2

		baseFare += timeBasedFareAdjustment;

		int ageBasedDiscount = calculateAgeBasedDiscount(baseFare, passengerAge); // step3

		if (ageBasedDiscount == 0) {
			baseFare = 0;
		} else if (baseFare == ageBasedDiscount) {
			baseFare = ageBasedDiscount;
		} else {
			baseFare = baseFare - ageBasedDiscount;
		}

		int passHolderDiscount = calculatePassHolderDiscount(baseFare, isPassHolder); // step4

		baseFare = baseFare - passHolderDiscount;

		int travelTimeEstimation = calculateTravelTimeEstimation(transportVehicle, distance, speed); // step 5

		int delayTime = calculateDelayConditions(travelHours, distance); // step6

		int totalJourneyTime = travelTimeEstimation + delayTime;

		System.out.println("Transport type:" + transportVehicle + "\n" + "Distance Travelled:" + distance + "\n"
				+ "Final fare payable:" + baseFare + "\n" + "Estimated travel time (minutes):" + travelTimeEstimation
				+ "\n" + "Delay:" + delayTime + "\n" + "Final total journey time:" + totalJourneyTime);

	}

	public static int calculateDelayConditions(String travelHours, int distance) {

		int delay = 0;

		if (travelHours.equalsIgnoreCase("peakHours")) {

			delay += 10;
		}

		if (distance > 20) {

			delay += 15;

		}
		return delay;

	}

	public static int calculateTravelTimeEstimation(String transportVehicle, int distance, int speed) {

		int time = 0;

		if (transportVehicle.equalsIgnoreCase("Bus")) {

			time = TimeCalculation(distance, speed);

		} else if (transportVehicle.equalsIgnoreCase("Metro")) {

			time = TimeCalculation(distance, speed);
		} else {
			time = TimeCalculation(distance, speed);
		}
		return time;

	}

	public static int TimeCalculation(int distance, int speed) {

		int estimatedTime = (distance * 60) / speed;

		return estimatedTime;
	}

	public static int calculatePassHolderDiscount(int baseFare, String isPassHolder) {

		int passDiscount = 0;

		if (isPassHolder.equalsIgnoreCase("Yes") && baseFare > 0) {

			passDiscount = (baseFare * 10) / 100;

		} else {
			return passDiscount;
		}

		return passDiscount;

	}

	public static int calculateAgeBasedDiscount(int baseFare, int passengerAge) {

		int ageFareDiscount = 0;

		if (passengerAge <= 5) {
			ageFareDiscount = 0;
		} else if (passengerAge >= 6 && passengerAge <= 17) {

			ageFareDiscount = (baseFare * 30) / 100;
		} else if (passengerAge >= 60) {

			ageFareDiscount = (baseFare * 40) / 100;
		} else {
			ageFareDiscount = baseFare;
		}

		return ageFareDiscount;

	}

	public static int calculateTimeBasedFareAdjusment(int baseFare, String travelHours) {

		int addOnFare = 0;

		if (travelHours.equalsIgnoreCase("PeakHours")) {

			addOnFare = (baseFare * 20) / 100;
		} else {
			addOnFare = 0;
		}

		return addOnFare;
	}

	public static int calculateBaseFare(String transportVehicle, int distance, int ratePerKm) {

		int calBaseFare = 0;

		if (transportVehicle.equalsIgnoreCase("Bus")) {

			calBaseFare = distance * ratePerKm;
		} else if (transportVehicle.equalsIgnoreCase("Metro")) {

			calBaseFare = distance * ratePerKm;
		} else {

			calBaseFare = distance * ratePerKm;
		}

		return calBaseFare;

	}

}
