package com.example.hw2_8;

import java.security.Key;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BookOfRecipe {
    public Set<Recipe> setRecipe;
    public BookOfRecipe() {setRecipe = new HashSet<>();}
    public Set<Recipe> getSetRecipe() { return setRecipe;}

    public void addRecipe(Recipe recipe){
        if(setRecipe.contains(recipe)){
            throw new IllegalArgumentException("рецепт с таким названием уже существует!!");
        }else {
            setRecipe.add(recipe);
        }
    }
    @Override
    public String toString() {return "" + setRecipe + "";}
    @Override
    public int hashCode() {return Objects.hash(setRecipe);}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookOfRecipe that = (BookOfRecipe) o;
        return setRecipe.equals(that.setRecipe);
    }
}
