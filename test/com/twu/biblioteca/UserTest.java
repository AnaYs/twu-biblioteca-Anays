package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by isabellamers on 24/04/17.
 */
public class UserTest {
    User user;
    String libraryNumber = "LIB-5577";
    String password = "456ef";

    @Before
    public void before() {
        user = new User(libraryNumber, password);
    }

    @Test
    public void verify() throws Exception {
        Assert.assertTrue(user.verify(libraryNumber, password));
    }
}