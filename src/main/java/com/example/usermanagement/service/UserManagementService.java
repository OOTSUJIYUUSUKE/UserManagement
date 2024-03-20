package com.example.usermanagement.service;

import com.example.usermanagement.dto.UserManagementMapper;
import com.example.usermanagement.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagementService {
    private final UserManagementMapper userManagementMapper;

    public UserManagementService(UserManagementMapper userManagementMapper) {
        this.userManagementMapper = userManagementMapper;
    }

    public List<User> findAll() {
        return userManagementMapper.findAll();
    }
}
