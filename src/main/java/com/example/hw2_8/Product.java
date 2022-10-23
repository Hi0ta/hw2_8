package com.example.hw2_8;

import java.util.Objects;

public class Product {
    private String productName;
    private double productCost;
    private double productQuantity;

    public Product(String productName, double productCost, double productQuantity) {
        if (productName== null || productName.isBlank()){
            throw new IllegalArgumentException("Заполните карточку товара полностью и корректно");
            //System.out.println("Заполните карточку товара полностью");
        }else {
            this.productName = productName;
        }
        this.setProductCost(productCost);
        this.setProductQuantity(productQuantity);
    }

    public String getProductName() {return productName;}
    public double getProductCost() {return productCost;}
    public double getProductQuantity() {return productQuantity;}

    public void setProductCost(double productCost) {
        if (productCost <= 0){
            throw new IllegalArgumentException("Заполните карточку товара полностью и корректно");
            //System.out.println("Заполните карточку товара полностью");
        }else {
            this.productCost = productCost;
        }
    }
    public void setProductQuantity(double productQuantity) {
        if (productQuantity <= 0){
            throw new IllegalArgumentException("Заполните карточку товара полностью и корректно");
            //System.out.println("Заполните карточку товара полностью");
        }else {
            this.productQuantity = productQuantity;
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
        return productName + " цена " + productCost + "руб количество " + productQuantity + " кг";
    }


}
