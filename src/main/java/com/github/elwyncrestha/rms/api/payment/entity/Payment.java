package com.github.elwyncrestha.rms.api.payment.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import com.github.elwyncrestha.rms.api.order.entity.Order;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Payment extends AbstractPersistable<Long> {

    @OneToOne
    private Order order;

    private float paidAmount;
    private float returnedAmount;

}
