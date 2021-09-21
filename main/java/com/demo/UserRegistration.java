package com.demo;

import java.util.regex.Pattern;

/**
 * @author jayeshkumar This class has REGEX pattern for user details and method
 *         to validate each detail
 */
public class UserRegistration {

	final String NAME = "^[A-Z][a-z]{2}[a-z]*";
	final String PHONE = "[1-9][0-9]\\s[1-9][0-9]{9}";

	final String username = "^[A-Za-z][A-Za-z0-9+-]{2}[A-Za-z0-9+-]*([.][A-Za-z0-9]{2}[A-Za-z0-9]*)?";
	final String domain = "\\@[a-zA-Z0-9]+\\.[a-z]{2}[a-z]*([.][a-z]{2}[a-z]*)?";

	final String EMAIL = username + domain;

	final String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,20}";

	/**
	 * 
	 * @return true if first name is valid
	 * @throws InvalidUserDetailException if users first name is invalid
	 */
	public boolean validateFirstName(String firstname) throws InvalidUserDetailException {

		boolean fnameResult = Pattern.matches(NAME, firstname);
		if (fnameResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid First name");
		}
	}

	/**
	 * 
	 * @return true if last name is valid
	 * @throws InvalidUserDetailException if users last name is invalid
	 */
	public boolean validateLastName(String lastname) throws InvalidUserDetailException {
		boolean lnameResult = Pattern.matches(NAME, lastname);
		if (lnameResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid Last name");
		}
	}

	/**
	 * 
	 * @return true if phone number is valid
	 * @throws InvalidUserDetailException if users phone number is invalid
	 */
	public boolean validatePhoneNumber(String phoneNumber) throws InvalidUserDetailException {
		boolean phoneResult = Pattern.matches(PHONE, phoneNumber);
		if (phoneResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid Phone number");
		}
	}

	/**
	 * 
	 * @return true if email is valid
	 * @throws InvalidUserDetailException if email is invalid
	 */
	public boolean validateEmail(String email) throws InvalidUserDetailException {
		boolean emailResult = Pattern.matches(EMAIL, email);
		if (emailResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid Email address");
		}
	}

	/**
	 * 
	 * @return true if password is valid
	 * @throws InvalidUserDetailException if users password is invalid
	 */
	public boolean validatePassword(String password) throws InvalidUserDetailException {
		boolean passwordResult = Pattern.matches(PASSWORD, password);
		if (passwordResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid password");
		}
	}

}
