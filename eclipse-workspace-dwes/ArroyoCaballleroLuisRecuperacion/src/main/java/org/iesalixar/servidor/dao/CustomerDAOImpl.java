package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.iesalixar.servidor.bd.PoolDB;
import org.iesalixar.servidor.models.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public ArrayList<Customer> getAll() {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		Customer customer;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			
			String sql = "select * from customers";
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				
				customer = new Customer();
				customer.setCustomerNumber(rs.getInt("customerNumber"));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setContactLastName(rs.getString("contactLastName"));
				customer.setContactFirstName(rs.getString("contactFirstName"));
				customer.setPhone(rs.getString("phone"));
				customer.setAddressLine1(rs.getString("addressLine1"));
				customer.setAddressLine2(rs.getString("addressLine2"));
				customer.setCity(rs.getString("city"));
				customer.setState(rs.getString("state"));
				customer.setPostalCode(rs.getString("postalCode"));
				customer.setCountry(rs.getString("country"));
				customer.setSalesRepEmployeeNumber(rs.getInt("salesRepEmployeeNumber"));
				customer.setCreditLimit(rs.getDouble("creditLimit"));
				
				
				
				customerList.add(customer);
				
			}
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return customerList;
	}

}
