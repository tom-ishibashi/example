package com.example.service;

import com.example.dao.BookDao;
import com.example.dao.BookDaoImpl;
import com.example.dao.LibraryDao;
import com.example.dao.LibraryDaoImpl;
import com.example.entity.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookManagementService implements BookManagement {
    
    private LibraryDao libraryDao;
    private BookDao bookDao;
    
    public BookManagementService() {
        this.libraryDao = new LibraryDaoImpl();
        this.bookDao = new BookDaoImpl();
    }
    
    public void execute() {
        // do something.
        Map<String, String> conditions = new HashMap<String, String>();
        conditions.put("param1", "param");    
        conditions.put("param1", "param");
        
        List<Book> books = bookDao.selectBooksByConditions(conditions);
        
        Book book = new Book();
        book.setTitle("title");
        book.setGenre("genre");
        book.setAuthor("author");
        book.setPulished("20151025");
        
        bookDao.update(book);
        bookDao.insert(book);
    }
}
