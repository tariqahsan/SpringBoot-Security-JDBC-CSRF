package org.mma.training.java.spring.service;

import java.util.List;

import org.mma.training.java.spring.model.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();
	void getEmployeeById(String empid);
}