package com.twu.biblioteca;

import java.time.Year;

/**
 * Created by isabellamers on 15/04/17.
 */
public class Book {
    private String title;
    String author;
    Year year;

    String getTitle() {
        return title;
    }

    void setTitle(String bookTitle) {
        title = bookTitle;
    }
}
