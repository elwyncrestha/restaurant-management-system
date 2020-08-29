package com.github.elwyncrestha.rms.api.order.service;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.elwyncrestha.rms.api.order.entity.Order;
import com.github.elwyncrestha.rms.api.order.repository.OrderRepository;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    public OrderServiceImpl(
        OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order save(Order order) {
        return repository.save(order);
    }

    @Override
    public Order getOne(Long id) {
        return repository.getOne(id);
    }

    @Override
    public List<Order> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Order> getAllUnpaid() {
        return repository.findUnpaidOrders();
    }

    @Override
    public List<Order> findOrdersByOrderDateTimeBetween(ZonedDateTime start, ZonedDateTime end) {
        return repository.findOrdersByOrderDateTimeBetween(start, end);
    }
}
