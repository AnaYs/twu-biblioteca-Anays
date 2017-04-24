package com.twu.biblioteca;

/**
 * Created by isabellamers on 24/04/17.
 */
public class Movie {
    private String name;
    private String year;
    private String director;
    private String rating;

    public Movie ( String n, String y, String d, String r ) {
        name = n;
        year = y;
        director = d;
        rating = r;
    }

    String getName() { return name; }

    String getYear() { return year; }

    String getDirector() { return director; }

    String getRating() { return rating; }

    String getDetails() { return name + ", " + year + ", " + director; }
}
