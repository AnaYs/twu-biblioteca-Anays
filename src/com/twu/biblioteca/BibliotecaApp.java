package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Library library = new Library();
        library.launch();
        library.listBooks();
    }
}