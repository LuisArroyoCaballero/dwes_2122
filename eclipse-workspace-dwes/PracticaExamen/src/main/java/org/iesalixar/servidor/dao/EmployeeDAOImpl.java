package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.iesalixar.servidor.bd.PoolDB;
import org.iesalixar.servidor.models.Employee;
import org.iesalixar.servidor.models.ProductLine;
import org.iesalixar.servidor.models.Usuario;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public ArrayList<Employee> getAll() {
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		Employee employee;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			
			String sql = "select * from employees";
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				
				employee = new Employee();
				employee.setEmployeeNumber(rs.getInt("employeeNumber"));
				employee.setLastName(rs.getString("lastName"));
				employee.setFirstName(rs.getString("firstName"));
				employee.setExtension(rs.getString("extension"));
				employee.setEmail(rs.getString("email"));
				employee.setOfficeCode(rs.getString("officeCode"));
				employee.setReportsTo(rs.getInt("reportsTo"));
				employee.setJobTitle(rs.getString("jobTitle"));
				
				
				employeeList.add(employee);
				
			}
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return employeeList;
	}

	@Override
	public Employee getByEmployeeNumber(int employeeNumber) {
		
		Employee employee = null;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			
			String sql = "select * from employees where employeeNumber=?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, employeeNumber);
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {

				employee = new Employee();
				employee.setEmployeeNumber(rs.getInt("employeeNumber"));
				employee.setLastName(rs.getString("lastName"));
				employee.setFirstName(rs.getString("firstName"));
				employee.setExtension(rs.getString("extension"));
				employee.setEmail(rs.getString("email"));
				employee.setOfficeCode(rs.getString("officeCode"));
				employee.setReportsTo(rs.getInt("reportsTo"));
				employee.setJobTitle(rs.getString("jobTitle"));
			}
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return employee;
	}

	@Override
	public boolean createEmployee(Employee empleado) {
		
		int resultado = 0;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			String sql = "insert into employees values(?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, empleado.getEmployeeNumber());
			statement.setString(2, empleado.getLastName());
			statement.setString(3, empleado.getFirstName());
			statement.setString(4, empleado.getExtension());
			statement.setString(5, empleado.getEmail());
			statement.setString(6, empleado.getOfficeCode());
			statement.setInt(7, empleado.getReportsTo());
			statement.setString(8, empleado.getJobTitle());
			
			resultado = statement.executeUpdate();
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return (resultado == 0 ? false : true);
	
	}
	
	

}
