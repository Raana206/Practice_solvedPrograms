package com.palletp.arrayloop;

//import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		


//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Values From the KeyBord");
		int arr[] = {10,20,30,40,50,60,70,80,90,100};

//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}

		OrderChecking checking = new OrderChecking();
		int ar[] = checking.getReverseOrder(arr);

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	
	
	
}

class OrderChecking {

	public static int[] getReverseOrder(int arr[]) {

		int ar[] = new int[arr.length/2];
           int j=0;
		for (int i = 0; i <arr.length; i+=2) {
			ar[j] = arr[i];
			j++;

		}
		return ar;
	}
}
