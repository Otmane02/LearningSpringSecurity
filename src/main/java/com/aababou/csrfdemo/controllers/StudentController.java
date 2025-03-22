package com.aababou.csrfdemo;

/*
author otman
    */

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class StudentController {


    @GetMapping("hey")
            public String hey(HttpServletRequest request) {
        return "hey"+request.getSession().getId();
    }


    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"otmane","java"),
            new Student(2,"aababou","Php")
    ));

    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("students")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return  (CsrfToken) request.getAttribute("_csrf");
    }
}
