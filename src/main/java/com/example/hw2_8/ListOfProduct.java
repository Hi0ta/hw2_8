package com.example.hw2_8;
import java.util.HashSet;
import java.util.Set;

public class ListOfProduct {
    public static Set<Product> setProduct = new HashSet<>();
    public static void addProduct(Product product){
        if(setProduct.equals(product)){
            throw new IllegalArgumentException("дважды добавить одно и то же нельзя!!");
        }else {
            setProduct.add(product);
        }
    }


}
