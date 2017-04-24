package com.twu.biblioteca;

/**
 * Created by isabellamers on 24/04/17.
 */
public class User {
    private char[] password;
    private String libraryNumber;

    public User( String l, char[] p ) {
        libraryNumber = l;
        password = p;
    }

    public boolean verify(String l, char[] p) {
        if (libraryNumber.equals(l) && password.equals(p)) {
            return true;
        } else {
            return false;
        }
    }
}
