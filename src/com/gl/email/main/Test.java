package com.gl.email.main;

import java.util.Scanner;

import com.gl.email.model.Employee;
import com.gl.email.service.CredentialService;
import com.gl.email.service.CredentialServiceImpl;

public class Test {
	public static void main(String[] args) {
      CredentialService service = new CredentialServiceImpl();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter First Name");
      String fn = sc.next();
      System.out.println("Enter Last Name");
      String ln = sc.next();
      System.out.println("Enter department Name");
      String dept = sc.next();
      
      String password = service.generatePassword();
      System.out.println(password);
      String email = service.generateEmailAddress(fn, ln, dept);
      Employee emp = new Employee(fn, ln);
      emp.setPassword(password);
      emp.setEmail(email);
      
      service.showCredentials(emp);

	}
}
