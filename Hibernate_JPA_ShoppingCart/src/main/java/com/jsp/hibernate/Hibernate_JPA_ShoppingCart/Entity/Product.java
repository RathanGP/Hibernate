package com.jsp.hibernate.Hibernate_JPA_ShoppingCart.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product 
{
	@Id
	private int ProductId;
	private String ProductName;
	private String ProductBrand;
	private int ProductPrice;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductBrand() {
		return ProductBrand;
	}
	public void setProductBrand(String productBrand) {
		ProductBrand = productBrand;
	}
	public int getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductBrand=" + ProductBrand
				+ ", ProductPrice=" + ProductPrice + "]";
	}

	
}
