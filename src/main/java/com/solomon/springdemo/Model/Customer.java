package com.solomon.springdemo.Model;


import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

public class Customer {

    @NotNull(message = "required")
//    @Size(min=1,message = "required")
    private String firstName;
    @NotNull(message = "required")
//    @Size(min=1,message = "required")
    private String lastName;

    @NotNull(message = "is required")
//    @Min(value=0,message = "must be greater than or equal to zero")
//    @Max(value=10, message = "must be less than or equal to ten")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "must be 5 digits or characters ")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
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
