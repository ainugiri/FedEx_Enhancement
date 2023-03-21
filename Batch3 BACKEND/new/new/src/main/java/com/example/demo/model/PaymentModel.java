package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT_TABLE")
public class PaymentModel {
	@Id
	@Column(name= "CARD_NUMBER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cardNumber;
	@Column(name= "EXPIRY_DATE")
	private String expiryDate;
	@Column(name= "CVV")
	private int cvv;
	@Column(name= "CARD_HOLDER")
	private String cardHolder;
	@Column(name= "TOTAL_AMOUNT")
	private int totalAmount;
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getCardHolder() {
		return cardHolder;
	}
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
	