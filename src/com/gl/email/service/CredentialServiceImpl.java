package com.gl.email.service;

import java.util.Random;

import com.gl.email.model.Employee;

public class CredentialServiceImpl implements CredentialService {
	String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String Small_chars = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String symbols = "!@#$%^&*_=+-/.?<>)";
	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName.toLowerCase()+ lastName.toLowerCase()+ "@" + department + ".gl.in" ;
	}

	@Override
	public String generatePassword() {
		String values = Capital_chars + Small_chars + numbers + symbols;
		// Using random method
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return String.valueOf(password);
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear" + employee.getFirstName()+ "your generated credentials");
		System.out.println("Email\t\t" + employee.getEmail());
		System.out.println("Password\t" + employee.getPassword());
		
	}

}
