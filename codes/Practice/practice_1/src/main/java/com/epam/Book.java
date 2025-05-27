package com.epam;

public class Book {

    private int bookID;
    private String bookAuthor;

    public Book(int bookID, String bookAuthor, String bookName) {
        this.bookID = bookID;
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
    }

    private String bookName;


    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }

}
