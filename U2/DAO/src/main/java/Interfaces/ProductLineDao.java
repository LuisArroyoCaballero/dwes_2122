package Interfaces;


import java.util.List;

import ClassModel.ProductLine;

public interface ProductLineDao {
	ProductLine getProductLine(String name);
	List<ProductLine> getProductLines();
	void DeleteProductLine(String name);
}
