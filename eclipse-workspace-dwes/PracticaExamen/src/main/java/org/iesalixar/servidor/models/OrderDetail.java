package org.iesalixar.servidor.models;

import java.io.Serializable;

public class OrderDetail implements Serializable {

	private int orderNumber;
	private String productCode;
	private int quantityOrdered;
	private Double priceEach;
	private int orderLineNumber;
	
	
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OrderDetail(int orderNumber, String productCode, int quantityOrdered, Double priceEach,
			int orderLineNumber) {
		super();
		this.orderNumber = orderNumber;
		this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}


	public int getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public int getQuantityOrdered() {
		return quantityOrdered;
	}


	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}


	public Double getPriceEach() {
		return priceEach;
	}


	public void setPriceEach(Double priceEach) {
		this.priceEach = priceEach;
	}


	public int getOrderLineNumber() {
		return orderLineNumber;
	}


	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}


	@Override
	public String toString() {
		return "OrderDetail [orderNumber=" + orderNumber + ", productCode=" + productCode + ", quantityOrdered="
				+ quantityOrdered + ", priceEach=" + priceEach + ", orderLineNumber=" + orderLineNumber + "]";
	}
	
	
	
}
