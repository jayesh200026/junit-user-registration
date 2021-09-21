package com.demo;

/**
 * @author jayeshkumar This is custom exception class that extends Exception
 */
@SuppressWarnings("serial")
public class InvalidUserDetailException extends Exception {

	InvalidUserDetailException(String message) {
		super(message);
	}

}
