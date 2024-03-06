package com.payment.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.payment.model.ChargeRequest;
import com.payment.model.Payment;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.Customer;
import com.stripe.model.PaymentMethod;
import com.stripe.model.Token;

@Service
public class ChargeRequestService {
//	
//	@Value("${stripe.api.key}")
//	private String apiKey;
//	
//	
//	public void init() {
//		Stripe.apiKey = apiKey;
//	}
//	
//	public ResponseEntity<String> add(ChargeRequest chargeRequest){
//	 Stripe.apiKey = apiKey; // Assuming you have a valid API key
//
//     try {
//         // Create a PaymentMethod using the provided card details
//         Map<String, Object> paymentMethodParams = new HashMap<>();
//         paymentMethodParams.put("type", "card");
//         paymentMethodParams.put("card", Map.of(
//                 "number", chargeRequest.getCardNumber(),
//                 "cvc", chargeRequest.getCvc(),
//                 "exp_month", chargeRequest.getExpiryMonth(),
//                 "exp_year", chargeRequest.getExpiryYear()
//         ));
//
//         PaymentMethod paymentMethod = PaymentMethod.create(paymentMethodParams);
//
//         // Create a Customer with the email and the newly created PaymentMethod
//         Map<String, Object> customerParams = new HashMap<>();
//         customerParams.put("email", chargeRequest.getEmail());
//         customerParams.put("payment_method", paymentMethod.getId());
//
//         Customer customer = Customer.create(customerParams);
//
//         return ResponseEntity.ok("Card added successfully to customer " + customer.getId());
//     } catch (StripeException e) {
//         return ResponseEntity.badRequest().body("Error: " + e.getMessage());
//     }
// }
//	
//	public ResponseEntity<String> add(ChargeRequest chargeRequest) {
//   
//    	Stripe.apiKey = apiKey;
//    	Map<String , Object> charge = new HashMap();
//    	charge.put("number" , chargeRequest.getCardNumber());
//    	charge.put("cvc", chargeRequest.getCvc());
//    	charge.put("exp_month" , chargeRequest.getExpiryMonth());
//    	charge.put("exp_year", chargeRequest.getExpiryYear());
//    	
//    	Map<String , Object> save = new HashMap();
//    	save.put("card" , charge);
//    	
//    	 try {
//    		 PaymentMethod paymentMethod = PaymentMethod.create(save);
//    		 Map<String, Object> customerParams = new HashMap<>();
//             customerParams.put("email", chargeRequest.getEmail());
//             customerParams.put("payment_method", paymentMethod.getId());
//             Customer customer = Customer.create(customerParams);
//             return ResponseEntity.ok().body("Card added successfully to customer " + customer.getId());
//    	 }
//    	 catch(StripeException e){
//    		 return ResponseEntity.badRequest().body("Error: " + e.getMessage());
//    	 }
//    }
//    catch(Exception e) {
//    	e.printStackTrace();
//    	throw new RuntimeException("Failed");
//    }
//    return chargeRequest;
//}
	
//	public Payment charge(Payment payment) {
//		try {
//			Stripe.apiKey = apiKey;
//			Map<String , Object> chargeParams = new HashMap();
//			chargeParams.put("amount", payment.getAmount() * 100);
//			chargeParams.put("currency", "USD");
//			chargeParams.put("source", payment.getStripeToken()); 
//			
//			Map<String, Object> metaData = new HashMap();
//			metaData.put("id", payment.getChargeId());
//			metaData.putAll(chargeParams);
////			chargeParams.put( "metaData" , metaData);
//			
//			Charge charge = Charge.create(chargeParams);
//			payment.setMessage(charge.getOutcome().getSellerMessage());
//			
//			if(charge.getPaid()) {
//				payment.setChargeId(charge.getId());
//				payment.setSuccess(true);
//			}
//			return payment;
//		}
//		catch(Exception e) {
//			throw new RuntimeException("Invalid");
//		}
//	}
//	 public Payment charge(Payment payment) throws StripeException {
//	        Stripe.apiKey = apiKey;
//
//	        Map<String, Object> chargeParams = new HashMap<>();
//	        chargeParams.put("amount", payment.getAmount() * 100); // Amount should be in cents
//	        chargeParams.put("currency", "USD");
//	        chargeParams.put("source", payment.getStripeToken());
//
//	        Charge charge = Charge.create(chargeParams);
//
//	        if (charge.getPaid()) {
//	            payment.setSuccess(true);
//	            payment.setMessage("Payment successful!");
//	            payment.setChargeId(charge.getId());
//	        } else {
//	            payment.setSuccess(false);
//	            payment.setMessage("Payment failed");
//	        }
//	        
//	        return payment;
//	    }
}

