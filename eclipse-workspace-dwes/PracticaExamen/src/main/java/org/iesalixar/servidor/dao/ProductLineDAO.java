package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.models.ProductLine;

public interface ProductLineDAO {

	public ArrayList<ProductLine> getAll();
	public boolean updateProductLine(ProductLine productLine);
	public boolean removeProductLine(String productLine);
	public boolean createProductLine(ProductLine productLine);
	
}
