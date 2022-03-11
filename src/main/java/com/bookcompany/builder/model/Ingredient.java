package com.bookcompany.builder.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Ingredient implements Serializable {
    private String description;
    private BigDecimal cost;
    private int calories;
    private FoodType foodType;
}
