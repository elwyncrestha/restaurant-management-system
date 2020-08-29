package com.github.elwyncrestha.rms.api.payment.service;

import java.time.ZonedDateTime;
import java.util.List;

import com.github.elwyncrestha.rms.api.payment.entity.Payment;
import com.github.elwyncrestha.rms.core.service.BaseService;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
public interface PaymentService extends BaseService<Payment, Long> {

    List<Payment> findPaymentsByPaymentDateTimeBetween(ZonedDateTime start, ZonedDateTime end);
}
