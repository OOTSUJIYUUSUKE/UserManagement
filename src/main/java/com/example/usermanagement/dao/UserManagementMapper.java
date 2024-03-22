package com.example.usermanagement.dao;

import com.example.usermanagement.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserManagementMapper {
    public List<User> findAll();
}
