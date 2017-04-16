package com.twu.biblioteca;

import java.time.Year;

/**
 * Created by isabellamers on 15/04/17.
 */
public class Book {
    private String title;
    private String author;
    private String year;
    private boolean rented;

    public Book (String t, String a, String y) {
        title = t;
        author = a;
        year = y;
        rented = false;
    }

    boolean rented() { return rented; }

    public void rent() { rented = true; }

    String getTitle() {
        return title;
    }

    void setTitle(String bookTitle) {
        title = bookTitle;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String authorName) {
        author = authorName;
    }

    String getYear() {
        return year;
    }

    void setYear(String yearPublished) {
        year = yearPublished;
    }
}
