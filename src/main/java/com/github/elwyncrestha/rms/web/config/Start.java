package com.github.elwyncrestha.rms.web.config;

import java.io.File;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

import com.github.elwyncrestha.rms.api.fooditem.service.FoodItemService;

/**
 * @author Elvin Shrestha on 8/28/2020
 */
@Component
public class Start {

    @Value("${classpath.patch}")
    private String patchLocation;

    private final FoodItemService foodItemService;
    private final DataSource dataSource;

    public Start(FoodItemService foodItemService, DataSource dataSource) {
        this.foodItemService = foodItemService;
        this.dataSource = dataSource;
    }

    @PostConstruct
    public void patch() {
        boolean isEmpty = foodItemService.getAll().isEmpty();
        if (isEmpty) {
            String patch = patchLocation + File.separator + "food-items.sql";
            ClassPathResource resource = new ClassPathResource(patch);
            ResourceDatabasePopulator populator = new ResourceDatabasePopulator(resource);
            populator.execute(dataSource);
        }
    }
}
