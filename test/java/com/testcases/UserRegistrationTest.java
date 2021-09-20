package com.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.demo.UserRegistration;

public class UserRegistrationTest {

	/**
	 * This test case should pass if we provide a valid first name
	 */
	@Test
	public void givenfirstname_whichisproper_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("Jayesh");
		Assert.assertTrue(result);
	}

	/**
	 * Test should pass because we are checking invalid first name that doesn't have
	 * atleast 3 characters
	 */
	@Test
	public void givenfirstname_whichisshort_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("JK");
		Assert.assertFalse(result);
	}

	/**
	 * Test should pass because we are checking invalid first name that doesn't
	 * start with capital letter
	 */
	@Test
	public void givenfirstname_wherefirstletternotcapital_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("daredevil");
		Assert.assertFalse(result);
	}

	/**
	 * This test case should pass if we provide a valid last name
	 */
	@Test
	public void givenlastname_whichisproper_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("Kumar");
		Assert.assertTrue(result);
	}

	/**
	 * Test should pass because we are checking invalid last name that doesn't have
	 * atleast 3 characters
	 */
	@Test
	public void givenlastname_whichisshort_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("M");
		Assert.assertFalse(result);
	}

	/**
	 * Test should pass because we are checking invalid last name that doesn't start
	 * with capital letter
	 */
	@Test
	public void givenlastname_wherefirstletternotcapital_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("kumar");
		Assert.assertFalse(result);
	}

	/**
	 * Test case pass if valid phone number is given
	 */
	@Test
	public void givenphonenumber_whichisproper_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91 8660886760");
		Assert.assertTrue(result);
	}

	/**
	 * Test should pass because we are checking invalid phone number that doesn't
	 * start with country code
	 */
	@Test
	public void givenphonenumber_withoutcountrycode_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("8660886760");
		Assert.assertFalse(result);
	}

	/**
	 * Test should pass because we are checking invalid phone number that doesn't
	 * have all 10 digits
	 */
	@Test
	public void givenphonenumber_lessthantendigit_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91 866088676");
		Assert.assertFalse(result);
	}

	/**
	 * Test should pass because we are checking invalid phone number that has more
	 * that one space after country code
	 */
	@Test
	public void givenphonenumber_morethanonespaceaftercountrycode_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91  8660886760");
		Assert.assertFalse(result);
	}

	/**
	 * Test should pass because we are checking invalid phone number that starts
	 * with zero
	 */
	@Test
	public void givenphonenumber_thatstartswithzero_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91 0660886760");
		Assert.assertFalse(result);
	}

	/**
	 * Test case will pass if given a valid email
	 */
	@Test
	public void givenemail_whichisproper_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateEmail("jayeshkumar8660@gmail.com");
		Assert.assertTrue(result);
	}

	/**
	 * Test case will pass because we are checking for invalid email
	 */
	@Test
	public void givenemail_whichisinvalid_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateEmail("tempgoogle@45");
		Assert.assertFalse(result);
	}

	/**
	 * Test case will pass if a valid password is given
	 */
	@Test
	public void givenpassword_whichisvalid_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("tempGoogle@45");
		Assert.assertTrue(result);
	}

	/**
	 * Test case will pass as we are checking for invalid password without capital
	 * letter
	 */
	@Test
	public void givenpassword_withoutcaps_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("tempgoogle@45");
		Assert.assertFalse(result);
	}

	/**
	 * Test case will pass as we are checking for invalid password without digit
	 */
	@Test
	public void givenpassword_withoutdigit_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("temp@Google");
		Assert.assertFalse(result);
	}

	/**
	 * Test case will pass as we are checking for invalid password without special
	 * character
	 */
	@Test
	public void givenpassword_withoutspecialchar_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("tempGoogle45");
		Assert.assertFalse(result);
	}

	/**
	 * Test case will pass as we are checking for invalid password which is less
	 * that minimum character 8
	 */
	@Test
	public void givenpassword_whichisshort_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("Yml@45");
		Assert.assertFalse(result);
	}

}
