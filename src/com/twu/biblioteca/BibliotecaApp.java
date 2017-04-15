package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new Book("Fifty Shades of Grey","Stephen Hawking", "2012" );
        books[1] = new Book("5 Regrets of the Dying","Bronnie Ware", "2016" );
        Library library = new Library(books);
        library.launch();
        library.listBooks();
    }
}