package com.example.firstspringdatajpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private Long id;
    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }


}
