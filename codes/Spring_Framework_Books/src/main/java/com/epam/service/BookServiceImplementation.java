package com.epam.service;

import com.epam.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


@Service 
public class BookServiceImplementation implements BookService{

    HashMap<Integer,Book> bookHashMap = new HashMap<>();
    @Override
    public void addBook(Book book) {

        bookHashMap.put(book.getId(),book);
    }

    @Override
    public Book getBookById(int id) {

        System.out.println("Book with id "+ id);
        return bookHashMap.get(id);
    }

    @Override
    public List<Book> listAllBooks() {
        List<Book> booksList = new ArrayList<>();

        for(int k:bookHashMap.keySet()){
            booksList.add(bookHashMap.get(k));
        }

        return booksList;
    }

    @Override
    public void updateBook(Book book){
        bookHashMap.put(book.getId(),book);
    }

    @Override
    public void deleteBook(Book book){
        bookHashMap.remove(book.getId());
    }
}
