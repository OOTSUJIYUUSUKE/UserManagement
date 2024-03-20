package com.example.usermanagement.entity;

import java.time.LocalDate;

public class User {
    private Integer id;
    private Name name;
    private Birthday birthday;

    public User(Integer id, String lastName, String firstName, LocalDate birthday) {
        this.id = id;
        this.name = new Name(lastName, firstName);
        this.birthday = new Birthday(birthday);
    }
}
