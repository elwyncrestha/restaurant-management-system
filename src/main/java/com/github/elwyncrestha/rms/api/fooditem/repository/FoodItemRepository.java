package com.github.elwyncrestha.rms.api.fooditem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.elwyncrestha.rms.api.fooditem.entity.FoodItem;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {

}
