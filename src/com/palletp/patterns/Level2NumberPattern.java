package com.palletp.patterns;

public class Level2NumberPattern {

	public static void main(String[] args) {

		Level2 level2 = new Level2();
		level2.numberDiamond();
		level2.pascals();
		level2.binaryTrianglePattern();// imp
		level2.hallowDiamond();
		level2.hollowButterflyPyramid();
		level2.numberButterflyPattern();
		level2.xPattern();
		level2.spiralStarPattern(); // imp
		level2.hollowSquareWithDiagonals(); // imp
		level2.mirrorNumberPyramid();
		level2.hollowDiamondNumberPattern(); // imp
	}
}

class Level2 {

	public void numberDiamond() {

		int number = 4;

		for (int i = 1; i <= number; i++) {

			for (int s = 1; s <= number - i; s++) {

				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = number - 1; i >= 1; i--) { // here void duplicate row

			for (int s = 1; s <= number - i; s++) {

				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println(); // These is not required

	}

	public void binaryTrianglePattern() {
		int no = 6;
		for (int i = 0; i < no; i++) {
			for (int j = 0; j <= i; j++) {

				if ((i + j) % 2 == 0) { // this logic is good
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}

//				if (i % 2 == 0) {                  // this is also  working fine
//					if (j % 2 == 0) {
//						System.out.print(1+" ");
//					} else {
//						System.out.print(0+" ");
//					}
//				}else {
//					if(j%2==0) {
//						System.out.print(0+" ");
//					}else {
//						System.out.print(1+" ");
//					}
//				}
//			

			}
			System.out.println();
		}
	}

	public void pascals() {

		int n = 5;

		for (int i = 0; i <= n; i++) {

			for (int s = 1; s < n - i; s++) {

				System.out.print(" ");
			}

			int number = 1;

			for (int j = 0; j <= i; j++) {

				System.out.printf("%2d ", number);

				number = number * (i - j) / (j + 1); // imp Logic or formula
			}
			System.out.println();
		}
	}

	public void hallowDiamond() {

		int no = 5;

		for (int i = 1; i <= no; i++) {

			for (int s = 1; s <= no - i; s++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {

				if (i == j || j == 1) {

					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		for (int i = no - 1; i >= 1; i--) {

			for (int s = 1; s <= no - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				if (j == 1 || i == j) {

					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public void hollowButterflyPyramid() {

		int n = 4;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				if (j == i || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			for (int s = 1; s <=n-i; s++) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {
				if (k == i || k == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

//		lower

		for (int i = n-1; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				if (j == i || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			for (int s = 1; s <=n-i; s++) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {

				if (k == i || k == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	public void numberButterflyPattern() {

		int n = 4;

//		upper half
		for (int i = 1; i <= n; i++) {
			int num = i;

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int s = n - 1; s >= i; s--) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(num--);
			}

			System.out.println();
		}

//		lower half
		for (int i = n - 1; i >= 1; i--) {

			int num = i;

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}

			for (int s = n - 1; s >= i; s--) {
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print(num--);
			}
			System.out.println();
		}
	}

	public void xPattern() {

		int n = 5;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i == j || i + j == n - 1) { // here you i=0 starting value then 
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void spiralStarPattern() { // imp

		int n = 5;

		for (int i = 0; i < n; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					System.out.print("* ");
				}
			} else {
				if (i % 4 == 1) {
					for (int s = 0; s < n - 1; s++) {
						System.out.print("  ");
					}
					System.out.print("*");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void hollowSquareWithDiagonals() { // please remember the logic

		int n = 5;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i == 0 || j == 0 || j == n - 1 || i == n - 1) {

					System.out.print("* ");

				} else {

					if (i == j || i + j == n - 1) { // this logic is diagonals Logic
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}

				}

			}
			System.out.println();

		}
	}

	public void zigZagPattern() {

	}

	public void mirrorNumberPyramid() { // imp logic

		int n = 7;
		int mid = n / 2;

		// Upper half (including middle)
		for (int i = 0; i <= mid; i++) {

			// spaces
			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}

			// increasing numbers
			for (int num = 1; num <= mid - i + 1; num++) {
				System.out.print(num);
			}

			// decreasing numbers
			for (int num = mid - i; num >= 1; num--) {
				System.out.print(num);
			}

			System.out.println();
		}

		// Lower half
		for (int i = mid - 1; i >= 0; i--) {

			// spaces
			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}

			// increasing numbers
			for (int num = 1; num <= mid - i + 1; num++) {
				System.out.print(num);
			}

			// decreasing numbers
			for (int num = mid - i; num >= 1; num--) {
				System.out.print(num);
			}

			System.out.println();
		}
	}

	public void hollowDiamondNumberPattern() {

		int n = 7;

		for (int i = 1; i <= n; i += 2) {

			for (int s = 1; s <= (n - i) / 2; s++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {

				if (j == 1 || i == j) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		// lower Half

		for (int i = n - 2; i >= 1; i -= 2) {

			for (int s = 1; s <= (n - i) / 2; s++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {

				if (j == 1 || j == i) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

}
