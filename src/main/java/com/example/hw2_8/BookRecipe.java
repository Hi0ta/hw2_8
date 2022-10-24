package com.example.hw2_8;

import java.util.HashSet;
import java.util.Set;

public class BookRecipe {
    public static Set<Recipe> setRecipe = new HashSet<>();
    public static void addRecipe(Recipe recipe){
        if(setRecipe.contains(recipe)){
            throw new IllegalArgumentException("рецепт с таким названием уже существует!!");
        }else {
            setRecipe.add(recipe);
        }
    }
}
