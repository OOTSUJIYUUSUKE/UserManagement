package com.example.usermanagement.controller;

import com.example.usermanagement.entity.Birthday;
import com.example.usermanagement.entity.User;

public class UserResponse {
    private Integer id;
    private String fullName;
    private Birthday birthday;

    public UserResponse(User user) {
        this.id = user.getId();
        this.fullName = user.getLastName() + user.getFirstName();
        this.birthday = user.getBirthday();
    }
}
