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

	// Following are the lambda functions to each validating one user property.

	IValidateUserDetail validateFirstNamelambda = (firstName) -> Pattern.matches(NAME, firstName);
	IValidateUserDetail validateLastNamelambda = (lastName) -> Pattern.matches(NAME, lastName);
	IValidateUserDetail validatePhonelambda = (phone) -> Pattern.matches(PHONE, phone);
	IValidateUserDetail validateEmaillambda = (email) -> Pattern.matches(EMAIL, email);
	IValidateUserDetail validatePasswordlambda = (password) -> Pattern.matches(PASSWORD, password);

	/**
	 * 
	 * @return true if first name is valid ,uses lambda function
	 * @throws InvalidUserDetailException if users first name is invalid
	 */
	public boolean validateFirstName(String firstname) throws InvalidUserDetailException {

		boolean fnameResult = validateFirstNamelambda.validateUserDetail(firstname);
		if (fnameResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid First name");
		}
	}

	/**
	 * 
	 * @return true if last name is valid,uses lambda function
	 * @throws InvalidUserDetailException if users last name is invalid
	 */
	public boolean validateLastName(String lastname) throws InvalidUserDetailException {
		boolean lnameResult = validateLastNamelambda.validateUserDetail(lastname);
		if (lnameResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid Last name");
		}
	}

	/**
	 * 
	 * @return true if phone number is valid,uses lambda function
	 * @throws InvalidUserDetailException if users phone number is invalid
	 */
	public boolean validatePhoneNumber(String phoneNumber) throws InvalidUserDetailException {
		boolean phoneResult = validatePhonelambda.validateUserDetail(phoneNumber);
		if (phoneResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid Phone number");
		}
	}

	/**
	 * 
	 * @return true if email is valid,uses lambda function
	 * @throws InvalidUserDetailException if email is invalid
	 */
	public boolean validateEmail(String email) throws InvalidUserDetailException {
		boolean emailResult = validateEmaillambda.validateUserDetail(email);
		if (emailResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid Email address");
		}
	}

	/**
	 * 
	 * @return true if password is valid,uses lambda function
	 * @throws InvalidUserDetailException if users password is invalid
	 */
	public boolean validatePassword(String password) throws InvalidUserDetailException {
		boolean passwordResult = validatePasswordlambda.validateUserDetail(password);
		if (passwordResult) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid password");
		}
	}

}
