package com.bookcompany.builder.service;

import com.bookcompany.builder.model.Directory;
import com.bookcompany.builder.model.Recipe;

import java.io.*;

public class ReadWriteFileService {
    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        recipe.setDescription("Something");
        writeObjectToFile(recipe, Directory.FILE_DIRECTORY.getPath() + "savedObject.txt");
        Recipe readCustomer = readObjectFromFile(Directory.FILE_DIRECTORY.getPath() + "savedObject.txt");
        System.out.println(readCustomer);
        System.out.println(Directory.FILE_DIRECTORY.getPath());
    }

    private static void writeObjectToFile(Recipe recipe, String filePath){
        try (OutputStream os = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(os)){
            oos.writeObject(recipe);
        } catch (IOException ioException) {
            System.out.println("Something went wrong during writing.");
            System.out.println(ioException.getMessage());
            System.out.println(ioException.getClass());
        }
    }

    private static Recipe readObjectFromFile(String filePath){
        try (InputStream os = new FileInputStream(filePath);
             ObjectInputStream oos = new ObjectInputStream(os)){
            return (Recipe) oos.readObject();
        } catch (IOException | ClassNotFoundException exception) {
            System.out.println("Something went wrong during writing.");
            System.out.println(exception.getMessage());
            System.out.println(exception.getClass());
        }
        return null;
    }
}
