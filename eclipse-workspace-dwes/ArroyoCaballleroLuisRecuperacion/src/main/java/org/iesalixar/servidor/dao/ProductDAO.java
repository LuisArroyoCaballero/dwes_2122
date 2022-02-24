package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.models.Product;
import org.iesalixar.servidor.models.ProductLine;

public interface ProductDAO {
	
	public ArrayList<Product> getAllProducts(String productLine);
	public ArrayList<Product> getAll();
	public boolean createProduct(Product product);
	public Product getByProductCode(String productCode);
	

}
