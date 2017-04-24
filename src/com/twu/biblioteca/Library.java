package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by isabellamers on 15/04/17.
 */
public class Library {
    public static ArrayList<Book> availableBooks = new ArrayList<Book>();
    private static ArrayList<Book> rentedBooks = new ArrayList<Book>();
    private static ArrayList<Movie> availableMovies = new ArrayList<Movie>();
    private static ArrayList<User> registeredUsers = new ArrayList<User>();
    public static User currentUser;

    public Library() {
        availableBooks.add(0, new Book("Fifty Shades of Grey","Stephen Hawking", "2012" ));
        availableBooks.add(1, new Book("5 Regrets of the Dying","Bronnie Ware", "2016" ));
        availableMovies.add( 0, new Movie("Batman", "1967", "Marvel", "3"));
        registeredUsers.add( 0, new User ( "Steven", "043448555", "test@test.com","LIB-5577", "456ef" ));
    }

    public static String welcome() {
        String welcomeMessage = "Welcome to your library!";
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }

    public boolean login(String l, String p) {
        Boolean login = false;
        for(int i = 0; registeredUsers.size() > i; i++) {
            User user = registeredUsers.get(i);
            if (user.verify(l,p)) {
                login = true;
                currentUser = user;
                break;
            }
        }
        return login;
    }

    public ArrayList<Book> listRentedBooks() {
        return rentedBooks;
    }
    public ArrayList<Movie> listMovies() { return availableMovies; }

    public void printBooks() {
        System.out.println("----------------------------------------- Books ------------------------------------------");
        System.out.print("\033[0;1m");
        System.out.printf("%-10s %-30s %-20s %-20s\n", "", "Title", "Author", "Year");
        System.out.print("\033[0;0m");
        for(int i = 0; availableBooks.size() > i; i++) {
            System.out.printf("%-10s %-30s %-20s %-20s\n", i+1, availableBooks.get(i).getTitle(), availableBooks.get(i).getAuthor(), availableBooks.get(i).getYear());
        }
        System.out.print("\n");
    }

    public void printRentedBooks() {
        System.out.println("------------------------------------- Rented Books --------------------------------------");
        System.out.print("\033[0;1m");
        System.out.printf("%-10s %-30s %-20s %-10s %-20s\n", "", "Title", "Author", "Year", "Rented By");
        System.out.print("\033[0;0m");
            for (int i = 0; rentedBooks.size() > i; i++) {
                Book book = rentedBooks.get(i);
                System.out.printf("%-10s %-30s %-20s %-10s %-20s\n", i + 1, book.getTitle(), book.getAuthor(), book.getYear(), book.getRentedBy());
            }
        System.out.print("\n");
    }

    public void checkOut(int index){
        Book book = availableBooks.get(index);
        book.rent("LIB-5577");
        availableBooks.remove(book);
        rentedBooks.add(book);
    }

    public void checkIn(int index) {
        Book book = rentedBooks.get(index);
        rentedBooks.remove(book);
        availableBooks.add(book);
    }

    public void printMovies() {
        System.out.println("------------------------------------- Movies --------------------------------------");
        System.out.print("\033[0;1m");
        System.out.printf("%-10s %-50s %-20s\n", "", "Movie Details", "Rating (1-10)");
        System.out.print("\033[0;0m");
        for (int i = 0; availableMovies.size() > i; i++) {
            System.out.printf("%-10s %-50s %-20s\n", i + 1, availableMovies.get(i).getDetails(), availableMovies.get(i).getRating());
        }
        System.out.print("\n");
    }

    public void checkOutMovie(int index) {
        Movie movie = availableMovies.get(index);
        availableMovies.remove(movie);
    }
}
