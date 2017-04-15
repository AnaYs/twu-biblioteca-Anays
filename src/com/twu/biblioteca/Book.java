package com.twu.biblioteca;

import java.time.Year;

/**
 * Created by isabellamers on 15/04/17.
 */
public class Book {
    private String title;
    private String author;
    private String year;

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
