package com.rejex;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
@purpose: Ability to add first name
@param: No parameters
@function : FirstName Validation
@return: No return value.
*/

public class UserRegistration {
	static Scanner scanner = new Scanner(System.in);

	public void FirstName() {
		System.out.println("Enter First Name");

		String fN = scanner.nextLine();

		/*
		 * Ablidity to check First name starts with Cap and has minimum 3 characters
		 * 
		 */
		if (Pattern.matches("[A-Z]{1}[a-z]{2,}", fN) == true)

			System.out.println("Valid Input ");
		else
			System.out.println("Invalid Input ");

		// scanner.close();
	}

	public void LastName() {

		System.out.println("Enter Name");
		Scanner scanner = new Scanner(System.in);
		String lN = scanner.nextLine();

		/*
		 * Ablidity to check Last name starts with Cap and has minimum 3 characters
		 * 
		 */
		if (Pattern.matches("[a-z]{2,}[A-Z]{1}", lN) == true)

			System.out.println("Valid Input ");
		else
			System.out.println("Invalid Input ");

	}

	public void Email() {

		System.out.println("Enter Email Address");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.nextLine();

		/*
		 * Ablidity to to enter a valid email address
		 * 
		 */
		if (Pattern.matches("^[a-z]+([.][a-z]+)*@bl+[.]co([.]in)*", email) == true)

			System.out.println("Valid Input ");
		else
			System.out.println("Invalid Input ");

	}

	public void MobileFormat() {

		System.out.println("Enter Mobile Number");
		Scanner scanner = new Scanner(System.in);
		String MbFormat = scanner.nextLine();

		/*
		 * Ablidity to to follow pre-defined Mobile Format
		 * 
		 */
		if (Pattern.matches("^[1-9]{2}\s{1}[1-9]{1}[0-9]{9}$", MbFormat) == true)

			System.out.println("Valid Input ");
		else
			System.out.println("Invalid Input ");

	}
}
