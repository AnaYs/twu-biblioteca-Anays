package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by isabellamers on 15/04/17.
 */
public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> givenBooks) {
        books = givenBooks;
    }

    public static String welcome() {
        String welcomeMessage = "Welcome to your library!";
        return welcomeMessage;
    }

    public ArrayList<Book> listBooks() {
        return books;
    }

    public static void checkOut(Book book){

        //ImplementArrayList for book array and remove or add
        //Suggest availableBooks variable and CheckedOutBooks variable
    }
}
