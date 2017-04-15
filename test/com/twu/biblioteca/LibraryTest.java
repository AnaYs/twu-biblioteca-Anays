package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;

    @Before
    public void before() {
       library  = new Library();
    }
    @Test
    public void whenLibraryIsLaunchedDisplaysWelcomeMessage() throws Exception {
        Assert.assertEquals("Welcome to your library!", library.launch());
    }

    @Test
    public void whenLibraryIsLaunchedListsBooks() throws Exception {
        List<String> expectedBooks;
        expectedBooks = Arrays.asList("Fifty Shades of Grey", "5 Regrets of the Dying");
        List<String> actualBooks = library.listBooks();
        Assert.assertEquals(actualBooks, expectedBooks);
    }
}
