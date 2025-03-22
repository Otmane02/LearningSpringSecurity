package com.aababou.csrfdemo.controllers;

import com.aababou.csrfdemo.model.User;
import com.aababou.csrfdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
author otman
    */
@RestController

public class UserController {

    @Autowired
    UserService uservice;
    @PostMapping("register")
    public User createUser(@RequestBody User user) {
        return uservice.saveUser(user);
    }
}
