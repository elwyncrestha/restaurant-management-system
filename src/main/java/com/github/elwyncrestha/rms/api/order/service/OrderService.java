package com.github.elwyncrestha.rms.api.order.service;

import java.time.ZonedDateTime;
import java.util.List;

import com.github.elwyncrestha.rms.api.order.entity.Order;
import com.github.elwyncrestha.rms.core.service.BaseService;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
public interface OrderService extends BaseService<Order, Long> {

    List<Order> getAllUnpaid();

    List<Order> findOrdersByOrderDateTimeBetween(ZonedDateTime start, ZonedDateTime end);

    long countOrdersByOrderDateTimeBetween(ZonedDateTime start, ZonedDateTime end);

}
