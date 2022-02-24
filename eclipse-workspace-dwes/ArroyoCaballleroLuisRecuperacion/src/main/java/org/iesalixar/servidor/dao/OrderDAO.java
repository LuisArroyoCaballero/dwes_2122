package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.models.Order;
import org.iesalixar.servidor.models.ProductLine;

public interface OrderDAO {
	
	public ArrayList<Order> getAll();
	public Order getByOrderNumber(int orderNumber);
	public boolean updateOrder(int orderNumber, int customerNumber);

}
