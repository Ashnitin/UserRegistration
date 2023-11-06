package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration ob=new UserRegistration();
    @Test
    public void givenValidFirstName(){
        boolean firstName=ob.validFirstName("Ash");
        Assertions.assertTrue(firstName);
    }
    @Test
    public void givenValidLastName(){
        boolean lastName=ob.validLastName("Bankar");
        Assertions.assertTrue(lastName);
    }
    @Test
    public void givenValidEmail(){
        boolean email=ob.validEmail("ashwini.bankar11@gmail.com");
        Assertions.assertTrue(email);
    }
    @Test
    public void givenPreDefinedMobileFormat(){
        boolean mobile=ob.validMobile("91 7796226982");
        Assertions.assertTrue(mobile);
}

}
