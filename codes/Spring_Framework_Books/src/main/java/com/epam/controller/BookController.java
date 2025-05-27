package com.epam.controller;


import com.epam.model.Book;
import com.epam.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookController {


    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService=bookService;
    }

    public void addBook(Book book){
        bookService.addBook(book);
    }

    public Book getBookById(int id){
        return bookService.getBookById(id);
    }

    public void updateBook(Book book){
        bookService.updateBook(book);
    }

    public void deleteBook(Book book){
        bookService.deleteBook(book);
    }


}
