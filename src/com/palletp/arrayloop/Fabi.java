package com.palletp.arrayloop;

public class Fabi {
	
 public static void main(String[] args) {
	
	 int f1=0;
	 int f2=1;
	 int f3=0;
	 
	 System.out.println(f1);
	 System.out.println(f2);
	 int i=1;
	 while(i<=10) {
		 
		 f3=f1+f2;
		 System.out.println(f3);
		f1=f2;
		f2=f3;
		i++;
		
	 }
}
}
