package com.github.elwyncrestha.rms.api.fooditem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.elwyncrestha.rms.api.fooditem.entity.FoodItem;
import com.github.elwyncrestha.rms.api.fooditem.repository.FoodItemRepository;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Service
public class FoodItemServiceImpl implements FoodItemService {

    private final FoodItemRepository repository;

    public FoodItemServiceImpl(
        FoodItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public FoodItem save(FoodItem foodItem) {
        return repository.save(foodItem);
    }

    @Override
    public FoodItem getOne(Long id) {
        return repository.getOne(id);
    }

    @Override
    public List<FoodItem> getAll() {
        return repository.findAll();
    }
}
