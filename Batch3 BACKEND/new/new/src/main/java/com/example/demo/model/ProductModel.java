package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_TABLE")
public class ProductModel {
	@Id
	@Column(name= "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productID;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "QUANTITY")
	private int quantity;
	@Column(name = "PRICE")
	private int price;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "CATEGORY_ID")
	private String categoryId;
	public int getProduct_ID() {
		return productID;
	}
	public void setProduct_ID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProduct_Name(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
}

