package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by isabellamers on 15/04/17.
 */
public class Library {
    private static ArrayList<Book> books = new ArrayList<Book>();

    public Library() {
        books.add(new Book("Fifty Shades of Grey","Stephen Hawking", "2012" ));
        books.add(new Book("5 Regrets of the Dying","Bronnie Ware", "2016" ));
    }

    public static String welcome() {
        String welcomeMessage = "Welcome to your library!";
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }

    public ArrayList<Book> listBooks() {
        return books;
    }

    public void printBooks() {
        System.out.print("\033[0;1m");
        System.out.printf("%-30s %-20s %-20s\n", "Title", "Author", "Year");
        System.out.print("\033[0;0m");
        for(int i = 0; 2 > i; i++) {
            System.out.printf("%-30s %-20s %-20s\n", books.get(i).getTitle(), books.get(i).getAuthor(), books.get(i).getYear());
        }
    }

    public static void checkOut(Book book){
        books.remove(book);
        //ImplementArrayList for book array and remove or add
        //Suggest availableBooks variable and CheckedOutBooks variable
    }
}
