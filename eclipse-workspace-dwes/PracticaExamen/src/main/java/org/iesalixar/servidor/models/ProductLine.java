package org.iesalixar.servidor.models;

import java.io.Serializable;

public class ProductLine implements Serializable {

	private String productLine;
	private String textDescription;
	private String htmlDescription;
	
	
	
	
	public ProductLine() {
		super();
		// TODO Auto-generated constructor stub
	}




	public ProductLine(String productLine, String textDescription, String htmlDescription) {
		super();
		this.productLine = productLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
	}




	public String getProductLine() {
		return productLine;
	}




	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}




	public String getTextDescription() {
		return textDescription;
	}




	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}




	public String getHtmlDescription() {
		return htmlDescription;
	}




	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}




	@Override
	public String toString() {
		return "ProductLine [productLine=" + productLine + ", textDescription=" + textDescription + ", htmlDescription="
				+ htmlDescription + "]";
	}
	
	
	
	
}
