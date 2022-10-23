package com.example.hw2_8;

import java.util.*;

public class Product {
    private String productName;
    private double productCost;

    public Product(String productName, double productCost) {
        if (productName== null || productName.isBlank()){
            throw new IllegalArgumentException("Заполните карточку товара полностью и корректно");
        }else {
            this.productName = productName;
        }
        this.setProductCost(productCost);
    }
    public String getProductName() {return productName;}
    public double getProductCost() {return productCost;}

    public void setProductCost(double productCost) {
        if (productCost <= 0){
            throw new IllegalArgumentException("Заполните карточку товара полностью и корректно");
        }else {
            this.productCost = productCost;
        }
    }
    @Override
    public int hashCode() {return Objects.hash(productName, productCost);}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.productCost, productCost) == 0 && productName.equals(product.productName);
    }
    @Override
    public String toString() {
        return productName + " цена " + productCost + "руб";
    }

}
