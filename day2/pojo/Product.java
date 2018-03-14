package com.htc.day2.pojo;

public class Product {
	
	private int productId;
	private String productDescription;
	private double price;
	
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int productId, String productDescription, double price) {
		super();
		this.productId = productId;
		this.productDescription = productDescription;
		this.price = price;
	}
	public Product(int productId, String productDescription) {
		super();
		this.productId = productId;
		this.productDescription = productDescription;
		
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productDescription=" + productDescription + ", price=" + price
				+ "]";
	}
	
	

}
