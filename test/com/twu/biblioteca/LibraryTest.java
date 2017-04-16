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

    Library library;
    ArrayList<Book> books = new ArrayList<Book>();

    @Before
    public void before() {
        books.add(new Book("Fifty Shades of Grey","Stephen Hawking", "2012" ));
        books.add(new Book("5 Regrets of the Dying","Bronnie Ware", "2016" ));
        library  = new Library(books);
    }
    @Test
    public void whenLibraryIsLaunchedDisplaysWelcomeMessage() throws Exception {
        Assert.assertEquals("Welcome to your library!", library.welcome());
    }
    @Test
    public void whenLibraryIsLaunchedListsBooks() throws Exception {
        String expectedBookTitle = books.get(0).getTitle();
        Assert.assertEquals(expectedBookTitle, library.listBooks().get(0).getTitle());
    }
    @Test
    public void whenBookIsCheckedOutItIsNoLongerListed() throws Exception {
        library.checkOut(books.get(0));
        String expectedBookTitle = books.get(1).getTitle();
        Assert.assertEquals(expectedBookTitle, library.listBooks().get(0).getTitle());
    }
}
