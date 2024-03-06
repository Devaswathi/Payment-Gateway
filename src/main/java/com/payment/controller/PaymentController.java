package com.payment.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.payment.model.Payment;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

//this creates checkoutsession id 

@RestController
@RequestMapping("/payment")
@CrossOrigin
public class PaymentController {
		@Value("${stripe.api.key}")
		private String apiKey;
		
		
		public void init() {
			Stripe.apiKey = apiKey;
		}
		
		@PostMapping("/checkoutSession")
		public ResponseEntity<Map<String, String>> checkoutSession(@RequestBody Payment payment) throws StripeException{
			try {
				Stripe.apiKey = apiKey;
				SessionCreateParams.Builder params = SessionCreateParams.builder()
						 .addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
						 .setMode(SessionCreateParams.Mode.PAYMENT)
						 .setSuccessUrl(payment.getSuccessUrl())
						 .setCancelUrl(payment.getCancelUrl())
						 .addLineItem(SessionCreateParams.LineItem.builder()
								 .setQuantity(payment.getQuantity())
								 .setPriceData(SessionCreateParams.LineItem.PriceData.builder()
										 .setCurrency(payment.getCurrency())
										 .setUnitAmount(payment.getAmount()*100)
										 .setProductData(SessionCreateParams.LineItem.PriceData.ProductData.builder()
												 .setName(payment.getName())
												 .setDescription("Good Product! Worth for money")
												 .build() )
			                                     .build())
								                 .build());
//				SessionCreateParams paramBuilder = params.build();
//				Map<String,Object> mapData = new HashMap();
//				mapData.put("payment_method_types", paramBuilder.getPaymentMethodTypes());
//				mapData.put("mode", paramBuilder.getMode());
//				mapData.put("successUrl", paramBuilder.getSuccessUrl());
//				mapData.put("cancelurl", paramBuilder.getCancelUrl());
//				mapData.put("line_items", paramBuilder.getLineItems());
//				Session session = Session.create(paramBuilder);
//				 return ResponseEntity.ok(session.getId());
				
				   Session session = Session.create(params.build());

			        Map<String, String> response = new HashMap<>();
			        response.put("sessionId", session.getId());

			        return ResponseEntity.ok(response);
			}
			 catch(StripeException e){
				 e.printStackTrace();
		            return ResponseEntity.status(500).build();
			 }
		}

		
		private void setSuccessUrl(String successUrl) {
			
		}
}
