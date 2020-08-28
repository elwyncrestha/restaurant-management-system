package com.github.elwyncrestha.rms.web.payment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.elwyncrestha.rms.api.payment.entity.Payment;
import com.github.elwyncrestha.rms.api.payment.service.PaymentService;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@RestController
@RequestMapping(PaymentController.URL)
public class PaymentController {

    static final String URL = "/payments";
    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Payment payment) {
        return ResponseEntity.ok(service.save(payment));
    }

}
