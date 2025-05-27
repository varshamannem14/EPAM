package com.epam;


import com.epam.model.Book;
import com.epam.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LibraryManager {

    private BookService bookService;

    @Autowired
    @Qualifier("bookServiceImplementation")
    public void setBookService(BookService bookService){

        this.bookService=bookService;
    }

    public void addAndDisplayBooks(){
        bookService.addBook(new Book(101,"ABC","Alice"));
        bookService.addBook(new Book(102,"DEF","Bob"));

        List<Book> bookList=bookService.listAllBooks();
        bookList.forEach(System.out::println);
        System.out.println("Book with id 102 is "+ bookService.getBookById(102));


    }
}
