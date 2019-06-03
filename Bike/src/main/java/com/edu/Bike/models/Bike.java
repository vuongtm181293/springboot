package com.edu.Bike.models;

import java.math.BigDecimal;
import java.sql.Date;

public class Bike {
	public Bike(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	private String name;
	private String phone;
	private String model;
	public Bike() {
		super();
	}

	private BigDecimal purchasePrice;
	private Date purchaseDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
}
