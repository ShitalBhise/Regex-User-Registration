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

	public void FirstName() {
		System.out.println("Enter First Name");
		Scanner scanner = new Scanner(System.in);
		String fN = scanner.nextLine();

		/*
		 * Ablidity to check First name starts with Cap and has minimum 3 characters
		 * 
		 */
		if (Pattern.matches("[A-Z]{1}[a-z]{2,}", fN) == true)

			System.out.println("Valid Input ");
		else
			System.out.println("Invalid Input ");

		scanner.close();
	}

}
