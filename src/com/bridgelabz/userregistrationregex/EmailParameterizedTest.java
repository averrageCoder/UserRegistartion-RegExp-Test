package com.bridgelabz.userregistrationregex;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class EmailParameterizedTest {
	
	private String emailToTest;
	private boolean expectedResult;
	private UserRegistartionRegex validator;

	public EmailParameterizedTest(String emailToTest, boolean expectedResult) {
		super();
		this.emailToTest = emailToTest;
		this.expectedResult = expectedResult;
	}
	
	String validEmails[] = {
			"abc-100@yahoo.com","abc@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net",
			"abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"
	};
	String invalidEmails[] = {
			"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
			"abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"
	};
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
			{"abc-100@yahoo.com",true},
			{"abc@yahoo.com",true},
			{"abc.100@yahoo.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@1.com",true},
			{"abc@gmail.com.com",true},
			{"abc+100@gmail.com",true},
			{"abc",false},
			{"abc@.com.my",false},
			{"abc123@.com",false},
			{"abc123@.com.com",false},
			{"abc()*@gmail.com",false},
			{"abc@%*.com",false},
			{"abc..2002@gmail.com",false},
			{"abc.@gmail.com",false},
			//{"abc@abc@gmail.com",false},
			{"abc@gmail.com.1a",false},
			{"abc@gmail.com.aa.au",false}
		});
	}

	@Test
	public void giveEmail_testWhetherEnailMatchesExpectedResult() {
		
		validator=new UserRegistartionRegex();
		boolean result = validator.emailValidator(emailToTest);
		
		assertEquals(expectedResult, result);
		
	}

}
