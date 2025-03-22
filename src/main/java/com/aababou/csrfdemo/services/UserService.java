package com.aababou.csrfdemo.services;

import com.aababou.csrfdemo.model.User;
import com.aababou.csrfdemo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/*
author otman
    */
@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return userRepo.save(user);
    }
}

