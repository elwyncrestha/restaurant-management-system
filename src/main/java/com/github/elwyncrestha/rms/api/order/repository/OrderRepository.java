package com.github.elwyncrestha.rms.api.order.repository;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.github.elwyncrestha.rms.api.order.entity.Order;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("select o from Order o where o.id not in (select distinct p.order.id from Payment p)")
    List<Order> findUnpaidOrders();

    List<Order> findOrdersByOrderDateTimeBetween(ZonedDateTime start, ZonedDateTime end);
}
