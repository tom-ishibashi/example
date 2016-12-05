package com.example.dao;

import com.example.entity.User;

import java.util.Map;

public interface UserDao {

    public Map<String, String> select();

    public int update(User user);
}
