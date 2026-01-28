package com.basic.java.programs;

import java.time.Year;

public class SwitchRelatedProblems {

	public static void main(String[] args) {

		SwitchCondtions condtions = new SwitchCondtions();
		condtions.weekDays();
		condtions.season();
		condtions.nestedSwitch();
		condtions.checkEvenAndOdd();
	}

}

class SwitchCondtions {

	public void weekDays() {

		int day = 4;

		String weeKDay = switch (day) {

		case 1 -> "monday";

		case 2 -> "TuesDay";

		case 3 -> "WednesDay";

		case 4 -> "ThursDay";

		case 5 -> "Friday";

		case 6 -> "Satursday";

		case 7 -> "Sunday";

		default -> "Invalid Input";

		};
		System.out.println(weeKDay);
	}

	public void season() {

		int month = 1;

		String season = switch (month) {

		case 12, 1, 2 -> "Winnter";
		case 3, 4, 5 -> "Spring";
		case 6, 7, 8 -> "Summer";
		case 9, 10, 11 -> "Autum";
		default -> "Invalid Input";

		};

		System.out.println(season);
	}

	public void nestedSwitch() {

		String type = "Vegetable";
		String name = "Apple";

		if (type == null || name == null) {
			System.out.println("Invalid input");
			return;
		}

		type = type.toLowerCase();
		name = name.toLowerCase();

		switch (type) {

		case "fruit":

			switch (name) {

			case "apple":
				System.out.println("Red");
				break;

			case "orange":
				System.out.println("Yellow");
				break;
			default:
				System.out.println("No fruit matched");
				break;

			}
			break;

		case "vegetable":

			switch (name) {

			case "Ginger":
				System.out.println("Brown");
				break;

			case "Amla":
				System.out.println("Light Green");
				break;
			default:
				System.out.println("No vegetable  matched");
				break;

			}
			break;

		default:
			System.out.println("No Type  Matched");

		}

	}

	public void checkEvenAndOdd() {

		for (int i = 1; i <= 5; i++) {

			int value = i % 2;

			switch (value) {

			case 0:
				System.out.println("Even");
				break;
			case 1:
				System.out.println("Odd");
				break;

			}
		}

		int x = 3;
		switch (x) {
		default:
			System.out.println(x);
		case 1:
			System.out.println(x);
		case 3:
			System.out.println(x);
		}
		
		
		for (int i = 1; i <= 2; i++) {
		    switch (i) {
		        case 1:
		            try {
		                System.out.print("A ");
		            } finally {
		                continue;
		            }
		        default:
		            System.out.print("D ");
		    }
		    System.out.print("X ");
		}
		
		outer:
		for (int i = 1; i <= 3; i++) {
		    for (int j = 1; j <= 3; j++) {
		        if (j == 2)
		            continue outer;
		        System.out.print(i + "" + j + " ");
		    }
		}
		
		
		int i = 0;
		while (i++ < 3) {
		    System.out.print(i + " ");
		}
		System.out.println(i);
		
		
		int k = 3;
		int r = k++ + ++k + (k = k++);
		System.out.println(r + " " + k);
		
		int t1 = 3;
		int t2 = t1 = t1++ + ++t1 * (t1 = ++t1);
		System.out.println(t2 + " " + t1);
	}
	
	
	
}