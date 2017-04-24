package com.twu.biblioteca;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class LibraryTest {

    Library testLibrary;
    Book testBook1 = new Book("Fifty Shades of Grey","Stephen Hawking", "2012" );
    Book testBook2 = new Book("5 Regrets of the Dying","Bronnie Ware", "2016" );

    @Before
    public void before () {
        testLibrary = new Library();
    }

    @Test
    public void whenLibraryIsLaunchedDisplaysWelcomeMessage() throws Exception {
        Assert.assertEquals("Welcome to your library!", testLibrary.welcome());
    }
    @Test
    public void LibraryListsBooks() throws Exception {
        String expectedBookTitle = testBook1.getTitle();
        Assert.assertEquals(expectedBookTitle, testLibrary.availableBooks.get(0).getTitle());
    }
    @Test
    public void whenBookIsCheckedOutItIsNoLongerListed() throws Exception {
        testLibrary.checkOut(0);
        Assert.assertEquals("5 Regrets of the Dying", testLibrary.availableBooks.get(0).getTitle());
    }
    @Test
    public void whenBookIsCheckedOutItIsDisplayedAsRented() throws Exception {
        testLibrary.checkOut(0);
        Assert.assertEquals("Fifty Shades of Grey", testLibrary.listRentedBooks().get(0).getTitle());
    }
    @Test
    public void whenBookIsReturnedItIsDisplayedAsAvailable() throws Exception {
        testLibrary.checkOut(0);
        testLibrary.checkIn(0);
        String expectedBookTitle = testBook1.getTitle();
        ArrayList<String> bookTitles = new ArrayList<String>();
        for(int i = 0; testLibrary.availableBooks.size() > i; i++) {
            bookTitles.add(testLibrary.availableBooks.get(i).getTitle());
        }
        Assert.assertTrue(bookTitles.contains(expectedBookTitle));
    }

    @Test
    public void LibraryListsMovies() throws Exception {
        String expectedMovieDetail = "Batman, 1967, Marvel";
        ArrayList<String> movieDetails = new ArrayList<String>();
        for(int i = 0; testLibrary.listMovies().size() > i; i++) {
            movieDetails.add(testLibrary.listMovies().get(i).getDetails());
        }
        Assert.assertTrue(movieDetails.contains(expectedMovieDetail));
    }

    @Test
    public void whenMovieIsCheckedOutIsIsNoLongerAvailable() throws Exception {
        testLibrary.checkOutMovie(0);
        ArrayList<String> movieDetails = new ArrayList<String>();
        for(int i = 0; testLibrary.listMovies().size() > i; i++) {
            movieDetails.add(testLibrary.listMovies().get(i).getDetails());
        }
        Assert.assertTrue(movieDetails.isEmpty());
    }

}
