package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovieTest {
    Movie movie;

    @Before
    public void before() { movie = new Movie( "Batman Goes Online", "1850", "Steven Spielberg", "3"); }

    @Test
    public void getName() throws Exception {
        String expectedName = "Batman Goes Online";
        Assert.assertEquals(movie.getName(), expectedName);

    }

    @Test
    public void getYear() throws Exception {
        String expectedYear = "1850";
        Assert.assertEquals(movie.getYear(), expectedYear);
    }

    @Test
    public void getDirector() throws Exception {
        String expectedDirector = "Steven Spielberg";
        Assert.assertEquals(movie.getDirector(), expectedDirector);
    }

    @Test
    public void getRating() throws Exception {
        String expectedRating = "3";
        Assert.assertEquals(movie.getRating(), expectedRating);
    }
}
