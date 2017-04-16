package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Library library = new Library();
        library.welcome();
        MenuOptions(library);
    }

    private static void displayMainMenu() {
        System.out.println("1 - List Books");
        System.out.println("2 - Checkout Book");
        System.out.println("3 - Return Book");
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
                case 2: System.out.println(unavailableOption); break;
                case 3: System.out.println(unavailableOption); break;
                case 4: break;
            }
        }

    }

}