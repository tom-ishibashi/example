package com.example.dao;

import com.example.entity.AbstractEntity;

import java.sql.Connection;
import java.time.LocalDateTime;

public class AbstractDao {
    
    protected Connection getConnection() {
        // get db connection
        return null;
    }
    
    protected void setCommonParams(AbstractEntity entity) {
        entity.setCreated(LocalDateTime.now());
        entity.setCreateUser("your userId");
        entity.setUpdated(LocalDateTime.now());
        entity.setUpdateUser("your userID");
    }
    
    protected void setUpdateParams(AbstractEntity entity) {
        entity.setUpdated(LocalDateTime.now());
        entity.setUpdateUser("your userID");        
    }
}
