package com.example.hw2_8;
import java.util.*;
public class Recipe {
    private String recipeName;
    //private Set<Product> setProductInRecipe = new HashSet<>();
    private Map<Product, Double> mapProductInRecipe;
    private double costAllProduct;
    public Recipe(String recipeName) {
        if (recipeName== null || recipeName.isBlank()) {
            System.out.println("название у рецепта должно быть!!!");
        }else {
            this.recipeName = recipeName;
        }
        costAllProduct = 0.0;
        mapProductInRecipe = new HashMap<>();
    }

    public String getRecipeName() {return recipeName;}
    public Map<Product, Double> getMapProductInRecipe() {return mapProductInRecipe;}
    public double getCostAllProduct() {return costAllProduct;}

    public void addProductInRecipe(Product product, double quantity){
        if (mapProductInRecipe.containsKey(product)){
            throw new IllegalArgumentException("Такой продукт уже добавлен в рецепт");
        }else if(quantity <= 0.0){
            quantity = 1.0;
            mapProductInRecipe.put(product, quantity);
            costAllProduct += product.getProductCost() * quantity;
        }else {
            mapProductInRecipe.put(product, quantity);
            costAllProduct += product.getProductCost() * quantity;
        }
    }
    @Override
    public String toString() {
        return recipeName + " список продуктов: " + mapProductInRecipe + " на общую сумму " + costAllProduct + " руб";
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
