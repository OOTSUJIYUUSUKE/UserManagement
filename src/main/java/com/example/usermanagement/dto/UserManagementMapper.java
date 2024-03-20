package com.example.usermanagement.dto;

import com.example.usermanagement.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserManagementMapper {
    public List<User> findAll();
}
