package com.aababou.csrfdemo.services;

import com.aababou.csrfdemo.model.User;
import com.aababou.csrfdemo.model.UserPrincipal;
import com.aababou.csrfdemo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/*
author otman
    */

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
     private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);

        if (user == null) {
            System.out.println("User not found 404 ");
            throw new UsernameNotFoundException(username);

        }
        return new UserPrincipal(user);
    }
}
