package com.twu.biblioteca;

/**
 * Created by isabellamers on 24/04/17.
 */
public class User {
    private String password;
    private String libraryNumber;
    private String name;
    private String phone;
    private String email;

    public User( String n, String ph, String e, String l, String p ) {
        name = n;
        phone = ph;
        email = e;
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

    public String getDetails() { return "User Name: " + name + "\n" + "Email: " + email + "\n" + "Tel: " + phone; }
}
