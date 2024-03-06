package com.payment.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChargeRequest {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String token;
	    private double amount;
	    private Date paymentDate;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getToken() {
			return token;
		}
		public void setToken(String token) {
			this.token = token;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public Date getPaymentDate() {
			return paymentDate;
		}
		public void setPaymentDate(Date paymentDate) {
			this.paymentDate = paymentDate;
		}
		@Override
		public String toString() {
			return "ChargeRequest [id=" + id + ", token=" + token + ", amount=" + amount + ", paymentDate="
					+ paymentDate + "]";
		}
        
	
}