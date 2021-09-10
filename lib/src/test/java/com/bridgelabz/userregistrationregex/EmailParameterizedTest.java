package com.bridgelabz.userregistrationregex;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailParameterizedTest {
	
	private String emailToTest;
	private UserRegisterationException.ExceptionType expectedResult;
	private UserRegistartionRegex validator;

	public EmailParameterizedTest(String emailToTest,UserRegisterationException.ExceptionType expectedResult) {
		super();
		this.emailToTest = emailToTest;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
			{"abc-100@yahoo.com",UserRegisterationException.ExceptionType.VALID_EMAIL},
			{"abc@yahoo.com",UserRegisterationException.ExceptionType.VALID_EMAIL},
			{"abc.100@yahoo.com",UserRegisterationException.ExceptionType.VALID_EMAIL},
			{"abc-100@abc.net",UserRegisterationException.ExceptionType.VALID_EMAIL},
			{"abc.100@abc.com.au",UserRegisterationException.ExceptionType.VALID_EMAIL},
			{"abc@1.com",UserRegisterationException.ExceptionType.VALID_EMAIL},
			{"abc@gmail.com.com",UserRegisterationException.ExceptionType.VALID_EMAIL},
			{"abc+100@gmail.com",UserRegisterationException.ExceptionType.VALID_EMAIL},
			{"abc",UserRegisterationException.ExceptionType.INVALID_EMAIL},
			{"abc@.com.my",UserRegisterationException.ExceptionType.INVALID_EMAIL},
			{"abc123@.com",UserRegisterationException.ExceptionType.INVALID_EMAIL},
			{"abc123@.com.com",UserRegisterationException.ExceptionType.INVALID_EMAIL},
			{"abc()*@gmail.com",UserRegisterationException.ExceptionType.INVALID_EMAIL},
			{"abc@%*.com",UserRegisterationException.ExceptionType.INVALID_EMAIL},
			{"abc..2002@gmail.com",UserRegisterationException.ExceptionType.INVALID_EMAIL},
			{"abc.@gmail.com",UserRegisterationException.ExceptionType.INVALID_EMAIL},
			//{"abc@abc@gmail.com",UserRegisterationException.ExceptionType.INVALID_EMAIL},
			{"abc@gmail.com.1a",UserRegisterationException.ExceptionType.INVALID_EMAIL},
			{"abc@gmail.com.aa.au",UserRegisterationException.ExceptionType.INVALID_EMAIL}
		});
	}
	
	@Test
	public void giveEmail_testWhetherEnailMatchesExpectedResult() throws UserRegisterationException {
		validator=new UserRegistartionRegex();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegisterationException.class);
			validator.emailValidator(emailToTest);
		}
		catch (UserRegisterationException e) {
			assertEquals(e.type,expectedResult);
		}
	}

}
