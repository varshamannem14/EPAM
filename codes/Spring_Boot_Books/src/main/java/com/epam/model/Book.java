package com.epam.model;


import org.springframework.stereotype.Component;

@Component
public class Book {

    private int id;
    private String title;
    private String author;

    public Book(){};

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {

        return title;
    }

    public String getAuthor() {

        return author;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    @Override
    public String toString() {

        return "id:"+id +" title:"+ title+" author:"+ author;
    }
}
