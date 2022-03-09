package com.bookcompany.builder.model;

import lombok.Data;

import java.util.List;

@Data
public class Recipe {
    private String description;
    private int quantity;
    private List<Ingredient> ingredients;
}
