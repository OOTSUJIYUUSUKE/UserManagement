package com.example.usermanagement.entity;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class Name {

    @NotBlank
    @Length(min = 1, max = 50)
    private String lastName;
    @NotBlank
    @Length(min = 1, max = 50)
    private String firstName;
    private String fullName;

    public Name(String lastName, String firstName) {
        this.fullName = lastName + " " + firstName;
    }

}
