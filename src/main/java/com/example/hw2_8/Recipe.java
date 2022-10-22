package com.example.hw2_8;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private String recipeName;
    Set<Product> setProductInRecipe = new HashSet<>();
    private double costAllProduct = 0.0;
    Product product;


    public Recipe(String recipeName, Set<Product> setProductInRecipe) {
        if (recipeName== null || recipeName.isBlank()) {
            System.out.println("название у рецепта должно быть!!!");
        }else {
            this.recipeName = recipeName;
        }
        this.setProductInRecipe = setProductInRecipe;
    }

    public static double allCost(double costAllProduct, Set<Product> setProductInRecipe){
    for(Product product: setProductInRecipe) {
        costAllProduct += product.getProductCost();
        }
    return costAllProduct;
    }

    public String getRecipeName() {return recipeName;}
    public Set<Product> getSetProductInRecipe() {return setProductInRecipe;}
    public double getCostAllProduct() {return costAllProduct;}

    @Override
    public String toString() {
        return recipeName + " список продуктов: " + setProductInRecipe + " на общую сумму " + allCost(costAllProduct, setProductInRecipe) + " руб";
    }

    @Override
    public int hashCode() {return Objects.hash(recipeName);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return recipeName.equals(recipe.recipeName);
    }
}
