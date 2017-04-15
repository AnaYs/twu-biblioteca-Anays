package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;

/**
 * Created by isabellamers on 15/04/17.
 */
public class Library {
    private Book[] books;

    public Library(Book[] givenBooks) {
        books = givenBooks;
    }

    public static String launch() {
        String welcomeMessage = "Welcome to your library!";
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }

    public Book[] listBooks() {
        return books;
    }
}
