package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Address")
public class AddressModel {
	@Id
	@Column(name= "USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userId;
	@Column(name= "PINCODE")
	private int pincode;
	@Column(name= "ADDRESS")
	private String address;
	@Column(name= "CITY")
	private String city;
	@Column(name= "STATE")
	private String state;
	@Column(name= "COUNTRY")
	private String country;
	@Column(name= "MOBILE_NUMBER")
	private String mobileNumber;
	
	public AddressModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AddressModel(String userId, int pincode, String address, String city, String state, String country,
			String mobileNumber) {
		super();
		this.userId = userId;
		this.pincode = pincode;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getUserId() {
		return userId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
