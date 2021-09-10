package com.bridgelabz.userregistrationregex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistartionRegex {
	public  boolean passwordValidator(String password) throws UserRegisterationException {	
		Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[\\S]{8,}$");
		Matcher matcher;
		try {
			if(password.length()==0)
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.ENTERED_EMPTY, "PLEASE ENTER A VALID PASSWORD");	
			matcher = passwordPattern.matcher(password);
			boolean matchFound = matcher.find();
			if(matchFound)
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.VALID_PASSWORD, "VALID PASSWORD");
			else
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.INAVLID_PASSWORD, "PLEASE ENTER A VALID PASSWORD");
		}
		catch (NullPointerException e) {
			throw new UserRegisterationException(UserRegisterationException.ExceptionType.ENTERED_NULL, "PLEASE ENTER A VALID PASSWORD");
		}		
	}

	public void mobilePhoneValidator(String phoneNumber) throws UserRegisterationException {
		Pattern phonePattern = Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");
		Matcher matcher;
		try {
			if(phoneNumber.length()==0)
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.ENTERED_EMPTY, "PLEASE ENTER A VALID PHONE NUMBER");
			matcher = phonePattern.matcher(phoneNumber);
			boolean matchFound = matcher.find();
			if(matchFound)
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.VALID_PHONE_NUMBER, "VALID PHONE NUMBER");
			else
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.INVALID_PHONE_NUMBER, "PLEASE ENTER A VALID PHONE NUMBER");
		}
		catch (NullPointerException e) {
			throw new UserRegisterationException(UserRegisterationException.ExceptionType.ENTERED_NULL, "PLEASE ENTER A VALID PHONE NUMBER");
		}		
	}

	public void emailValidator(String email) throws UserRegisterationException {
		Pattern emailPattern = Pattern.compile("^abc([.+_-][A-Z0-9]+)?[A-Z0-9]*[@][A-Za-z0-9]+.[A-Za-z]{2,}(.[A-Za-z]{2,6})?$",Pattern.CASE_INSENSITIVE);
		Matcher matcher;
		try {
			if(email.length()==0)
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.ENTERED_EMPTY, "PLEASE ENTER A VALID EMAIL");
			matcher = emailPattern.matcher(email);
			boolean matchFound = matcher.find();
			if(matchFound)
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.VALID_EMAIL, "VALID EMAIL");
			else
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.INVALID_EMAIL, "PLEASE ENTER A VALID EMAIL");
		}
		catch (NullPointerException e) {
			throw new UserRegisterationException(UserRegisterationException.ExceptionType.ENTERED_NULL, "PLEASE ENTER A VALID EMAIL");
		}	
	}

	public void firstNameLastNameValidator(String name) throws UserRegisterationException {
		Pattern firstNamePattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher;
		try {
			if(name.length()==0)
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.ENTERED_EMPTY, "PLEASE ENTER A VALID NAME");
			matcher = firstNamePattern.matcher(name);
			boolean matchFound = matcher.find();
			if(matchFound)
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.VALID_NAME, "VALID NAME");
			else
				throw new UserRegisterationException(UserRegisterationException.ExceptionType.INVALID_NAME, "PLEASE ENTER A VALID NAME");
		}
		catch (NullPointerException e) {
			throw new UserRegisterationException(UserRegisterationException.ExceptionType.ENTERED_NULL, "PLEASE ENTER A VALID NAME");
		}
		
	}

}
