package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.Year;

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

    @Test
    public void getBookAuthor() throws Exception {
        String expectedAuthor = "Stephen Hawking";
        book.setAuthor(expectedAuthor);
        Assert.assertEquals(book.getAuthor(), expectedAuthor);
    }

    @Test
    public void getYearPublished() throws Exception {
        String expectedYear = "2012";
        book.setYear(expectedYear);
        Assert.assertEquals(book.getYear(), expectedYear);
    }
}
