package com.example.service;

import com.example.dao.UserDao;
import com.example.dao.UserDaoImpl;
import com.example.entity.User;

import java.util.Map;

public class AuthenticationService implements Authentication {

    private UserDao dao;

    public AuthenticationService() {
        this.dao = new UserDaoImpl();
    }

    public void auth() {
        Map<String, String> result = dao.select();
    }

    public void updateUser() {
        User user = new User();
        int result = dao.update(user);
    }
}
