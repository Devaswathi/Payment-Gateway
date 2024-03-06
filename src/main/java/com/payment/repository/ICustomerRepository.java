package com.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.model.Customer;
@Repository
public interface ICustomerRepository extends JpaRepository<Customer , Long> {

}
