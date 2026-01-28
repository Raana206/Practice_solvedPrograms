package com.palletp.conditional;

import java.util.Scanner;

public class BiggestOneOfTwoNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first Number");
		int no1 = scanner.nextInt();
		System.out.println("Enter Seocnd Number");
		int no2 = scanner.nextInt();
		
		if(no1>no2) {
			System.out.println("First Number is Greater than Second number :" +"\n"+no1);
		}else {
			System.out.println("Second Number is Greater than First number :"+"\n"+no2);
		}
	}

}
