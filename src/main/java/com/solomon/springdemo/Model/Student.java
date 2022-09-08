package com.solomon.springdemo.Model;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component("student")
@Scope("singleton")
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;
    private String operatingSystem;
    private final Map<String,String> favouriteLanguageOption;

    public Student() {
        this.favouriteLanguageOption = new HashMap<>();
        this.favouriteLanguageOption.put("Java","Java");
        this.favouriteLanguageOption.put("Ruby","Ruby");
        this.favouriteLanguageOption.put("C#","C#");
        this.favouriteLanguageOption.put("C++","C++");
        this.favouriteLanguageOption.put("Python","Python");
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public Map<String, String> getFavouriteLanguageOption() {
        return favouriteLanguageOption;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
}
