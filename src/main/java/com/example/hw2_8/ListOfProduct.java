package com.example.hw2_8;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ListOfProduct {
    public Set<Product> setProduct;

    public ListOfProduct() {setProduct = new HashSet<>();}

    public Set<Product> getSetProduct() {return setProduct;}


    public  void addProduct(Product product){
        if(setProduct.contains(product)){
            throw new IllegalArgumentException("такой товар уже куплен ;-)");
        }else {
            setProduct.add(product);
        }
    }
    @Override
    public String toString() {return "" +  setProduct;}
    @Override
    public int hashCode() {return Objects.hash(setProduct);}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListOfProduct that = (ListOfProduct) o;
        return setProduct.equals(that.setProduct);
    }
}
