package com.epam.service;

import com.epam.model.Book;

import java.util.List;

public interface BookService {

    void addBook(Book book);
    Book getBookById(int id);
    List<Book> listAllBooks();
    void updateBook(Book book);
    void deleteBook(Book book);
}
