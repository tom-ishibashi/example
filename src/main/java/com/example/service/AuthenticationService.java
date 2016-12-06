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

    public boolean auth() {
        Map<String, String> result = dao.select();
        if (result.get("token") == null) {
            return false;
        }
        return true;
    }

    public int updateUser(User user) {
        return dao.update(user);
    }
}
