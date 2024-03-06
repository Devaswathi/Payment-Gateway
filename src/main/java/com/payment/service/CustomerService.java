package com.payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.model.Customer;
import com.payment.repository.ICustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private ICustomerRepository customerRepository;
	
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public List<Customer> getCustomer(){
		return customerRepository.findAll();
	}

}
