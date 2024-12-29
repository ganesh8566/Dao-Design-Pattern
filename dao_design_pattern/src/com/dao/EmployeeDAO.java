package com.dao;

import java.util.List;

import com.dto.Employee;

public interface EmployeeDAO {
	List<Employee> getEmployee();
	Employee getEmployee(int id);
	boolean insertEmployee(int id, String name,String designation,int salary);
	boolean updateEmployeeSalary(Employee e);
	boolean deleteEmployee(int id);
}
