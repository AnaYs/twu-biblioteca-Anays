package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;

    @Before
    public void before() {
       library  = new Library();
    }
    @Test
    public void whenLibraryIsLaunchedDisplaysWelcomeMessage() {
        Assert.assertEquals("Welcome to your library!", library.launch());
    }
}
