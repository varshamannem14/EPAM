package com.epam.controller;


import com.epam.model.Book;
import com.epam.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")

public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService=bookService;
    }

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book){
        bookService.addBook(book);
        return ResponseEntity.ok("Book added successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        Book book = bookService.getBookById(id);
        if(book!=null){
            return ResponseEntity.ok(book);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Book>> listAllBooks(){
        return ResponseEntity.ok(bookService.listAllBooks());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateBook(@PathVariable int id, @RequestBody Book book){

        bookService.updateBook(book);
        return ResponseEntity.ok("Book updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        if (bookService.getBookById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        bookService.deleteBook(id);
        return ResponseEntity.ok("Book deleted successfully");
    }

}
