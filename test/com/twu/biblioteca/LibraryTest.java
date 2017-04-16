package com.twu.biblioteca;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

}
