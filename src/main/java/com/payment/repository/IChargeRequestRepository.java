package com.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.model.ChargeRequest;

@Repository
public interface IChargeRequestRepository extends JpaRepository<ChargeRequest, Long> {

}
