package com.example.hw2_8;

import java.util.*;

public class Product {
    private String productName;
    private Double productCost;
    private Double quantity;

    public Product(String productName, double productCost, Double quantity) {
        if (productName== null || productName.isBlank()){
            throw new IllegalArgumentException("Заполните карточку товара полностью и корректно (название у продукта должно быть)");
        }else {
            this.productName = productName;
        }
        this.setProductCost(productCost);
        this.setQuantity(quantity);
    }
    public String getProductName() {return productName;}
    public double getProductCost() {return productCost;}
    public Double getQuantity() {return quantity;}

    public void setProductCost(Double productCost) {
        if (productCost <= 0){
            throw new IllegalArgumentException("Заполните карточку товара полностью и корректно(стоимость должна  быть выше нуля)");
        }else {
            this.productCost = productCost;
        }
    }

    public void setQuantity(Double quantity) {
        if (quantity == null){
            quantity = 1.0;
        }else if(quantity < 0.0){
            throw new IllegalArgumentException("Заполните карточку товара корректно (количество не может быть числом отрицательным)");
        }
        this.quantity = quantity;
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
        return productName + " цена " + productCost + " руб количество " + quantity + " кг";
    }

}
