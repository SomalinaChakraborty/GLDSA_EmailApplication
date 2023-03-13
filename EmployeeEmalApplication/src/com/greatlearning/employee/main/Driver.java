package com.greatlearning.employee.main;

import java.util.Scanner;

import com.greatlearning.employee.model.Employee;
import com.greatlearning.employee.service.CredentialServiceImpl;
import com.greatlearning.employee.service.CredentialsService;

public class Driver {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			CredentialsService service=new CredentialServiceImpl();
			
			
			Employee emp=new Employee("Somalina","Chakraborty");
			
			System.out.println("Please select department from the following");
			System.out.println("1.Technical");
			System.out.println("2.Admin");
			System.out.println("3.Human Resources");
			System.out.println("4.Legal");
			int choice=sc.nextInt();
			String department=null;
			switch(choice) {
			case 1:
				department="tech";
				break;
			case 2:
				department="admin";
				break;
			case 3:
				department="hr";
				break;
				
			case 4:
				department="legal";
				break;
			default:
				System.out.println("Please select department from the following");
}
				if(department!=null){
					emp.setDepartment(department);
				}
				String emailAddress=service.generateEmailAddress(emp);
				emp.setEmail(emailAddress);
				String password=service.generatePassword();
				emp.setPassword(password);
				service.showCredentials(emp);
		}
	}
}
