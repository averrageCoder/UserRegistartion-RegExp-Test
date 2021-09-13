package com.bridgelabz.userregistrationregex;

public class UserRegisterationException extends RuntimeException {
	
	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY, INVALID_NAME, INVALID_EMAIL, INVALID_PHONE_NUMBER, INAVLID_PASSWORD,
		VALID_NAME, VALID_EMAIL, VALID_PHONE_NUMBER, VALID_PASSWORD
	}
	
	ExceptionType type;
	
	public UserRegisterationException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
