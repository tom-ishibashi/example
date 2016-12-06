package com.example.controller;

import com.example.service.Authentication;
import com.example.service.AuthenticationService;
import com.example.service.BookManagement;
import com.example.service.BookManagementService;
import com.example.service.Calculate;
import com.example.service.CalculateService;

/**
 * プロセス制御を行うクラス
 */
public class Processing {

    private BookManagement bookManagement;
    private Authentication authentication;
    private Calculate calculate;

    public Processing() {
        this.bookManagement = new BookManagementService();
        this.authentication = new AuthenticationService();
        this.calculate = new CalculateService();
    }

    /**
     * 実行
     */
    public void run() {

        boolean isAuth = authentication.auth();
        if (!isAuth) {
            throw new RuntimeException("Authentication failed.");
        }
        
        bookManagement.execute(); 
        
        for(int i = 0; i < 10; i++) {
            calculate.calc();
        }
    }
}
