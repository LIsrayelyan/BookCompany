package com.bookcompany.builder.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Recipe implements Serializable {
    private String description;
    private int quantity;
    private List<Ingredient> ingredients;
}
