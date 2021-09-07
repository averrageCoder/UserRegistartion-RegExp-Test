package com.bridgelabz.userregistrationregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistartionRegex {
	
	//static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		firstNameValidator();
		lastNameValidator();
	}

	private static void lastNameValidator() {
		
		Pattern firstNamePattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher;
		
		System.out.println("\nEnter last name: ");
		String firstName = "Jain"; //scan.nextLine();
		
		matcher = firstNamePattern.matcher(firstName);
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println(firstName+" -\t Valid");
		} 
		else {
			System.out.println(firstName+" -\t Invalid");
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
