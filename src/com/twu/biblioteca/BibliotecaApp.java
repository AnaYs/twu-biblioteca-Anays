package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {
    static Library library = new Library();

    public static void main(String[] args) {
        library.welcome();
        MenuOptions(library);
    }

    private static void displayMainMenu() {
        System.out.println("1 - List all books");
        System.out.println("2 - Borrow a book");
        System.out.println("3 - Return a book");
        System.out.println("4 - Quit");
    }

    private static void MenuOptions(Library library) {
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
                case 1: library.printBooks(); break;
                case 2: checkOut(); break;
                case 3: checkIn(); break;
                case 4: break;
                default: System.err.println(unavailableOption); continue;
            }
        }
    }

    private static void checkOut() {
        System.out.println("Indicate number of the book you would like to borrow:");
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt() - 1;
        try {
            library.checkOut(userInput);
            System.out.println("Thank you! Enjoy the book");
        } catch (Exception e) {
            System.out.println("That book is not available.");
        }
        System.out.println("\n");
        displayMainMenu();
    }

    private static void checkIn() {
        if (library.listRentedBooks().isEmpty()) {
            System.out.println("Nothing to return.");
            return;
        } else {
            library.printRentedBooks();
            System.out.println("Indicate number of the book you would like to return:");
            Scanner s = new Scanner(System.in);
            int userInput = s.nextInt() - 1;
            try {
                library.checkIn(userInput);
                System.out.println("Thank you for returning the book.");
            } catch (Exception e) {
                System.out.println("That is not a valid book to return.");
            }
            System.out.println("\n");
        }
        displayMainMenu();
    }

}