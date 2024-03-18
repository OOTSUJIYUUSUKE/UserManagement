package com.example.usermanagement.entity;

public class User {
    private Integer id;
    private Name name;
    private Birthday birthday;

    public User(Name name, Birthday birthday) {
        this.id = null;
        this.name = name;
        this.birthday = birthday;
    }
}
