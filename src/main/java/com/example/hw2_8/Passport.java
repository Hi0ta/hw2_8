package com.example.hw2_8;

import java.time.LocalDate;
import java.util.*;

public class Passport {
    private final String numberPassport;
    private String firstName;
    private String lastName;
    private String middleName;
    private final LocalDate dateOfBirth;

    public Passport(String numberPassport, String lastName, String firstName, String middleName, LocalDate dateOfBirth) {
        if(numberPassport.length()!= 6){
            this.numberPassport = "поле заполнено некорректно!!!";
        }else {
            this.numberPassport = numberPassport;
        }
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.middleName = middleName;
        if (dateOfBirth.equals(null) ){
            this.dateOfBirth = LocalDate.of(1900, 01, 01);
        }else {
            this.dateOfBirth = dateOfBirth;
        }
    }
    public String getNumberPassport() {return numberPassport;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getMiddleName() {return middleName;}
    public LocalDate getDateOfBirth() {return dateOfBirth;}
    public void setFirstName(String firstName) {
        if (firstName.isBlank() || firstName == null){
            this.firstName = "поле заполнено некорректно!";
        }else {
            this.firstName = firstName;
        }
    }
    public void setLastName(String lastName) {
        if (lastName.isBlank() || lastName == null){
            this.lastName = "поле заполнено некорректно!";
        }else {
            this.lastName = lastName;
        }
    }
    public void setMiddleName(String middleName) {this.middleName = middleName;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return numberPassport.equals(passport.numberPassport);
    }
    @Override
    public int hashCode() {return Objects.hash(numberPassport);}
    @Override
    public String toString() {
        return "паспорт № " + numberPassport + " ФИО: " + lastName + " " + firstName + " " + middleName + ", дата рождения: " + dateOfBirth;
    }
}
