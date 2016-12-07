package com.example.service;

import com.example.dao.BookDao;
import com.example.dao.BookDaoImpl;
import com.example.dao.LibraryDao;
import com.example.dao.LibraryDaoImpl;
import com.example.entity.Book;
import com.example.entity.Library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        books.forEach(e -> {
            Book book = new Book();
            book.setTitle(e.getTitle());
            book.setGenre(e.getGenre());
            book.setAuthor(e.getAuthor());
            book.setPulished(e.getPulished());            
            bookDao.update(book);
            bookDao.insert(book);
        });
        
        List<Library> libraries = libraryDao.selectLibraries();
        List<String> libraryNames = libraries
                        .stream()
                        .filter(s -> s.getName().startsWith("library_"))
                        .map(s -> s.getName())
                        .collect(Collectors.toList());
    }
}
