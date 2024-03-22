package com.example.usermanagement.entity;

import java.time.LocalDate;

public class User {
    private Integer id;
    private String lastName;
    private String firstName;
    private Birthday birthday;

    public User(String lastName, String firstName, LocalDate birthday) {
        this.id = null;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = new Birthday(birthday);
    }

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Birthday getBirthday() {
        return birthday;
    }
}
