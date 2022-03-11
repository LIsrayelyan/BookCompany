package com.bookcompany.builder.repository;

import com.bookcompany.builder.model.Ingredient;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IngredientRepository {
    private final List<Ingredient> ingredientList = new ArrayList<>();
    public void saveToFile(String filename){
    File file = new File(filename);
    }
}