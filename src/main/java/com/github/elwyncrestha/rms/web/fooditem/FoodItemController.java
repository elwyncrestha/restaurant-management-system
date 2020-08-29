package com.github.elwyncrestha.rms.web.fooditem;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.elwyncrestha.rms.api.fooditem.service.FoodItemService;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@RestController
@RequestMapping(FoodItemController.URL)
public class FoodItemController {

    static final String URL = "/api/food-items";
    private final FoodItemService service;

    public FoodItemController(
        FoodItemService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

}
