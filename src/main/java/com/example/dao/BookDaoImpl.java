package com.example.dao;

import com.example.entity.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookDaoImpl extends AbstractDao implements BookDao{
    
    private Connection con;
    
    public BookDaoImpl() {
        this.con = getConnection();
    }
    
    public List<Book> selectBooksByConditions(Map<String, String> conditions) {
        
        Book entity = new Book();
        List<Book> books = new ArrayList<Book>();

        try {
            // access your DB
            PreparedStatement ps = con.prepareStatement("sql");
            ResultSet rs = ps.executeQuery();
            
            // resultset to entity
            while(rs.next()) {
                entity.setTitle(rs.getString("title"));
                books.add(entity);
            }
        } catch(SQLException se) {
            // 
        }
        
        return books;
    }

    public int update(Book book) {
        
        setUpdateParams(book);
        
        // access your DB
        
        // return update row counts;
        return 0;
    }

    public int insert(Book book) {
        
        setCommonParams(book);
        
        // access your DB
        
        // return insert result;
        return 1;
    }
    
    
}
