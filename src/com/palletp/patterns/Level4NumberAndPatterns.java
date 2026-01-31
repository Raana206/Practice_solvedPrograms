package com.palletp.patterns;

public class Level4NumberAndPatterns {

	public static void main(String[] args) {

		TestPattern level4 = new TestPattern();
		level4.hourglassNumberPattern();
		level4.xPattern();
	}

}

class TestPattern {

	public void hourglassNumberPattern() {

		int n = 7;

		int mid = n / 2;

//		 upper Half
		for (int i = 0; i <= mid; i++) {

			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}

			for (int j = i + 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();

		}

//		lowerHalf

		for (int i = mid - 1; i >= 0; i--) {

			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}
			for (int j = i + 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}
	
	public void xPattern() {
		
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(j==i|| (i+j)==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
