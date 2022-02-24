package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.iesalixar.servidor.bd.PoolDB;
import org.iesalixar.servidor.models.ProductLine;

public class ProductLineDAOImpl implements ProductLineDAO {

	@Override
	public ArrayList<ProductLine> getAll() {
		
		ArrayList<ProductLine> categoriasList = new ArrayList<>();
		ProductLine categoria;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			
			String sql = "select * from productlines";
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				
				categoria = new ProductLine();
				categoria.setProductLine(rs.getString("productLine"));
				categoria.setTextDescription(rs.getString("textDescription"));
				categoria.setHtmlDescription(rs.getString("htmlDescription"));
				
				categoriasList.add(categoria);
				
			}
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return categoriasList;
	}

	@Override
	public boolean updateProductLine(ProductLine productLine) {
		
		int resultado = 0;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			String sql = "update productlines set productLine=?, textDescription=?, htmlDescription=? where productLine = ?";
			
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, productLine.getProductLine());
			statement.setString(2, productLine.getTextDescription());
			statement.setString(3, productLine.getHtmlDescription());
			statement.setString(4, productLine.getProductLine());
			
			resultado = statement.executeUpdate();
			
			con.close();
			
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	@Override
	public boolean removeProductLine(String productLine) {
		
		int resultado = 0;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();

		try {

			String sql = "delete from productlines where productLine=?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, productLine);

			resultado = statement.executeUpdate();

			con.close();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return (resultado == 0 ? false : true);
	}

	@Override
	public boolean createProductLine(ProductLine productLine) {
		
		int resultado = 0;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			String sql = "insert into productlines values(?,?,?,null)";
			
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, productLine.getProductLine());
			statement.setString(2, productLine.getTextDescription());
			statement.setString(3, productLine.getHtmlDescription());
			
			resultado = statement.executeUpdate();
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return (resultado == 0 ? false : true);
	}

}
