package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Library library = getLibrary();
        System.out.println(library.welcome());
        Book[] books = library.listBooks();
        MenuOptions(books);
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

    private static void displayMainMenu() {
        System.out.println("1 - List Books");
        System.out.println("2 - Checkout Book");
        System.out.println("3 - Return Book");
        System.out.println("4 - Quit");
    }

    private static void MenuOptions(Book[] books) {
        displayMainMenu();
        Scanner s = new Scanner(System.in);
        String unavailableOption = "This option is unavailable. Select a valid option!";
        int userInput = 0;
        while (userInput != 4) {
            System.out.println();
            System.out.print("Enter the number of menu option:");
            userInput = s.nextInt();
            System.out.println();
            switch (userInput) {
                case 1: printBooks(books); break;
                case 2: System.out.println(unavailableOption); break;
                case 3: System.out.println(unavailableOption); break;
                case 4: break;
            }
        }

    }

}