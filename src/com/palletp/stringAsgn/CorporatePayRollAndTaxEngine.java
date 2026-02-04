package com.palletp.stringAsgn;

import java.util.Scanner;

public class CorporatePayRollAndTaxEngine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter Basic Of the Employee :");

		double basicSalary = scanner.nextDouble();

		if (basicSalary < 5000) {
			System.out.println("Employee Minimum Salary Above 5000.0 Please Do Verify");
			return;
		}

		System.out.println("Please Enter Designation Of the Employee :");

		int designation = scanner.nextInt();

		if (designation <1 || designation > 4) {
			System.out.println("Employee Desgination is Not Matched! Please Verify");
			return;
		}

		String employeeDesignationName = null;

		switch (designation) {

		case 1:
			employeeDesignationName = "Intern";
			break;
		case 2:
			employeeDesignationName = "Engineer";
			break;
		case 3:
			employeeDesignationName = "Team Lead";
			break;
		case 4:
			employeeDesignationName = "Manager";
			break;
		}

		System.out.println("please Enter Employee total Years Of Experience: ");

		int empExperience = scanner.nextInt();

		if (empExperience < 0) {
			System.out.println("Employee Experience must be 0 or more. Please Do Verify");
			return;
		}

		System.out.println("Is Employee Working Remotely?");

		String remoteEmployee = scanner.next(); // (yes/no)

		if (!remoteEmployee.equalsIgnoreCase("yes") && (!remoteEmployee.equalsIgnoreCase("no"))) {

			System.out.println("Here Only Check YES or NO . Please Do Verify");
			return;
		}

		System.out.println("Total number of leaves taken in the month:");

		int leaves = scanner.nextInt();

		// performs all the Methods

		double allowances = calculateSalaryAllowance(basicSalary, empExperience); // step 2

		double bonuses = bonusesAndExtraAllowance(basicSalary, employeeDesignationName, empExperience, remoteEmployee); // step
																														// 3

		double grossSalary = calculateGrossSalary(basicSalary, allowances, bonuses); // step 4

		double leaveDeduction = calculateLeaveDeduction(grossSalary, leaves); // step 5

		double pfDeduction = calculatePfSalaryDeduction(basicSalary); // step 6(1)

		double professionalTax = calculateProfessionalTax(grossSalary); // step 6(2)

		double incomeTax = calculateIncomeTax(grossSalary); // step 7

		double netSalary = calculateNetSalary(grossSalary, pfDeduction, professionalTax, incomeTax, leaveDeduction); // step
																														// 8

		System.out.println(grossSalary + "\n" + pfDeduction + "\n" + professionalTax + "\n" + leaveDeduction + "\n"
				+ incomeTax + "\n" + netSalary);

		scanner.close();

	}

	public static double calculateNetSalary(double grossSalary, double pfDeduction, double professionalTax,
			double incomeTax, double leaveDeduction) {

		double allDeductions = pfDeduction + professionalTax + incomeTax + leaveDeduction;

		double netSalary = grossSalary - allDeductions;

		if (netSalary < 0.0) {
			return 0.0;
		}

		return netSalary;

	}

	public static double calculateIncomeTax(double grossSalary) {

		double incomeTax = 0.0;

		if (grossSalary < 40000) {

			incomeTax = 0.0;

		} else if (grossSalary >= 40001 && grossSalary <80000) {

			incomeTax = (grossSalary * 10) / 100;

		} else {
			incomeTax = (grossSalary * 20) / 100;

		}

		return incomeTax;

	}

	public static double calculateProfessionalTax(double grossSalary) {

		double professionalTax = 0.0;

		if (grossSalary > 25000) {

			professionalTax = 200.0;

		}
		return professionalTax;

	}

	public static double calculatePfSalaryDeduction(double basicSalary) {

		return (basicSalary * 12) / 100;

	}

	public static double calculateLeaveDeduction(double grossSalary, int leaves) {

		double per_daySalary = grossSalary / 30;

		double leaveDeduction = 0.0;
		if (leaves > 2) {

			int extraLeaves = leaves - 2;
			leaveDeduction = extraLeaves * per_daySalary;
		}

		return leaveDeduction;

	}

	public static double calculateGrossSalary(double basicSalary, double allowances, double bonuses) {

		return basicSalary + (allowances + bonuses);

	}

	public static double bonusesAndExtraAllowance(double basicSalary, String employeeDesignationName, int empExperience,
			String remoteEmployee) {

		double bonus = 0.0;

		if (empExperience >= 5) {

			bonus += 7000.00;

		}
		if (employeeDesignationName.equalsIgnoreCase("Manager") && empExperience >= 8) {

			bonus += 12000.00;

		}
		if (remoteEmployee.equalsIgnoreCase("yes")) {

			bonus += 3000.0;
		}
		return bonus;
	}

	public static double calculateSalaryAllowance(double basicSalary, int empExperience) { // step 2

		double houseRentAllowance = (basicSalary * 25) / 100;

		double dearnessAllowance = (basicSalary * 12) / 100;

		double medicalAllowance = 0.0;

		if (empExperience >= 2) {
			medicalAllowance = 2000.00;
		}

		return houseRentAllowance + dearnessAllowance + medicalAllowance;

	}

}
