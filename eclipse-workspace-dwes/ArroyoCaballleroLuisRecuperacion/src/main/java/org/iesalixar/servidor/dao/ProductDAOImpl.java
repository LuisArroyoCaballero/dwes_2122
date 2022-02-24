package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.iesalixar.servidor.bd.PoolDB;
import org.iesalixar.servidor.models.Product;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public ArrayList<Product> getAllProducts(String productLine) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		Product product = null;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();

		try {

			String sql = "select * from products where  productLine=?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, productLine);

			ResultSet rs = statement.executeQuery();

			// Como el campo de búsqueda es la clave solo debería obtener un resultado
			// si no es así estaremos machacando cada vez el valor de customer y
			while (rs.next()) {

				product = new Product();
				product.setProductName(rs.getString("productName"));
				product.setProductCode(rs.getString("productCode"));
				product.setProductLine(rs.getString("productLine"));
				product.setProductScale(rs.getString("productScale"));
				product.setProductVendor(rs.getString("productVendor"));
				product.setProductDescription(rs.getString("productDescription"));
				product.setQuantityInStock(rs.getInt("quantityInStock"));
				product.setBuyPrice(rs.getDouble("buyPrice"));
				product.setMsrp(rs.getDouble("MSRP"));
				
				products.add(product);

			}
			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} 

		return products;
	}

	@Override
	public ArrayList<Product> getAll() {
		
		ArrayList<Product> productList = new ArrayList<>();
		Product product;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			
			String sql = "select * from products";
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				
				product = new Product();
				product.setProductCode(rs.getString("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setProductLine(rs.getString("productLine"));
				product.setProductScale(rs.getString("productScale"));
				product.setProductVendor(rs.getString("productVendor"));
				product.setProductDescription(rs.getString("productDescription"));
				product.setQuantityInStock(rs.getInt("quantityInStock"));
				product.setBuyPrice(rs.getDouble("buyPrice"));
				product.setMsrp(rs.getDouble("MSRP"));
				
				
				productList.add(product);
				
			}
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return productList;
	}

	@Override
	public boolean createProduct(Product product) {
		int resultado = 0;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			String sql = "insert into products values(?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, product.getProductCode());
			statement.setString(2, product.getProductName());
			statement.setString(3, product.getProductLine());
			statement.setString(4, product.getProductScale());
			statement.setString(5, product.getProductVendor());
			statement.setString(6, product.getProductDescription());
			statement.setInt(7, product.getQuantityInStock());
			statement.setDouble(8, product.getBuyPrice());
			statement.setDouble(9, product.getMsrp());
			
			resultado = statement.executeUpdate();
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return (resultado == 0 ? false : true);
	}

	@Override
	public Product getByProductCode(String productCode) {

		Product product = null;
		PoolDB pool = new PoolDB();
		Connection con = pool.getConnection();
		
		try {
			
			String sql = "select * from products where productCode=?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, productCode);
			
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {

				product = new Product();
				product.setProductCode(rs.getString("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setProductLine(rs.getString("productLine"));
				product.setProductScale(rs.getString("productScale"));
				product.setProductVendor(rs.getString("productVendor"));
				product.setProductDescription(rs.getString("productDescription"));
				product.setQuantityInStock(rs.getInt("quantityInStock"));
				product.setBuyPrice(rs.getDouble("buyPrice"));
				product.setMsrp(rs.getDouble("MSRP"));
			}
			
			con.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return product;
	}

	
}
