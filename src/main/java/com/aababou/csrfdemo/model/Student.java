package com.aababou.csrfdemo.controllers;

public class Student {
        private int id;
        private String name;
        private String email;

        // Constructeur avec paramètres
        public Student(int id, String name, String email) {
                this.id = id;
                this.name = name;
                this.email = email;
        }

        // Constructeur par défaut (si nécessaire)
        public Student() {}

        // Getters et Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
}
