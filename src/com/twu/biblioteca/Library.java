package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by isabellamers on 15/04/17.
 */
public class Library {
    public static ArrayList<Book> availableBooks = new ArrayList<Book>();
    private static ArrayList<Book> rentedBooks = new ArrayList<Book>();

    public Library() {
        availableBooks.add(0, new Book("Fifty Shades of Grey","Stephen Hawking", "2012" ));
        availableBooks.add(1, new Book("5 Regrets of the Dying","Bronnie Ware", "2016" ));
    }

    public static String welcome() {
        String welcomeMessage = "Welcome to your library!";
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }

    public ArrayList<Book> listRentedBooks() {
        return rentedBooks;
    }

    public void printBooks() {
        System.out.print("\033[0;1m");
        System.out.printf("%-10s %-30s %-20s %-20s\n", "", "Title", "Author", "Year");
        System.out.print("\033[0;0m");
        for(int i = 0; availableBooks.size() > i; i++) {
            System.out.printf("%-10s %-30s %-20s %-20s\n", i+1, availableBooks.get(i).getTitle(), availableBooks.get(i).getAuthor(), availableBooks.get(i).getYear());
        }
        System.out.println("-----------------------Rented------------------------");
        for(int i = 0; rentedBooks.size() > i; i++) {
            System.out.printf("%-10s %-30s %-20s %-20s\n", i+1, rentedBooks.get(i).getTitle(), rentedBooks.get(i).getAuthor(), rentedBooks.get(i).getYear());
        }
    }

    public void checkOut(int index){
        Book book = availableBooks.get(index);
        book.rent();
        availableBooks.remove(book);
        rentedBooks.add(book);
    }

    public void checkIn(int index) {
        Book book = rentedBooks.get(index);
        rentedBooks.remove(book);
        availableBooks.add(book);
    }
}
