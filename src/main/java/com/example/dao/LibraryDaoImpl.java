package com.example.dao;

import com.example.entity.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LibraryDaoImpl implements LibraryDao{

    public Library selectLibraryByCondition(Map<String, String> condition) {
        
        // access your DB
        
        // resultset to entity
        Library entity = new Library();

        return entity;
    }

    public List<Library> selectLibraries() {
        
        // access your DB

        // resultset to entity
        Library entity = new Library();
        List<Library> libraries = new ArrayList<Library>();
        libraries.add(entity);

        return libraries;
    }
}
