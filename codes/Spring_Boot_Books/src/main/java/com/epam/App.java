package com.epam;

import com.epam.controller.BookController;
import com.epam.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		BookController bookController = context.getBean(BookController.class);

		bookController.addBook(new Book(101,"ABC","Alice"));
		bookController.addBook(new Book(102,"DEF","Bob"));
		bookController.addBook(new Book(103,"GHI","Carl"));
		bookController.addBook(new Book(104,"KLM","Elena"));
		bookController.addBook(new Book(105,"PQR","Damon"));

		bookController.getBookById(104);
		bookController.listAllBooks();
		bookController.updateBook(103,new Book(103,"XYZ","Stefan"));
		bookController.deleteBook(105);
		bookController.listAllBooks();
	}

}
