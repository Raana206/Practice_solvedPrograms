package com.basic.java.programs.leetCode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CouponCodeValidator {

	private final List<String> ORDER = Arrays.asList("electronics", "grocery", "pharmacy", "restaurant");

	public static void main(String[] args) {

		CouponCodeValidator codeValidator = new CouponCodeValidator();

		String[] code = { "SAVE10", "SAVE20", "ELEC30" };
		String businessLine[] = { "grocery", "groce", "electronics" };
		boolean isActive[] = { true, true, true };

		System.out.println(codeValidator.validateCoupons(code, businessLine, isActive));
	}

	public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

		List<String> result = new ArrayList<>();
		List<String[]> list = new ArrayList<>();

		for (int i = 0; i < code.length; i++) {

			if (isCode(code[i]) && isBussiness(businessLine[i]) && isActive[i]) {
				list.add(new String[] { businessLine[i], code[i] });

			}
		}

		Collections.sort(list, (a, b) -> {
			int cmp = Integer.compare(ORDER.indexOf(a[0]), ORDER.indexOf(b[0]));

			if (cmp != 0)
				return cmp;

			return a[1].compareTo(b[1]);

		});

		// Extract only codes

		for (String[] pair : list) {
			result.add(pair[1]);
		}

		return result;
	}

	private boolean isCode(String code) {

		if (code == null || code.isEmpty()) {
			return false;
		}
		for (char c : code.toCharArray()) {
			if (!Character.isLetterOrDigit(c) && c != '_') {
				return false;
			}
		}

		return true;

	}

	private boolean isBussiness(String business) {

		return business != null && business.equals("electronics") || business.equals("grocery")
				|| business.equals("pharmacy") || business.equals("restaurant");

	}

}
