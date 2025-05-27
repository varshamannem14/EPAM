package com.epam;

import com.epam.controller.BookController;
import com.epam.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App 
{
    public static void main( String[] args ){

        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        BookController bookController = context.getBean(BookController.class);

        bookController.addBook(new Book(101,"ABC","DEF"));
        System.out.println(bookController.getBookById(101));

    }
}
