package com.gl.email.service;

import com.gl.email.model.Employee;

public interface CredentialService {
	public String generateEmailAddress(String firstName, String lastName, String department);

	public String generatePassword();

	public void showCredentials(Employee employee);

}
