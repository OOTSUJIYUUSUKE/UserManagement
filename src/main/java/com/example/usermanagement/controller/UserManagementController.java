package com.example.usermanagement.controller;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.service.UserManagementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserManagementController {

    private final UserManagementService userManagementService;

    public UserManagementController(UserManagementService userManagementService) {
        this.userManagementService = userManagementService;
    }

    @GetMapping("/users")
    public List<UserResponse> getAllUsers() {
        List<User> userList = userManagementService.findAll();
        List<UserResponse> userResponse = userList.stream().map(s -> new UserResponse(s)).collect(Collectors.toList());
        return userResponse;
    }
}
