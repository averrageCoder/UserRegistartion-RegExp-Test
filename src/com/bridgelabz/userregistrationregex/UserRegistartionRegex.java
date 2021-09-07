package com.bridgelabz.userregistrationregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistartionRegex {
	
	//static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		firstNameValidator();
		lastNameValidator();
		emailValidator();
		mobilePhoneValidator();
		passwordValidator();
	}

	private static void passwordValidator() {
		
		Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[\\S]{8,}$");
		Matcher matcher;
		
		System.out.println("\nEnter password: ");
		String password = "s9dSs%sd"; //scan.nextLine();
		
		matcher = passwordPattern.matcher(password);
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println(password+" -\t Valid");
		} 
		else {
			System.out.println(password+" -\t Invalid");
		}
		
		
	}

	private static void mobilePhoneValidator() {
		
		Pattern phonePattern = Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");
		Matcher matcher;
		
		System.out.println("\nEnter email: ");
		String phoneNumber = "91 9876543210"; //scan.nextLine();
		
		matcher = phonePattern.matcher(phoneNumber);
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println(phoneNumber+" -\t Valid");
		} 
		else {
			System.out.println(phoneNumber+" -\t Invalid");
		}
		
	}

	private static void emailValidator() {
		
		Pattern emailPattern = Pattern.compile("^abc([.+_-][A-Z0-9]+)?[A-Z0-9]*[@][A-Z0-9]+.[A-Z]{2,}(.[A-Z]{2,6})?$",Pattern.CASE_INSENSITIVE);
		Matcher matcher;
		
		System.out.println("\nEnter email: ");
		String validEmails[] = {
				"abc-100@yahoo.com","abc@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net",
				"abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"
		};
		String invalidEmails[] = {
				"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
				"abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"
		};
		
		for(String email: validEmails) {
			
			 matcher = emailPattern.matcher(email);
			 boolean matchFound = matcher.find();
				if(matchFound) {
					System.out.println(email+"-\tValid");
				} 
				else {
					System.out.println(email+"-\tInvalid");
				}
		}
		System.out.println("\n");
		for(String email: invalidEmails) {
			
			 matcher = emailPattern.matcher(email);
			 boolean matchFound = matcher.find();
				if(matchFound) {
					System.out.println(email+"-\tValid");
				} 
				else {
					System.out.println(email+"-\tInvalid");
				}
		}
		
	}

	private static void lastNameValidator() {
		
		Pattern lastNamePattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher;
		
		System.out.println("\nEnter last name: ");
		String lastName = "Jain"; //scan.nextLine();
		
		matcher = lastNamePattern.matcher(lastName);
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println(lastName+" -\t Valid");
		} 
		else {
			System.out.println(lastName+" -\t Invalid");
		}
		
	}

	private static void firstNameValidator() {
		
		Pattern firstNamePattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher;
		
		System.out.println("Enter first name: ");
		String firstName = "Harsh"; //scan.nextLine();
		
		matcher = firstNamePattern.matcher(firstName);
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println(firstName+" -\t Valid");
		} 
		else {
			System.out.println(firstName+" -\t Invalid");
		}
		
	}

}
