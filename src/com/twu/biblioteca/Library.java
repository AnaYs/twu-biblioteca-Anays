package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;

/**
 * Created by isabellamers on 15/04/17.
 */
public class Library {




    public static String launch() {
        String welcomeMessage = "Welcome to your library!";
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }

    public static List<String> listBooks() {
        List<String> availableBooks = Arrays.asList("Fifty Shades of Grey", "5 Regrets of the Dying");
        System.out.print(availableBooks);
        return availableBooks;
    }
}
