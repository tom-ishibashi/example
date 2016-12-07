package com.example.dao;

import com.example.entity.User;

import java.util.Map;

public interface UserDao {

    public User selectUserByCondition(Map<String, String> condition);

    public int update(User user);
}
