package com.example.dao;

import com.example.entity.Book;

import java.util.List;
import java.util.Map;

public interface BookDao {
    public List<Book> selectBooksByConditions(Map<String, String> conditions);
    
    public int update(Book book);
    
    public int insert(Book book);
}
