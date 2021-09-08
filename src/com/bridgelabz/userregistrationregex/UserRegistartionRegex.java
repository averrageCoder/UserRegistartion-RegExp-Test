package com.bridgelabz.userregistrationregex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistartionRegex {
	public  boolean passwordValidator(String password) {
		
		Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[\\S]{8,}$");
		Matcher matcher;
		
		matcher = passwordPattern.matcher(password);
		boolean matchFound = matcher.find();
		return matchFound;		
	}

	public boolean mobilePhoneValidator(String phoneNumber) {
		
		Pattern phonePattern = Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");
		Matcher matcher;
		
		matcher = phonePattern.matcher(phoneNumber);
		boolean matchFound = matcher.find();
		return matchFound;		
	}

	public boolean emailValidator(String email) {
		
		Pattern emailPattern = Pattern.compile("^abc([\\.\\+\\_\\-][A-Z0-9]+)?[A-Z0-9]*[@][A-Z0-9]+.[A-Z]{2,}(.[A-Z]{2,6})?$",Pattern.CASE_INSENSITIVE);
		Matcher matcher;
		
		matcher = emailPattern.matcher(email);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	public boolean firstNameLastNameValidator(String name) {
		
		Pattern firstNamePattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher;
		
		matcher = firstNamePattern.matcher(name);
		boolean matchFound = matcher.find();
		return matchFound;
		
	}

}
