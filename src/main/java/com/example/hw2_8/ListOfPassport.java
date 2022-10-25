package com.example.hw2_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ListOfPassport {
    public   Map<String, Passport> updatePassport;

    public ListOfPassport() {
        updatePassport = new HashMap<>();
    }

    public Map<String, Passport> getUpdatePassport() {
        return updatePassport;
    }

    public  void addPassport(Passport passport){
        updatePassport.put(passport.getNumberPassport(), passport);
    }
    public  void searchPassportByNumber(String numberPassport){
        System.out.println(updatePassport.get(numberPassport));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListOfPassport that = (ListOfPassport) o;
        return updatePassport.equals(that.updatePassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updatePassport);
    }

    @Override
    public String toString() {
        return "" + updatePassport.values();    }
}
