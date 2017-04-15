package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
    Book book;

    @Before
    public void before() {
        book = new Book();
    }

    @Test
    public void getBookTitle() throws Exception {
        String expectedTitle = "Fifty Shades of Grey";
        book.setTitle(expectedTitle);
        Assert.assertEquals(book.getTitle(), expectedTitle);
    }
}
