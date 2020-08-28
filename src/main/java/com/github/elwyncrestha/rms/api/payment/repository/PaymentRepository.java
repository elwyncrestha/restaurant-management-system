package com.github.elwyncrestha.rms.api.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.elwyncrestha.rms.api.payment.entity.Payment;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
