package com.bookcompany.builder;

import com.bookcompany.builder.model.FoodType;
import com.bookcompany.builder.model.Ingredient;
import com.bookcompany.builder.model.Recipe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ingredient lemon = new Ingredient();
        lemon.setCalories(5);
        lemon.setCost(new BigDecimal("0.1"));
        lemon.setDescription("a lemon");
        lemon.setFoodType(FoodType.VEGETARIAN);

        System.out.println(lemon);

        Ingredient egg = new Ingredient();
        egg.setCalories(180);
        egg.setCost(new BigDecimal("0.15"));
        egg.setDescription("an egg");
        egg.setFoodType(FoodType.NON_VEGETARIAN);

        System.out.println(egg);

        Ingredient beef = new Ingredient();
        beef.setCalories((350));
        beef.setCost(new BigDecimal(2));
        beef.setDescription("a beef");
        beef.setFoodType(FoodType.NON_VEGETARIAN);

        System.out.println(beef);

        Ingredient potato = new Ingredient();
        potato.setCalories((210));
        potato.setCost(new BigDecimal(0.2));
        potato.setDescription("a potato");
        potato.setFoodType(FoodType.VEGETARIAN);

        System.out.println(potato);

        Ingredient flour = new Ingredient();
        flour.setCalories((250));
        flour.setCost(new BigDecimal(0.3));
        flour.setDescription("a flour");
        flour.setFoodType(FoodType.VEGETARIAN);

        System.out.println(potato);

        Ingredient tomato = new Ingredient();
        tomato.setCalories((40));
        tomato.setCost(new BigDecimal(0.1));
        tomato.setDescription("a tomato");
        tomato.setFoodType(FoodType.VEGETARIAN);

        System.out.println(tomato);

        Ingredient cheese = new Ingredient();
        cheese.setCalories((150));
        cheese.setCost(new BigDecimal(0.8));
        cheese.setDescription("a cheese");
        cheese.setFoodType(FoodType.VEGETARIAN);

        System.out.println(cheese);

        Ingredient ham = new Ingredient();
        ham.setCalories((80));
        ham.setCost(new BigDecimal(1.5));
        ham.setDescription("a ham");
        ham.setFoodType(FoodType.NON_VEGETARIAN);

        System.out.println(ham);

        Ingredient bread = new Ingredient();
        bread.setCalories((160));
        bread.setCost(new BigDecimal(0.4));
        bread.setDescription("a bread");
        bread.setFoodType(FoodType.VEGETARIAN);

        System.out.println(bread);

        Ingredient mushroom = new Ingredient();
        mushroom.setCalories((40));
        mushroom.setCost(new BigDecimal(1));
        mushroom.setDescription("a mushroom");
        mushroom.setFoodType(FoodType.VEGETARIAN);

        System.out.println(mushroom);

        Ingredient pasta = new Ingredient();
        pasta.setCalories((310));
        pasta.setCost(new BigDecimal(0.9));
        pasta.setDescription("a pasta");
        pasta.setFoodType(FoodType.VEGETARIAN);

        System.out.println(pasta);



        Recipe boiledegg = new Recipe();
        boiledegg.setDescription("boiled eggs and eggs");
        boiledegg.setQuantity(15);


        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(egg);
        ingredientList.add(egg);
        boiledegg.setIngredients(ingredientList);

        System.out.println(boiledegg);

        Recipe scrambledegg = new Recipe();
        scrambledegg.setDescription("scrambledeggs, eggs and eggs");
        scrambledegg.setQuantity(5);


        List<Ingredient> ingredient = new ArrayList<>();
        ingredientList.add(egg);
        ingredientList.add(egg);
        boiledegg.setIngredients(ingredientList);

        System.out.println(scrambledegg);

        Recipe chipswitheggs = new Recipe();
        chipswitheggs.setDescription("chipswitheggs, egg, potato, potato and egg");
        chipswitheggs.setQuantity(25);

        List<Ingredient> ingredients= new ArrayList<>();
        ingredientList.add(egg);
        ingredientList.add(potato);
        boiledegg.setIngredients(ingredientList);

        System.out.println(chipswitheggs);

        Recipe burger = new Recipe();
        burger.setDescription("bun, beef, tomato, cheese");
        burger.setQuantity(30);

        List<Ingredient> Ingredients= new ArrayList<>();
        ingredientList.add(beef);
        ingredientList.add(tomato);
        ingredientList.add(cheese);
        burger.setIngredients(ingredientList);

        System.out.println(burger);

        Recipe scrambledeggs = new Recipe();
        scrambledeggs.setDescription("egg, egg, egg, egg");
        scrambledeggs.setQuantity(8);

        List<Ingredient> ingredients1= new ArrayList<>();
        ingredientList.add(egg);
        ingredientList.add(egg);
        scrambledeggs.setIngredients(ingredientList);

        System.out.println(scrambledeggs);

        Recipe pizzaNapolitana = new Recipe();
        pizzaNapolitana.setDescription("flour, cheese, cheese");
        pizzaNapolitana.setQuantity(30);

        List<Ingredient> Ingredients1= new ArrayList<>();
        ingredientList.add(flour);
        ingredientList.add(cheese);
        ingredientList.add(cheese);
        pizzaNapolitana.setIngredients(ingredientList);

        System.out.println(pizzaNapolitana);

        Recipe sandwich = new Recipe();
        sandwich.setDescription("bread, bread, cheese, ham");
        sandwich.setQuantity(5);

        List<Ingredient> Ingredients2= new ArrayList<>();
        ingredientList.add(bread);
        ingredientList.add(bread);
        ingredientList.add(cheese);
        ingredientList.add(ham);
        sandwich.setIngredients(ingredientList);

        System.out.println(sandwich);

        Recipe chips = new Recipe();
        chips.setDescription("potato, potato, potato");
        chips.setQuantity(25);

        List<Ingredient> ingredients2= new ArrayList<>();
        ingredientList.add(potato);
        ingredientList.add(potato);
        ingredientList.add(potato);
        chips.setIngredients(ingredientList);

        System.out.println(chips);

        Recipe pizza4seasons = new Recipe();
        pizza4seasons.setDescription("flour, cheese, cheese, cheese, cheese");
        pizza4seasons.setQuantity(35);

        List<Ingredient> ingredients3= new ArrayList<>();
        ingredientList.add(flour);
        ingredientList.add(cheese);
        ingredientList.add(cheese);
        ingredientList.add(cheese);
        ingredientList.add(cheese);
        pizza4seasons.setIngredients(ingredientList);

        System.out.println(pizza4seasons);

        Recipe pizzaham = new Recipe();
        pizzaham.setDescription("flour, cheese, ham, mushroom, tomato");
        pizzaham.setQuantity(40);

        List<Ingredient> Ingredients3= new ArrayList<>();
        ingredientList.add(flour);
        ingredientList.add(cheese);
        ingredientList.add(ham);
        ingredientList.add(mushroom);
        ingredientList.add(tomato);
        pizzaham.setIngredients(ingredientList);

        System.out.println(pizzaham);

        Recipe pastanapolitana = new Recipe();
        pastanapolitana.setDescription("pasta, ham, egg");
        pastanapolitana.setQuantity(25);

        List<Ingredient> Ingredients4= new ArrayList<>();
        ingredientList.add(pasta);
        ingredientList.add(ham);
        ingredientList.add(egg);
        pastanapolitana.setIngredients(ingredientList);

        System.out.println(pastanapolitana);

        Recipe pastaspeciale = new Recipe();
        pastaspeciale.setDescription("pasta, secret ingredient, egg, gold dust, cheese");
        pastaspeciale.setQuantity(25);

        List<Ingredient> ingredients4= new ArrayList<>();
        ingredientList.add(pasta);
        ingredientList.add(egg);
        ingredientList.add(cheese);
        pastaspeciale.setIngredients(ingredientList);

        System.out.println(pastaspeciale);

        Recipe omelette = new Recipe();
        omelette.setDescription("egg, egg, cheese, ham");
        omelette.setQuantity(15);

        List<Ingredient> ingredients5= new ArrayList<>();
        ingredientList.add(egg);
        ingredientList.add(egg);
        ingredientList.add(cheese);
        ingredientList.add(ham);
        omelette.setIngredients(ingredientList);

        System.out.println(omelette);

        Recipe omelettevegeteranian = new Recipe();
        omelettevegeteranian.setDescription("egg, egg, cheese");
        omelettevegeteranian.setQuantity(15);

        List<Ingredient> ingredients6= new ArrayList<>();
        ingredientList.add(egg);
        ingredientList.add(egg);
        ingredientList.add(cheese);
        omelettevegeteranian.setIngredients(ingredientList);

        System.out.println(omelettevegeteranian);



    }
}
