package com.alkeshgupta.springboot.thymeleafdemo.model;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;
    private List<String> favouriteOperatingSystem;

    public Student () {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public List<String> getFavouriteOperatingSystem() {
        return favouriteOperatingSystem;
    }

    public void setFavouriteOperatingSystem(List<String> favouriteOperatingSystem) {
        this.favouriteOperatingSystem = favouriteOperatingSystem;
    }
}
