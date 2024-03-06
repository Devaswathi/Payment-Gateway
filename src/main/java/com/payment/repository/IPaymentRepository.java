package com.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.model.ChargeRequest;
import com.payment.model.Payment;
@Repository
public interface IPaymentRepository extends JpaRepository<ChargeRequest,Long> {

}
