package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        Library library = getLibrary();
        System.out.println(library.welcome());
        Book[] books = library.listBooks();
        printBooks(books);
    }

    private static void printBooks(Book[] books) {
        System.out.print("\033[0;1m");
        System.out.printf("%-30s %-20s %-20s\n", "Title", "Author", "Year");
        System.out.print("\033[0;0m");
        for(int i = 0; 2 > i; i++) {
            System.out.printf("%-30s %-20s %-20s\n", books[i].getTitle(), books[i].getAuthor(), books[i].getYear());
        }
    }

    private static Library getLibrary() {
        Book[] books = new Book[2];
        books[0] = new Book("Fifty Shades of Grey","Stephen Hawking", "2012" );
        books[1] = new Book("5 Regrets of the Dying","Bronnie Ware", "2016" );
        return new Library(books);
    }

}