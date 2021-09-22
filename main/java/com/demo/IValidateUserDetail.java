package com.demo;

/**
 * @author jayeshkumar 
 * This is a Functional Interface which is used by each of
 * our lambda expression.
 */
@FunctionalInterface
public interface IValidateUserDetail {

	boolean validateUserDetail(String detail);

}
