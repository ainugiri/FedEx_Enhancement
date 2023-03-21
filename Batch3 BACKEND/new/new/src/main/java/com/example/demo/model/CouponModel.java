package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUPON_CREATION")
public class CouponModel {
	
	@Id
	@Column(name = "coupon_Codes")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String  coupon_Codes;
	@Column(name = "coupon_Name")
	private String  coupon_Name;
	@Column(name = "description")
	private String description;
	@Column(name = "validity_Date")
	private int validity_Date;
	public String getCoupon_Codes() {
		return coupon_Codes;
	}

	public void setCoupon_Codes(String coupon_Codes) {
		this.coupon_Codes = coupon_Codes;
	}

	public String getCoupon_Name() {
		return coupon_Name;
	}

	public void setCoupon_Name(String coupon_Name) {
		this.coupon_Name = coupon_Name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getValidity_Date() {
		return validity_Date;
	}

	public void setValidity_Date(int validity_Date) {
		this.validity_Date = validity_Date;
	}
}
	
	