package com.example.hw2_8;
import java.util.*;
public class Recipe {
    private String recipeName;
    Map<Product, Double> mapProductInRecipe = new HashMap<>();
    private double costAllProduct = 0.0;
    public Recipe(String recipeName, Map<Product, Double> mapProductInRecipe) {
        if (recipeName== null || recipeName.isBlank()) {
            System.out.println("название у рецепта должно быть!!!");
        }else {
            this.recipeName = recipeName;
        }
        this.mapProductInRecipe = mapProductInRecipe;
    }
    public String getRecipeName() {return recipeName;}
    public Map<Product, Double> getMapProductInRecipe() {return mapProductInRecipe;}
    public double getCostAllProduct() {return costAllProduct;}
    @Override
    public String toString() {
        return recipeName + " список продуктов: " + mapProductInRecipe.keySet() + " на общую сумму " + allCost(costAllProduct, mapProductInRecipe) + " руб";
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
    public static double allCost(double costAllProduct, Map<Product, Double> mapProductInRecipe){
        for (Map.Entry<Product, Double> cost:mapProductInRecipe.entrySet()){
            costAllProduct += cost.getKey().getProductCost() * cost.getValue();
        }
        return costAllProduct;
    }

}
