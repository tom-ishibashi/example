package com.example.service;

import com.example.entity.User;

public interface Authentication {
    
    public boolean auth();
    
    public int updateUser(User user);
}
