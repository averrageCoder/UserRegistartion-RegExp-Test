package com.bridgelabz.userregistrationregex;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class UserRegisteration {

	@Test
	public void givenFirstName_whenProper_shouldReturnTrue() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		boolean result = userValidator.firstNameLastNameValidator("Nasir");
		assertTrue(result);
		
	}
	
	@Test
	public void givenFirstName_whenNotProper_shouldReturnFalse() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		boolean result = userValidator.firstNameLastNameValidator("nas");
		assertFalse(result);
		
	}
	
	@Test
	public void givenLastName_whenProper_shouldReturnTrue() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		boolean result = userValidator.firstNameLastNameValidator("Jain");
		assertTrue(result);
		
	}
	
	@Test
	public void givenLastName_whenNotProper_shouldReturnFalse() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		boolean result = userValidator.firstNameLastNameValidator("ja");
		assertFalse(result);
		
	}
	
	@Test
	public void givenMobile_whenProper_shouldReturnTrue() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		boolean result = userValidator.mobilePhoneValidator("91 9876543210");
		assertTrue(result);
		
	}
	
	@Test
	public void givenMobile_whenNotProper_shouldReturnFalse() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		boolean result = userValidator.mobilePhoneValidator("9876543210");
		assertFalse(result);
		
	}
	
	@Test
	public void givenPassword_whenProper_shouldReturnTrue() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		boolean result = userValidator.passwordValidator("pa2@Word");
		assertTrue(result);
		
	}
	
	@Test
	public void givenPassword_whenNoUppperCase_shouldReturnFalse() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		boolean result = userValidator.passwordValidator("okay1@34");
		assertFalse(result);
		
	}
	
	@Test
	public void givenPassword_whenNoSpecialCharacter_shouldReturnFalse() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		boolean result = userValidator.passwordValidator("Okay1234");
		assertFalse(result);
		
	}
	
	@Test
	public void givenEmail_whenProper_shouldReturnTrue() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		boolean result = userValidator.emailValidator("abc@bridgelabz.com");
		assertTrue(result);
		
	}
	
	@Test
	public void givenEmail_whenNotProper_shouldReturnFalse() {
		
		UserRegistartionRegex userValidator = new UserRegistartionRegex();
		boolean result = userValidator.emailValidator("abcs@@bridgelabz.com");
		assertFalse(result);
		
	}

}
