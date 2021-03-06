package com.github.elwyncrestha.rms.api.payment.repository;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.elwyncrestha.rms.api.payment.entity.Payment;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    List<Payment> findPaymentsByPaymentDateTimeBetween(ZonedDateTime start, ZonedDateTime end);

    long countPaymentsByPaymentDateTimeBetween(ZonedDateTime start, ZonedDateTime end);
}
