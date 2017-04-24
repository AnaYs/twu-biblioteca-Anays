package com.twu.biblioteca;

import org.hamcrest.CoreMatchers;
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
    String name = "Steven";
    String phone = "043448355";
    String email = "test@test.com";

    @Before
    public void before() {
        user = new User(name, phone, email, libraryNumber, password);
    }

    @Test
    public void verify() throws Exception {
        Assert.assertTrue(user.verify(libraryNumber, password));
    }

    @Test
    public void getDetails() throws Exception {
        String expectedDetail = "Steven";
        Assert.assertThat(user.getDetails(), CoreMatchers.containsString(expectedDetail));
    }
}
