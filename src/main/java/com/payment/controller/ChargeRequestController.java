package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.model.ChargeRequest;
import com.payment.model.Payment;
import com.payment.service.ChargeRequestService;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;

@RestController
@RequestMapping("/stripe")
@CrossOrigin("*")
public class ChargeRequestController {
	
	@Autowired
	private ChargeRequestService chargeRequestService;
	
	@Value("${stripe.api.key}")
	private String apiKey;
	
	public void init() {
		Stripe.apiKey = apiKey;
		
	}
	
	

//	@PostMapping("/createToken")
//    public ResponseEntity<String> createChargeRequest(@RequestBody ChargeRequest chargeRequest) {
//       return chargeRequestService.add(chargeRequest);
////        if (savedChargeRequest.getToken() != null) {
////            return ResponseEntity.ok(savedChargeRequest);
////        } 
//    }

//	 @PostMapping("/charge")
//	    public ResponseEntity<Payment> charge(@RequestBody Payment payment) {
//	        try {
//	            Payment chargedPayment = chargeRequestService.charge(payment);
//	            if (chargedPayment.isSuccess()) {
//	                return ResponseEntity.ok(chargedPayment);
//	            } else {
//	                return ResponseEntity.badRequest().body(chargedPayment);
//	            }
//	        } catch (StripeException e) {
//	            return ResponseEntity.badRequest().body(new Payment());
//	        }
//	    }	    
}
