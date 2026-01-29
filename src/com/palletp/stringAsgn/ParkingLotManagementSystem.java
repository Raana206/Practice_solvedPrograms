package com.palletp.stringAsgn;

import java.util.Scanner;

public class ParkingLotManagementSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Vehicle Name:");

		String vName = sc.next().toLowerCase();

		System.out.println("Count the ParkingHour : ");
		
		 if (!sc.hasNextInt()) {
	            System.out.println("Parking hours must be a number!");
	            sc.close();
	            return;
	        }

		int parkingHour = sc.nextInt();
		
		if(parkingHour<=0) {
			System.out.println("Parking hour must be Greaterthan Zero");
			return;
		}

		int totalParkingCost = 0;

		switch (vName) {

		case "car":

			int car_Perhour = 60;

			totalParkingCost = calParkingCost(car_Perhour, parkingHour);

			System.out.println("Car Parking Cost:" + totalParkingCost);
			break;

		case "bike":

			int bike_Perhour = 30;

			totalParkingCost = calParkingCost(bike_Perhour, parkingHour);

			System.out.println("Bike Parking Cost:" + totalParkingCost);

			break;

		case "bus":

			int bus_Perhour = 200;

			totalParkingCost = calParkingCost(bus_Perhour, parkingHour);

			System.out.println("Bus Parking Cost:" + totalParkingCost);
			break;

		default:
			System.out.println("Vehicle is Not Valid");
			break;

		}
		sc.close();

	}

	public static int calParkingCost(int perHour, int parkingHour) {

		int initialBill = perHour * parkingHour;

		int disc_bill = 0;
		if (parkingHour > 10) {

			int disc20 = ((initialBill * 20) / 100); // 20% discount;

			disc_bill = initialBill - disc20;

			if (disc_bill > 1000) {

				int disc10 = ((disc_bill * 10) / 100); // 10% discount

				return disc_bill - disc10;

			} else {
				return disc_bill;
			}

		} else {
			return initialBill;
		}

	}

}
