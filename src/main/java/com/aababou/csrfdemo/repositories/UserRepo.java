package com.aababou.csrfdemo.repositories;

import com.aababou.csrfdemo.model.Student;
import com.aababou.csrfdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
author otman
    */
@Repository
public interface UserRepo extends JpaRepository <User, Integer> {

   User findByUsername(String username);

}
