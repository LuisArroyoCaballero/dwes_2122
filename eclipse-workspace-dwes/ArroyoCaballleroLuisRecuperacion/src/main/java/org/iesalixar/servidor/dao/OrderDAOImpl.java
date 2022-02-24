package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.iesalixar.servidor.bd.PoolDB;
import org.iesalixar.servidor.models.Order;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public ArrayList<Order> getAll() {
		ArrayList<Order> orderList = new ArrayList<>();
		Order order;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			
			String sql = "select * from orders";
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				
				order = new Order();
				order.setOrderNumber(rs.getInt("orderNumber"));
				order.setOrderDate(rs.getString("orderDate"));
				order.setRequiredDate(rs.getString("requiredDate"));
				order.setShippedDate(rs.getString("shippedDate"));
				order.setStatus(rs.getString("status"));
				order.setComments(rs.getString("comments"));
				order.setCustomerNumber(rs.getInt("customerNumber"));
				
				
				orderList.add(order);
				
			}
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return orderList;
	}

	@Override
	public Order getByOrderNumber(int orderNumber) {
		
		Order order = null;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			
			String sql = "select * from orders where orderNumber=?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, orderNumber);
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {

				order = new Order();
				order.setOrderNumber(rs.getInt("orderNumber"));
				order.setOrderDate(rs.getString("orderDate"));
				order.setRequiredDate(rs.getString("requiredDate"));
				order.setShippedDate(rs.getString("shippedDate"));
				order.setStatus(rs.getString("status"));
				order.setComments(rs.getString("comments"));
				order.setCustomerNumber(rs.getInt("customerNumber"));
			}
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return order;
	}

	@Override
	public boolean updateOrder(int orderNumber, int customerNumber) {
		
		int resultado = 0;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			String sql = "update orders set customerNumber=? where orderNumber = ?";
			
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, customerNumber);
			statement.setInt(2, orderNumber);
			
			
			resultado = statement.executeUpdate();
			
			con.close();
			
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

}
