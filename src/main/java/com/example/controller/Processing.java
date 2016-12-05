package com.example.controller;

import com.example.service.Authentication;
import com.example.service.AuthenticationService;
import com.example.service.BusinessLogic;
import com.example.service.BusinessLogicService;

public class Processing {

    private BusinessLogic businessLogic;
    private Authentication authentication;

    public Processing() {
        this.businessLogic = new BusinessLogicService();
        this.authentication = new AuthenticationService();
    }

    public void run() {

        authentication.auth();

        businessLogic.execute();
    }
}
