package com.example.dao;

import com.example.entity.User;

import java.util.Map;

public class UserDaoImpl implements UserDao {

    public User selectUserByCondition(Map<String, String> condition) {
        // access your db
        // resultset to entity
        User user = new User();
        return user;
    }

    public int update(User user) {
        // access your db
        return 0;
    }
}
