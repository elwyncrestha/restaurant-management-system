package com.github.elwyncrestha.rms.api.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.elwyncrestha.rms.api.order.entity.Order;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
