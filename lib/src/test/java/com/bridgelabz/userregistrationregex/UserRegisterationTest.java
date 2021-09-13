package com.bridgelabz.userregistrationregex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class UserRegisterationTest {

	@Test
	public void givenFirstName_whenProper_shouldThrowCustomException() throws Exception {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.firstNameLastNameValidator.testRegex("Nasir");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.VALID_NAME);
		}
	}
	
	@Test
	public void givenFirstName_whenNotProper_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.firstNameLastNameValidator.testRegex("nas");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.INVALID_NAME);
		}
	}
	
	@Test
	public void givenFirstName_whenNull_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.firstNameLastNameValidator.testRegex(null);
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.ENTERED_NULL);
		}
	}
	
	@Test
	public void givenFirstName_whenEmpty_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.firstNameLastNameValidator.testRegex("");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.ENTERED_EMPTY);
		}
	}
	
	@Test
	public void givenLastName_whenProper_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.firstNameLastNameValidator.testRegex("Jain");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.VALID_NAME);
		}
	}
	
	@Test
	public void givenLastName_whenNotProper_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.firstNameLastNameValidator.testRegex("jai");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.INVALID_NAME);
		}
	}
	
	@Test
	public void givenLastName_whenNull_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.firstNameLastNameValidator.testRegex(null);
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.ENTERED_NULL);
		}
	}
	
	@Test
	public void givenLastName_whenEmpty_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.firstNameLastNameValidator.testRegex("");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.ENTERED_EMPTY);
		}
	}
	
	@Test
	public void givenMobile_whenProper_shouldThrowCustomException() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.mobilePhoneValidator.testRegex("91 9876543210");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.VALID_PHONE_NUMBER);
		}
	}
	
	@Test
	public void givenMobile_whenNotProper_shouldThrowCustomException() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.mobilePhoneValidator.testRegex("9876543210");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.INVALID_PHONE_NUMBER);
		}		
	}
	
	@Test
	public void givenMobile_whenNull_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.mobilePhoneValidator.testRegex(null);
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.ENTERED_NULL);
		}
	}
	
	@Test
	public void givenMobile_whenEmpty_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.mobilePhoneValidator.testRegex("");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.ENTERED_EMPTY);
		}
	}
	
	@Test
	public void givenPassword_whenProper_shouldThrowCustomException() {	
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.passwordValidator.testRegex("pa2@Word");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.VALID_PASSWORD);
		}
	}
	
	@Test
	public void givenPassword_whenNoUppperCase_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.passwordValidator.testRegex("okay1@34");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.INAVLID_PASSWORD);
		}	
	}
	
	@Test
	public void givenPassword_whenNoSpecialCharacter_shouldThrowCustomException() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.passwordValidator.testRegex("Okay1234");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.INAVLID_PASSWORD);
		}	
		
	}
	
	@Test
	public void givenPassword_whenNull_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.passwordValidator.testRegex(null);
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.ENTERED_NULL);
		}
	}
	
	@Test
	public void givenPassword_whenEmpty_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.passwordValidator.testRegex("");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.ENTERED_EMPTY);
		}
	}
	
	@Test
	public void givenEmail_whenProper_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.emailValidator.testRegex("abc@bridgelabz.com");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.VALID_EMAIL);
		}
	}
	
	@Test
	public void givenEmail_whenNotProper_shouldThrowCustomException() {		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.emailValidator.testRegex("abcs@@bridgelabz.com");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.INVALID_EMAIL);
		}
	}
	
	@Test
	public void givenEmail_whenNull_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.emailValidator.testRegex(null);
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.ENTERED_NULL);
		}
	}
	
	@Test
	public void givenEmail_whenEmpty_shouldThrowCustomException() {
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			userValidator.emailValidator.testRegex("");
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,UserRegisterationException.ExceptionType.ENTERED_EMPTY);
		}
	}

}
