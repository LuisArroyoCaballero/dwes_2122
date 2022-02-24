package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.models.Employee;

public interface EmployeeDAO {
	
	public ArrayList<Employee> getAll();
	public Employee getByEmployeeNumber(int employeeNumber);
	public boolean createEmployee(Employee empleado);

}
