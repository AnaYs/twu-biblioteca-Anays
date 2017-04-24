package com.twu.biblioteca;

/**
 * Created by isabellamers on 24/04/17.
 */
public class User {
    public String password;
    public String libraryNumber;

    public User( String l, String p ) {
        libraryNumber = l;
        password = p;
    }

    public boolean verify(String l, String p) {
        if (libraryNumber.equals(l) && password.equals(p)) {
            return true;
        } else {
            return false;
        }
    }
}
