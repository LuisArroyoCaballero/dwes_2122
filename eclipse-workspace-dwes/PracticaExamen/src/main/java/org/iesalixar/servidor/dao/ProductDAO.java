package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.models.Product;

public interface ProductDAO {
	
	public ArrayList<Product> getAllProducts(String productLine);

}
