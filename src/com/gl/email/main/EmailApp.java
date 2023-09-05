package com.gl.email.main;

import java.util.Scanner;

import com.gl.email.model.Employee;
import com.gl.email.service.CredentialService;
import com.gl.email.service.CredentialServiceImpl;

public class EmailApp {

	public static void main(String[] args) {
		CredentialService service = new CredentialServiceImpl();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Fist Name");
		String firstName = sc.next();
		System.out.println("Enter Last Name");
		String lastName = sc.next();

		Employee employee = new Employee(firstName, lastName);
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = sc.nextInt();
		String department = "";
		switch (option) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "ad";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "lg";
			break;

		default:
			System.out.println("please enter correct choice");
			break;
		}
		
		String email = service.generateEmailAddress(firstName, lastName, department);
		employee.setEmail(email);
		
		String password = service.generatePassword();
		employee.setPassword(password);
		
		service.showCredentials(employee);
	}

}
