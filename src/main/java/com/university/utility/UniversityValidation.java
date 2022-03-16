package com.university.utility;

import com.university.entity.University;

public class UniversityValidation {

	public static boolean validate(University university) {
		boolean isValid = true;
		if (university != null) {
			String collegeId = university.getCollege_id();
			String email = university.getEmail();
			String countryDialCode = university.getCountry_dial_code();
			String mobileNumber = university.getMobile();
			String source = university.getSource();
			String secretKey = university.getSecret_key();
			if (isBlank(collegeId) || isBlank(email) || isBlank(countryDialCode) || isBlank(mobileNumber)
					|| isBlank(source) || isBlank(secretKey)) {
				isValid = false;
			}
		}
		return isValid;
	}

	private static boolean isBlank(String value) {
		if (value == null || (value != null && value.isEmpty())) {
			return true;
		}

		return false;
	}

}
