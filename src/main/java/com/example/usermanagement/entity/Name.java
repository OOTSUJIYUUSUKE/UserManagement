package com.example.usermanagement.entity;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class Name {

    @NotBlank
    @Length(min = 1, max = 50)
    private String lastName;
    @Length(min = 1, max = 50)
    private String middleName;
    @NotBlank
    @Length(min = 1, max = 50)
    private String firstName;

    public Name(String lastName, String middleName, String firstName) {
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
    }

    public String getName() {
        if(middleName == null) {
            return lastName + firstName;
        }
        else {
            return lastName + middleName + firstName;
        }
    }
}
