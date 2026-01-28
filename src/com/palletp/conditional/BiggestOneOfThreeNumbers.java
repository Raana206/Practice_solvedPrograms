package com.palletp.conditional;

import java.util.Scanner;

public class BiggestOneOfThreeNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first Number");
		int no1 = scanner.nextInt();
		System.out.println("Enter Seocnd Number");
		int no2 = scanner.nextInt();
		System.out.println("Enter Third Number");
		int no3=scanner.nextInt();
	
		
		if(no1>no2) {
			if(no1>no3) {
			System.out.println("First Number is Greater than Remaining numbers :" +"\n"+no1);
			}else {
				System.out.println("Third Number is Greater than Remaining numbers:"+"\n"+no3);
			}
		}else if(no2>no3) {
			System.out.println("Second Number is Greater than Remaining numbers:"+"\n"+no2);
		}else {
			System.out.println("Third Number is Greater than Remaining numbers:"+"\n"+no3);
		}
	
	
	
	if(no1>no2 && no1>no3) {
	
		System.out.println("First Number is Greater than Remaining numbers :" +"\n"+no1);
		
	}else if(no2>no3) {
		System.out.println("Second Number is Greater than Remaining numbers:"+"\n"+no2);
	}else {
		System.out.println("Third Number is Greater than Remaining numbers:"+"\n"+no3);
	}
}

}
