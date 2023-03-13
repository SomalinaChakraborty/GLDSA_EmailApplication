package com.greatlearning.employee.service;

import com.greatlearning.employee.model.Employee;

public interface CredentialsService {
	public  String generateEmailAddress(Employee emp);
	public String generatePassword();
	public  String showCredentials(Employee emp);

}
