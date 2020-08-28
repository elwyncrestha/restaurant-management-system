package com.github.elwyncrestha.rms.api.order.entity;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import com.github.elwyncrestha.rms.api.fooditem.entity.FoodItem;
import com.github.elwyncrestha.rms.api.user.entity.User;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Order extends AbstractPersistable<Long> {

    @ManyToOne
    private User user;

    @Column(updatable = false)
    private LocalDateTime orderDateTime;

    @ManyToMany
    private List<FoodItem> items;
}
