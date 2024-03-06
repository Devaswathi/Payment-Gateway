package com.payment.model;

import jakarta.persistence.Entity;

//@Entity
//@Table(name="payments")
//this class will create checkout object comes forn frontend after selecting the product
public class Payment {

	private String name;
	private Long amount;
	private String success;
	private String currency;
	private Long quantity;
	private String successUrl;
	private String cancelUrl;
	public String getName() {
		return name;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public String getSuccessUrl() {
		return successUrl;
	}
	public void setSuccessUrl(String successUrl) {
		this.successUrl = successUrl;
	}
	public String getCancelUrl() {
		return cancelUrl;
	}
	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Payment [name=" + name + ", amount=" + amount + ", success=" + success + ", currency=" + currency
				+ ", quantity=" + quantity + ", successUrl=" + successUrl + ", cancelUrl=" + cancelUrl + "]";
	}
	
}