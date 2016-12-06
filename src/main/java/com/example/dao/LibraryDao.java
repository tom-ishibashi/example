package com.example.dao;

import com.example.entity.Library;

import java.util.List;
import java.util.Map;

public interface LibraryDao {
    
    public Library selectLibraryByCondition(Map<String, String> condition);
    
    public List<Library> selectLibraries();
}
