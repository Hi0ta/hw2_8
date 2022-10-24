package com.example.hw2_8;

import java.util.HashMap;
import java.util.Map;

public class ListOfPassport {
    public static Map<String, Passport> updatePassport = new HashMap<>();
    public static void addPassport(Passport passport){
        updatePassport.put(passport.getNumberPassport(), passport);
    }
    public static void searchPassportByNumber(String numberPassport){
        System.out.println(updatePassport.get(numberPassport));
    }

}
