package com.example.service;

import com.example.dao.UserDao;
import com.example.dao.UserDaoImpl;
import com.example.entity.User;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationService implements Authentication {

    private UserDao dao;

    public AuthenticationService() {
        this.dao = new UserDaoImpl();
    }

    public boolean auth() {
        Map<String, String> condition = new HashMap<String, String>();
        // put select condition
        
        User user = dao.selectUserByCondition(condition);
        if (user == null) {
            return false;
        }
        return true;
    }

    public int updateUser(User user) {
        return dao.update(user);
    }
}
