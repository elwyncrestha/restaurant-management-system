package com.github.elwyncrestha.rms.api.payment.service;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.elwyncrestha.rms.api.payment.entity.Payment;
import com.github.elwyncrestha.rms.api.payment.repository.PaymentRepository;


/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository repository;

    public PaymentServiceImpl(
        PaymentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Payment save(Payment payment) {
        return repository.save(payment);
    }

    @Override
    public Payment getOne(Long id) {
        return repository.getOne(id);
    }

    @Override
    public List<Payment> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Payment> findPaymentsByPaymentDateTimeBetween(ZonedDateTime start,
        ZonedDateTime end) {
        return repository.findPaymentsByPaymentDateTimeBetween(start, end);
    }
}
