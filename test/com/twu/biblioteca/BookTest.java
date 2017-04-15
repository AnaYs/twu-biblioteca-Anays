package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.Year;

public class BookTest {
    Book book;

    @Before
    public void before() {
        book = new Book("Fifty Shades of Grey","Stephen Hawking", "2012" );
    }

    @Test
    public void getBookTitle() throws Exception {
        String expectedTitle = "Fifty Shades of Grey";
        Assert.assertEquals(book.getTitle(), expectedTitle);
    }

    @Test
    public void getBookAuthor() throws Exception {
        String expectedAuthor = "Stephen Hawking";
        Assert.assertEquals(book.getAuthor(), expectedAuthor);
    }

    @Test
    public void getYearPublished() throws Exception {
        String expectedYear = "2012";
        Assert.assertEquals(book.getYear(), expectedYear);
    }
}
