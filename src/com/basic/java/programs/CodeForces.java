package com.basic.java.programs;

import java.util.Scanner;

public class CodeForces {

	public static void main(String[] args) {

//			amin amir rima nima
//		    amin amir nima rima

//		amir rima amin nima
		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	 
	        while (t-- > 0) {
	 
	            int n = sc.nextInt();
	            String s = "";
	 
	            for (int i = 0; i < n; i++) {
	 
	                String a = sc.next();
	 
	                String option1 = a + s;
	                String option2 = s + a;
	 
	                if (option1.compareTo(option2) < 0) {
	                    s = option1;
	                } else {
	                    s = option2;
	                }
	            }
	 
	            System.out.println(s);
	        }
	}
}
