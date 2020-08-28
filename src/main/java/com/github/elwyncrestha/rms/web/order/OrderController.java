package com.github.elwyncrestha.rms.web.order;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.elwyncrestha.rms.api.order.entity.Order;
import com.github.elwyncrestha.rms.api.order.service.OrderService;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@RestController
@RequestMapping(OrderController.URL)
public class OrderController {

    static final String URL = "/orders";
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Order order) {
        return ResponseEntity.ok(service.save(order));
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/unpaid")
    public ResponseEntity<?> getAllUnpaid() {
        return ResponseEntity.ok(service.getAllUnpaid());
    }
}
