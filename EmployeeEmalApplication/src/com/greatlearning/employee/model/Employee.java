package com.greatlearning.employee.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	
	
	
	public Employee(String firstName, String lastName) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		
		// TODO Auto-generated constructor stub
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	
	
	
	
	
	
	
	
	
}
