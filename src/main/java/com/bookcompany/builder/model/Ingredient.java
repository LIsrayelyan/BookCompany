package com.bookcompany.builder.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Ingredient {
    private String description;
    private BigDecimal cost;
    private int calories;
    private FoodType foodType;
}
