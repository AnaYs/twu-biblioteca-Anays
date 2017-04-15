package com.twu.biblioteca;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    Library library;

    @Before
    public void before() {
        Book[] books = new Book[2];
        books[0] = new Book("Fifty Shades of Grey","Stephen Hawking", "2012" );
        books[1] = new Book("5 Regrets of the Dying","Bronnie Ware", "2016" );
        library  = new Library(books);
    }
    @Test
    public void whenLibraryIsLaunchedDisplaysWelcomeMessage() throws Exception {
        Assert.assertEquals("Welcome to your library!", library.launch());
    }
    @Test
    public void whenLibraryIsLaunchedListsBooks() throws Exception {
        Book[] actualBookList = library.listBooks();
        Book book = new Book("Fifty Shades of Grey","Stephen Hawking", "2012" );
        Assert.assertEquals(library.listBooks()[0].getTitle(), book.getTitle());

    }
}
