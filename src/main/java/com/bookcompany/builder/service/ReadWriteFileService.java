package com.bookcompany.builder.service;

import com.bookcompany.builder.model.Directory;
import com.bookcompany.builder.model.Ingredient;
import com.bookcompany.builder.model.Recipe;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileService {
    private static List<Ingredient> my_recipes;

    public static void main(String[] args) {
        System.out.println(Directory.FILE_DIRECTORY.getPath() + "ingredients.txt");
        readLinesFromFile(Directory.FILE_DIRECTORY.getPath() + "ingredients.txt");
        System.out.println("----------------------------");
        readLinesFromFile(Directory.FILE_DIRECTORY.getPath() + "my_recipes.txt");
        System.out.println("----------------------------");
        readLinesFromFile(Directory.FILE_DIRECTORY.getPath() + "egg_recipes.txt");
    }

    private static List<String> readLinesFromFile(String filePath) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.out.println("Something went wrong during writing.");
            System.out.println(exception.getMessage());
            System.out.println(exception.getClass());
        }
        return lines;
    }





}

