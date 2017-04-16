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

    Library testLibrary = new Library();
    Book testBook1 = new Book("Fifty Shades of Grey","Stephen Hawking", "2012" );
    Book testBook2 = new Book("5 Regrets of the Dying","Bronnie Ware", "2016" );

    @Test
    public void whenLibraryIsLaunchedDisplaysWelcomeMessage() throws Exception {
        Assert.assertEquals("Welcome to your library!", testLibrary.welcome());
    }
    @Test
    public void whenLibraryIsLaunchedListsBooks() throws Exception {
        String expectedBookTitle = testBook1.getTitle();
        Assert.assertEquals(expectedBookTitle, testLibrary.listBooks().get(0).getTitle());
    }
    @Test
    public void whenBookIsCheckedOutItIsNoLongerListed() throws Exception {
        testLibrary.checkOut(testBook1);
        Assert.assertFalse(testLibrary.listBooks().contains(testBook1));
    }
}
